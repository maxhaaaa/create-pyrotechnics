
package net.mcreator.createpyrotechnics.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.createpyrotechnics.world.inventory.RadarTestMenu;
import net.mcreator.createpyrotechnics.procedures.RadarTestProcedureProcedure;
import net.mcreator.createpyrotechnics.procedures.DzRemoveProcedure;
import net.mcreator.createpyrotechnics.procedures.DzAddProcedure;
import net.mcreator.createpyrotechnics.procedures.DyAddProcedure;
import net.mcreator.createpyrotechnics.procedures.DxRemoveProcedure;
import net.mcreator.createpyrotechnics.procedures.DxAddProcedure;
import net.mcreator.createpyrotechnics.procedures.CheckCordsProcedure;
import net.mcreator.createpyrotechnics.CreatePyrotechnicsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RadarTestButtonMessage {
	private final int buttonID, x, y, z;

	public RadarTestButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RadarTestButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RadarTestButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RadarTestButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RadarTestMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RadarTestProcedureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			DxAddProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			DxRemoveProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			DyAddProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			DzRemoveProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			DzAddProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			DzRemoveProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			CheckCordsProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreatePyrotechnicsMod.addNetworkMessage(RadarTestButtonMessage.class, RadarTestButtonMessage::buffer, RadarTestButtonMessage::new, RadarTestButtonMessage::handler);
	}
}
