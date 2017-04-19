/*
 * Copyright 2016-2017 Ague Mort of Veteran Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package langs;

import core.Config;
import util.Const;

import java.util.ListResourceBundle;

/**
 * @author Veteran Software by Ague Mort
 */
public class LanguageBundle_es extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Añadido "},
            {"addFail", "No se pudo añadir "},
            {"addHelp", "```Markdown\n# ADD\n* Used to add managers for your server.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - The @ mention of the user to add as a manager"
                    + "\n\n## EXAMPLE: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague```"},
            {"adminOverride", "*El permiso de este comando se ha reemplazado por un desarollador del bot.*"},
            {"alreadyExists", "Parece que esto ya estaba en mi base de datos. ¯\\_(?)_/¯"},
            {"alreadyManager", "Parece que ese usuario ya es gerente. Encuentra más humanos! "},
            {"announcementMessageText", "Hey!  %s has just gone live! Watch their stream here: %s"},
            {"announceHelp", "```Markdown\nANNOUNCE:  Shhh...  Soy un secreto...\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tEste comando solo puede ser usado por desarrolladores.```"},
            {"beamHelp", "```Ruby\nBEAM:  Añade y quita cosas relacionadas con el Beam.pro\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " beam <sub-comando> <opción> <argumento>"
                    + "\n\t<sub-comando> <opción> <argumento>"
                    + "\n\tadd channel <nombre-de-el-canal>"
                    + "\n\tremove channel <nombre-de-el-canal>```"},
            {"beamUserNoExist", "Este usuario Beam no existe, revisa como lo has escrito e intentalo de nuevo."},
            {"botLangFail", "Something went wrong and my language is still the same."},
            {"botLangHelp", "```Markdown\n# BOTLANG\n* Used to change the language of my responses.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang language"
                    + "\n\tEnter either the English spelling or the native spelling of the language you wish to set."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish" + "```"
                    + "\n\tIf you need further help with this command or others outside of what our help commands do and you wish to ask questions in a language currently associated "
                    + "with the bot please feel free to reach out to our translators in our Discord for assistance. Discord is at " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "You've successfully changed my language."},
            {"botLangUnsupported", "That language is currently not supported."},
            {"botStatistics", "%s Statistics"},
            {"broadcasterLangAllSuccess", " :ok_hand: Solo buscaré streamers en todos los idiomas!"},
            {"broadcasterLangFail", "Algo ha salido mal, seguiré buscando en todos los idiomas."},
            {"broadcasterLangSuccess", " :ok_hand: Solo buscaré streamers en ese idioma!"},
            {"canNotRemoveOwner", "Humano incrédulo, no puedes eliminar al dueño del servidor de la lista de gerentes. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Tíiiio, algo ha salido mal. Intentalo en un ratico."},
            {"cleanupHelp", "```Ruby\nCLEANUP:  Cambia la forma en la que limpio mis notificaciones.\nUSAGE:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <opción>"
                    + "\n<opción>"
                    + "\n\tnone - No le cambiaré nada a mis notficaciones! (por defecto)"
                    + "\n\tedit - Editaré mis notificaciones para que ponga \"OFFLINE\" cuando el streamer se desconecte."
                    + "\n\tdelete - Borraré la notificación cuando el streamer se desconecte.```"},
            {"cleanupSuccessDelete", "Señor, sí señor! Borraré todas las notificaciones a partir de ahora!"},
            {"cleanupSuccessEdit", "Editando las notificaciones..."},
            {"cleanupSuccessNone", " :ok_hand: No le haré nada a las notificaciones."},
            {"compactFail", "Algo ha salido mal. Mi modo compacto no ha cambiado."},
            {"compactHelp", "```Markdown\nCOMPACT:  Cambia mis notificaciones a modo compacto. \nUSAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <opción>"
                    + "\n<opción>"
                    + "\n\tnoEmbed     - Removes the large embed and only uses a short sentence."
                    + "\n\tsmallEmbed  - Announces with an embed with no large banner image."
                    + "\n\tfullEmbed   - The full announcement with large banner image."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: You will get the full announcement from now on."},
            {"compactSmallEmbed", " :compression: You will get an announcement with a small embed from now on."},
            {"compactNoEmbed", " :compression: Your announcements will only be a short sentence from now on."},
            {"devMessage", "*Mensaje de los desarrolladores de:" + Const.BOT_NAME + "\n\n\t"},
            {"discordChannelNoExist", "That text channel doesn't exist on your server."},
            {"discordLink", "Interested in joining the Now Live Discord server? Lots of helpful people there if you're " +
                    "having problems! Click this link:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Display's the link to join the Now Live Discord server."},
            {"discordUserNoExist", "Esta persona no es usuario de discord!  Intentalo de nuevo!"},
            {"doesNotExist", "Eso nunca estuvo en mi base de datos."},
            {"emptyArgs", "Creo que te has olvidado de algún comando. Revisa la ayuda para más info."},
            {"emptyCommand", "La próxima vez que me despiertes, pon un comando."},
            {"followersEmbed", "Seguidores"},
            {"guildJoinSuccess", "Hola!  Soy Now Live, el bot notificador de streams! Escribe `" + Const.COMMAND_PREFIX
                    + Const.COMMAND + " help` para una lista de comandos.\n\nSi necesitas ayuda configurandome, ven, " +
                    "únete a mi discord " + Const.DISCORD_URL + " y revisa how-to-setup y commands-list " +
                    "para toda la info!\n\nNo olvides saludar!"},
            {"helpPm", "Hey there, %s! So I hear you're looking for some help? Here is a list of my commands.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Currently supported languages: English, Czech, German, French, Spanish\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# INVITE\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# MOVE\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " move help\n\n" +
                    "# NOTIFY\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# STREAMLANG\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Gives the link to the bot's Patreon. Commands are :\n"+
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" + Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Gives the link to our Trello which is used for bug reports and feature requests. Commands are :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" + Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" + Const.COMMAND_PREFIX + Const.COMMAND + " request```"+
                    "\n\n~~" + Const.BOT_NAME + "\n\n" +
                    "If you need additional help, join my Discord.  Lots of helpful people there:  " + Const.DISCORD_URL + "\n\n" +
                    "***P.S. I don't monitor this mailbox, so please don't send me any messages through PM***"},
            {"incorrectArgs", "Has escrito algo mal.  Revisa la ayuda para más información" +
                    '.'},
            {"invite", "Hola amigo! Invitame a tu server!\n\n\t"
                    + "**Click aquí:** https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token() + "&scope=bot&permissions=8"},
            {"inviteHelp", "```Markdown\nINVITE:  Ya puse mi link de invitaación.\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvita a NowLive a tu servidor de Discord.```"},
            {"listHelp", "```Markdown\n# LIST\n* This command lists things from the database.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\ttwitchChannel   - Lists the Twitch Channels you follow"
                    + "\n\ttwitchCommunity - List the Twitch Communities you follow"
                    + "\n\tgfilter         - Lists all game filters you have set up"
                    + "\n\ttwitchGame      - List the Twitch Games that I'm tracking for you"
                    + "\n\tmanager         - Lists the managers on this server"
                    + "\n\ttfilter         - Lists all title filters you have set up"
                    + "\n\ttwitchTeam      - Lists the Twitch teams you follow"
                    + "\n\tsetting         - Lists common bot settings"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel" + "```"},
            {"listSettings", "```Markdown\n" +
                    "# Bot Settings on Your Server" +
                    "\n* Compact mode is %s." +
                    "\n* Notification is set to %s." +
                    "\n* Cleanup is set to %s." +
                    "\n* Broadcaster language is set to %s." +
                    "\n* Bot language is set to %s.```"},
            {"moveDoNotOwnChannel", " :no_entry: Ehm... no puedo anunciar en un canal que no existe en tu " +
                    "server!"},
            {"moveFail", " :no_entry: Parece que no puedo enviar notificaciones ahí. Revisa mis permisos. " +
                    "in that channel."},
            {"moveHelp", "```Markdown\n# MOVE\n* Change where I make my announcements.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " move <channel>\n\t"
                    + "<channel> - The name of the channel you wish to move my announcements to (MUST include the #)\n"
                    + "This option is deprecated and may not work as you think.  Please see the Twitch command."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " move #discordchannel" + "```"},
            {"moveSuccess", " :ok_hand: Anunciaré ahí! :arrow_right: "},
            {"needOneManager", "Si lo eliminas... Quien me mandará cosas?"},
            {"noBotManager", "Eso vá en contra de las leyes de la unión de los bots de discord. Lo siento " +
                    "Encuentra a un buen humano para ese trabajo. :thumbsup:"},
            {"noneOnline", "Lo siento tío, Pero no hay nadie de los que sigo en directo."},
            {"notAManager", "Lo siento, sólo los gerentes pueden hacer eso."},
            {"notAnAdmin", "A quien le convenga:  Soy tu sirviente pero no tu no eres mi maestro."},
            {"notifyEveryone", ":tada: GUAU!!  **TODOS** los de este servidor serán notificados cuando alguien " +
                    "se ponga en directo! *(Estás seguro?  No lo recomiendo para grandes servidores...  Puede " +
                    "que alguien se moleste.)*"},
            {"notifyHelp", "```Markdown\nNOTIFY:  Se usa para cambiar el método de notificación global en el server.\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " notify <option>"
                    + "\n\tnone - No hay @ notificaciones de ese tipo (por defecto)"
                    + "\n\there - Notificaré a todos los que estén conectados cuando lo anuncie"
                    + "\n\teveryone - Notificaré a TODOS!!  MUAJAJAJAJA!!  (No lo recomiendo en servers grandes)```"},
            {"notifyHere", " :bellhop_bell: Todo el mundo que esté conectado será notificado."},
            {"notifyNone", " :ok_hand: No mencionaré a nadie en mis notificaciones."},
            {"nowLive", "NOW LIVE!\n"},
            {"nowPlayingEmbed", "Reproduciendo"},
            {"nowPlayingLower", " Está reproduciendo "},
            {"nowStreamingEmbed", " Está streameando!"},
            {"numUniqueMembers", "Number Unique Members"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " Se ha desconectado!"},
            {"on", " on "},
            {"onlineStreamPm1", "Hey!  Ahora hay "},
            {"onlineStreamPm2", " streamers en linea que te pueden interesar! Miralos y puede que te gusten! \n\n"},
            {"oops", "Oops!  Algo ha salido mal, pero no se ha cambiado nada!  intentemoslo de nuevo."},
            {"patreon", "If you wish to donate to the bot consider using our Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp" , "Gives the link to our patreon page."},
            {"ping", "Cuando estaba en china, en el equipo \"All-American Ping Pong\", me encantaba jugar al ping-pong con " +
                    "raqueta Flexolite. Viejos tiempos."},
            {"pingHelp", "```Ruby\nPING:  Se usa para pingearme. Si funciono bien, te enviaré un pong.\nUSAGE: "
                    + Const.COMMAND_PREFIX + "ping```"},
            {"privateMessageReply", "Lo siento, pero el bot al que estás intentando contactar no tiene el mailobx " +
                    "configurado aún.  Porfavor, intentelo más tarde."},
            {"removed", "Eliminado."},
            {"removeManagerFail", "I can't remove %s because they are not in my database."},
            {"removeHelp", "```Markdown\n# REMOVE\n* Used to remove managers from my database.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - The @ mention of the user to remove as a manager"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Servers"},
            {"shardsThis", "Shard Number"},
            {"shardsTotal", "Number Shards"},
            {"statusHelp", "```Markdown\n# STATUS\n* Shows various statistics of the bot.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Allows you to filter streams by the language it is being broadcast " +
                    "in.  This supports the English spelling of the language, or the native spelling.  Must be a supported " +
                    "language on Twitch that is listed in the Dashboard.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* You may use either the native spelling of the language or the English spelling of the language."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Stream Title"},
            {"streamsHelp", "```Ruby\nSTREAMS:  Te enviaré una lista de streams por privado. (NOTA: Recibirás " +
                    "bastantes privados usando este comando, dependiendo cuantos streams estés" +
                    "monitorizando!)\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"trello", "To report bugs or to request features to be added to the bot please use our Trello. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Returns the link to the Trello for the bot"},
            {"totalViewsEmbed", "Total Views"},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchAnnounceUpdate", "\n# Updated the Twitch announcement channel for %s to: %s."},
            {"twitchAnnounceUpdateFail", "\n! Failed to change the Twitch announce channel for %s to: %s."},
            {"twitchChannelAdd", "\n# Added channel(s): %s."},
            {"twitchChannelAddFail", "\n# Failed to add channels: %s."},
            {"twitchChannelAnnounce", "\n# They will be announced in: #%s."},
            {"twitchChannelGameFilter", "\n# They will only be announced when they are playing: %s."},
            {"twitchChannelNotFound", "\n# Channel(s) not found on Twitch: %s."},
            {"twitchChannelRemove", "\n# Removed channels: %s."},
            {"twitchChannelRemoveFail", "\n! Failed to delete channels: %s."},
            {"twitchChannelTitleFilter", "\n# They will only be announced when these words are in the title: %s."},
            {"twitchCommunityAdd", "\n# Added community(s): %s."},
            {"twitchCommunityAddFail", "\n# Failed to add community(s): %s."},
            {"twitchCommunityAnnounce", "\n# The community(s) will announce in: #%s."},
            {"twitchCommunityNotFound", "\n# Community(s) not found on Twitch: %s."},
            {"twitchCommunityRemove", "\n# Removed community(s): %s."},
            {"twitchCommunityRemoveFail", "\n# Failed to remove community(s): %s."},
            {"twitchGameAdd", "\n# Added game(s): %s."},
            {"twitchGameAddFail", "\n# Failed to add game(s): %s."},
            {"twitchGameAnnounce", "\n# The game will announce in: #%s."},
            {"twitchGameFilterAdd", "\n# Added game filter(s): %s."},
            {"twitchGameFilterAddFail", "\n# Failed to add game filter(s): %s."},
            {"twitchGameFilterRemove", "\n# Removed game filter(s): %s."},
            {"twitchGameFilterRemoveFail", "\n# Failed to remove game filter(s): %s."},
            {"twitchGameRemove", "\n# Removed game(s): %s."},
            {"twitchGameRemoveFail", "\n# Failed to remove game(s): %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Add and remove things that are Twitch.tv related.\n"
                    + "* Notes:\n\t"
                    + "To add game filters and title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Twitch URL. It will not work!! Use only the channel name (www.twitch.tv/channelName)\n\t"
                    + "The Team name must be from the URL, not the display name of the team. (www.twitch.tv/team/teamName)\n\t"
                    + "You may add multiple channels, teams, games, communities, game and title filters by using the pipe character | between them.\n\t"
                    + "The only required options are: channelName/communityName/teamName/gameName\n\n"
                    + "## Twitch Channels\n"
                    + "Note: Adding an announcement channel, game and title filters are optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Twitch Communities (Announce ALL live streams in the community)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community communityName #announcementChannel\n\n"
                    + "## Twitch Games (Announce ALL live streams for that game)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game gameName #announcementChannel\n\n"
                    + "## Twitch Teams (Announce ALL live streams in the team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team teamName #announcementChannel\n\n"
                    + "## Twitch Game Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Twitch Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter gameName #announcementChannel\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adds a channel to announce in a certain channel and game filters)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (adds a game to the global announcement channel)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (adds the community with a specified announcement channel)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (adds a team with a specific announcement channel)\n\n"
                    + "```"},
            {"twitchTeamAdd", "\n# Added team(s): %s."},
            {"twitchTeamAddFail", "\n# Failed to add team(s): %s."},
            {"twitchTeamAnnounce", "\n# The team(s) will announce in: #%s."},
            {"twitchTeamNotFound", "\n# Team(s) not found on Twitch: %s."},
            {"twitchTeamRemove", "\n# Removed team(s): %s."},
            {"twitchTeamRemoveFail", "\n# Failed to remove team(s): %s."},
            {"twitchTeams", "Twitch Teams"},
            {"twitchTitleFilterAdd", "\n# Added title filter(s): %s."},
            {"twitchTitleFilterAddFail", "\n# Failed to add title filter(s): %s."},
            {"twitchTitleFilterRemove", "\n# Removed title filter(s): %s."},
            {"twitchTitleFilterRemoveFail", "\n# Failed to remove title filter(s): %s."},
            {"typeOnce", "Solo necesitas escribirlo una vez, tontito."},
            {"uniqueChannels", "Unique Channels %s"},
            {"uniqueGames", "Unique Games %s"},
            {"usePlatform", "Oops!  Eso es como se hacía antes!  Usa el comando específico!  Escribe`" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` para más info."},
            {"watchThemHere", "Miralos aquí: "},
            {"wrongCommand", " :thinking: No conozco ese comando."}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}