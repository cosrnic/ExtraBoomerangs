package me.cosmic.extraboomerangs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import java.util.Objects;

public class Boomerangs implements Listener {

    ExtraBoomerangs plugin;

    public Boomerangs(ExtraBoomerangs plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e){

        Player p = e.getPlayer();

        if(e.getAction().equals(Action.RIGHT_CLICK_AIR)) {

            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&6Wooden Boomerang"))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&6") + pname + Utils.chat("&6's Wooden Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.WoodBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.WoodBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(5, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&6Stone Boomerang"))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&6") + pname + Utils.chat("&6's Stone Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.StoneBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.StoneBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(7.5, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&6Iron Boomerang"))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&6") + pname + Utils.chat("&6's Iron Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.IronBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.IronBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(10, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&dDiamond Boomerang"))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&d") + pname + Utils.chat("&d's Diamond Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.DiamondBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.DiamondBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(12.5, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&f&lQuartz Boomerang"))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&f&l") + pname + Utils.chat("&f&l's Quartz Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.QuartzBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.QuartzBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(17.5, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&c&lNetherite Boomerang"))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&c&l") + pname + Utils.chat("&c&lNetherite Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.NetheriteBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.NetheriteBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(25, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
            if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Utils.chat("&c&lUpgraded Netherite Boomerang"))) {
                if (Objects.requireNonNull(p.getInventory().getItemInMainHand().getItemMeta().getLore()).contains(Utils.chat("&6Item Ability: Swing &e&lRIGHT CLICK"))) {

                    ArmorStand as = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    Location destination = p.getLocation().add(p.getLocation().getDirection().multiply(10));


                    String pname = p.getName();
                    as.setCustomNameVisible(true);
                    as.setCustomName(Utils.chat("&c&l") + pname + Utils.chat("&c&lUpgraded Netherite Boomerang"));
                    as.setArms(true);
                    as.setGravity(false);
                    as.setVisible(false);
                    as.setItemInHand(new ItemStack(Material.BONE));
                    as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

                    p.getInventory().removeItem(ItemManager.UpgradedNetheriteBoomerang);

                    Vector vector = destination.subtract(p.getLocation()).toVector();

                    new BukkitRunnable() {
                        int distance = 40;
                        int i = 0;

                        public void run() {
                            EulerAngle rot = as.getRightArmPose();
                            EulerAngle rotnew = rot.add(0, 20, 0);
                            as.setRightArmPose(rotnew);

                            if (i >= distance) {
                                as.teleport(as.getLocation().subtract(vector.normalize()));
                                if (i >= distance * 2) {
                                    as.remove();
                                    p.getInventory().addItem(ItemManager.UpgradedNetheriteBoomerang);
                                    cancel();
                                }
                            } else {
                                as.teleport(as.getLocation().add(vector.normalize()));
                            }
                            i++;

                            for (Entity entity : as.getLocation().getChunk().getEntities()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity livingentity = (LivingEntity) entity;
                                        if (!(livingentity == p)) {
                                            livingentity.damage(100, p);
                                        }
                                    }
                                }
                            }


                        }
                    }.runTaskTimer(plugin, 1L, 1L);
                }
            }
        }





    }

    @EventHandler
    public void onEntity(PlayerInteractAtEntityEvent e) {
        if(e.getRightClicked() instanceof ArmorStand){
            ArmorStand as = (ArmorStand) e.getRightClicked();
            if(as.getName().contains("Boomerang")){
                e.setCancelled(true);
            }
        }
    }

}
