// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelswordsmachine_legs<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "swordsmachine_legs"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelswordsmachine_legs(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(7, 49)
				.addBox(-0.4F, 9.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 22).mirror()
				.addBox(-1.4F, 10.0F, -3.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 28)
				.addBox(-1.4F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
				.addBox(-1.4F, 1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 21)
				.addBox(-1.4F, 5.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 46)
				.addBox(-1.4F, 7.7F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).texOffs(47, 50)
				.addBox(-0.9F, 4.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 38)
				.addBox(-1.4F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(53, 0).mirror()
				.addBox(-0.6F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 8)
				.addBox(-0.4F, 10.0F, -4.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition feet_r1 = LeftLeg.addOrReplaceChild("feet_r1",
				CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -1.2F, 2.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 11.0F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition feet_r2 = LeftLeg.addOrReplaceChild("feet_r2",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 11.0F, -2.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition feet_r3 = LeftLeg.addOrReplaceChild("feet_r3",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 11.0F, -2.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(11, 22)
						.addBox(-1.6F, 10.0F, -3.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
						.addBox(-1.4F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 5)
						.addBox(-1.6F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 34)
						.addBox(-1.6F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 49)
						.addBox(-1.1F, 3.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
						.addBox(-1.6F, 2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 30)
						.addBox(-1.6F, 5.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 20)
						.addBox(-1.6F, 7.7F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).texOffs(16, 8)
						.addBox(-0.6F, 10.0F, -4.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 10)
						.addBox(-0.6F, 9.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition feet_r4 = RightLeg.addOrReplaceChild("feet_r4",
				CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -1.2F, 2.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9F, 11.0F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition feet_r5 = RightLeg.addOrReplaceChild("feet_r5",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 11.0F, -2.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition feet_r6 = RightLeg.addOrReplaceChild("feet_r6",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 11.0F, -2.0F, 0.0F, 0.6981F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}