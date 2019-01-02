package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public class OnBlockCommand implements ICommand {

    public void execute(Player p, String[] args) {

        Game g = GameManager.getInstance().getGameFromLeader(p);
        List<Player> playerList = g.getPlayers();

        List<Player> toRemove = new LinkedList<Player>();
        Material check = Material.matchMaterial(args[2]);

        for(Player allPlayer: playerList){

            Location l = allPlayer.getLocation();
            int y = l.getBlockY();
            Material lastMaterial = null;

            for(int i=y;i>0;i--){
                Block b = (new Location(l.getWorld(),l.getBlockX(),i,l.getBlockZ())).getBlock();
                Material m =  b.getBlockData().getMaterial();
                if(m != Material.AIR){
                    lastMaterial =  m;
                    break;
                }
            }

            if((check == lastMaterial && args[1].equals("remove") )||(check != lastMaterial && args[1].equals("keep"))){
                toRemove.add(p);
            }
        }

        for(Player removePlayer: toRemove){
            g.removePlayer(p);
            removePlayer.teleport(removePlayer.getBedSpawnLocation());
        }
    }

    public boolean hasPermission(Player p) {

        if(GameManager.getInstance().getLeaders().contains(p)){
            return true;
        }
        return false;
    }
}
