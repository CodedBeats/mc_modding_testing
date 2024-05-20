package io.github.codedbeats.testing_mod;

import io.github.codedbeats.testing_mod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestingMod.MOD_ID)
public class TestingMod {
    public static final String MOD_ID = "testing_mod";

    public TestingMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // add items register to bus
        ItemInit.ITEMS.register(bus);
    }
}
