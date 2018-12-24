package Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface ICommand {

    void execute(CommandSender p, String[] args);

    boolean hasPermissiom(Player p);


}
