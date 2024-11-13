
package net.mcreator.createpyrotechnics.client.particle;

@OnlyIn(Dist.CLIENT)
public class CapParticleParticle extends TextureSheetParticle {
	public static CapParticleParticleProvider provider(SpriteSet spriteSet) {
		return new CapParticleParticleProvider(spriteSet);
	}

	public static class CapParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public CapParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new CapParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected CapParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 200f;
		this.lifetime = 920;
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 0.15;
		this.yd = vy * 0.15;
		this.zd = vz * 0.15;
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