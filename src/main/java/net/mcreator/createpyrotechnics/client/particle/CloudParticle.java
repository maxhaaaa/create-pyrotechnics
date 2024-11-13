
package net.mcreator.createpyrotechnics.client.particle;

@OnlyIn(Dist.CLIENT)
public class CloudParticle extends TextureSheetParticle {
	public static CloudParticleProvider provider(SpriteSet spriteSet) {
		return new CloudParticleProvider(spriteSet);
	}

	public static class CloudParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public CloudParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new CloudParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected CloudParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 200f;
		this.lifetime = 920;
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 0.3;
		this.yd = vy * 0.3;
		this.zd = vz * 0.3;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 80) % 12 + 1, 12));
		}
	}
}