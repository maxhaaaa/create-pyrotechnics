
package net.mcreator.createpyrotechnics.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.world.inventory.ComputernavigatorMenu;
import net.mcreator.createpyrotechnics.procedures.NavyupProcedure;
import net.mcreator.createpyrotechnics.procedures.NavydownProcedure;
import net.mcreator.createpyrotechnics.procedures.ExecutebuttonProcedure;
import net.mcreator.createpyrotechnics.procedures.CallmaxesmenuupzProcedure;
import net.mcreator.createpyrotechnics.procedures.CallmaxesmenulibsrightProcedure;
import net.mcreator.createpyrotechnics.procedures.CallmaxesmenuleftProcedure;
import net.mcreator.createpyrotechnics.procedures.CallmaxesmenudownzProcedure;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ComputernavigatorButtonMessage {
	private final int buttonID, x, y, z;

	public ComputernavigatorButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ComputernavigatorButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ComputernavigatorButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ComputernavigatorButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ComputernavigatorMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 1) {

			CallmaxesmenuupzProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			CallmaxesmenudownzProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			NavyupProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			NavydownProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			CallmaxesmenuleftProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			CallmaxesmenulibsrightProcedure.execute(world, x, y, z);
		}
		if (buttonID == 8) {

			ExecutebuttonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreatePyrotechnicsMod.addNetworkMessage(ComputernavigatorButtonMessage.class, ComputernavigatorButtonMessage::buffer, ComputernavigatorButtonMessage::new, ComputernavigatorButtonMessage::handler);
	}
}
