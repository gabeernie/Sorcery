package com.root.sorcery.Setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
