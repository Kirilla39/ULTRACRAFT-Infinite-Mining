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

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelswordsmachine_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelswordsmachine_body"),
			"main");
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;

	public Modelswordsmachine_body(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(46, 10).addBox(-0.9F, -1.9F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(0, 41)
						.addBox(-0.9F, 1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-1.0F, 9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-1.1F, 5.8F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(10, 50)
						.addBox(1.0F, 13.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(0.0F, 13.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r1 = LeftArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 16).addBox(-1.0F, 0.5F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 16)
						.addBox(-1.0F, 2.0F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.4363F, 0.7854F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(15, 53).addBox(-1.5F, 15.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-0.5F, 15.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 9)
						.addBox(-2.1F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 30)
						.addBox(-2.1F, 3.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 25)
						.addBox(-2.1F, 10.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 48)
						.addBox(-1.5F, 1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 48)
						.addBox(-1.6F, 7.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(50, 39).addBox(-2.0F, -0.4F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(12, 13).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 16)
						.addBox(-3.5F, 1.5F, -2.5F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.5F, 1.0F, 1.5F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(-1.0F, 8.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).texOffs(31, 4)
						.addBox(-2.0F, 7.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 8)
						.addBox(-3.0F, 6.0F, -1.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 51)
						.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
						.addBox(-4.5F, 0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 25).mirror()
						.addBox(1.5F, 0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(43, 33).addBox(2.0F, -3.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 37).addBox(-4.0F, -3.0F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(22, 22).addBox(-4.0F, 0.0F, 0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
