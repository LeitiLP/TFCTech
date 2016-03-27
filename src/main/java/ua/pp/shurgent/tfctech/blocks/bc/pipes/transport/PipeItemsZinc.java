package ua.pp.shurgent.tfctech.blocks.bc.pipes.transport;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.ForgeDirection;
import ua.pp.shurgent.tfctech.TFCTech;
import ua.pp.shurgent.tfctech.blocks.bc.pipes.handlers.PipeItemsInsertionHandler;
import ua.pp.shurgent.tfctech.core.ModPipeIconProvider;
import buildcraft.api.core.IIconProvider;
import buildcraft.transport.pipes.PipeItemsClay;
import buildcraft.transport.pipes.events.PipeEventItem;
import buildcraft.transport.pipes.events.PipeEventPriority;

public class PipeItemsZinc extends PipeItemsClay {

	public PipeItemsZinc(Item item) {
		super(item);
	}

	@Override
	public IIconProvider getIconProvider() {
		return TFCTech.instance.pipeIconProvider;
	}

	@Override
	public int getIconIndex(ForgeDirection direction) {
		return ModPipeIconProvider.TYPE.PipeItemsZinc.ordinal();
	}

	@PipeEventPriority(priority = -200)
	public void eventHandler(PipeEventItem.FindDest event) {
		super.eventHandler(event);
	}

	public void eventHandler(PipeEventItem.Entered event) {
		event.item.setInsertionHandler(PipeItemsInsertionHandler.INSTANCE);
	}
}