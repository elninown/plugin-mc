package fr.ayoub.firstplugin;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		
		if(sender instanceof Player){
			
			Player player = (Player) sender;
			Location spawn = new Location(player.getWorld(), 249.478, 3, 263.501, 1.8f, 7.48f);
			player.sendMessage("§3§lVous venez d'être TP au §5SPAWN !");
			player.teleport(spawn);
		}
		
		return false;
	}

}
