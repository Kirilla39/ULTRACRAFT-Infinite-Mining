// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelv1_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "v1_body"), "main");
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;

	public Modelv1_body(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 21)
				.mirror().addBox(-0.5F, 8.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 45).mirror().addBox(-0.5F, 3.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 58).mirror()
				.addBox(-0.5F, 0.5F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(22, 55).addBox(4.5F, -23.0F, 0.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition shoulder_r1 = LeftArm.addOrReplaceChild("shoulder_r1",
				CubeListBuilder.create().texOffs(0, 43).mirror()
						.addBox(5.0F, -24.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition lowerarm_r1 = LeftArm.addOrReplaceChild("lowerarm_r1",
				CubeListBuilder.create().texOffs(66, 10).mirror()
						.addBox(4.0F, -15.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(57, 0).mirror()
						.addBox(4.0F, -17.0F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(36, 21)
						.addBox(-1.5F, 8.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-1.5F, 0.5F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).texOffs(14, 45)
						.addBox(-1.5F, 3.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm
				.addOrReplaceChild("RightArm_r1",
						CubeListBuilder.create().texOffs(22, 55).addBox(-6.5F, -23.0F, 0.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition lowerarm_r2 = RightArm.addOrReplaceChild("lowerarm_r2",
				CubeListBuilder.create().texOffs(66, 10)
						.addBox(-7.0F, -15.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-7.0F, -17.0F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition shoulder_r2 = RightArm
				.addOrReplaceChild("shoulder_r2",
						CubeListBuilder.create().texOffs(0, 43).addBox(-8.0F, -24.0F, -1.0F, 3.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(36, 27)
						.addBox(-1.0F, 0.8F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 7)
						.addBox(-2.0F, 6.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.5F, 4.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 36)
						.addBox(-2.0F, 4.0F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body
				.addOrReplaceChild("Body_r1",
						CubeListBuilder.create().texOffs(59, 19).addBox(-2.0F, -17.5F, 8.6F, 4.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body
				.addOrReplaceChild("Body_r2",
						CubeListBuilder.create().texOffs(32, 39).addBox(-3.0F, -14.5F, -1.0F, 2.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(32, 39).mirror()
						.addBox(1.0F, -14.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -16.0F, -2.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Body_r5 = Body
				.addOrReplaceChild("Body_r5",
						CubeListBuilder.create().texOffs(63, 47).addBox(-1.0F, -16.0F, -1.0F, 2.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body_r6 = Body
				.addOrReplaceChild("Body_r6",
						CubeListBuilder.create().texOffs(34, 11).addBox(-3.5F, -23.5F, 0.0F, 7.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Body_r7 = Body
				.addOrReplaceChild("Body_r7",
						CubeListBuilder.create().texOffs(46, 20).addBox(-2.0F, -24.0F, 0.0F, 4.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(18, 20).addBox(-2.0F, -23.0F, -5.1F, 5.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.8727F, -0.0873F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(18, 28).addBox(-3.0F, -23.0F, -5.1F, 5.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.8727F, 0.0873F));

		PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create().texOffs(59, 27).addBox(-2.0F,
				-2.0F, -1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 3.0F));

		PartDefinition Lwing_r1 = Wings.addOrReplaceChild("Lwing_r1",
				CubeListBuilder.create().texOffs(0, 9).addBox(1.0F, -4.0F, -1.0F, 17.0F, 9.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.6109F));

		PartDefinition Rwing_r1 = Wings.addOrReplaceChild("Rwing_r1",
				CubeListBuilder.create().texOffs(0, 9).mirror()
						.addBox(-18.0F, -4.0F, -1.0F, 17.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, -0.6109F));

		PartDefinition Rwing_r2 = Wings.addOrReplaceChild("Rwing_r2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-18.0F, -4.0F, 0.0F, 17.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.6109F));

		PartDefinition Lwing_r2 = Wings.addOrReplaceChild("Lwing_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -4.0F, 0.0F, 17.0F, 9.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, -0.6109F));

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