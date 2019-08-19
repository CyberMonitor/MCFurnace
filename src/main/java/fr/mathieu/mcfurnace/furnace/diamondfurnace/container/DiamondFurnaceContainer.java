package fr.mathieu.mcfurnace.furnace.diamondfurnace.container;

import fr.mathieu.mcfurnace.utils.MCFurnaceBlocksRegistered;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;

public class DiamondFurnaceContainer extends AbstractDiamondFurnaceContainer {

    public DiamondFurnaceContainer(int p_i50082_1_, PlayerInventory p_i50082_2_) {
        super(MCFurnaceBlocksRegistered.DIAMOND_FURNACE_CONTAINER, IRecipeType.SMELTING, p_i50082_1_, p_i50082_2_);
    }

    public DiamondFurnaceContainer(int p_i50083_1_, PlayerInventory p_i50083_2_, IInventory p_i50083_3_, IIntArray p_i50083_4_) {
        super(MCFurnaceBlocksRegistered.DIAMOND_FURNACE_CONTAINER, IRecipeType.SMELTING, p_i50083_1_, p_i50083_2_, p_i50083_3_, p_i50083_4_);
    }

    public DiamondFurnaceContainer(int windowsID, PlayerInventory playerInventoryIn, PacketBuffer packetBuffer) {
        this(windowsID, playerInventoryIn);

    }


    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }
}
