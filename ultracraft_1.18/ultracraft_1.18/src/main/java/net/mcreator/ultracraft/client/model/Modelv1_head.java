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
public class Modelv1_head<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelv_1_head"), "main");
	public final ModelPart Head;

	public Modelv1_head(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(47, 29).mirror().addBox(1.0F, -31.0F, 5.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(47, 29).addBox(-2.0F, -31.0F, 5.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 24)
						.addBox(-1.5F, -27.0F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-2.0F, -31.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.0F, -31.0F, 0.5F, 4.0F,
								5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Head_r2 = Head
				.addOrReplaceChild(
						"Head_r2", CubeListBuilder.create().texOffs(37, 30).mirror()
								.addBox(1.0F, -31.7F, -4.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(37, 30).addBox(-2.0F, -31.7F, -4.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition Head_r4 = Head
				.addOrReplaceChild(
						"Head_r4", CubeListBuilder.create().texOffs(51, 41).mirror()
								.addBox(2.6F, -27.5F, -1.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, -0.0436F, -0.0436F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(51, 41).addBox(-3.6F, -27.5F, -1.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 0.0436F, 0.0436F));
		PartDefinition Head_r6 = Head
				.addOrReplaceChild(
						"Head_r6", CubeListBuilder.create().texOffs(27, 46).mirror()
								.addBox(-3.3F, -29.4F, -4.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.0436F, 0.1745F));
		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(27, 46).addBox(2.3F, -29.4F, -4.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));
		PartDefinition Head_r8 = Head
				.addOrReplaceChild(
						"Head_r8", CubeListBuilder.create().texOffs(34, 0).mirror()
								.addBox(5.5F, -30.5F, -6.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.0436F, -0.0436F, -0.1309F));
		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(34, 0).addBox(-6.5F, -30.5F, -6.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.0436F, 0.0436F, 0.1309F));
		PartDefinition neck_r1 = Head.addOrReplaceChild("neck_r1",
				CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -23.0F, -15.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
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
