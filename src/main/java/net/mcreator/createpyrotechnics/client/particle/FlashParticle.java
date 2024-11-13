
package net.mcreator.createpyrotechnics.client.particle;

@OnlyIn(Dist.CLIENT)
public class FlashParticle extends TextureSheetParticle {
	public static FlashParticleProvider provider(SpriteSet spriteSet) {
		return new FlashParticleProvider(spriteSet);
	}

	public static class FlashParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public FlashParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new FlashParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected FlashParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0f, 0f);
		this.quadSize *= 1600f;
		this.lifetime = 6;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 0.6;
		this.yd = vy * 0.6;
		this.zd = vz * 0.6;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 2) % 4 + 1, 4));
		}
	}
}