package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class JoinCommand implements ICommand {

    public void execute(Player p, String[] args) {
        if(args.length == 1){
            p.sendMessage(ChatColor.RED +  "Specify which players game you want to join");
            return;
        }else if(!GameManager.getInstance().getLeaders().contains(p)){
            p.sendMessage(ChatColor.RED+"This player is currently not hosting a game");
            return;
        }
        Game g = GameManager.getInstance().getGameFromLeader(Bukkit.getPlayer(args[1]));
        if(g.hasStarted()) {
            p.sendMessage(ChatColor.RED + "This game has already started");
            return;
        }else if(g.getPlayers().contains(p)){
            p.sendMessage(ChatColor.RED+"You have already joined this game");
            return;
        }
        g.addPlayer(p);
    }

    public boolean hasPermission(Player p) {
        return true;
    }
}
