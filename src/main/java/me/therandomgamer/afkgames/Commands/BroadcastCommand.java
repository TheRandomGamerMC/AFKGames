package me.therandomgamer.afkgames.Commands;

import me.therandomgamer.afkgames.GameManager;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class BroadcastCommand implements ICommand {

    public void execute(Player p, String[] args) {

        TextComponent clickable = new TextComponent("[Click Here]");
        clickable.setColor(ChatColor.YELLOW);
        clickable.setBold(true);
        clickable.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"afkgames join "+p.getName()));

        TextComponent rest = new TextComponent("to join "+p.getName()+"'s game");
        rest.setColor(ChatColor.AQUA);

        clickable.addExtra(rest);

        for( Player all: Bukkit.getOnlinePlayers()){
            all.spigot().sendMessage(clickable);

        }
    }

    public boolean hasPermission(Player p) {

        if(GameManager.getInstance().getLeaders().contains(p)){
            return true;
        }

        return false;
    }
}
