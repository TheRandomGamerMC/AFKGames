package me.therandomgamer.afkgames.Commands;

import org.bukkit.entity.Player;

public interface ICommand {

    void execute(Player p, String[] args);

    boolean hasPermission(Player p);


}
