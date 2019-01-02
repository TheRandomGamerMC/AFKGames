package me.therandomgamer.afkgames.Commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand implements ICommand {

    public void execute(Player c, String[] args) {
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"create: "+ChatColor.RESET+" You can create an afkgames event");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"join: "+ChatColor.RESET+"People can execute this command to join");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"broadcast: "+ChatColor.RESET+"This will broadcast a message for all players to join");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"enablejoin: "+ChatColor.RESET+"This will allow players to join");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"start: "+ChatColor.RESET+"This starts the game");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"setspawn: "+ChatColor.RESET+"Sets the spawn point for players to join");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"remove [player]: "+ChatColor.RESET+"This removes the player");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"add [player]: "+ChatColor.RESET+"Externally add a player");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"onblock remove/keep [material]: "+ChatColor.RESET+"This will either remove all the players not standing on a certain blocktype or remove all players  not standing on a certain blocktype");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"mod: "+ChatColor.RESET+"This will mod a player, mods can remove people");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"unmod: "+ChatColor.RESET+"This will unmod a player");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"leader: "+ChatColor.RESET+"This will set a co leader for this event");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"unleader: "+ChatColor.RESET+"This will remove a co leader for this event");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"togglepvp: "+ChatColor.RESET+"This will toggle pvp");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"togglevis: "+ChatColor.RESET+"This will toggle the visibility of players");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"settimer [time in seconds]: "+ChatColor.RESET+"This will remove the block that you are looking at untill the timer runs out");
        c.sendMessage(ChatColor.AQUA+""+ChatColor.BOLD+"banhammer: "+ChatColor.RESET+"This will give you an axe with which you can remove people");

    }


    public boolean hasPermission(Player p) {
        return p.hasPermission("afkgames.help");
    }
}
