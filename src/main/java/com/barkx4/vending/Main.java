package com.barkx4.vending;

import com.barkx4.vending.components.BaseVendingComponent;
import com.barkx4.vending.entity.VendorEntity;
import com.barkx4.vending.init.ModEntities;
import com.barkx4.vending.init.ModItems;
import com.barkx4.vending.interfaces.VendingComponent;

import nerdhub.cardinal.components.api.ComponentRegistry;
import nerdhub.cardinal.components.api.ComponentType;
import nerdhub.cardinal.components.api.event.EntityComponentCallback;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer 
{
	public static final String MOD_ID = "vending";

	public static final ComponentType<VendingComponent> VENDING = 
	        ComponentRegistry.INSTANCE.registerIfAbsent(new Identifier("economy:vending_component"), VendingComponent.class);
	
	@Override
    public void onInitialize()
    {       
    	ModItems.init();
    	ModEntities.init();

    	// Add vending component to our vendor entities
    	EntityComponentCallback.event(VendorEntity.class).register((entity, components) -> components.put(VENDING, new BaseVendingComponent()));    	
    }
}
