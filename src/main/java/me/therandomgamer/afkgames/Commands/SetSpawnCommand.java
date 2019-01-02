package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements ICommand {

    public void execute(Player p, String[] args) {
        Game g = GameManager.getInstance().getGameFromLeader(p);
        Location loc = p.getLocation();
        g.setSpawn(loc);
    }

    public boolean hasPermission(Player p) {

        if(GameManager.getInstance().getLeaders().contains(p)){
            return true;
        }
        return false;
    }
}
