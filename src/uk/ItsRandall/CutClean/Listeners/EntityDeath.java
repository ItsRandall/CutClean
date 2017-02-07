package uk.ItsRandall.CutClean.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import uk.ItsRandall.CutClean.Main;

public class EntityDeath implements Listener {

    public EntityDeath(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);

    }

    @EventHandler
    public void EntityD(EntityDeathEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Cow) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.COOKED_BEEF, 3));
            event.getDrops().add(new ItemStack(Material.LEATHER));
        }
        else if (entity instanceof Chicken) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.COOKED_CHICKEN, 3));
            event.getDrops().add(new ItemStack(Material.FEATHER, 2));
        }
        else if (entity instanceof Pig) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.GRILLED_PORK, 3));
        }
        else if (entity instanceof Sheep) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.BREAD, 2));
        }
    }
}
