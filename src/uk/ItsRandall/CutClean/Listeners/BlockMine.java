package uk.ItsRandall.CutClean.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import uk.ItsRandall.CutClean.Main;

import java.util.Random;

public class BlockMine implements Listener{
    public BlockMine(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);

    }

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        Player player = e.getPlayer();
        if (block.getType() == Material.IRON_ORE) {
            block.getDrops().clear();
            e.setCancelled(true);
            block.setType(Material.AIR);
            block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT));
            ExperienceOrb exp = (ExperienceOrb) block.getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.3, 0.5), ExperienceOrb.class);
            exp.setExperience(3);
            return;
        }

        if (block.getType() == Material.GOLD_ORE) {
            block.getDrops().clear();
            e.setCancelled(true);
            block.setType(Material.AIR);
            block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT));
            ExperienceOrb exp = (ExperienceOrb) block.getWorld().spawn(e.getBlock().getLocation().add(0.5, 0.3, 0.5), ExperienceOrb.class);
            exp.setExperience(7);
        }
    }
}
