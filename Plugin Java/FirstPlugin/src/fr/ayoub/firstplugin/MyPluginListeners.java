package fr.ayoub.firstplugin;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MyPluginListeners implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		
		
		
		Player player = event.getPlayer();
		
		ItemStack customsword = new ItemStack(Material.COMPASS, 1);
		ItemMeta customM = customsword.getItemMeta();
		customM.setDisplayName("§c§lSKORPIO ! :)");
		customsword.setItemMeta(customM);
		
		player.getInventory().setItemInMainHand(customsword);
		player.updateInventory();
		
		// ********************************************** //
		
		ItemStack head = new ItemStack(Material.SPONGE, 100);
		
		player.getInventory().setHelmet(head);
		ItemStack customhead = new ItemStack(Material.SPONGE, 100);
		ItemMeta customH = customhead.getItemMeta();
		
		customH.addEnchant(Enchantment.DAMAGE_ALL, 1000000, true);
		player.getInventory().setHelmet(customhead);
		player.updateInventory();
		
		// ********************************************** // 
		
		// Sponge Head //
		
		ItemStack bloc1 = new ItemStack(Material.EMERALD_BLOCK, 1);
		
		player.getInventory().addItem(bloc1);
		player.updateInventory();
		
		// ********************************************** //
		
		// BLAZE ROD //
		
		ItemStack customstick = new ItemStack(Material.BLAZE_ROD, 1);
		ItemMeta customstick1 = customstick.getItemMeta();
		
		customstick1.addEnchant(Enchantment.DAMAGE_ALL, 10000000, true);
		player.getInventory().addItem(customstick);
		player.updateInventory();
		
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		Action action = event.getAction();
		ItemStack it = event.getItem();
		
		if(it == null) return;
		
		if(it.getType() == Material.DIAMOND_HOE){
			if(action == Action.RIGHT_CLICK_AIR){
				player.sendMessage("Vous venez de faire un click");	
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}
