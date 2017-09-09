package fr.ayoub.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTest implements CommandExecutor {
	
	private FirstPlugin main;

	public CommandTest(FirstPlugin firstPlugin) {
		this.main = firstPlugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		
		if(sender instanceof Player){
			Player player = (Player)sender;
			
			if(cmd.getName().equalsIgnoreCase("test")){
				player.sendMessage(main.getConfig().getString("message.test"));
				return true;
			}
			
			if(cmd.getName().equalsIgnoreCase("alert")){
				
				if(arg3.length == 0){
					player.sendMessage("§lLa commande est > /alert <message> .");
				}
				
				if(arg3.length >= 1){
					StringBuilder bc = new StringBuilder();
					for(String part : arg3){
						bc.append(part + " ");
					}
					
					Bukkit.broadcastMessage("§l[§l§4" + player.getName() + "§f] " + bc.toString());
				}
				
				
				
				return true;
			}
			
			
		}
		
		
		return false;
	}

}
