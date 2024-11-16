
package net.mcreator.createpyrotechnics.potion;

public class BurntretnasMobEffect extends MobEffect {
	public BurntretnasMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}