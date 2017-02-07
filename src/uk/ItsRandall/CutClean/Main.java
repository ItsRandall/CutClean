package uk.ItsRandall.CutClean;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import uk.ItsRandall.CutClean.Listeners.BlockMine;
import uk.ItsRandall.CutClean.Listeners.EntityDeath;

import java.util.HashMap;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Plugin plugin = this;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        new EntityDeath(this);
        new BlockMine(this);
    }
}

