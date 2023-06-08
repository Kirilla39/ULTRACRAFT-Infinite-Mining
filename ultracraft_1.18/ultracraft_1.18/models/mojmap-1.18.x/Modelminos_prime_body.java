// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelminos_prime_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minos_prime_body"), "main");
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;

	public Modelminos_prime_body(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition hand_r1 = LeftArm.addOrReplaceChild("hand_r1", CubeListBuilder.create().texOffs(46, 5).mirror()
				.addBox(5.0F, -14.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 46)
				.mirror().addBox(5.5F, -21.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 12).mirror().addBox(5.0F, -24.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition snake_r1 = LeftArm.addOrReplaceChild("snake_r1", CubeListBuilder.create().texOffs(52, 36)
				.mirror().addBox(5.5F, -15.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(10, 50).mirror().addBox(5.5F, -16.0F, -2.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(41, 22).mirror()
				.addBox(5.0F, -18.0F, -2.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, -0.0436F, 0.0F, -0.0436F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition hand_r2 = RightArm.addOrReplaceChild("hand_r2",
				CubeListBuilder.create().texOffs(46, 5)
						.addBox(-8.0F, -14.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-8.5F, -21.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-9.0F, -24.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition snake_r2 = RightArm.addOrReplaceChild("snake_r2",
				CubeListBuilder.create().texOffs(52, 36)
						.addBox(-8.5F, -15.0F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(10, 50)
						.addBox(-8.5F, -16.0F, -2.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 22)
						.addBox(-9.0F, -18.0F, -2.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, -0.0436F, 0.0F, 0.0436F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 1.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-3.0F, 7.0F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 19)
						.addBox(-4.0F, 9.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 12)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 15)
						.addBox(-4.0F, 1.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(3.0F, 1.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition heart_r1 = Body
				.addOrReplaceChild("heart_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.5F, -1.3F, 1.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition heart_r2 = Body
				.addOrReplaceChild("heart_r2",
						CubeListBuilder.create().texOffs(35, 12).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}