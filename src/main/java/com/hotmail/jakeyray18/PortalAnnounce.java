package com.hotmail.jakeyray18;

import com.hotmail.jakeyray18.listeners.PortalCreateEventListener;
import java.util.logging.Level;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
 
public class PortalAnnounce extends JavaPlugin
{
  @Override
  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(new PortalCreateEventListener(), this);
    getLogger().log(Level.INFO, "{0}Portal Announcement Enabled", ChatColor.DARK_GREEN);
  }
  
  
  
}