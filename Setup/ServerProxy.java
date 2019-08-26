package com.root.sorcery.Setup;

import net.minecraft.world.World;

public class ServerProxy  implements IProxy {

    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
}
