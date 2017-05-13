# Now Live
[![Build Status](https://travis-ci.org/VeteranSoftware/NowLiveBot-2.0.svg?branch=master)](https://travis-ci.org/VeteranSoftware/NowLiveBot-2.0)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/af8f87629fd84849a8789530683231e7)](https://www.codacy.com/app/VeteranSoftware/NowLiveBot-2-0?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=VeteranSoftware/NowLiveBot-2.0&amp;utm_campaign=Badge_Grade)
[![Dependency Status](https://www.versioneye.com/user/projects/58324817eaa74b0049b51498/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/58324817eaa74b0049b51498)
![Discord Badge](https://discordapp.com/api/guilds/250045505659207699/widget.png?style=shield)

> A Discord bot that announces streamers as they go live!

## Supported Platforms
* Twitch
* Beam

## Planned Platforms
* YouTube
* HitBox

## The Basics

> You MUST be a manager to execute these commands!

### Permissions (The How & Why)

> Now Live requires the following permissions in order to do what you expect out of it.

#### Administrator
Allows the bot to do everything it needs to do (send, delete, edit announcements) and leave it open for future implementations of different features.
Please don't change the permissions to anything else as the bot will likely not do everything it needs to do.

### Invite the bot to your server
To add Now Live to your server, [click here](https://discordapp.com/oauth2/authorize?&client_id=240729664035880961&scope=bot&permissions=8).

> **IMPORTANT:**  Leave the bot permissions as they are!  The bot needs all of those permissions to do its job!  Removing any of those permissions could cause the bot to not work properly in your server!

### Add Additional Managers (optional)
> **NOTE:**  All peeps in your server with Administrator and Manage Server permissions are automagically added as managers!

To add additional managers use the following command:

`-nl add manager @<user>`


Additionally, you can remove managers by typing:

`-nl remove manager @<user>`

### Add Channels to Monitor
> **NOTE:** Twitch is currently the only supported platform.  I will update this when more platforms are added.

You now have the ability to add multiple channels at one time along with adding in-line game ant title filters.
You can even set specific announcement channels for different streamers!

> **NOTE:** Game filters and Title filters MUST have their appropriate brackets around them.  Game filters, title filters
are optional.

To add channels, type:

`-nl twitch channel <channelName|channelName> {gamefilter|gamefilter} [titlefilter|titlefilter] #announceChannel`


Example:  `-nl twitch channel AgueMort #live-streams` (adds only a channel that announces to your live-streams channel)
Example:  `-nl twitch channel AgueMort {OverWatch|World of Warcraft} #announcements` (adds a channel and will only announce them when they are playing Overwatch or World of Warcraft)

> **IMPORTANT:** Only add the channel name.  Adding the full URL of the channel will not work.

If you messed up, you can remove the channel using:

`-nl twitch channel <channelName>` (IMPORTANT: don't include the announcement channel!  Only the Twitch channel name)

#### Game and Title Filters
Filters allow you to only have channels announced when the streamer is playing a specific game.  These filters are global and will apply to all streams!

To add a filter, type:

```
-nl twitch gfilter {The Legend of Zelda|Super Mario World 64}
-nl twitch tfilter [giveaway|chill|stream]
```


To remove filters, type:

```
-nl twitch gfilter {The Legend of Zelda}
-nl twitch tfilter [giveaway]
```

### Add Games, Teams & Communities

To add a game, team, or community ***(this will announce EVERY LIVE STREAM for that game, team or community!)***, type:

```
-nl twitch game League of Legends|Overwatch #stream-announcements
-nl twitch community MMORPG #mmorpg-streams
-nl twitch team thekingdom #the kingdom-streams
```

To remove a game, team, or community, type:

```
-nl twitch game League of Legends
-nl twitch community MMORPG
-nl twitch team thekingdom
```

---
## Command List
### Add (Managers only)
> Add managers

`-nl add manager @<user>`

### Bot Language (Managers only)
> **IMPORTANT:**  This will affect all of the bot's responses.  Native spelling is allowed!  
If you don't know how to type the non-English characters, use the English version

> **Currently supported languages:**  English, French, German, & Spanish

> Change the language of the bots responses to a language other than English.


`-nl botlang <language>`

#### Examples
`-nl botlang english` (default)

> French

`-nl botlang french` or `-nl botlang français` 

> German

`-nl botlang german` or `-nl botlang deutsch`

> Spanish

`-nl botlang spanish` or `-nl botlang español`

### Cleanup (Managers only)
> Changes what happens when the streamer goes offline

`-nl cleanup none` *(default)*

`-nl cleanup edit`

`-nl cleanup delete`

### Compact (Managers only)
> Changes how streams are announces (removes the auto-embedded image)

`-nl compact on`

`-nl compact off` *(default)*

### List
> List the specified things from the database for the Discord server

`-nl list twitchchannels`

`-nl list twitchgames`

`-nl list gfilter`

`-nl list tfilter`

`-nl list manager`

`-nl list twitchteam`

`-nl list twitchcommunity`

`-nl list settings`

### Notify (Managers only)
> Changes who gets notified with the announcements

`-nl notify none` *(default)*

`-nl notify here`

`-nl notify everyone`

### Remove (Managers only)
> Remove managers

`-nl remove manager @<user>`

### Stream Language (Managers only)
> **IMPORTANT:**  This only affects Twitch streams.

> Allows you to filter streams by the language it is being broadcast in.  This supports the English spelling of the 
language, or the native spelling.  Must be a supported language on Twitch that is listed in the Dashboard.


`-nl streamlang <language>`

#### Examples
> Spanish

`-nl streamlang spanish` or `-nl streamlang español`

> Japanese

`-nl streamlang japanese` or `-nl streamlang 日本語`

> Greek

`-nl streamlang greek` or `-nl streamlang ελληνικά`

> Arabic

`-nl streamlang arabic` or `-nl streamlang العربية`

> All languages (no filter)

`-nl streamlang all`

### Streams
> Send you a Private Message with a list of all streamers that are actively streaming that your Discord server is following

`-nl streams`

### Twitch (Managers only)
> Adds and removes Twitch channels, games, teams, or communities to monitor

`-nl twitch channel aguemort #live-streams {Overwatch|World of Warcraft|Dub Wars} [any%|speedruns|songrequest]`

`-nl twitch game League of Legends|Overwatch #stream-announcements`

`-nl twitch community MMORPG #mmorpg-streams`

`-nl twitch team thekingdom #the kingdom-streams`

`-nl twitch gfilter {The Legend of Zelda|Super Mario World 64}`

`-nl twitch tfilter [giveaway|chill|stream]`

---
## Now Live has a Discord Server!

[Join us on Discord and chat with the developers!](https://discord.gg/gKbbrFK)

---
## Problems?
If you are having issues with the bot, please do not open an issue here.  Go to [the Now Live Trello Board](https://trello.com/invite/b/kcWshbIU/a94c145e598be9f8dd734197ba07288e/now-live-bot) and let the developers know first.  If it's a big enough issue, we'll tell you to open an issue here.  If any issues are opened up here without bringing it up on Trello first, they will be automatically closed and not actioned upon.
