
package net.mcreator.createpyrotechnics.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToxifierLabButtonMessage {

	private final int buttonID, x, y, z;

	public ToxifierLabButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ToxifierLabButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ToxifierLabButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ToxifierLabButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ToxifierLabMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			PlusFlameProcedure.execute();
		}
		if (buttonID == 1) {

			MinusFlameProcedure.execute(entity);
		}
		if (buttonID == 2) {

			WaterPressedProcedure.execute();
		}
		if (buttonID == 3) {

			PoisonPowderPressedProcedure.execute(entity);
		}
		if (buttonID == 4) {

			ToxSealPressedProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreatePyrotechnicsMod.addNetworkMessage(ToxifierLabButtonMessage.class, ToxifierLabButtonMessage::buffer, ToxifierLabButtonMessage::new, ToxifierLabButtonMessage::handler);
	}

}
