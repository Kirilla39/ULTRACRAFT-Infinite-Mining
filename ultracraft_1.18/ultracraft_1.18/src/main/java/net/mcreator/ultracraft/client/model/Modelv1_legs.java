package net.mcreator.ultracraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelv1_legs<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelv_1_legs"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelv1_legs(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(45, 0).addBox(-1.4F, 11.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 63)
						.addBox(-0.4F, 2.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 63)
						.addBox(-0.9F, 7.0F, -2.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r1 = LeftLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(59, 43).addBox(0.5F, -2.5F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition feet_r1 = LeftLeg.addOrReplaceChild("feet_r1",
				CubeListBuilder.create().texOffs(53, 37).addBox(0.5F, -2.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition lowerleg_r1 = LeftLeg.addOrReplaceChild("lowerleg_r1",
				CubeListBuilder.create().texOffs(20, 46).addBox(0.5F, -8.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild(
				"LeftLeg_r1", CubeListBuilder.create().texOffs(14, 55).mirror()
						.addBox(0.3F, -13.0F, -2.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, -0.0436F, 0.0F, 0.1309F));
		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(26, 55).addBox(1.0F, -12.8F, -2.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r3 = LeftLeg.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(41, 39).addBox(0.5F, -15.3F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition LeftLeg_r4 = LeftLeg.addOrReplaceChild("LeftLeg_r4",
				CubeListBuilder.create().texOffs(28, 63).addBox(3.7F, -15.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-1.6F, 11.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(18, 63).mirror().addBox(-1.1F, 7.0F, -2.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(34, 63).addBox(-0.6F, 2.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg_r5 = RightLeg.addOrReplaceChild(
				"LeftLeg_r5", CubeListBuilder.create().texOffs(41, 39).mirror()
						.addBox(-1.5F, -15.3F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(14, 55).addBox(-2.3F, -13.0F, -2.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.0436F, 0.0F, -0.1309F));
		PartDefinition lowerleg_r2 = RightLeg.addOrReplaceChild(
				"lowerleg_r2", CubeListBuilder.create().texOffs(20, 46).mirror()
						.addBox(-3.5F, -8.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild(
				"RightLeg_r3", CubeListBuilder.create().texOffs(26, 55).mirror()
						.addBox(-3.0F, -12.8F, -2.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition RightLeg_r4 = RightLeg.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(28, 63).addBox(-4.7F, -15.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightLeg_r5 = RightLeg.addOrReplaceChild("RightLeg_r5",
				CubeListBuilder.create().texOffs(59, 43).addBox(-3.5F, -2.5F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition feet_r2 = RightLeg
				.addOrReplaceChild(
						"feet_r2", CubeListBuilder.create().texOffs(53, 37).mirror()
								.addBox(-3.5F, -2.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
						PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
