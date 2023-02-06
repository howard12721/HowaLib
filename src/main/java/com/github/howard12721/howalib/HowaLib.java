package com.github.howard12721.howalib;

import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class HowaLib extends JavaPlugin {

    @Getter
    private static Plugin owningPlugin;

    public static void initialize(Plugin plugin) {
        plugin = owningPlugin;
    }

    public static void dispose() {
        
    }

}
