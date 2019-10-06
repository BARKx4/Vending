package com.barkx4.vending.vending;

import com.barkx4.vending.Main;
import com.barkx4.vending.entity.VendorEntity;

import net.minecraft.nbt.CompoundTag;

public class Vending 
{
	public static void set(VendorEntity vendor, CompoundTag vendorData)
	{
		Main.VENDING.get(vendor).set(vendorData);
	}
	
	public static CompoundTag get(VendorEntity vendor)
	{
		return Main.VENDING.get(vendor).get();
	}
}
