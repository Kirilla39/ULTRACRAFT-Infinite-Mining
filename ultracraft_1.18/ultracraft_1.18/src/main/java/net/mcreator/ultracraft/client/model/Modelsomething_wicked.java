package net.mcreator.ultracraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsomething_wicked<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelsomething_wicked"),
			"main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelsomething_wicked(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -11.0F, -2.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 36)
						.addBox(-1.0F, -12.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 39)
						.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -27.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(40, 36).addBox(-0.5F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -14.5F, -0.5F, 12.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
						.addBox(-9.0F, -12.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(6.0F, -12.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 33)
						.addBox(-1.0F, 9.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 16)
						.addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild(
				"RightArm", CubeListBuilder.create().texOffs(32, 35).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(40, 12).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, -22.0F, 0.0F));
		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 10.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild(
				"LeftArm", CubeListBuilder.create().texOffs(34, 0).addBox(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(40, 41).addBox(0.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, -22.0F, 0.0F));
		PartDefinition cube_r2 = LeftArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 10.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 42).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -3.0F, 0.0F));
		PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 12.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(26, 20).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -3.0F, 0.0F));
		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(18, 8).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 12.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
