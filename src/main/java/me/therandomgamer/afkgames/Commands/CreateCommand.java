package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.entity.Player;

public class CreateCommand implements ICommand {

    public void execute(Player p, String[] args) {

        Game g = new Game(p);
        GameManager.getInstance().addGame(g);

    }

    public boolean hasPermission(Player p) {

        if(p.hasPermission("afkgames.create") && ! GameManager.getInstance().getLeaders().contains(p)){
            return true;
        }
        return false;
    }
}
