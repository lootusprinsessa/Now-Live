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
public class LanguageBundle_de extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Hinzugefügt: "},
            {"addFail", "Fehler beim Hinzufügen von "},
            {"addHelp", "```Markdown\n# ADD\n* Befehl um Manager hinzuzufügen.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <inhalt>"
                    + "\n\t<option> <inhalt>"
                    + "\n\tmanager - Der @ Name des Benutzers, den du als Manager hinzufügen möchtest"
                    + "\n\n## BEISPIEL: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague```"},
            {"adminOverride", "*Permission dieses Befehls wurden von einem Bot Developer überschrieben.*"},
            {"alreadyExists", "Es scheint als wäre das bereits in meiner Datenbank. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Dieser Benutzer ist bereits ein Manager.  Find moar humanz!"},
            {"announceHelp", "```Markdown\n# ANNOUNCE\n* Shhh...  I'm a secret...\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tThis command is only available to the developers.```"},
            {"announcementMessageText", "Hey!  %s ist jetzt live! Zum Stream geht\'s hier: %s"},
            {"beamHelp", "```Markdown\n# BEAM\n* Hinzufügen und Entfernen von Beam.pro Inhalten.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam <unterbefehl> <option> <argument>\n"
                    + "\t<unterbefehl> <option> <argument>\n"
                    + "\tadd           channel  <channelname>\n"
                    + "\tremove        channel  <channelname>\n\n"
                    + "## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " beam add channel Ague" + "```"},
            {"beamUserNoExist", "Beam-benutzer konnte nicht gefunden werden!"},
            {"botLangFail", "Irgendwas ging schief und meine Sprache ist immernoch die selbe."},
            {"botLangHelp", "```Markdown\n# BOTLANG\n* Befehl zum ändern der Sprache.\n\n## VERWENDUNG: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang language"
                    + "\n\tGebe den englischen oder nativen Namen der Sprache ein, die du einstellen möchtest."
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish" + "```"},
            {"botLangSuccess", "Du hast erfolgreich meine Sprache geändert."},
            {"botLangUnsupported", "Diese Sprache wird aktuell noch nicht unterstützt."},
            {"botStatistics", "%s Statistiken"},
            {"broadcasterLangAllSuccess", " :ok_hand: Ich werde nach Streams in allen Sprachen suchen!"},
            {"broadcasterLangFail", "Etwas ging schief und ich suche immernoch nach allen Sprachen."},
            {"broadcasterLangSuccess", " :ok_hand: Ich werde nach Streams in dieser Sprache suchen!"},
            {"canNotRemoveOwner", "Haha, du kannst nicht den Serverbesitzer von der Managerliste löschen. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ach, mensch...  Da hat was nicht funktioniert... am besten nochmal versuchen."},
            {"cleanupHelp", "```Markdown\n# CLEANUP\n*  Ändert wie ich Stream Benachrichtigungen aufräume.\n\n## VERWENDUNG:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone - Ich ändere nichts! (Standardeinstellung)"
                    + "\n\tedit - Ich editiere die Benachrichtung und markiere Streams als \"OFFLINE\""
                    + "\n\tdelete - Ich lösche Benachrichtungen, wenn die entsprechenden Streamer offline gehen```"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Sir, ja Sir!  Ich lösche meine Benachrichtigungen ab jetzt!"},
            {"cleanupSuccessEdit", "Benachrichtigungen editieren, alles klar."},
            {"cleanupSuccessNone", " :ok_hand: Ich lasse alle Benachrichtungen unverändert."},
            {"compactFail", "Uhm, irgendwas ging schief.  Mein Compact Mode ist nicht geändert worden."},
            {"compactHelp", "```Markdown\n# COMPACT\n* Im Compact Mode sind meine Benachrichtigungen kompakter.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\ton  - Aktiviert Compact Mode"
                    + "\n\toff - Deaktiviert Compact Mode"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact on" + "```"},
            {"compactOff", " :compression: Compact Mode wurde deaktiviert."},
            {"compactOn", " :compression: Compact Mode wurde aktiviert."},
            {"devMessage", "*Nachricht der " + Const.BOT_NAME + " Developer:*\n\n\t"},
            {"discordChannelNoExist", "Dieser Textchannel existiert auf diesem Server nicht."},
            {"discordUserNoExist", "Diese Person ist kein Discord Benutzer!  Versuche es nochmal!"},
            {"doesNotExist", "Das wurde nie meiner Datenbank hinzugefügt."},
            {"emptyArgs", "Ich glaube du hast da einen Teil des Befehls vergessen.  Mit der Option *help* erkläre ich dir den Befehl gerne."},
            {"emptyCommand", "Wenn du mich nächstes mal weckst, gib mir bitte auch etwas zu tun."},
            {"followersEmbed", "Follower"},
            {"guildJoinSuccess", "Hi!  Ich bin Now Live, der Streambenachrichtigungsbot!  Schreibe `" + Const.COMMAND_PREFIX
                    + Const.COMMAND + " help` für eine Liste meiner Befehle.\n\nSolltest zu Hilfe beim Einrichten brauchen," +
                    "tritt meinem Server (" + Const.DISCORD_URL + ") bei und sieh dir die how-to-setup und command-list " +
                    "Channel für weitere Informationen an!\n\nNicht vergessen hallo zu sagen!"},
            {"helpPm", "Hey %s!\n\n" +
                    "Ich hab gehört du suchst Hilfe?  Hier ist eine Liste meiner Befehle.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* Befehl um Manager hinzuzufügen. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Hinzufügen und Entfernen von Beam.pro Inhalten. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Befehl zum ändern der Sprache.\n" +
                    "* Aktuell unterstützte Sprachen: Englisch(English), Tschechisch(Czech), Deutsch(German), Französisch(French), Spanisch(Spanish)" +
                    "* Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Ändert wie ich Stream Benachrichtigungen aufräume. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Im Compact Mode sind meine Benachrichtigungen kompakter. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# INVITE\n" +
                    "* Postet meinen Einladelink. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Erstellt eine Liste von Dingen in meiner Datenbank. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# MOVE\n" +
                    "* Ändert wo ich Benachrichtigungen poste. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " move help\n\n" +
                    "# NOTIFY\n" +
                    "* Ändert die globablen Benachrichtigunseinstellungen. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* Pingbefehl - wenn ich online bin, werde ich antworten. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Befehl um Manager zu entfernen. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# STREAMLANG\n" +
                    "* Erlaubt das Filtern von Streams nach Sprache.\n" +
                    "* Für mehr Informantionen, schreibe: " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Ich schicke dir alle aktuell aktiven Streams als private Nachricht." +
                    "* Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Hinzufügen und Entfernen von Twitch.tv-Inhalten. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n```\n" +
                    "Ague arbeitet immernoch viel daran neue Dinge, die ich für dich machen kann, zu perfektionieren.\n\n~~" + Const.BOT_NAME + "\n\n" +
                    "Solltest du Hilfe benötigen, tritt meinem Discordserver bei.  Dort gibt es sehr viele hilfsbereite Leute:  " + Const.DISCORD_URL + "\n\n" +
                    "***P.S. Ich schaue nicht in die privaten Nachrichten, also schreibe mir hier bitte keine Nachrichten***"},
            {"incorrectArgs", "Argument(e) fehlen oder sind fehlerhaft.  Benutze die *help* Option für mehr Details."},
            {"invite", "Hey %s! Lade mich zu deinem Server ein!\n\n\t"
                    + "**Klicke hier:** https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token() + "&scope=bot&permissions=8"},
            {"inviteHelp", "```Markdown\n# INVITE\n* Postet meinen Einladelink.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tLade den NowLive-Bot zu deinem Discord Server ein.```"},
            {"listHelp", "```Markdown\n# LIST\n* Erstellt eine Liste von Dingen in meiner Datenbank.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list *option*"
                    + "\n\ttwitchChannel   - Listet die Twitch Channels, denen du folgst"
                    + "\n\ttwitchCommunity - Listet die Twitch Communities, denen du folgst"
                    + "\n\tgamefilter      - Listet alle Spieler Filter"
                    + "\n\ttwitchGame      - Listet die Twitch Spiele, die ich für dich verfolge"
                    + "\n\tmanager         - Listet die Manager dieses Servers"
                    + "\n\ttitlefilter     - Listet alle Titelfilter, die du erstellt hast"
                    + "\n\ttwitchTeam      - Listet die Twitch Teams, denen du folgst"
                    + "\n\tsetting         - Listet diverse Bot-Einstellungen"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list channel" + "```"},
            {"listSettings", "```Markdown\n" +
                    "# Bot-Einstellungen dieses Servers" +
                    "\n* Compact mode ist %s." +
                    "\n* Benachrichtigungsmodus ist %s." +
                    "\n* Cleanup-Modus ist %s." +
                    "\n* Streamsprache ist %s." +
                    "\n* Botsprache ist %s.```"},
            {"moveDoNotOwnChannel", " :no_entry: Ähm, Ich kann nichts in einem Channel posten, " +
                    "der auf deinem Server nicht existiert!"},
            {"moveFail", " :no_entry: Ich kann dort scheinbar keine Benachrichtigungen posten.  Stell sicher dass du in diesem Channel " +
                    "mir Schreibrechte gegeben hast."},
            {"moveHelp", "```Markdown\n# MOVE\n* Ändert wo ich Benachrichtigungen poste.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " move <channel>\n\t"
                    + "<channel> - Der Name des Channels in dem ich Benachrichtigungen posten soll (MUSS mit # beginnen)\n"
                    + "Diese Option ist veraltet und funktioniert wahrscheinlich nicht so wie du denkst.  Benutze bitte den Twitch-Befehl."
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " move #discordchannel" + "```"},
            {"moveSuccess", " :ok_hand: Okay ich werde dort posten! :arrow_right: "},
            {"needOneManager", "Wenn du das tust, wer managet mich dann?"},
            {"noBotManager", "Bots als Manager hinzufügen verstößt gegen die Discord Bot Union By-Laws. Sorry, versuche einen " +
                    "geeignet Menschen für diesen Job zu finden. :thumbsup:"},
            {"noneOnline", "Sorry %s, aktuell ist niemanden, dem dieser Server folgt, online."},
            {"notAManager", "Entschuldige, aber nur meine Manager dürfen das. Schreibe `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` für eine Liste von Leuten, die das dürfen."},
            {"notAnAdmin", "Ich mag zwar dein Diener sein, aber du bist nicht mein Meister."},
            {"notifyEveryone", ":tada: WOW!!  **JEDER** in diesem Server wird benachrichtigt, wenn ich " +
                    "einen Stream poste!  *(Bist du sicher? In größeren Server könnte es  " +
                    "Leute nerven...)*"},
            {"notifyHelp", "```Markdown\n# NOTIFY\n* Ändert die globablen Benachrichtigunseinstellungen.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone     - Keine @ Mitteilungen (Standardeinstellung)"
                    + "\n\there - Ich benachrichtige alle, die online sind (via ``@here``)"
                    + "\n\teveryone - Ich benachrichtige ALLE!!  Muhahaha!!  (Nicht für größere Server empfohlen)"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", " :bellhop_bell: Alle, die online sind, werden benachrichtigt."},
            {"notifyNone", " :ok_hand: Ich werde keine @ Mitteilungen mehr benutzen."},
            {"nowLive", "NOW LIVE!\n"},
            {"nowPlayingEmbed", "Spielt gerade"},
            {"nowPlayingLower", " spielt gerade "},
            {"nowStreamingEmbed", " streamt jetzt!"},
            {"numUniqueMembers", "Number Unique Members"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " ist schon offline!"},
            {"on", " auf "},
            {"onlineStreamPm1", "Hey da!  Es gibt aktuell "},
            {"onlineStreamPm2", " aktive Streamer, die dich interessieren könnten! Folge ihren Links um sie " +
                    "auszuchecken: \n\n"},
            {"oops", "Ups! Irgendwas ist schiefgelaufen! Lass uns das nochmal versuchen."},
            {"ping", "Als ich in China war, war ich in einem amerikanischen Ping-Pongteam. Ich liebte es mit meinem " +
                    "Flexolite Ping-Pongsschläger zu spielen."},
            {"pingHelp", "```Markdown\n# PING\n* Pingbefehl - wenn ich online bin, werde ich antworten.\n\n## VERWENDUNG: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"privateMessageReply", "Es tut uns leid, aber der Bot, den sie gerufen haben antwortet nicht " +
                    "auf private Nachrichten.  Versuchen Sie es später nocheinmal."},
            {"removed", "Entfernt: %s %s."},
            {"removeManagerFail", "Ich kann %s nicht entfernen, da kein solcher Eintrag in meiner Datenbank existiert."},
            {"removeHelp", "```Markdown\n# REMOVE\n* Befehl um Manager zu entfernen.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - Der @ Name des Benutzers, den du als Manager hinzufügen möchtest"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Server"},
            {"statusHelp", "```Markdown\n# STATUS\n* Zeigt einige Statistiken über den Bot.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Erlaubt das Filtern von Streams nach Sprache " +
                    "Unterstützt entweder den englischen oder nativen Namen der Sprache. Die Sprache " +
                    "muss im Twitch Dashboard unterstützt werden.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Du kannst entweder den nativen oder den englischen Namen der Sprache verwenden."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Streamtitel"},
            {"streamsHelp", "```Markdown\n# STREAMS\n* Ich schicke dir alle aktuell aktiven Streams als private Nachricht. (HINWEIS: Du wirst wahrscheinlich " +
                    "mehrere private Nachrichten durch diesen Befehl erhalten, je nachdem wie viele Streams dein Discord Server " +
                    "beobachtet!)\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Alle Aufrufe"},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchAnnounceUpdate", "\n# Standardankündigungskanal von %s zu %s geändert."},
            {"twitchAnnounceUpdateFail", "\n! Fehler beim Ändern des Standardankündigungskanal von %s zu %s."},
            {"twitchChannelAdd", "\n# Hinzugefügte Kanäle: %s."},
            {"twitchChannelAddFail", "\n# Fehler beim Hinzufügen der Kanäle: %s."},
            {"twitchChannelAnnounce", "\n# Sie werden in #%s angekündigt."},
            {"twitchChannelGameFilter", "\n# Sie werden nur angekündigt, wenn sie %s spielen."},
            {"twitchChannelNotFound", "\n# Kanäle nicht auf Twitch gefunden: %s."},
            {"twitchChannelRemove", "\n# Entfernte Kanäle: %s."},
            {"twitchChannelRemoveFail", "\n! Fehler beim Entfernen der Kanäle: %s."},
            {"twitchChannelTitleFilter", "\n# Sie werden nur angekündigt wenn die Worte %s im Titel sind."},
            {"twitchCommunityAdd", "\n# Hinzugefügte Community(s): %s."},
            {"twitchCommunityAddFail", "\n# Fehler beim hinzufügen der Community(s): %s."},
            {"twitchCommunityAnnounce", "\n# Die Community(s) werden in %s angekündigt."},
            {"twitchCommunityNotFound", "\n# Community(s) nicht auf Twitch gefunden: %s."},
            {"twitchCommunityRemove", "\n# Entfernte Community(s): %s."},
            {"twitchCommunityRemoveFail", "\n# Fehler beim Entfernen der Community(s): %s."},
            {"twitchGameAdd", "\n# Hinzugefügte Spiele: %s."},
            {"twitchGameAddFail", "\n# Fehler beim Hinzufügen der Spiele: %s."},
            {"twitchGameAnnounce", "\n# Die Spiele werden in #%s angekündigt."},
            {"twitchGameFilterAdd", "\n# Spielfilter hinzugefügt: %s."},
            {"twitchGameFilterAddFail", "\n# Fehler beim Hinzufügen der Spielefilter: %s."},
            {"twitchGameFilterRemove", "\n# Spielefilter entfernt: %s."},
            {"twitchGameFilterRemoveFail", "\n# Fehler beim Entfernen der Spielefilter: %s."},
            {"twitchGameRemove", "\n# Spiele entfernt: %s."},
            {"twitchGameRemoveFail", "\n# Fehler beim Entfernen der Spiele: %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Hinzufügen und Entfernen von Twitch.tv-Inhalten.\n"
                    + "* ^Hinweise:\n\t"
                    + "Um Spielefilter und Titelfilter hinzuzufügen, musst du die Klammern schreiben.\n\t"
                    + "Benutze NICHT die komplette Twitch-URL. Das funktioniert nicht!! Benutze nur den Kanalnamen (www.twitch.tv/channelName)\n\t"
                    + "Der Teamname muss der aus der URL sein, nicht der auf der Seite sichtbare. (www.twitch.tv/team/teamName)\n\t"
                    + "Du kannst mehrere Kanäle, Teams, Spiele, Communities, Spiel- und Titelfilter hinzufügen indem du das Pipe-Zeichen | als Trennzeichen benutzt.\n\t"
                    + "Die einzigen zwingend nötigen Optionen sind: kanalName/communityName/teamName/spielName\n\n"
                    + "## Twitch-Kanäle\n"
                    + "Hinweis: Ankündigungskanal, Spiel- und Titelfilter sind optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel kanalName #ankündigungsKanal {Spielfilter} [Titelfilter]\n\n"
                    + "## Twitch-Communities (Postet ALLE Streams dieser Community)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community communityName #ankündigungsKanal\n\n"
                    + "## Twitchspiele (Postet ALLE Streams dieses Spiels)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game spielName #ankündigungsKanal\n\n"
                    + "## Twitchteams (Postet ALLE Streams in diesem Team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team teamName #ankündigungsKanal\n\n"
                    + "## Twitch-Spielefilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Twitchankündigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch spielfilter {spielName|spielName} #ankündigungsKanal\n\n"
                    + "## Twitch-Titelfilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Twitchankündigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch titelfilter spielName #ankündigungsKanal\n\n"
                    + "* Beispiel:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Fügt einen Twitchkanal für einen bestimmten Kanal und Spielfilter hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (Fügt ein Spiel für den Standardankündigungskanal hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (Fügt eine Twitch-Community für einen bestimmten Ankündigungskanal hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (Fügt ein Twitchteam für einen bestimmten Ankündigungskanal hinzu)\n\n"
                    + "```"},
            {"twitchTeamAdd", "\n# Teams hinzugefügt: %s."},
            {"twitchTeamAddFail", "\n# Fehler beim Hinzufügen der Teams: %s."},
            {"twitchTeamAnnounce", "\n# Die Teams werden in #%s angekündigt."},
            {"twitchTeamNotFound", "\n# Team(s) nicht auf Twitch gefunden: %s."},
            {"twitchTeamRemove", "\n# Entfernte Teams: %s."},
            {"twitchTeamRemoveFail", "\n# Fehler beim entfernen der Teams: %s."},
            {"twitchTeams", "Twitchteams"},
            {"twitchTitleFilterAdd", "\n# Titelfilter hinzugefügt: %s."},
            {"twitchTitleFilterAddFail", "\n# Fehler beim Hinzufügen der Titelfilter: %s."},
            {"twitchTitleFilterRemove", "\n# Titelfilter entfernt: %s."},
            {"twitchTitleFilterRemoveFail", "\n# Fehler beim Entfernen der Titelfilter: %s."},
            {"typeOnce", "Das musst du nicht doppelt schreiben, Dussel."},
            {"uniqueChannels", "Verschiedene Kanäle %s"},
            {"uniqueGames", "Verschiedene Spiele %s"},
            {"usePlatform", "Ups!  Das ist der alte Befehl!  Benutze bitte die neuen plattformspezifischen Befehle!  Schreibe `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` für weitere Informationen"},
            {"watchThemHere", "Jetzt zuschauen: "},
            {"wrongCommand", " :thinking: Den Befehl kenne ich nicht."}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}