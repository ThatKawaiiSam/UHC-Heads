package io.github.thatkawaiisam.uhcheads;

import org.bukkit.inventory.ItemStack;

public class UHCHeadsAPI {

    private static UHCHeadsPlugin instance;

    UHCHeadsAPI(UHCHeadsPlugin plugin) {
        instance = plugin;
    }

    public static ItemStack getHead() {
        return instance.getItem();
    }
}
