package me.progamer260.jobapi;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class JobHandler {
   private static  Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("JobAPI");
   private static JobType jobType;

    /** Returns the players JobType **/
    public static JobType getJob(Player player) {
        return jobType;
    }
    /** Used for getting the players job from a config file**/
    public static String getJobAsString(Player player) {
        return String.valueOf(plugin.getConfig().get(player.getName()));
    }
    /** Used for setting the players job type **/
    public static void setJobType(Player player, JobType jobType) {
       jobType = jobType;
    }
    /** Used for setting/changing the players job in a config file **/
    public static void setJobTypeAsString(Player player, JobType jobType) {
        plugin.getConfig().set(player.getName(), jobType.toString());
        plugin.saveConfig();
    }
}
