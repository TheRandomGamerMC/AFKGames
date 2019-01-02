package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class RemoveCommand implements ICommand {

    public void execute(Player p, String[] args) {

        Player r = Bukkit.getPlayer(args[1]);
        Game g = GameManager.getInstance().getGameFromPlayer(r);

        if(!(g.getModerators().contains(p) || g.getLeaders().contains(p))){
            p.sendMessage(ChatColor.RED+"You are not a moderator in the game of this player");
            return;
        }
        g.removePlayer(r);
        r.sendMessage(ChatColor.RED+"You have been removed from this AFKGame, thank you for playing!");
        r.teleport(r.getBedSpawnLocation()); // Will add this location into a config file in a later version of the game
    }



    //Checking for mod is done in execute, so I can get game from player specified in args, this way 1 person can be mod in different games
    public boolean hasPermission(Player p) {
        return true;
    }
}
