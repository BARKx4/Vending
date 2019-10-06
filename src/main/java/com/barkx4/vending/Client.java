package com.barkx4.vending;

import com.barkx4.vending.client.render.VendorRenderer;
import com.barkx4.vending.entity.VendorEntity;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;

public class Client implements ClientModInitializer
{
	@Override
	public void onInitializeClient() 
	{
		EntityRendererRegistry.INSTANCE.register(VendorEntity.class, (entityRenderDispatcher, context) -> new VendorRenderer(entityRenderDispatcher));
	}
}
