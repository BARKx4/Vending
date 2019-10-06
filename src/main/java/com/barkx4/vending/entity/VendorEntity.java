package com.barkx4.vending.entity;


import java.util.Collections;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Arm;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VendorEntity extends LivingEntity
{
	public VendorEntity(EntityType<? extends LivingEntity> entityType, World world) 
	{
		super(entityType, world);
	    this.setCustomName(new LiteralText("Egg Vendor"));
	    this.setCustomNameVisible(true);
	}

	@Override
	public void move(MovementType movementType_1, Vec3d vec3d_1) 
	{
		// Do nothing.
	}
	
	@Override
	protected void initDataTracker() 
	{
		super.initDataTracker();
	}

	@Override
	public Iterable<ItemStack> getArmorItems() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getEquippedStack(EquipmentSlot equipmentSlot) 
	{
		return ItemStack.EMPTY;
	}

	@Override
	public void setEquippedStack(EquipmentSlot var1, ItemStack var2) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public Arm getMainArm() 
	{
		return Arm.RIGHT;
	}
	
	@Override 
	protected void applyDamage(DamageSource damageSource, float damage)
	{
		this.remove();
		return;
		/*
		if (damageSource.getAttacker() instanceof PlayerEntity)
		{
			CompoundTag vendingData = Vending.get(this);
			UUID UUIDowner = vendingData.getUuid("owner");
			PlayerEntity playerAttacker = (PlayerEntity) damageSource.getAttacker();
			
			if (playerAttacker.getUuid() == UUIDowner)
			{
		
			}
		}*/
	}
	
	@Override
	public Iterable<ItemStack> getItemsEquipped() 
	{
	      return Collections.emptyList();
	}
}
