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

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelminos_prime_boss<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultracraft", "modelminos_prime_boss"),
			"main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public Modelminos_prime_boss(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-1.4F, 10.0F, -2.3F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(53, 2).mirror().addBox(-1.9F, 11.7F, -2.3F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
						.texOffs(48, 67).mirror().addBox(-1.4F, 16.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 81).mirror().addBox(-0.9F, 10.0F, 0.0F, 2.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 13)
						.mirror().addBox(-0.9F, 0.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 13)
						.addBox(-5.9F, 0.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 0.0F, 0.0F));
		PartDefinition feet_r1 = LeftLeg.addOrReplaceChild("feet_r1",
				CubeListBuilder.create().texOffs(78, 61).mirror().addBox(0.5F, -2.0F, -3.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(54, 18).mirror().addBox(0.5F, -3.0F, -6.4F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 24.0F, 0.0F, 0.2618F, -0.0873F, 0.0F));
		PartDefinition feet_r2 = LeftLeg.addOrReplaceChild("feet_r2",
				CubeListBuilder.create().texOffs(0, 13).mirror().addBox(0.0F, -1.0F, -7.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(15, 59).mirror().addBox(0.0F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 24.0F, 0.0F, 0.0F, -0.0873F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild(
				"LeftLeg_r1", CubeListBuilder.create().texOffs(40, 14).mirror()
						.addBox(-1.7F, 5.0F, -2.7F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 1.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild(
				"LeftLeg_r2", CubeListBuilder.create().texOffs(0, 44).mirror()
						.addBox(-2.0F, -1.0F, -2.4F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 1.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(74, 34).addBox(-2.6F, 10.0F, -2.3F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 67)
						.addBox(-2.6F, 16.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 2)
						.addBox(-3.1F, 11.7F, -2.3F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(0, 81)
						.addBox(-1.1F, 10.0F, 0.0F, 2.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 0.0F, 0.0F));
		PartDefinition feet_r3 = RightLeg.addOrReplaceChild("feet_r3",
				CubeListBuilder.create().texOffs(15, 59).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-5.0F, -1.0F, -7.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 24.0F, 0.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition feet_r4 = RightLeg.addOrReplaceChild("feet_r4",
				CubeListBuilder.create().texOffs(78, 61).addBox(-4.5F, -2.0F, -3.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 18)
						.addBox(-4.5F, -3.0F, -6.4F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 24.0F, 0.0F, 0.2618F, 0.0873F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(40, 14).addBox(-3.3F, 5.0F, -2.7F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.1F, 1.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(0, 44).addBox(-3.0F, -1.0F, -2.4F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(6.0F, -12.0F, 0.0F));
		PartDefinition upperarm_r1 = LeftArm.addOrReplaceChild("upperarm_r1",
				CubeListBuilder.create().texOffs(0, 72).mirror().addBox(5.5F, -21.0F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false).texOffs(62, 25).mirror().addBox(5.0F, -25.0F, -2.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition lowerarm_l = LeftArm.addOrReplaceChild("lowerarm_l", CubeListBuilder.create(), PartPose.offset(1.0F, 6.0F, 0.0F));
		PartDefinition hand_r1 = lowerarm_l
				.addOrReplaceChild(
						"hand_r1", CubeListBuilder.create().texOffs(40, 76).mirror()
								.addBox(6.0F, -13.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(-6.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition snake_r1 = lowerarm_l.addOrReplaceChild("snake_r1",
				CubeListBuilder.create().texOffs(26, 72).mirror().addBox(6.5F, -5.0F, -2.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(30, 58).mirror().addBox(6.5F, 0.5F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(13, 67).mirror().addBox(6.7F, -2.5F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, 7.0F, 0.0F, -0.0436F, 0.0F, -0.1309F));
		PartDefinition lowerarm_r1 = lowerarm_l.addOrReplaceChild(
				"lowerarm_r1", CubeListBuilder.create().texOffs(16, 74).mirror()
						.addBox(5.5F, -19.0F, -1.5F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, -0.0436F, 0.1745F, -0.0436F));
		PartDefinition elbow_r1 = lowerarm_l
				.addOrReplaceChild(
						"elbow_r1", CubeListBuilder.create().texOffs(0, 64).mirror()
								.addBox(-2.0F, -1.2F, -2.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.0436F, 0.1745F, -0.0436F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-7.0F, -12.0F, 0.0F));
		PartDefinition upperarm_r2 = RightArm.addOrReplaceChild("upperarm_r2",
				CubeListBuilder.create().texOffs(0, 72).addBox(-8.5F, -21.0F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(62, 25)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition lowerarm_r = RightArm.addOrReplaceChild("lowerarm_r", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition hand_r2 = lowerarm_r.addOrReplaceChild("hand_r2",
				CubeListBuilder.create().texOffs(40, 76).addBox(-8.0F, -13.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition snake_r2 = lowerarm_r.addOrReplaceChild("snake_r2",
				CubeListBuilder.create().texOffs(26, 72).addBox(-10.5F, -5.0F, -2.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(30, 58)
						.addBox(-10.5F, 0.5F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(13, 67).addBox(-10.7F, -2.5F, -2.5F, 4.0F,
								2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 7.0F, 0.0F, -0.0436F, 0.0F, 0.1309F));
		PartDefinition lowerarm_r2 = lowerarm_r.addOrReplaceChild("lowerarm_r2",
				CubeListBuilder.create().texOffs(0, 64).addBox(-2.0F, -1.2F, -2.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -0.0436F, -0.1745F, 0.0436F));
		PartDefinition lowerarm_r3 = lowerarm_r.addOrReplaceChild("lowerarm_r3",
				CubeListBuilder.create().texOffs(16, 74).addBox(-8.5F, -19.0F, -1.5F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, -0.0436F, -0.1745F, 0.0436F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -15.0F, -2.0F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-4.0F, -8.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-4.5F, -3.0F, -2.5F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 10)
						.addBox(-2.0F, -7.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 25)
						.addBox(-4.0F, -15.0F, 0.0F, 8.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-5.0F, -14.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(4.0F, -14.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(32, 7).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition pipis_r1 = Body.addOrReplaceChild("pipis_r1",
				CubeListBuilder.create().texOffs(26, 0).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(55, 54).addBox(-4.5F, 0.0F, 0.7F, 9.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -5.0F, 0.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.5F, -2.0F, -3.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(24, 39).addBox(-5.0F, -6.0F, -4.0F, 10.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition heart = Body.addOrReplaceChild("heart", CubeListBuilder.create(), PartPose.offset(1.0F, -15.0F, 0.0F));
		PartDefinition heart_r1 = heart.addOrReplaceChild("heart_r1",
				CubeListBuilder.create().texOffs(43, 65).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition heart_r2 = heart.addOrReplaceChild("heart_r2",
				CubeListBuilder.create().texOffs(80, 28).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(26, 15).addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 13)
						.addBox(1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.0F, -6.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 78)
						.addBox(-3.0F, -6.0F, -4.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 78)
						.addBox(2.0F, -6.0F, -4.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(73, 7)
						.addBox(-3.0F, -8.0F, -4.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 72)
						.addBox(-2.0F, -11.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 44)
						.addBox(-0.5F, -9.0F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -12.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 4)
						.addBox(0.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 18)
						.addBox(-2.5F, -9.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 21)
						.addBox(2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 40)
						.addBox(-3.5F, -9.0F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-2.0F, -12.0F, -4.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 67)
						.addBox(0.0F, -11.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(-2.0F, -13.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(35, 47).addBox(1.5F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(4, 81).addBox(1.0F, -6.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(15, 44).addBox(-2.0F, -5.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(31, 25).addBox(-1.0F, 4.2F, -3.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(22, 27)
						.addBox(-3.0F, -2.0F, -3.3F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition chin_r1 = Head.addOrReplaceChild("chin_r1",
				CubeListBuilder.create().texOffs(23, 25).addBox(-1.5F, -25.3F, -2.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 12)
						.addBox(-2.5F, -25.3F, -1.8F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(58, 36).addBox(-3.0F, -3.0F, -1.5F, 6.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
