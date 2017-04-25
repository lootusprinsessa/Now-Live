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
            {"addHelp", "```Markdown\n# ADD\n* Se usa para añadir gestores al servidor.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - Menciona con un @ para añadir al gerente"
                    + "\n\n## Ejemplo: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague```"},
            {"adminOverride", "*El permiso de este comando se ha reemplazado por un desarollador del bot.*"},
            {"alreadyExists", "Parece que esto ya estaba en mi base de datos. ¯\\_(?)_/¯"},
            {"alreadyManager", "Parece que ese usuario ya es gerente. Encuentra más humanos! "},
            {"announcementMessageText", "Hey!  %s está en directo! Mira el stream aquí!: %s"},
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
                    + "\n\tIntroduce la otrografía correcta o la nativa del idioma del idioma que quieras."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish" + "```"
                    + "\n\tSi necesitas ayuda con este comandos u otros fuera de lo que estes mensajes de ayuda y quieres preguntar en un leguaje asociado"
                    + "a este bot, tómate la libertad de hablarle a nuestros traductores en nuestro servidor de Discord . El servidor está en " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Has cambiado mi idioma correctamente!."},
            {"botLangUnsupported", "No soportamos ese lenguaje."},
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
                    + "\n\tnoEmbed     - Cambia los mensajes largos por los cortos."
                    + "\n\tsmallEmbed  - Anuncia los mensajes SIN el banner del canal.."
                    + "\n\tfullEmbed   - Anuncia el stream CON el banner del canal."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: Las notificaciones serán enteros a partir de ahora."},
            {"compactSmallEmbed", " :compression: Tendrás las notificaciones un pequeño embed."},
            {"compactNoEmbed", " :compression: A partir de ahora las notificaciones serán una pequeña frase."},
            {"devMessage", "*Mensaje de los desarrolladores de:" + Const.BOT_NAME + "\n\n\t"},
            {"discordChannelNoExist", "Este canal de texto no existe en el servidor."},
            {"discordLink", "Quieres unnirte al servidor de Now Live? Hay mucha gente dispuesta a ayudar " +
                    "si tienes problemas! Clica este enlace:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Aparece el enlace para unirte al servidor de Now Live."},
            {"discordUserNoExist", "Esta persona no es usuario de discord!  Intentalo de nuevo!"},
            {"doesNotExist", "Eso nunca estuvo en mi base de datos :thinking:."},
            {"emptyArgs", "Creo que te has olvidado de algún comando. Revisa la ayuda para más info."},
            {"emptyCommand", "La próxima vez que me despiertes, pon un comando."},
            {"followersEmbed", "Seguidores"},
            {"guildJoinSuccess", "Hola!  Soy Now Live, el bot  de streams! Escribe `" + Const.COMMAND_PREFIX
                    + Const.COMMAND + " help` para una lista de comandos.\n\nSi necesitas ayuda configurandome, ven, " +
                    "únete a mi discord " + Const.DISCORD_URL + " y revisa how-to-setup y commands-list " +
                    "para toda la info!\n\nNo olvides saludar!"},
            {"helpPm", "Hey there, %s! He escuchado por ahí que buscas ayuda eh? Aquí tienes una lista de comandos!.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Idiomas soportados: Inglés, Checo, Alemán, Frances, Español\n" +
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
                    "Da el enlace para el Patreon del bot. Los comandos son:\n"+
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" + Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Da el enlace a Trello que se usa para reportar bugs y para recomendar características. Los comandos son:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" + Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" + Const.COMMAND_PREFIX + Const.COMMAND + " request```"+
                    "\n\n~~" + Const.BOT_NAME + "\n\n" +
                    "Si necesitas más ayuda, únete a mi server de Discord.  Hay mucha gente dispuesta a ayudar:  " + Const.DISCORD_URL + "\n\n" +
                    "***P.D. No leo los mensajes privados, por favor, no mandes mensajes privados***"},
            {"incorrectArgs", "Has escrito algo mal.  Revisa la ayuda para más información" +
                    '.'},
            {"invite", "Hola amigo! Invitame a tu server!\n\n\t"
                    + "**Click aquí:** https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token() + "&scope=bot&permissions=8"},
            {"inviteHelp", "```Markdown\nINVITE:  Ya puse mi link de invitaación.\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvita a NowLive a tu servidor de Discord.```"},
            {"listHelp", "```Markdown\n# LIST\n* Este comando lista cosas de la base de datos.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\ttwitchChannel   - Lista los canales de Twitch que sigues"
                    + "\n\ttwitchCommunity - Lista las comunidades de Twitch que sigues"
                    + "\n\tgfilter         - Lista los filtros que has configurados"
                    + "\n\ttwitchGame      - Lista los juegos de twitch que has configurado"
                    + "\n\tmanager         - Lista los gerentes de este servidor"
                    + "\n\ttfilter         - Lista los filtros de título que tienes puesto"
                    + "\n\ttwitchTeam      - Lista los equipos de Twitch que sigues."
                    + "\n\tsetting         - Lista las configuraciones básicas del bot"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel" + "```"},
            {"listSettings", "```Markdown\n" +
                    "# Configuraciones del bot en este server" +
                    "\n* Modo compacto: %s." +
                    "\n* Modo notificiaciones: %s." +
                    "\n* Modo limpieza de notificaciones: %s." +
                    "\n* Lenguaje del streamer: %s." +
                    "\n* Lenguaje del bot: %s.```"},
            {"moveDoNotOwnChannel", " :no_entry: Ehm... no puedo anunciar en un canal que no existe en tu " +
                    "server!"},
            {"moveFail", " :no_entry: Parece que no puedo enviar notificaciones ahí. Revisa mis permisos. " +
                    "in that channel."},
            {"moveHelp", "```Markdown\n# MOVE\n* Cambia donde donde notifico los streams.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " move <channel>\n\t"
                    + "<channel> - El nombre del canal en el que queras que anuncie los streams # (DEBE incluir la #)\n"
                    + "Esta opción está inactiva y no funcionará como crees.  Por favor, usa el comando de Twitch."
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
            {"patreon", "Si quieres donar considera unirte a mi Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp" , "Da el enlace a la página de Patreon."},
            {"ping", "Cuando estaba en china, en el equipo \"All-American Ping Pong\", me encantaba jugar al ping-pong con " +
                    "mi raqueta Flexolite. Viejos tiempos."},
            {"pingHelp", "```Ruby\nPING:  Se usa para pingearme. Si funciono bien, te enviaré un pong.\nUSAGE: "
                    + Const.COMMAND_PREFIX + "ping```"},
            {"privateMessageReply", "Lo siento, pero el bot al que estás intentando contactar no tiene el mailobx " +
                    "configurado aún.  Porfavor, intentelo más tarde."},
            {"removed", "Eliminado."},
            {"removeManagerFail", "No puedo eliminar %s porque no está en mi base de datos."},
            {"removeHelp", "```Markdown\n# REMOVE\n* Se usa para eliminar gerentes.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - Usa la mención ( @ ) para eliminar al gerente"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Servidores"},
            {"shardsThis", "Número de Shard"},
            {"shardsTotal", "Numero total de Shards"},
            {"statusHelp", "```Markdown\n# STATUS\n* Muestra varias estadisticas del bot.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Permite filtrar los streams por el lenguaje en el que se " +
                    "emite.  Esto soporta el idioma deletreado en inglés o el idioma escrito de manera nativa. Además el idioma debe " +
                    "estar soportado como Twitch indica en el Dashboard.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Debes usar el deletreo nativo de este idioma o el deletreo en Inglés."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Stream Title"},
            {"streamsHelp", "```Ruby\nSTREAMS:  Te enviaré una lista de streams por privado. (NOTA: Recibirás " +
                    "bastantes privados usando este comando, dependiendo de cuantos streams tengas" +
                    "monitorizando!)\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"trello", "Para reportar bug o si tienes alguna caracteristica para añadir al bot usa nuestro Trello. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Da el link directo al Trello del bot"},
            {"totalViewsEmbed", "Visitas totales "},
            {"twitchCommunities", "Comunidades de Twitch "},
            {"twitchAnnounceUpdate", "\n# Se cambió el canal de notificación de %s a: %s."},
            {"twitchAnnounceUpdateFail", "\n! No se pudo cambiar el canal de %s a: %s."},
            {"twitchChannelAdd", "\n# Se añadió(eron) canal(es): %s."},
            {"twitchChannelAddFail", "\n# No se pudieron añadir el(los) canal(es): %s."},
            {"twitchChannelAnnounce", "\n# Serán anunciados en: #%s."},
            {"twitchChannelGameFilter", "\n# Solo serán anunciados mientras juegen: %s."},
            {"twitchChannelNotFound", "\n# Canal(es) no encontrados: %s."},
            {"twitchChannelRemove", "\n# Canales eliminados: %s."},
            {"twitchChannelRemoveFail", "\n! No se pudieron eliminar los canales: %s."},
            {"twitchChannelTitleFilter", "\n# Solo se anunciarán cuando estas palabras estén en el titulo: %s."},
            {"twitchCommunityAdd", "\n# Añadida comunidad(es): %s."},
            {"twitchCommunityAddFail", "\n# No se pudieron añadir la(s) comunidad(es): %s."},
            {"twitchCommunityNotFound", "\n# Comunidad(es) no encontradas: %s."},
            {"twitchCommunityRemove", "\n# Elimindada communidad(es): %s."},
            {"twitchCommunityRemoveFail", "\n# No se pudieron eliminar las commundad(es): %s."},
            {"twitchGameAdd", "\n# Juego(s) añadido(s): %s."},
            {"twitchGameAddFail", "\n# No se pudieron añadir los juego(s): %s."},
            {"twitchGameAnnounce", "\n# El juego se anunciará en: #%s."},
            {"twitchGameFilterAdd", "\n# Se añadieron los filtros: %s."},
            {"twitchGameFilterAddFail", "\n# No se pudieron añadir los filtros: %s."},
            {"twitchGameFilterRemove", "\n# Eliminados los filtros: %s."},
            {"twitchGameFilterRemoveFail", "\n# No se pudo eliminar el filtro: %s."},
            {"twitchGameRemove", "\n# Eliminado(s) juego(s): %s."},
            {"twitchGameRemoveFail", "\n# No se pudo eliminar el juego: %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Añade y elimina cosas relaccionadas con Twitch.tv.\n"
                    + "* Notes:\n\t"
                    + "Para añadir filtros de juegos y de títulos,debes incluir los corchetes.\n\t"
                    + "NO usar el enlace completo, no va a funcionar!!Usa solo el nombre del canal (www.twitch.tv/**__channelName__**)\n\t"
                    + "El nombre del equipo debe ser la url completa, no el nombre del equipo. (www.twitch.tv/team/teamName)\n\t"
                    + "Para añadir múltiples canales, equipos, juegos, comunidades y filtros de título y juegos usa el caracter | entre ellos.\n\t"
                    + "Las unicas opciones son: channelName/communityName/teamName/gameName\n\n"
                    + "## Canales de Twitch\n"
                    + "Nota: añadir un canal de notificación, y filtros de título o juego es opcional."
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #canaldenotificacion {FiltroDeJuego} [FiltroDeTítulo]\n\n"
                    + "## Comunidades de Twitch (Anuncia TODOS los streams en la comunidad)\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community NombreComunidad #canaldenotificacion\n\n"
                    + "## Juegos de Twitch (Anuncia TODOS los streams en ese juego)\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game NombreJuego #canaldenotificacion\n\n"
                    + "## Equipos de twitch (Anuncia TODOS los streams en ese equipo)\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team NombreEquipo #canaldenotificacion\n\n"
                    + "## Filtros de Juego (Global)\n"
                    + "* NOTA: Esto afecta a todas las notificaciones de streams para twitch\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {NombreJuego|NombreJuego} #canaldenotificacion\n\n"
                    + "## Filtros de Título (Global)\n"
                    + "* NOTA: Esto afecta a todas las notificaciones\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter NombreJuego #canaldenotificación\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (añade un canal para anunciar a traves de ciertos filtros)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (Añade un juego al canal de notificación)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (Añade una comunidad para anunciar en un canal específico)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (añade un equipo con un canal específico para anunciar)\n\n"
                    + "```"},
            {"twitchTeamAdd", "\n# Equipo añadido(s): %s."},
            {"twitchTeamAddFail", "\n# No se pudo añadir el equipo: %s."},
            {"twitchTeamAnnounce", "\n# El equipo se anunciará en: #%s."},
            {"twitchTeamNotFound", "\n# Equipo no encontrado: %s."},
            {"twitchTeamRemove", "\n# Equipo eliminado: %s."},
            {"twitchTeamRemoveFail", "\n# No se pudo eliminar el equipo: %s."},
            {"twitchTeams", "Equipo de Twitch"},
            {"twitchTitleFilterAdd", "\n# Se añadieron los filtros: %s."},
            {"twitchTitleFilterAddFail", "\n# No se pudieron añadir los títulos de filtro: %s."},
            {"twitchTitleFilterRemove", "\n# Eliminado filtro(s) de título(s): %s."},
            {"twitchTitleFilterRemoveFail", "\n# No se pudo eliminar el filtro: %s."},
            {"typeOnce", "Solo necesitas escribirlo una vez, tontito."},
            {"uniqueChannels", "Canales únicos %s"},
            {"uniqueGames", "Juegos únicos %s"},
            {"usePlatform", "Uups!  Eso es como se hacía antes!  Usa el comando específico!  Escribe`" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` para más info."},
            {"watchThemHere", "Miralos aquí: "},
            {"wrongCommand", " :thinking: No conozco ese comando."}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
