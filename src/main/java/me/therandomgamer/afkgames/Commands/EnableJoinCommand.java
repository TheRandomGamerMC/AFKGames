package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.entity.Player;

public class EnableJoinCommand implements ICommand {


    public void execute(Player p, String[] args) {

        Game g  = GameManager.getInstance().getGameFromLeader(p);
        g.setEnableJoin(true);


    }

    public boolean hasPermission(Player p) {

        if(GameManager.getInstance().getLeaders().contains(p)){
            return true;
        }

        return false;
    }
}
