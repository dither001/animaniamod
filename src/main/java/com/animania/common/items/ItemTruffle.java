package com.animania.common.items;

import com.animania.Animania;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTruffle extends Item
{
    private String name = "truffle";

    // TODO Make Food

    public ItemTruffle() {
        super();
        this.setCreativeTab(Animania.TabAnimaniaResources);
        this.setRegistryName(new ResourceLocation(Animania.MODID, this.name));
        GameRegistry.register(this);
        this.setUnlocalizedName(Animania.MODID + "_" + this.name);
    }

    public String getName() {
        return this.name;
    }

}