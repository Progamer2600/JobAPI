package me.progamer260.jobapi;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        this.getConfig().options().copyDefaults(true);
        this.getConfig().options().pathSeparator('*');
        saveDefaultConfig();
        saveConfig();
    }
    public void onDisable() {
    saveConfig();
    }
}
