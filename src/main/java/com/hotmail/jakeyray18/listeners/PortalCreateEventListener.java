/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.jakeyray18.listeners;

import com.hotmail.jakeyray18.PortalAnnounce;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

/**
 *
 * @author DanielWegner
 */
public class PortalCreateEventListener implements Listener {

    public PortalCreateEventListener() {
    }
    
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPortalCreateEvent(PortalCreateEvent event) {
        if (event.getReason() == PortalCreateEvent.CreateReason.FIRE) {
            Block block = event.getBlocks().get(0);

            int x = block.getLocation().getBlockX();
            int y = block.getLocation().getBlockY();
            int z = block.getLocation().getBlockZ();
            Bukkit.broadcastMessage(ChatColor.GOLD + "Portal created at X:" + x + " Y:" + y + " Z:" + z);
        }
    }
}
