package com.rauruca.aliasChat;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        /*
          色をつけるためのメソッド
         */
        final MiniMessage miniMessage = MiniMessage.miniMessage();
        /*

         */
        if (strings.length == 2){
            Bukkit.broadcast(Component.text("<" + strings[0] + "> " + strings[1]));
        } else {
            commandSender.sendMessage(miniMessage.deserialize("<red>usage: /aliaschat <name> <text>"));
        }
        return false;
    }
}
