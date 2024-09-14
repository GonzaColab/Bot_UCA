package com.relaxingleg;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.*;
import org.jetbrains.annotations.NotNull;
import net.dv8tion.jda.api.events.message.*;

public class Listeners extends ListenerAdapter {

    /*"@Override
    public void onReady(@NotNull ReadyEvent event) {

        JDA jda = event.getJDA();

        for (Guild guild : jda.getGuilds()) {
            for (TextChannel channel : jda.getTextChannels()) {

                channel.sendMessage("Estoy En línea!").queue();

            }
        }
    }*/

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        if(event.getAuthor().isBot()) return;
        MessageChannel channel = event.getChannel();
        channel.sendMessage(event.getMessage().getContentRaw()).queue();

    }
}



/*public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equalsIgnoreCase("!hello")) {
            // Asegúrate de proporcionar contenido para el mensaje
            event.getChannel().sendMessage("Hello, world!").queue();*/