package io.github.thatkawaiisam.uhcheads;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Iterator;

public class UHCHeadsPlugin extends JavaPlugin {

    @Getter private UHCHeadItem item;

    @Override
    public void onEnable() {
        new UHCHeadsAPI(this);
        item = new UHCHeadItem();
        addRecipe();
    }

    @Override
    public void onDisable() {
        removeRecipe(item);
    }

    public void addRecipe() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(item);
        shapedRecipe.shape("&&&", "&/&", "&&&");
        shapedRecipe.setIngredient('&', Material.GOLD_INGOT);
        shapedRecipe.setIngredient('/', Material.SKULL_ITEM, 3);
        Bukkit.getServer().addRecipe(shapedRecipe);
    }

    //Credit to Joel for this method.
    public void removeRecipe(ItemStack itemStack) {
        Iterator<Recipe> iterator = getServer().recipeIterator();

        while (iterator.hasNext()) {
            Recipe recipe = iterator.next();

            if (recipe != null && recipe.getResult() == itemStack) {
                iterator.remove();
            }
        }
    }


}
