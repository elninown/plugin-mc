package fr.ayoub.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		System.out.println("Le plugin s'allume !");
		getCommand("test").setExecutor(new CommandTest(this));
		getCommand("alert").setExecutor(new CommandTest(this));
		getCommand("spawn").setExecutor(new CommandSpawn());
		getCommand("random").setExecutor(new CommandAlea());
		getServer().getPluginManager().registerEvents(new MyPluginListeners(), this);
		
		for(String string : getConfig().getConfigurationSection("kits").getKeys(false)){
			System.out.println(getConfig().getConfigurationSection("kits").getInt(string + ".id"));
		}
	}

	@Override
	public void onDisable() {
		System.out.println("Fin du plugin");
	}
	
	
}
