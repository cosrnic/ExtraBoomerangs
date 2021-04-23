package me.cosmic.extraboomerangs;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemManager {
    public static ItemStack BaseBoomerang;
    public static ItemStack WoodBoomerang;
    public static ItemStack StoneBoomerang;
    public static ItemStack IronBoomerang;
    public static ItemStack DiamondBoomerang;
    public static ItemStack QuartzBoomerang;
    public static ItemStack NetheriteBoomerang;
    public static ItemStack UpgradedNetheriteBoomerang;




    public static void init(){
        createBaseBoomerang();
        createWoodenBoomerang();
        createStoneBoomerang();
        createIronBoomerang();
        createDiamondBoomerang();
        createQuartzBoomerang();
        createNetheriteBoomerang();
        createUpgradedNetheriteBoomerang();





    }
    public static final void createBaseBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&fBase Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+0"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&fUsed to craft advanced &6Boomerangs"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&fCOMMON CRAFTING INGREDIENT"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        BaseBoomerang = item;
    }
    public static final void createWoodenBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&6Wooden Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+2.5"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &6Wood"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6LEGENDARY"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        WoodBoomerang = item;
    }

    public static final void createStoneBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&6Stone Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+5"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &6Stone"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6LEGENDARY"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        StoneBoomerang = item;
    }


    public static final void createIronBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&6Iron Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+7.5"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &6Iron"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6LEGENDARY"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        IronBoomerang = item;
    }

    public static final void createDiamondBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&dDiamond Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+10"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &dDiamonds"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&dMYTHIC"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        DiamondBoomerang = item;
    }

    public static final void createQuartzBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&f&lQuartz Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+15"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &f&lQuartz"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&f&lSPECIAL"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        QuartzBoomerang = item;
    }

    public static final void createNetheriteBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&lNetherite Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+20"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &c&lNetherite"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&c&lSUPREME"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        NetheriteBoomerang = item;
    }
    public static final void createUpgradedNetheriteBoomerang() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat("&c&lUpgraded Netherite Boomerang"));
        List<String> lore = new ArrayList<>();
        lore.add(Utils.chat("&7Damage: &c+100"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"));
        lore.add(Utils.chat("&7Throw a bone at a distance"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&7Infused with: &c&lNetherite BLOCKS!"));
        lore.add(Utils.chat(""));
        lore.add(Utils.chat("&c&lINSANELY SUPREME"));
        meta.setLore(lore);
        item.setItemMeta(meta);

        UpgradedNetheriteBoomerang = item;
    }












}
