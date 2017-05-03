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
public class LanguageBundle_sv extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "tillagd "},
            {"addFail", "Det gick inte att lägga till"},
            {"addHelp", "``` Markdown \n # ADD \n * Används för att lägga till chefer för din server \n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + "add <option> <content>"
                    + "\n\t<option> <innehåll>"
                    + "\n\tmanager - The @ omnämnandet av användaren för att lägga till som en manager"
                    + "\n\n## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "add manager @Ague```"},
            {"adminOverride", "* Tillstånd av detta kommando har åsidosätts av en utvecklare. *"},
            {"alreadyExists", "Det ser ut som du redan har lagt det till min databas. ¯ \\ _ (?) _ / ¯"},
            {"alreadyManager", "Det verkar som jag har redan anställt användaren som chef. Hitta moar humanz!"},
            {"announceHelp", "```Markdown\n# tillkännage\n* Shhh ... Jag är en hemlighet ...\n\n## ANVÄNDNING"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tdDetta kommandot är endast tillgänglig för developers.```"},
            {"beamHelp", "```Markdown\n# BEAM\n* Lägga till och ta bort saker som Beam.pro är relaterade\n\n## ANVÄNDNING"
                    + Const.COMMAND_PREFIX + Const.COMMAND + "balk <sub-kommando> <option> <argument>\n"
                    + "\t<sub-kommando> <option> <argument>\n"
                    + "\tadd channel <CHANNEL>\n"
                    + "\tremove kanal <kanalnamn>\n\n"
                    + "## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "stråle lägga kanal Ague" + "'' '"},
            {"beamUserNoExist", "Det Beam användaren inte existerar! Kontrollera din stavning och försök igen!"},
            {"botLangFail", "Något gick fel och mitt språk är fortfarande densamma."},
            {"botLangHelp", "```Markdown\n# BOTLANG\n* Används för att ändra språket i mina svar\n\n## ANVÄNDNING."
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + "botlang språk"
                    + "\n\tRetur antingen engelska stavningen eller infödda stavningen av det språk du vill ställa in."
                    + "\n\n## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "botlang spanska" + "'' '"
                    + "\n\tOm du behöver ytterligare hjälp med detta kommando eller andra utanför vad våra hjälp kommandon gör och du vill ställa frågor på ett språk som tillhörande"
                    + "Med boten gärna nå ut till våra översättare i vår oenighet om hjälp. Disharmoni är" + Const.COMMAND_PREFIX + Const.COMMAND + "oenighet"},
            {"botLangSuccess", "Du har ändrat mitt språk."},
            {"botLangUnsupported", "Det språk stöds för närvarande inte."},
            {"botStatistics", "%s Statistik"},
            {"broadcasterLangAllSuccess", "ok_hand. Jag ska leta efter strömmar från alla språk"},
            {"broadcasterLangFail", "Något gick fel och jag letar fortfarande efter alla språk."},
            {"broadcasterLangSuccess", " :ok_hand: Jag ska bara leta efter strömmar som finns på det språket"},
            {"canNotRemoveOwner", "Silly människa, du kan inte ta bort serverägaren från chefen listan. :laughing: :laughing:"},
            {"cleanupFail", "Ah, man ... Något gick fel ... Bättre prova det igen."},
            {"cleanupHelp", "```Markdown\n# CLEANUP\n* Ändra hur jag rensa upp min stream meddelanden\n\n## ANVÄNDNING"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone - Jag kommer inte att ändra en sak till mina meddelanden (standard)!"
                    + "\n\tedit - Jag redigerar mina meddelanden att säga \" OFFLINE \"när streamer går offline"
                    + "\n\tdelete - Jag ska bara ta bort meddelandet när streamer inte längre live"
                    + "\n\n## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Sir, YES SIR! Jag kommer att ta bort alla mina meddelanden från och med nu!"},
            {"cleanupSuccessEdit", "Redigera mina meddelanden, är det."},
            {"cleanupSuccessNone", "ok_hand. Jag kommer inte att göra något för att mina meddelanden"},
            {"compactFail", "Um, gick något fel. Min kompakta läget är oförändrat."},
            {"compactHelp", "```Markdown\n# COMPACT\n* Byt mina meddelanden till en kortare version\n\n## ANVÄNDNING."
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed     - Removes the large embed and only uses a short sentence."
                    + "\n\tsmallEmbed  - Announces with an embed with no large banner image."
                    + "\n\tfullEmbed   - The full announcement with large banner image."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: You will get the full announcement from now on."},
            {"compactSmallEmbed", " :compression: You will get an announcement with a small embed from now on."},
            {"compactNoEmbed", " :compression: Your announcements will only be a short sentence from now on."},
            {"configHelp", "# CONFIG\n* The base command to set my various settings. Check each specific settings help for more info.\n\n" +
                    "* defaultOfflineMessage - Returns the offline message to the default (used in edited announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "* defaultOnlineMessage - Returns the announcement message to the default (used in all announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "* setOfflineMessage - Set a custom offline message (used in edited announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "* setOnlineMessage - Set a custom announcement message (used in all announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help"},
            {"defaultAnnounceMessage", "%CHANNEL% has just gone live! Watch their stream here: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Reset my offline message to the default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% is no longer live!  Sorry, you missed them this time."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Reset my online message to the default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Meddelande från" + Const.BOT_NAME + "utvecklare:*\n\n\t"},
            {"discordChannelNoExist", "Det text kanal existerar inte på servern."},
            {"discordLink", "Interested in joining the Now Live Discord server? Lots of helpful people there if you're " +
                    "having problems! Click this link:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Display's the link to join the Now Live Discord server."},
            {"discordUserNoExist", "Den personen är inte en Discord användare! Försök igen!"},
            {"doesNotExist", "Det var aldrig läggas till min databas."},
            {"embedFull", "announcement with a full size embed"},
            {"embedSmall", "announce with a small embed"},
            {"embedNone", "announce with a just a small statement and no embed"},
            {"emptyArgs", "Jag tror att du har glömt en del av kommandot. Kontrollera kommandot help för mer info."},
            {"emptyCommand", "nästa gång du wake me up, skicka ett kommando som väl."},
            {"followersEmbed", "följare"},
            {"guildJoinSuccess", "Hej! Jag är boten Now Live, strömmen Skriv 'tillkännage bot!" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    "Help` för en lista över mina kommandon. \n\nOm du behöver lite hjälp med att ställa mig upp, kom" +
                    "Gå med min disharmoni på" + Const.DISCORD_URL + "och kolla in how-to-setup och kommando lista" +
                    "Kanaler för all info! \n\ndon't glömmer att säga hej!"},
            {"helpPm", "Hallå där, %s! Så jag hör du letar efter lite hjälp? Nedan följer en lista över mina kommandon.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* För närvarande stöds språk: engelska, tjeckiska, tyska, franska, spanska" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# MOVE\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " move help\n\n" +
                    "# NOTIFY\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVET\n" +
                    "* ör mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# STREAMLANG\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + "streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + "strömmar help\n\n" +
                    "# TWITCH\n" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n```\n" +
                    "# PATREON / DONERA\n" +
                    "Ger länken till bot är patreon Kommandon är.\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/BEGÄRAN\n" +
                    "Ger länk till vår Trello som används för felrapporter och önskemål om funktioner Kommandon är:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request```" +
                    "If you need additional help, join my Discord.  Lots of helpful people there:  " + Const.DISCORD_URL},
            {"incorrectArgs", "You passed incorrect or missing arguments to me.  Check the help command for more info."},
            {"invite", "Hey %s! Invite me to your server!\n\n\t"
                    + "**Click here:** https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token() + "&scope=bot&permissions=8"},
            {"inviteHelp", "```Markdown\n# INVITE\n* Used to display my invite link.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvite NowLive bot to your Discord Server.```"},
            {"listHelp", "```Markdown\n# LIST\n* This command lists things from the database.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list *option*"
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
                    "\n* Bot language is set to %s." +
                    "\n* Current online announcement message format is: %s." +
                    "\n* Current offline announcement message format is: %s.```"},
            {"moveDoNotOwnChannel", " :no_entry: Hey now, I can't announce to a channel that doesn't exists on your " +
                    "server!"},
            {"moveFail", " :no_entry: I can't seem to send announcements there.  Make sure I have the proper permissions " +
                    "in that channel."},
            {"moveHelp", "```Markdown\n# MOVE\n* Change where I make my announcements.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " move <channel>\n\t"
                    + "<channel> - The name of the channel you wish to move my announcements to (MUST include the #)\n"
                    + "This option is deprecated and may not work as you think.  Please see the Twitch command."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " move #discordchannel" + "```"},
            {"moveSuccess", " :ok_hand: I'll announce over there!"},
            {"needOneManager", "If you remove that manager, who will manage me?"},
            {"noBotManager", "It's against the Discord Bot Union By-Laws for bots to manage me. Sorry, try and find a " +
                    "suitable human for the job. :thumbsup:"},
            {"noneOnline", "Sorry %s, but there's nobody online right now that this server is following."},
            {"notAManager", "Sorry, but only my managers can do that. Type `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` for a list of people that can."},
            {"notAnAdmin", "To whom it may concern:  I am your servant, but you are not my master."},
            {"notifyEveryone", ":tada: WHOA!!  **EVERYONE** that belongs to the server will get notified when I " +
                    "announce streams!  *(Are you sure?  I don't recommend this for large servers...  It can make " +
                    "people grumpy.)*"},
            {"notifyHelp", "```Markdown\n# NOTIFY\n* Used to change the global notification option for this server.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone     - No @ notifications of any kind (default)"
                    + "\n\there     - I will notify only those people that are online when I make the announcement"
                    + "\n\teveryone - I'll notify EVERYONE!!  Mwahahaha!!  (I don't recommend this on large servers)"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", "bellhop_bell: Alla som är online kommer att få ett omnämnande när jag tillkännager strömmar."},
            {"notifyNone", "ok_hand. Jag kommer inte att nämna någon i mina meddelanden"},
            {"nowLive", "NU LIVE!\n"},
            {"nowPlayingEmbed", "Now Playing"},
            {"nowPlayingLower", "spelar nu"},
            {"nowStreamingEmbed", "nu streaming!"},
            {"numUniqueMembers", "Number unika medlemmar"},
            {"offline", "offline!\n"},
            {"offlineEmbed", "har gått offline!"},
            {"on", " på "},
            {"onlineStreamPm1", "Hey there! Det finns för närvarande"},
            {"onlineStreamPm2", "streamers på nätet som du kan vara intresserad av! Följ deras länkar för att kontrollera dem" +
                    "Out:\n\n"},
            {"oops", "Hoppsan! Något gick fel och ingenting har ändrats! Låt oss försöka det igen."},
            {"patreon", "Om du vill donera till bot överväga att använda vår Patreon. Https://www.patreon.com/nowlive"},
            {"patreonHelp", "Ger länk till vår patreon sidan."},
            {"ping", "När jag var i Kina på All-American Ping Pong laget, jag älskade bara spela ping-pong med min" +
                    "Flexolite ping pong paddel."},
            {"pingHelp", "` `` Wiki\n # PING\n * Används för att pinga mig om jag har fungerar, skickar jag dig en pong\n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX + Const.COMMAND + "ping```"},
            {"privateMessageReply", "Jag är ledsen, men boten du försöker nå har en röstbrevlåda som inte har" +
                    "Ställts in ännu. Försök din PM igen senare."},
            {"removed", " bort %s %s."},
            {"removeManagerFail", "Jag kan inte ta bort%s eftersom de inte är i min databas."},
            {"removeHelp", "```Markdown\n # TA BORT\n * Används för att ta bort chefer från min databas\n\n## ANVÄNDNING."
                    + Const.COMMAND_PREFIX + Const.COMMAND + "avlägsna manager @ användarnamn"
                    + "\n\tmanager - The @ omnämnandet av användaren att ta bort som en manager"
                    + "\n\n## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "ta bort manager @ AgueMort```"},
            {"servers", "servrar"},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Set a custom offline message for edited offline announcements.\n\n" +
                    "## Available tokens to use in your message:\n" +
                    "\t* %CHANNEL%   - The name of the channel\n" +
                    "\t* %FOLLOWERS% - The total number of followers\n" +
                    "\t* %GAME%      - The name of the game being streamed\n" +
                    "\t* %STATUS%    - The status (title) of the stream\n" +
                    "\t* %URL%       - The URL for the stream\n" +
                    "\t* %USER%      - The name of the channel\n" +
                    "\t* %VIEWERS%   - The number of current viewers\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + "config setOfflineMessage " +
                    "%CHANNEL% is no longer live!  Sorry, you missed them this time."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Set a custom announcement message.\n\n" +
                    "## Available tokens to use in your message:\n" +
                    "\t* %CHANNEL%   - The name of the channel\n" +
                    "\t* %FOLLOWERS% - The total number of followers\n" +
                    "\t* %GAME%      - The name of the game being streamed\n" +
                    "\t* %STATUS%    - The status (title) of the stream\n" +
                    "\t* %URL%       - The URL for the stream\n" +
                    "\t* %USER%      - The name of the channel\n" +
                    "\t* %VIEWERS%   - The number of current viewers\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + "config setOnlineMessage " +
                    "%CHANNEL% has just gone live! Watch their stream here: %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Shard Number"},
            {"shardsTotal", "Number Shards"},
            {"statusHelp", "```Markdown\n # STATUS\n* Visar olika statistik från bot\n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX + Const.COMMAND + "status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Gör det möjligt att filtrera strömmar av språket det sänds" +
                    "I. Detta stödjer den engelska stavningen av språket, eller infödda stavningen. Måste vara en stöds" +
                    "Språket på Twitch som anges i Dashboard\n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    "streamlang <språk>\n" +
                    "* Du kan använda antingen infödda stavningen av språket eller engelska stavningen av språket."
                    + "\n\n ## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "streamlang german```"},
            {"streamTitleEmbed", "Stream Titel"},
            {"streamsHelp", "```Markdown\n# STREAMS\n* Jag skickar en lista över aktiva strömmar som PM\n * (OBS!. Du kommer troligen" +
                    "Ta emot flera meddelanden med hjälp av detta kommando, beroende på hur många strömmar din oenighet" +
                    "monitorer)\n\n ## ANVÄNDNING:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Total Views"},
            {"trello", "För att rapportera buggar eller begära funktioner som ska läggas till bot använd vår Trello. Https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Ger länken till Trello för bot"},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchAnnounceUpdate", "\n # Uppdaterade Twitch meddelandekanalen för%s till: %s"},
            {"twitchAnnounceUpdateFail", "!\n Misslyckades att ändra Twitch tillkännage kanal för%s till: %s"},
            {"twitchChannelAdd", "\n # tillagd kanal (er):%s."},
            {"twitchChannelAddFail", "\n # Det gick inte att lägga till kanaler: %s"},
            {"twitchChannelAnnounce", "\n # De kommer att tillkännages i: #%s"},
            {"twitchChannelGameFilter", "\n # De kommer bara att meddelas när de spelar: %s"},
            {"twitchChannelNotFound", "\n# Channel(s) not found on Twitch: %s."},
            {"twitchChannelRemove", "\n # Bort kanaler: %s"},
            {"twitchChannelRemoveFail", "!\n gick inte att radera kanaler: %s"},
            {"twitchChannelTitleFilter", "\n # De kommer bara att meddelas när dessa ord är i titeln.%s"},
            {"twitchCommunityAdd", "\n # tillagd gemenskap (er): %s."},
            {"twitchCommunityAddFail", "\n # inte lägga gemenskap (er): %s"},
            {"twitchCommunityAnnounce", "\n # Samhället (er) kommer att tillkännage i: #%s."},
            {"twitchCommunityNotFound", "\n # gemenskapen (s) inte finns på Twitch %s"},
            {"twitchCommunityRemove", "\n # Bort gemenskap (er): %s."},
            {"twitchCommunityRemoveFail", "\n # Misslyckades att avlägsna gemenskap (er): %s"},
            {"twitchGameAdd", "\n # tillagd spel (s): %s."},
            {"twitchGameAddFail", "\n # inte lägga spel (s): %s"},
            {"twitchGameAnnounce", "\n # Spelet kommer tillkännage i. #%s"},
            {"twitchGameFilterAdd", "\n # Added spel filter (s):%s."},
            {"twitchGameFilterAddFail", "\n # inte lägga spelfilter (ar): %s"},
            {"twitchGameFilterRemove", "\n # Bort spel filter (s):%s."},
            {"twitchGameFilterRemoveFail", "\n # Misslyckades att avlägsna spel filtret (n): %s"},
            {"twitchGameRemove", "\n # Bort spel (s):%s "},
            {"twitchGameRemoveFail", "\n # Misslyckades att avlägsna spel (s): %s"},
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
            {"twitchTeamAdd", "\n # tillagd laget (er): %s."},
            {"twitchTeamAddFail", "\n # inte lägga laget (er): %s"},
            {"twitchTeamAnnounce", "\n # Laget (er) kommer att tillkännage i: #%s."},
            {"twitchTeamNotFound", "\n # Team (er) som inte finns på Twitch: %s"},
            {"twitchTeamRemove", "\n # Bort laget (er): %s."},
            {"twitchTeamRemoveFail", "\n # Det gick inte att ta bort lag (ar): %s"},
            {"twitchTeams", "Twitch Lag"},
            {"twitchTitleFilterAdd", "\n # Added titel filter (s): %s."},
            {"twitchTitleFilterAddFail", "\n # inte lägga titelfiltret (n): %s"},
            {"twitchTitleFilterRemove", "\n # Borttitel filter (s): %s."},
            {"twitchTitleFilterRemoveFail", "\n # Det gick inte att ta bort titelfiltret (n): %s"},
            {"typeOnce", "Du behöver bara skriva den delen en gång, dumt."},
            {"uniqueChannels", "unika kanaler %s"},
            {"uniqueGames", "Unika Spel %s"},
            {"updateAnnounceMessageFail", "# Something went wrong and the announcement message was not changed."},
            {"updateAnnounceMessageSuccess", "# You've updated the announcement message!  It now uses the format:\n\n* %s"},
            {"updateOfflineMessageFail", "# Something went wrong and the offline message was not changed."},
            {"updateOfflineMessageSuccess", "# You've updated the offline message!  It now uses the format:\n\n* %s"},
            {"usePlatform", "Oj! Det är det gamla sättet att göra saker! Använda plattformen specifikt kommando Typ '" +
                    Const.COMMAND_PREFIX + Const.COMMAND + "help` för mer info."},
            {"watchThemHere", "Titta på dem här:"},
            {"wrongCommand", "tänkande: Jag vet inte det kommandot."}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
