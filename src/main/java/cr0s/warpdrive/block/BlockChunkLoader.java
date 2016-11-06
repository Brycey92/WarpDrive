package cr0s.warpdrive.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockChunkLoader extends BlockAbstractContainer {
	IIcon iconBuffer;
	
	public BlockChunkLoader() {
		super(Material.iron);
		setBlockName("warpdrive.machines.ChunkLoader");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityChunkLoader();
	}
	
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		iconBuffer = par1IconRegister.registerIcon("warpdrive:chunkLoader");
	}
	
	@Override
	public IIcon getIcon(int side, int damage) {
		return iconBuffer;
	}
}
