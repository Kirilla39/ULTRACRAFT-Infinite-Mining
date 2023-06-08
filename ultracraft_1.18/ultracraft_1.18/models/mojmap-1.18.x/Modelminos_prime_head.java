// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelminos_prime_head<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minos_prime_head"), "main");
	private final ModelPart Head;

	public Modelminos_prime_head(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(28, 6)
				.addBox(-2.5F, -3.0F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 2).mirror()
				.addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(22, 0)
				.mirror().addBox(1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 2).addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
				.addBox(-2.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 55)
				.addBox(-3.0F, -6.0F, -4.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 55).mirror()
				.addBox(2.0F, -6.0F, -4.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 33)
				.addBox(-3.0F, -8.0F, -4.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 25)
				.addBox(-2.0F, -11.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
				.addBox(-0.5F, -9.0F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
				.addBox(1.5F, -12.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(0.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 12)
				.addBox(-2.5F, -9.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 15)
				.addBox(2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 14)
				.addBox(-3.5F, -9.0F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 57)
				.addBox(-2.0F, -12.0F, -4.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
				.addBox(0.0F, -11.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-2.0F,
						-13.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head
				.addOrReplaceChild("Head_r1",
						CubeListBuilder.create().texOffs(56, 3).addBox(1.5F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Head_r2 = Head
				.addOrReplaceChild("Head_r2",
						CubeListBuilder.create().texOffs(12, 56).addBox(1.0F, -6.0F, -3.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Head_r3 = Head
				.addOrReplaceChild("Head_r3",
						CubeListBuilder.create().texOffs(55, 26).addBox(-2.0F, -5.0F, -3.0F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(58, 12)
						.addBox(-1.0F, 4.2F, -3.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(0, 12)
						.addBox(-3.0F, -2.0F, -3.3F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chin_r1 = Head.addOrReplaceChild("chin_r1",
				CubeListBuilder.create().texOffs(28, 26)
						.addBox(-1.5F, -25.3F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 51)
						.addBox(-2.5F, -25.3F, -1.8F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}