package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.Game;
import me.therandomgamer.afkgames.GameManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class AddCommand implements ICommand {

    public void execute(Player p, String[] args) {

        Game g;
        Player added = Bukkit.getPlayer(args[1]);
        Player l = Bukkit.getPlayer(args[2]);

        List<Game> gamesWherePlayerIsMod = GameManager.getInstance().getGamesWherePlayerIsMod(p);

        if(gamesWherePlayerIsMod.size() == 1){
            g = gamesWherePlayerIsMod.get(0);
        }else if(args.length == 3 && gamesWherePlayerIsMod.contains(GameManager.getInstance().getGameFromLeader(l))){

            g = GameManager.getInstance().getGameFromLeader(l);
        }else {
            p.sendMessage(ChatColor.RED+"You cannot add this player");
            return;
        }

        if(GameManager.getInstance().getGameFromPlayer(added) != null){
            p.sendMessage(ChatColor.RED+"This player is already in a game");
            return;
        }

        g.addPlayer(added);

    }
    //Checking for mod is done in execute, so I can get game from args, this way 1 person can be mod in different games
    public boolean hasPermission(Player p) {
        return true;
    }
}
