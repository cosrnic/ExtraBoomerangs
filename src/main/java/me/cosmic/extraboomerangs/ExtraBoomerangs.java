package me.cosmic.extraboomerangs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class ExtraBoomerangs extends JavaPlugin {
    public static ExtraBoomerangs plugin;

    @Override
    public void onEnable() {
        plugin = this;
        ItemManager.init();
        // Plugin startup logic
        Commands commands = new Commands();
        getCommand("Boomerangs").setExecutor(commands);
        getServer().getPluginManager().registerEvents(new Boomerangs(this), this);
        getServer().getConsoleSender().sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &7Plugin has &aSuccessfully Started&7!"));
        getServer().getConsoleSender().sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &7Plugin coded by &4cosmicvfx&7#&c5436 &7on &9Discord"));


        ItemStack EBBlock = new ItemStack(Material.BONE_BLOCK);
        ItemMeta meta = EBBlock.getItemMeta();
        meta.setDisplayName(Utils.chat("&f&lEnchanted Bone Block"));
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.LUCK, 1, true);
        EBBlock.setItemMeta(meta);


        NamespacedKey ebbkey = new NamespacedKey(this, "ebblock");
        ShapedRecipe ebbrecipe = new ShapedRecipe(ebbkey, EBBlock);

        ebbrecipe.shape("BBB","BBB","BBB");
        ebbrecipe.setIngredient('B', Material.BONE_BLOCK);


        Bukkit.addRecipe(ebbrecipe);
        NamespacedKey baseboomerangekey = new NamespacedKey(this, "baseboomerang");
        ShapedRecipe baseboomerangrecipe = new ShapedRecipe(baseboomerangekey, ItemManager.BaseBoomerang);

        baseboomerangrecipe.shape("BBB", "BbB", "BBB");

        baseboomerangrecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        baseboomerangrecipe.setIngredient('b', Material.BOW);

        Bukkit.addRecipe(baseboomerangrecipe);


        NamespacedKey WoodBoomerangKey = new NamespacedKey(this, "woodboomerang");
        ShapedRecipe WoodBoomerangRecipe = new ShapedRecipe(WoodBoomerangKey, ItemManager.WoodBoomerang);

        WoodBoomerangRecipe.shape("WBW", "BbB", "WBW");

        WoodBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        WoodBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.BaseBoomerang));
        WoodBoomerangRecipe.setIngredient('W', Material.OAK_WOOD);

        Bukkit.addRecipe(WoodBoomerangRecipe);

        NamespacedKey StoneBoomerangKey = new NamespacedKey(this, "stoneboomerang");
        ShapedRecipe StoneBoomerangRecipe = new ShapedRecipe(StoneBoomerangKey, ItemManager.StoneBoomerang);

        StoneBoomerangRecipe.shape("SBS", "BbB", "SBS");

        StoneBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        StoneBoomerangRecipe.setIngredient('S', Material.STONE);
        StoneBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.BaseBoomerang));

        Bukkit.addRecipe(StoneBoomerangRecipe);

        NamespacedKey IronBoomerangKey = new NamespacedKey(this, "ironboomerang");
        ShapedRecipe IronBoomerangRecipe = new ShapedRecipe(IronBoomerangKey, ItemManager.IronBoomerang);

        IronBoomerangRecipe.shape("IBI", "BbB", "IBI");

        IronBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        IronBoomerangRecipe.setIngredient('I', Material.IRON_INGOT);
        IronBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.BaseBoomerang));

        Bukkit.addRecipe(IronBoomerangRecipe);

        NamespacedKey DiamondBoomerangKey = new NamespacedKey(this, "diamondboomerang");
        ShapedRecipe DiamondBoomerangRecipe = new ShapedRecipe(DiamondBoomerangKey, ItemManager.DiamondBoomerang);

        DiamondBoomerangRecipe.shape("DBD", "BbB", "DBD");

        DiamondBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        DiamondBoomerangRecipe.setIngredient('D', Material.DIAMOND);
        DiamondBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.BaseBoomerang));

        Bukkit.addRecipe(DiamondBoomerangRecipe);


        NamespacedKey QuartzBoomerangKey = new NamespacedKey(this, "quartzboomerang");
        ShapedRecipe QuartzBoomerangRecipe = new ShapedRecipe(QuartzBoomerangKey, ItemManager.QuartzBoomerang);

        QuartzBoomerangRecipe.shape("QBQ", "BbB", "QBQ");

        QuartzBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        QuartzBoomerangRecipe.setIngredient('Q', Material.QUARTZ_BLOCK);
        QuartzBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.BaseBoomerang));

        Bukkit.addRecipe(QuartzBoomerangRecipe);

        NamespacedKey NetheriteBoomerangKey = new NamespacedKey(this, "netheriteboomerang");
        ShapedRecipe NetheriteBoomerangRecipe = new ShapedRecipe(NetheriteBoomerangKey, ItemManager.NetheriteBoomerang);

        NetheriteBoomerangRecipe.shape("NBN", "BbB", "NBN");

        NetheriteBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        NetheriteBoomerangRecipe.setIngredient('N', Material.NETHERITE_INGOT);
        NetheriteBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.BaseBoomerang));

        Bukkit.addRecipe(NetheriteBoomerangRecipe);

        NamespacedKey UpgradedNetheriteBoomerangKey = new NamespacedKey(this, "upgradednetheriteboomerang");
        ShapedRecipe UpgradedNetheriteBoomerangRecipe = new ShapedRecipe(UpgradedNetheriteBoomerangKey, ItemManager.UpgradedNetheriteBoomerang);

        UpgradedNetheriteBoomerangRecipe.shape("NBN", "BbB", "NBN");

        UpgradedNetheriteBoomerangRecipe.setIngredient('B', new RecipeChoice.ExactChoice(EBBlock));
        UpgradedNetheriteBoomerangRecipe.setIngredient('N', Material.NETHERITE_BLOCK);
        UpgradedNetheriteBoomerangRecipe.setIngredient('b', new RecipeChoice.ExactChoice(ItemManager.NetheriteBoomerang));

        Bukkit.addRecipe(UpgradedNetheriteBoomerangRecipe);













    }

    @Override
    public void onDisable() {
        plugin = null;
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &7Plugin has &cStopped!&7!"));
        getServer().getConsoleSender().sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &7Plugin coded by &4Cosmic&7#&c0022 &7on &9Discord"));
    }
}
