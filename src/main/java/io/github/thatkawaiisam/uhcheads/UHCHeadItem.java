package io.github.thatkawaiisam.uhcheads;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class UHCHeadItem extends ItemStack {

    public UHCHeadItem() {
        this.setType(Material.GOLDEN_APPLE);
        this.setAmount(1);

        //Meta
        ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setDisplayName("§eGolden Head");
        this.setItemMeta(itemMeta);
    }
}
