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
public class Modelminos_prime_legs<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelminos_prime_legs"),
			"main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelminos_prime_legs(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-2.0F, -1.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(53, 22).mirror().addBox(-1.4F, 3.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(28, 37).mirror().addBox(-1.9F, 4.0F, -2.3F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 53)
						.mirror().addBox(-1.4F, 7.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(37, 57)
						.addBox(-0.9F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition feet_r1 = LeftLeg.addOrReplaceChild("feet_r1",
				CubeListBuilder.create().texOffs(14, 26).mirror().addBox(0.0F, -1.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(42, 28).mirror().addBox(0.0F, -2.0F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, -0.0873F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 31).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 22)
						.addBox(-1.6F, 3.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-1.6F, 7.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 37)
						.addBox(-2.1F, 4.0F, -2.3F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 57).mirror()
						.addBox(-1.1F, -2.0F, 0.0F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition feet_r2 = RightLeg.addOrReplaceChild("feet_r2",
				CubeListBuilder.create().texOffs(42, 28).addBox(-4.0F, -2.0F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 26)
						.addBox(-4.0F, -1.0F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, 0.0873F, 0.0F));
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
