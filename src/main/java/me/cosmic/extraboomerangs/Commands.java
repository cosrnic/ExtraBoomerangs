package me.cosmic.extraboomerangs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
        Player player = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage(Utils.chat("&cONLY PLAYERS CAN USE THIS COMMAND!"));
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("Boomerangs")) {
            if (player.hasPermission("Boomerangs.give")) {
                if(args.length == 0) {
                    player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cMissing Argument &f[&4LIST/GIVE&f]"));
                }
                if(args.length == 1) {
                    player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cMissing Argument &f[&4LIST/GIVE&f]"));
                }
                if (args.length == 2) {
                    if (args[0].equalsIgnoreCase("give")) {
                        if (args[1].equalsIgnoreCase("Wood")) {
                            if (player.hasPermission("Boomerangs.Wood")) {
                                player.getInventory().addItem(ItemManager.WoodBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }
                        if (args[1].equalsIgnoreCase("Stone")) {
                            if (player.hasPermission("Boomerangs.Stone")) {
                                player.getInventory().addItem(ItemManager.StoneBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }
                        if (args[1].equalsIgnoreCase("Iron")) {
                            if (player.hasPermission("Boomerangs.Iron")) {
                                player.getInventory().addItem(ItemManager.IronBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }
                        if (args[1].equalsIgnoreCase("Diamond")) {
                            if (player.hasPermission("Boomerangs.Diamond")) {
                                player.getInventory().addItem(ItemManager.DiamondBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }
                        if (args[1].equalsIgnoreCase("Quartz")) {
                            if (player.hasPermission("Boomerangs.Quartz")) {
                                player.getInventory().addItem(ItemManager.QuartzBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }
                        if (args[1].equalsIgnoreCase("Netherite")) {
                            if (player.hasPermission("Boomerangs.Netherite")) {
                                player.getInventory().addItem(ItemManager.NetheriteBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }
                        if (args[1].equalsIgnoreCase("UNetherite")) {
                            if (player.hasPermission("Boomerangs.UNetherite")) {
                                player.getInventory().addItem(ItemManager.UpgradedNetheriteBoomerang);
                            } else {
                                player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &cYou do not have permission!"));
                                return true;
                            }
                        }


                }
            }
                if(args[0].equalsIgnoreCase("list")) {
                    player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7-------------------------------"));
                    player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7>> &fList"));
                    player.sendMessage(Utils.chat("&6Wood"));
                    player.sendMessage(Utils.chat("&6Stone"));
                    player.sendMessage(Utils.chat("&6Iron"));
                    player.sendMessage(Utils.chat("&dDiamond"));
                    player.sendMessage(Utils.chat("&f&lQuartz"));
                    player.sendMessage(Utils.chat("&c&lNetherite"));
                    player.sendMessage(Utils.chat("&4&k||&c&lUNetherite&4&k||"));
                    player.sendMessage(Utils.chat("&f[&4Extra&cBoomerangs&f] &7-------------------------------"));
                }
                }

        }


    return true;
}
}
