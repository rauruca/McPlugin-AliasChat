package com.rauruca.aliasChat;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AliasChat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        /*
          コマンドをプラグインに登録
         */
        final PluginCommand command = this.getCommand("aliaschat");
        if (command != null){
            command.setExecutor(new Commands());
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
