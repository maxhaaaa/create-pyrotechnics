
package net.mcreator.createpyrotechnics.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Launch3ButtonMessage {

	private final int buttonID, x, y, z;

	public Launch3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Launch3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Launch3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Launch3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Launch3Menu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			DxAddProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			ICBMLaunchProcedureProcedure.execute(world, x, y, z);
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
		if (buttonID == 8) {

			GetLinkProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreatePyrotechnicsMod.addNetworkMessage(Launch3ButtonMessage.class, Launch3ButtonMessage::buffer, Launch3ButtonMessage::new, Launch3ButtonMessage::handler);
	}

}
