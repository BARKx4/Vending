package com.barkx4.vending.init;

import com.barkx4.vending.entity.VendorEntity;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities 
{
    public static final EntityType<VendorEntity> VENDOR =
        Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("vending", "vendor"),
            FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, VendorEntity::new).size(EntityDimensions.fixed(0.6F, 1.8F)).build()
        );
    
	public static void init()
	{
		
	}
}
