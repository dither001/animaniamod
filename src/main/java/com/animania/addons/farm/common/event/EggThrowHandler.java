package com.animania.addons.farm.common.event;

import com.animania.Animania;
import com.animania.addons.extra.common.entity.rodents.EntityFerretGrey;
import com.animania.addons.extra.common.entity.rodents.EntityFerretWhite;
import com.animania.addons.extra.common.entity.rodents.EntityHedgehog;
import com.animania.addons.farm.common.handler.FarmAddonItemHandler;
import com.animania.addons.farm.config.FarmConfig;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Animania.MODID)
public class EggThrowHandler
{

	@SubscribeEvent
	public static void notify(PlayerInteractEvent.RightClickItem event)
	{

		ItemStack stack = event.getItemStack();
		EntityPlayer player = event.getEntityPlayer();
		BlockPos pos = event.getPos();
		World world = event.getWorld();

		if (stack != ItemStack.EMPTY && (stack.getItem() == Items.EGG || stack.getItem() == FarmAddonItemHandler.brownEgg))
		{

			if (FarmConfig.settings.allowEggThrowing)
			{
				int esize = world.loadedEntityList.size();
				for (int k = 0; k <= esize - 1; k++)
				{
					Entity entity = world.loadedEntityList.get(k);

					double xt = entity.posX;
					double yt = entity.posY;
					double zt = entity.posZ;
					int x1 = MathHelper.floor(player.posX);
					int y1 = MathHelper.floor(player.posY);
					int z1 = MathHelper.floor(player.posZ);
					double x2 = Math.abs(xt - x1);
					double y2 = Math.abs(yt - y1);
					double z2 = Math.abs(zt - z1);

					// TODO
					if (entity != null && x2 <= 3 && y2 <= 2 && z2 <= 3 && (entity instanceof EntityFerretWhite || entity instanceof EntityFerretGrey || entity instanceof EntityHedgehog))
					{
						event.getEntityPlayer().swingArm(event.getHand());
						event.isCanceled();
						event.setCanceled(true);
					}
				}

			} else
			{
				// event.getEntityPlayer().swingArm(event.getHand());
				event.isCanceled();
				event.setCanceled(true);
			}

		}
	}

}
