package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CreateCommand implements ICommand {

    public void execute(Player p, String[] args) {

        if(p instanceof Player){
            Game g = new Game(p);
            GameManager.getInstance().addGame(g);
        }else {
            p.sendMessage(ChatColor.RED+"this command can only be executed by a player");
        }
    }

    public boolean hasPermission(Player p) {

        if(p.hasPermission("afkgames.create")){
            return true;
        }
        return false;
    }
}
