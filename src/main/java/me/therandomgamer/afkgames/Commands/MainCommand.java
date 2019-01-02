package me.therandomgamer.afkgames.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class MainCommand implements CommandExecutor {


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        // create hashmap with all subcommands inside of it, the String is the typed subcommand
        // the ICommand is a class that implements ICommand with 2 methods 1 to check perms, the other to execute it
        HashMap<String, ICommand> commandMap = new HashMap<String, ICommand>();
        commandMap.put("help", new HelpCommand());


        //searching for the right command

        if(!commandMap.containsKey(args[0])){

            commandSender.sendMessage(ChatColor.RED+"This command does not exist");
            return false;
        }

        ICommand ic = commandMap.get(args[0]);


        if((! (commandSender instanceof Player) || ! ic.hasPermission((Player) commandSender))) {
            commandSender.sendMessage(ChatColor.RED+"You don't have permission to do this");
            return false;
        }

        ic.execute((Player) commandSender,args);

        return true;
    }
}
