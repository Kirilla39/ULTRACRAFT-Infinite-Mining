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
public class Modelgabriel_body<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelgabriel_body"), "main");
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;

	public Modelgabriel_body(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(24, 61).mirror().addBox(-1.0F, 8.0F, -2.2F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 53).mirror().addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(36, 43).mirror().addBox(0.0F, 3.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition plate_r1 = LeftArm.addOrReplaceChild("plate_r1",
				CubeListBuilder.create().texOffs(0, 47).mirror().addBox(5.0F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false)
						.texOffs(14, 49).mirror().addBox(4.0F, -6.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(49, 47).mirror().addBox(5.0F, -4.5F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition plate_r2 = LeftArm
				.addOrReplaceChild(
						"plate_r2", CubeListBuilder.create().texOffs(28, 53).mirror()
								.addBox(7.0F, -0.7F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
						PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition lowerarm_r1 = LeftArm.addOrReplaceChild(
				"lowerarm_r1", CubeListBuilder.create().texOffs(53, 17).mirror()
						.addBox(-1.0F, -1.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(24, 61).addBox(-2.0F, 8.0F, -2.2F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 43)
						.addBox(-1.0F, 3.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition plate_r3 = RightArm.addOrReplaceChild("plate_r3",
				CubeListBuilder.create().texOffs(0, 47).addBox(-10.0F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(14, 49)
						.addBox(-5.0F, -6.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 47).addBox(-8.0F, -4.5F, -2.5F, 3.0F,
								4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition plate_r4 = RightArm.addOrReplaceChild("plate_r4",
				CubeListBuilder.create().texOffs(28, 53).addBox(-9.0F, -0.7F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition lowerarm_r2 = RightArm.addOrReplaceChild("lowerarm_r2",
				CubeListBuilder.create().texOffs(53, 17).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(24, 19).addBox(-4.0F, 1.0F, -2.5F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 31)
						.addBox(-4.0F, 0.0F, -1.5F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 49)
						.addBox(-4.0F, 9.5F, 1.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(24, 31)
						.addBox(-1.0F, 8.5F, -2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 39)
						.addBox(-3.5F, 5.0F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(52, 56).addBox(-2.0F, -13.5F, -2.7F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition wings = Body.addOrReplaceChild("wings",
				CubeListBuilder.create().texOffs(0, 11).addBox(-6.0F, -19.0F, 3.0F, 12.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition wing_left_r1 = wings.addOrReplaceChild("wing_left_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(2.0F, -4.0F, 2.0F, 28.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(24, 13).mirror().addBox(9.0F, -11.0F, 1.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, -0.1745F, -0.3491F));
		PartDefinition wing_right_r1 = wings.addOrReplaceChild("wing_right_r1",
				CubeListBuilder.create().texOffs(24, 13).addBox(-17.0F, -11.0F, 1.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-30.0F, -4.0F, 2.0F, 28.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, 0.1745F, 0.3491F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
