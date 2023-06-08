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
public class Modelmindflayer_head<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelmindflayer_head"),
			"main");
	public final ModelPart Head;

	public Modelmindflayer_head(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 8).addBox(-3.5F, -6.0F, -2.0F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -2.0F, -2.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 14)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
						.addBox(-3.0F, 4.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 40)
						.addBox(-5.0F, -14.0F, 3.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 40).mirror()
						.addBox(2.0F, -14.0F, 3.0F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 20)
						.addBox(-3.0F, -9.0F, -2.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 26)
						.addBox(-0.5F, -9.0F, -2.1F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 39).addBox(1.5F, -1.0F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 39).addBox(1.0F, -1.0F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(60, 16).mirror().addBox(2.0F, -4.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 16).addBox(-3.0F, -4.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
						.mirror().addBox(2.0F, -3.5F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 8)
						.addBox(-3.0F, -3.5F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 27).addBox(-2.0F, -4.0F, -1.5F, 4.0F,
								3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Head
				.addOrReplaceChild(
						"cube_r4", CubeListBuilder.create().texOffs(16, 28).mirror()
								.addBox(-2.0F, -1.0F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(6.0F, -5.0F, 5.0F, 0.2618F, 0.3491F, -0.1745F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(62, 12).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -5.0F, 5.0F, -0.5236F, 0.0873F, 0.2182F));
		PartDefinition cube_r6 = Head
				.addOrReplaceChild(
						"cube_r6", CubeListBuilder.create().texOffs(62, 12).mirror()
								.addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(6.0F, -5.0F, 5.0F, -0.5236F, -0.0873F, -0.2182F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(16, 28).addBox(-1.0F, -1.0F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -5.0F, 5.0F, 0.2618F, -0.3491F, 0.1745F));
		PartDefinition wire_l1 = Head.addOrReplaceChild("wire_l1",
				CubeListBuilder.create().texOffs(12, 25).mirror().addBox(-0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(28, 28).mirror().addBox(-0.5F, 0.5F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, -4.0F, 3.0F));
		PartDefinition cube_r8 = wire_l1.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(58, 22).addBox(11.5F, -18.5F, 9.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 28)
						.addBox(11.5F, -16.5F, 9.5F, 1.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, -3.0F, 0.4363F, 0.0F, 0.6981F));
		PartDefinition cube_r9 = wire_l1.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(32, 28).addBox(4.5F, 2.5F, 8.0F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, -3.0F, 0.0F, 0.0F, -0.9163F));
		PartDefinition wire_r1 = Head
				.addOrReplaceChild("wire_r1",
						CubeListBuilder.create().texOffs(12, 25).addBox(-0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(28, 28).addBox(-0.5F, 0.5F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-5.0F, -4.0F, 3.0F));
		PartDefinition cube_r10 = wire_r1.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(58, 22).addBox(-12.5F, -18.5F, 9.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 28)
						.addBox(-12.5F, -16.5F, 9.5F, 1.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 4.0F, -3.0F, 0.4363F, 0.0F, -0.6981F));
		PartDefinition cube_r11 = wire_r1.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(32, 28).addBox(-5.5F, 2.5F, 8.0F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 4.0F, -3.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition wire = Head
				.addOrReplaceChild(
						"wire", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
								.texOffs(0, 4).addBox(-1.0F, 1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -3.0F, 2.0F));
		PartDefinition cube_r12 = wire.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(58, 22).addBox(-0.5F, 23.0F, 11.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 28)
						.addBox(-0.5F, 8.0F, 11.0F, 1.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r13 = wire.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(32, 28).addBox(-0.5F, 2.0F, 6.5F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
