
package net.mcreator.createpyrotechnics.client.particle;

@OnlyIn(Dist.CLIENT)
public class SmokeCloudParticle extends TextureSheetParticle {
	public static SmokeCloudParticleProvider provider(SpriteSet spriteSet) {
		return new SmokeCloudParticleProvider(spriteSet);
	}

	public static class SmokeCloudParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public SmokeCloudParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new SmokeCloudParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected SmokeCloudParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 150f;
		this.lifetime = 1840;
		this.gravity = 0.2f;
		this.hasPhysics = true;
		this.xd = vx * 0.3;
		this.yd = vy * 0.3;
		this.zd = vz * 0.3;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 40) % 12 + 1, 12));
		}
	}
}