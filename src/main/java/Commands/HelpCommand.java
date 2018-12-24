package Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements ICommand {

    public void execute(CommandSender c, String[] args) {



    }


    public boolean hasPermissiom(Player p) {
        return p.hasPermission("banman.help");
    }
}
