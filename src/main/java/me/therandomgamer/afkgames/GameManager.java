package me.therandomgamer.afkgames;

import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public class GameManager {

    private LinkedList<Game> games;

    //Singleton construction
    private static GameManager gm;

    public static GameManager getInstance() {
        if(gm == null){
            gm = new GameManager();
        }
        return gm;
    }
    //end of singleton construction

    private GameManager(){
        games = new LinkedList<Game>();
    }

    public void addGame(Game g){
        games.add(g);
    }

    public void removeGame(Game g){
        games.remove(g);
    }

    public LinkedList<Game> getGames() {
        return games;
    }

    public List getLeaders(){

        LinkedList<Player> leaders = new LinkedList<Player>();

        for(Game g: games){
           leaders.addAll(g.getLeaders());
        }
        return leaders;
    }

    public Game getGameFromLeader(Player p){

        for(Game g: games){
            if(g.getLeaders().contains(p)){
                return g;
            }
        }
        return null;
    }


}
