package me.therandomgamer.afkgames;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.LinkedList;

public class Game {

    private LinkedList<Player> leaders;
    private LinkedList<Player> moderators;
    private LinkedList<Player> players;
    private boolean hasStarted;
    private Location spawn;
    private boolean pvp;
    private boolean visible;
    private boolean enableJoin;

    public Game(Player creator){
        leaders = new LinkedList<Player>();
        moderators = new LinkedList<Player>();
        players = new LinkedList<Player>();
        hasStarted = false;
        leaders.add(creator);
        spawn = creator.getLocation();
        pvp = false;
        visible = true;
        enableJoin = false;
    }

    public LinkedList<Player> getLeaders() {
        return leaders;
    }
    public boolean hasStarted() {
        return hasStarted;
    }

    public void setHasStarted(boolean hasStarted) {
        this.hasStarted = hasStarted;
    }

    public boolean isPvp() {
        return pvp;
    }

    public void setPvp(boolean pvp) {
        this.pvp = pvp;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isEnableJoin() {
        return enableJoin;
    }

    public void setEnableJoin(boolean enableJoin) {
        this.enableJoin = enableJoin;
    }
    public LinkedList<Player> getModerators() {
        return moderators;
    }

    public void setModerators(LinkedList<Player> moderators) {
        this.moderators = moderators;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }

    public void removePlayer(Player p){
        if (players.contains(p)) {
            players.remove(p);
        }
    }

    public void addPlayer(Player p){
        players.add(p);
    }

    public Location getSpawn() {
        return spawn;
    }

    public void setSpawn(Location spawn) {
        this.spawn = spawn;
    }
}
