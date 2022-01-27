package fr.denoria.test.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class GlobalListener implements Listener {

  public void onJoin(PlayerJoinEvent event) {
    Player player = event.getPlayer();
    HandlerList handlerList = event.getHandlers();

    /* TODO: You need to code the onJoin function
     * When a player connects, check if the server is not in WhiteList
     * If whitelist is on -> Disconnect client with message "&cWhiteList &f- &cUnauthorized"
     * Else -> Let the player connect
    */
  }

  public void onChatAsync(AsyncPlayerChatEvent event) {
    HandlerList handlerList = event.getHandlers();
    Player player = event.getPlayer();

    /* TODO: You need to code the onChatAsync function
     * When a player writes in the chat, check if the player is OP
     * If player is op -> Write message in red with prefix &c[OP]
     * Else -> Write the message in gray without prefix
     *
     * (Additional information) You have the right to choose the chat design
     */
  }

}
