package com.barkx4.vending.init;

import com.barkx4.vending.items.VendorContractItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems 
{

    public static final VendorContractItem VENDOR_CONTRACT = new VendorContractItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
    
    public static void init()
    {
	    Registry.register(Registry.ITEM, new Identifier("vending", "vendor_contract"), VENDOR_CONTRACT);
    }
}
