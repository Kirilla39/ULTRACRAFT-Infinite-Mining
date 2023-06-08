// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgabriel_legs<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gabriel_legs"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public Modelgabriel_legs(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(52, 9)
				.mirror().addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 32).mirror().addBox(-1.9F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(40, 12).mirror()
				.addBox(-1.4F, 8.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 27)
				.mirror().addBox(-1.9F, 10.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 64).mirror().addBox(-1.4F, 11.0F, -4.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(40, 53).mirror()
				.addBox(-1.4F, 4.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition feet_r1 = LeftLeg.addOrReplaceChild("feet_r1",
				CubeListBuilder.create().texOffs(0, 64).mirror()
						.addBox(0.5F, -2.5F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(45, 21).mirror()
						.addBox(0.5F, -1.0F, -2.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 5.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition skirt_r1 = LeftLeg.addOrReplaceChild("skirt_r1",
				CubeListBuilder.create().texOffs(60, 43).mirror()
						.addBox(0.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(52, 9)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 32)
						.addBox(-2.1F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-1.6F, 8.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 27)
						.addBox(-2.1F, 10.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 64)
						.addBox(-1.6F, 11.0F, -4.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-1.6F, 4.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition feet_r2 = RightLeg
				.addOrReplaceChild("feet_r2",
						CubeListBuilder.create().texOffs(0, 64).addBox(-3.5F, -2.5F, -3.5F, 3.0F, 1.0F, 3.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(45, 21).addBox(-3.5F, -1.0F, -2.3F, 3.0F, 2.0F, 1.0F,
								new CubeDeformation(-0.1F)),
						PartPose.offsetAndRotation(1.9F, 5.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition skirt_r2 = RightLeg
				.addOrReplaceChild("skirt_r2",
						CubeListBuilder.create().texOffs(60, 43).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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