package fr.ayoub.firstplugin;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAlea implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		
		if(sender instanceof Player){
			Random random = new Random();
			Player player = (Player) sender;
			Location ploc = player.getLocation();
			
			Location alea = new Location(player.getWorld(), ploc.getX() + random.nextInt(1000), ploc.getY() + random.nextInt(0), ploc.getZ() + random.nextInt(1000), 1.8f, 7.48f);
			player.sendMessage("§3§lVous venez d'être TP aléatoirement !");
			player.teleport(alea);
		}
		
		return false;
	}

}
