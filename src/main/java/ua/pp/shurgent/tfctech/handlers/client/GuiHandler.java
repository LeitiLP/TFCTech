package ua.pp.shurgent.tfctech.handlers.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler extends ua.pp.shurgent.tfctech.handlers.GuiHandler
{
	@Override
	public Object getClientGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z) 
	{
		/*TileEntity tileEntity;
		
		try
		{
			tileEntity = world.getTileEntity(x, y, z);
		}
		catch(Exception e)
		{
			return null;
		}
		*/
		switch (Id)
		{
//			case GuiIdCustom:
//				return new GuiCustom(player.inventory, (TileEntityCustom)tileEntity, world, x, y, z);
				
			default:
				return null;
		}
	}
}
