
package net.mcreator.createpyrotechnics.client.particle;

@OnlyIn(Dist.CLIENT)
public class FirepillarparticleParticle extends TextureSheetParticle {
	public static FirepillarparticleParticleProvider provider(SpriteSet spriteSet) {
		return new FirepillarparticleParticleProvider(spriteSet);
	}

	public static class FirepillarparticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public FirepillarparticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new FirepillarparticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected FirepillarparticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 2000f;
		this.lifetime = 200;
		this.gravity = -2f;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
	}
}