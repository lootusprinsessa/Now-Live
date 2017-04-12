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
                    + "\n\ttmanager - The @ omnämnandet av användaren för att lägga till som en manager"
                    + "\n\n## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "add manager @Ague```"},
            {"adminOverride", "* Tillstånd av detta kommando har åsidosätts av en utvecklare. *"},
            {"alreadyExists", "Det ser ut som du redan har lagt det till min databas. ¯ \\ _ (?) _ / ¯"},
            {"alreadyManager", "Det verkar som jag har redan anställt användaren som chef. Hitta moar humanz!"},
            {"announceHelp", "```Markdown\n# tillkännage\n* Shhh ... Jag är en hemlighet ...\n\n## ANVÄNDNING"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tdDetta kommandot är endast tillgänglig för developers.```"},
            {"announcementMessageText", "Hej %s har just gått live Titta sin stream här!%s"},
            {"beamHelp", "```Markdown\n# BEAM\n* Lägga till och ta bort saker som Beam.pro är relaterade\n\n## ANVÄNDNING"
                    + Const.COMMAND_PREFIX + Const.COMMAND + "balk <sub-kommando> <option> <argument>\n"
                    + "\t<sub-kommando> <option> <argument>\n"
                    + "\tadd channel <CHANNEL>\n"
                    + "\tREMOVE kanal <kanalnamn>\n\n"
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
                    + "\n\ton - Slår på Compact Mode"
                    + "\n\toff - Stänger av Compact Mode"
                    + "\n\n## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "kompakt på" + "```"},
            {"compactOff", "komprimering. Kompakt läge har stängts av"},
            {"compactOn", "komprimering. Kompakt läge har slagits på"},
            {"devMessage", "*Meddelande från" + Const.BOT_NAME + "utvecklare:*\n\n\t"},
            {"discordChannelNoExist", "Det text kanal existerar inte på servern."},
            {"discordUserNoExist", "Den personen är inte en Discord användare! Försök igen!"},
            {"doesNotExist", "Det var aldrig läggas till min databas."},
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
                    "* Används för att lägga till information till min databas För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Lägg till och ta bort saker som Beam.pro är relaterade För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Används för att ändra språket i mina svar.\n" +
                    "* För närvarande stöds språk: engelska, tjeckiska, tyska, franska, spanska" +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Ändra hur jag rensa upp min stream meddelanden För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Byt mina meddelanden till en kortare version För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# INVITE\n" +
                    "* Används för att visa mitt bjuda länk för mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Detta kommando listar saker från databasen För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# MOVE\n" +
                    "* Förändring där jag gör mina meddelanden För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " move help\n\n" +
                    "# NOTIFY\n" +
                    "* Används för att ändra den globala alternativ för denna server anmälan För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* Används för att pinga mig om jag har fungerar, skickar jag dig en pong För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVET\n" +
                    "* Används för att ta bort något från min databas För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# STREAMLANG\n" +
                    "* Gör att du kan filtrera strömmar av språket den sänds i.\n" +
                    "* För mer information, typ:" + Const.COMMAND_PREFIX + Const.COMMAND + "streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Jag skickar en lista över aktiva strömmar som en PM." +
                    "* För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + "strömmar help\n\n" +
                    "# TWITCH\n" +
                    "* Lägg till och ta bort saker som Twitch.tv är relaterade För mer information, typ:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n```\n" +
                    "# PATREON / DONERA\n" +
                    "Ger länken till bot är patreon Kommandon är.\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" + Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/BEGÄRAN\n" +
                    "Ger länk till vår Trello som används för felrapporter och önskemål om funktioner Kommandon är:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" + Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" + Const.COMMAND_PREFIX + Const.COMMAND + " request```"},
            // Big piece missing here
            {"notifyHere", "bellhop_bell: Alla som är online kommer att få ett omnämnande när jag tillkännager strömmar."},
            {"notifyNone", "ok_hand. Jag kommer inte att nämna någon i mina meddelanden"},
            {"nowLive", "NU LIVE!\n"},
            {"nowPlayingEmbed", "Now Playing"},
            {"nowPlayingLower", "spelar nu"},
            {"nowStreamingEmbed", "nu streaming!"},
            {"numUniqueMembers", "Number unika medlemmar"},
            {"offline", "offline!\n"},
            {"offlineEmbed", "har gått offline!"},
            {"oops", "på"},
            {"onlineStreamPm1", "Hey there! Det finns för närvarande"},
            {"onlineStreamPm2", "streamers på nätet som du kan vara intresserad av! Följ deras länkar för att kontrollera dem" +
                    "Out:\n\n"},
            {"oops", "Hoppsan! Något gick fel och ingenting har ändrats! Låt oss försöka det igen."},
            {"patreon", "Om du vill donera till bot överväga att använda vår Patreon. Https://www.patreon.com/nowlive"},
            {"PatreonHelp", "Ger länk till vår patreon sidan."},
            {"ping", "När jag var i Kina på All-American Ping Pong laget, jag älskade bara spela ping-pong med min" +
                    "Flexolite ping pong paddel."},
            {"pingHelp", "` `` Wiki\n # PING\n * Används för att pinga mig om jag har fungerar, skickar jag dig en pong\n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX + Const.COMMAND + "ping```"},
            {"privateMessageReply", "Jag är ledsen, men boten du försöker nå har en röstbrevlåda som inte har" +
                    "Ställts in ännu. Försök din PM igen senare."},
            {"removed", " bort %s %s."},
            {"removeManagerFail", "Jag kan inte ta bort%s eftersom de inte är i min databas."},
            {"removeHelp", "` `` Wiki\n # TA BORT\n * Används för att ta bort chefer från min databas\n\n## ANVÄNDNING."
                    + Const.COMMAND_PREFIX + Const.COMMAND + "avlägsna manager @ användarnamn"
                    + "\n\tmanager - The @ omnämnandet av användaren att ta bort som en manager"
                    + "\n\n ## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "ta bort manager @ AgueMort```"},
            {"servrer", "servrar"},
            {"statusHelp", "` `` Wiki\n # STATUS\n * Visar olika statistik från bot\n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX + Const.COMMAND + "status```"},
            {"streamlangHelp", "` `` Wiki\n # STREAMLANG\n * Gör det möjligt att filtrera strömmar av språket det sänds" +
                    "I. Detta stödjer den engelska stavningen av språket, eller infödda stavningen. Måste vara en stöds" +
                    "Språket på Twitch som anges i Dashboard\n\n ## ANVÄNDNING."
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    "Streamlang <språk>\n" +
                    "* Du kan använda antingen infödda stavningen av språket eller engelska stavningen av språket."
                    + "\n\n ## EXEMPEL:" + Const.COMMAND_PREFIX + Const.COMMAND + "streamlang german```"},
            {"streamTitleEmbed", "Stream Titel"},
            {"streamsHelp", "` `` Wiki\n # STREAMS\n * Jag skickar en lista över aktiva strömmar som PM\n * (OBS!. Du kommer troligen" +
                    "Ta emot flera meddelanden med hjälp av detta kommando, beroende på hur många strömmar din oenighet" +
                    "monitorer)\n\n ## ANVÄNDNING:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"trello", "För att rapportera buggar eller begära funktioner som ska läggas till bot använd vår Trello. Https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Ger länken till Trello för bot"},
            {"totalViewsEmbed", "Total Views"},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchAnnounceUpdate", "\n # Uppdaterade Twitch meddelandekanalen för%s till:.%s"},
            {"twitchAnnounceUpdateFail", "!\n Misslyckades att ändra Twitch tillkännage kanal för%s till:.%s"},
            {"twitchChannelAdd", "\n # tillagd kanal (er):%s."},
            {"twitchChannelAddFail", "\n # Det gick inte att lägga till kanaler:.%s"},
            {"twitchChannelAnnounce", "\n # De kommer att tillkännages i. #%s"},
            {"twitchChannelGameFilter", "\n # De kommer bara att meddelas när de spelar.%s"},
            {"twitchChannelRemove", "\n # Bort kanaler:.%s"},
            {"twitchChannelRemoveFail", "!\n gick inte att radera kanaler:.%s"},
            {"twitchChannelTitleFilter", "\n # De kommer bara att meddelas när dessa ord är i titeln.%s"},
            {"twitchCommunityAdd", "\n # tillagd gemenskap (er):%s."},
            {"twitchCommunityAddFail", "\n # inte lägga gemenskap (er):.%s"},
            {"twitchCommunityAnnounce", "\n # Samhället (er) kommer att tillkännage i: #%s."},
            {"twitchCommunityNotFound", "\n # gemenskapen (s) inte finns på Twitch.%s"},
            {"twitchCommunityRemove", "\n # Bort gemenskap (er):%s."},
            {"twitchCommunityRemoveFail", "\n # Misslyckades att avlägsna gemenskap (er):.%s"},
            {"twitchGameAdd", "\n # tillagd spel (s):%s."},
            {"twitchGameAddFail", "\n # inte lägga spel (s):.%s"},
            {"twitchGameAnnounce", "\n # Spelet kommer tillkännage i. #%s"},
            {"twitchGameFilterAdd", "\n # Added spel filter (s):%s."},
            {"twitchGameFilterAddFail", "\n # inte lägga spelfilter (ar):.%s"},
            {"twitchGameFilterRemove", "\n # Bort spel filter (s):%s."},
            {"twitchGameFilterRemoveFail", "\n # Misslyckades att avlägsna spel filtret (n):.%s"},
            {"twitchGameRemove", "\n # Bort spel (s):%s."},
            {"twitchGameRemoveFail", "\n # Misslyckades att avlägsna spel (s):.%s"},
            {"twitchHelp", "` `` Wiki\n # RYCKA\n * Lägga till och ta bort saker som Twitch.tv är relaterade.\n"
                    + "* Anmärkningar:\n \t"
                    + "För att lägga till spelfilter och titel filter, du måste inkludera konsolerna.\n\t"
                    + "Använd inte den fullständiga Twitch URL. Det kommer inte att fungera !! Använd endast kanalnamnet (www.twitch.tv/channelName)\n\t"
                    + "Lagets namn måste vara från webbadressen, inte visningsnamnet i teamet. (Www.twitch.tv/team/teamName)\n\t"
                    + "Du kan lägga till flera kanaler, team, spel, samhällen, spel och titel filter med hjälp av röret tecknet |. Mellan dem\n\t"
                    + "De enda erforderliga alternativen är: CHANNEL / COMMUNITY / lagnamn / gamename\n\n"
                    + "## Twitch Kanaler\n"
                    + "Obs: Lägga till en meddelandekanal, spel och titel filter är valfria."
                    + "* Format:" + Const.COMMAND_PREFIX + Const.COMMAND + "rycka kanal CHANNEL #announcementChannel {gameFilters} [titleFilters]\n\n"},
            {"twitchTeamAdd", "\n # tillagd laget (er):%s."},
            {"twitchTeamAddFail", "\n # inte lägga laget (er): %s"},
            {"twitchTeamAnnounce", "\n # Laget (er) kommer att tillkännage i: #%s."},
            {"twitchTeamNotFound", "\n # Team (er) som inte finns på Twitch:.%s"},
            {"twitchTeamRemove", "\n # Bort laget (er):%s."},
            {"twitchTeamRemoveFail", "\n # Det gick inte att ta bort lag (ar):.%s"},
            {"twitchTeams", "Twitch Lag"},
            {"twitchTitleFilterAdd", "\n # Added titel filter (s):%s."},
            {"twitchTitleFilterAddFail", "\n # inte lägga titelfiltret (n):.%s"},
            {"twitchTitleFilterRemove", "\n # Borttitel filter (s):%s."},
            {"twitchTitleFilterRemoveFail", "\n # Det gick inte att ta bort titelfiltret (n):.%s"},
            {"typeOnce", "Du behöver bara skriva den delen en gång, dumt."},
            {"uniqueChannels", "unika kanaler%s"},
            {"uniqueGames", "Unika Spel%s"},
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