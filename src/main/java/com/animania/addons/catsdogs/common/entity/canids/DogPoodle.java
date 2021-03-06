package com.animania.addons.catsdogs.common.entity.canids;

import net.minecraft.world.World;

public class DogPoodle
{

	public static class EntityFemalePoodle extends EntityFemaleDogBase
	{
	
		public EntityFemalePoodle(World world)
		{
			super(world);
			this.type = DogType.POODLE;
		}
		
		@Override
		public int getPrimaryEggColor()
		{
			return -658707;
		}
		
		@Override
		public int getSecondaryEggColor()
		{
			return -5537189;
		}
		
		@Override
		public int getVariantCount()
		{
			return 3;
		}
		
		@Override
		public int getEyeColorForVariant(int variant)
		{
			switch(variant)
			{
			case 0: 
				return 0xECECEC;
			case 1:
				return 0x1D1D1D;
			default:
				return 0x874D29;
			}
		}
	}

	public static class EntityMalePoodle extends EntityMaleDogBase
	{
	
		public EntityMalePoodle(World world)
		{
			super(world);
			this.type = DogType.POODLE;
		}
		
		@Override
		public int getPrimaryEggColor()
		{
			return -658707;
		}
		
		@Override
		public int getSecondaryEggColor()
		{
			return -5537189;
		}
		
		@Override
		public int getVariantCount()
		{
			return 3;
		}
		
		@Override
		public int getEyeColorForVariant(int variant)
		{
			switch(variant)
			{
			case 0: 
				return 0xECECEC;
			case 1:
				return 0x1D1D1D;
			default:
				return 0x874D29;
			}
		}
	}

	public static class EntityPuppyPoodle extends EntityPuppyBase
	{
	
		public EntityPuppyPoodle(World world)
		{
			super(world);
			this.type = DogType.POODLE;
		}
		
		@Override
		public int getPrimaryEggColor()
		{
			return -658707;
		}
		
		@Override
		public int getSecondaryEggColor()
		{
			return -5537189;
		}
		
		@Override
		public int getVariantCount()
		{
			return 3;
		}
		
		@Override
		public int getEyeColorForVariant(int variant)
		{
			switch(variant)
			{
			case 0: 
				return 0xECECEC;
			case 1:
				return 0x1D1D1D;
			default:
				return 0x874D29;
			}
		}
	}

}
