
package net.mcreator.createpyrotechnics.command;

@Mod.EventBusSubscriber
public class RadioactiveFalloutCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("radioactivefallout").requires(s -> s.hasPermission(2))

		);
	}

}
