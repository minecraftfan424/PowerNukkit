package cn.nukkit.entity.hostile;

import cn.nukkit.entity.EntityType;
import cn.nukkit.entity.Smiteable;
import cn.nukkit.item.Item;
import cn.nukkit.level.chunk.Chunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * Created by PetteriM1
 */
public class Phantom extends Mob implements Smiteable {

    public Phantom(EntityType<Phantom> type, Chunk chunk, CompoundTag nbt) {
        super(type, chunk, nbt);
    }

    @Override
    protected void initEntity() {
        super.initEntity();
        this.setMaxHealth(20);
    }

    @Override
    public float getWidth() {
        return 0.9f;
    }

    @Override
    public float getHeight() {
        return 0.5f;
    }

    @Override
    public String getName() {
        return "Phantom";
    }

    @Override
    public Item[] getDrops() {
        return new Item[]{Item.get(470)};
    }
}