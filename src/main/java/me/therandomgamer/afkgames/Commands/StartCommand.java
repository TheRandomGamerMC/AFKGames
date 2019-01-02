package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class StartCommand implements ICommand {

    public void execute(Player p, String[] args) {

        Game g = GameManager.getInstance().getGameFromLeader(p);

        if(g.hasStarted()){
            p.sendMessage(ChatColor.RED+"This game has already started");
            return;
        }
        g.setHasStarted(true);
    }

    public boolean hasPermission(Player p) {

        if(GameManager.getInstance().getLeaders().contains(p)){
            return true;
        }
        return false;
    }
}
