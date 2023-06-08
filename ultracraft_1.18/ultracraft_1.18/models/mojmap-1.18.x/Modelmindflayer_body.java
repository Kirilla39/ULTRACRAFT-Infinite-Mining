// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmindflayer_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mindflayer_body"), "main");
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;

	public Modelmindflayer_body(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(13, 55).mirror()
						.addBox(-1.0F, 2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 37).addBox(-1.0F, -7.0F, -2.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(16, 34).addBox(-1.0F, -6.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(1.5F, 4.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition wire_l = LeftArm.addOrReplaceChild("wire_l", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = wire_l.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 21).mirror()
				.addBox(6.0F, 23.0F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 27)
				.mirror().addBox(6.0F, 8.0F, 5.5F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, -0.7418F, -0.2618F, -0.0873F));

		PartDefinition cube_r2 = wire_l.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(34, 27).mirror()
						.addBox(1.0F, 2.0F, -0.5F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -0.2618F, -0.5672F));

		PartDefinition cube_r3 = wire_l.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 25).mirror()
				.addBox(2.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 12)
				.mirror().addBox(1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(13, 55)
						.addBox(-2.0F, 2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
						.addBox(-2.5F, 4.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(38, 24).addBox(-2.0F, -7.0F, -2.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(55, 0).addBox(-2.5F, -5.0F, -2.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition wire_r = RightArm.addOrReplaceChild("wire_r", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r4 = wire_r.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 21)
						.addBox(-6.0F, 23.0F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 27)
						.addBox(-6.0F, 8.0F, 5.5F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, -0.7418F, 0.2618F, 0.0873F));

		PartDefinition cube_r5 = wire_r.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(34, 27).addBox(-1.0F, 2.0F, -0.5F, 0.0F, 10.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.2618F, 0.5672F));

		PartDefinition cube_r6 = wire_r.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 25)
						.addBox(-3.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-3.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
						.addBox(-4.0F, 8.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 4)
						.addBox(-3.0F, 3.0F, -1.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-4.0F, 7.0F, -1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 7)
						.addBox(-2.0F, 4.0F, -2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lbutt_r1 = Body.addOrReplaceChild("lbutt_r1",
				CubeListBuilder.create().texOffs(48, 33).addBox(-4.0F, -0.5F, -1.5F, 4.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.1745F, 0.0F, 0.1745F));

		PartDefinition lbutt_r2 = Body.addOrReplaceChild("lbutt_r2",
				CubeListBuilder.create().texOffs(48, 33).mirror()
						.addBox(0.0F, -0.5F, -1.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.1745F, 0.0F, -0.1745F));

		PartDefinition booba = Body.addOrReplaceChild("booba", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.0F, -2.0F));

		PartDefinition Body_r1 = booba.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(48, 20).mirror()
						.addBox(0.0F, -1.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, -0.1745F, -0.0436F));

		PartDefinition Body_r2 = booba.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(48, 20).addBox(-4.0F, -1.0F, -2.5F, 4.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.1745F, 0.0436F));

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