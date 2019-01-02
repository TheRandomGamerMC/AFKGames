package me.therandomgamer.afkgames;

import me.therandomgamer.afkgames.Commands.MainCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getPluginCommand("afkgames").setExecutor(new MainCommand());
    }
}
