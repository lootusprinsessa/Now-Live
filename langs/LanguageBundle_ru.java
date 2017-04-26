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
public class LanguageBundle_ru extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Добавить "},
            {"addFail", "Не удалось добавить "},
            {"addHelp", "```Markdown\n# ДОБАВЛЕНИЕ\n* Используется для добавления менеджеров для вашего сервера.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - @ Упомяните пользователя для добавлении в качестве менеджера"
                    + "\n\n## ПРИМЕР: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague```"},
            {"adminOverride", "*Разрешение этой команды было отменено разработчиком.*"},
            {"alreadyExists", "Похоже, вы уже добавили это в мою базу данных.. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Кажется, я уже установил этого пользователя в качестве менеджера."},
            {"announceHelp", "```Markdown\n# ОБЪЯВЛЕНИЕ\n* Тсс... Я секрет...\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tЭта команда доступна только для разработчиков.```"},
            {"beamHelp", "```Markdown\n# BEAM\n* Добавление и удаление данных связанных с Beam.pro.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam <sub-command> <option> <argument>\n"
                    + "\t<sub-command> <option> <argument>\n"
                    + "\tadd           channel  <channelname>\n"
                    + "\tremove        channel  <channel-name>\n\n"
                    + "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " beam add channel Ague" + "```"},
            {"beamUserNoExist", "Указанного пользователя Beam не существует! Проверьте правильность написания и повторите попытку!"},
            {"botLangFail", "Что-то пошло не так. Мой язык все тот же."},
            {"botLangHelp", "```Markdown\n# ЯЗЫКБОТА\n* Используется для изменения языка моих ответов.\n\n## ПРИМЕНЕНИЕ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " Язык бота"
                    + "\n\tИспользуйте Английское, либо родное написание языка, который вы хотите установить."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tВам нужна дополнительная помощь с этой командой? Не нашли ответа и хотите задать вопросы на языке, в настоящее время связанным "
                    + "с ботом? Пожалуйста, не стесняйтесь обратиться к переводчикам на нашем сервере для получения помощи. Discord is at " + Const.COMMAND_PREFIX + Const.COMMAND + " discord```"},
            {"botLangSuccess", "Вы успешно изменили мой язык."},
            {"botLangUnsupported", "Этот язык в настоящее время не поддерживается."},
            {"botStatistics", "%s Статистика"},
            {"broadcasterLangAllSuccess", " :ok_hand: Я буду искать трансляции на всех языках."},
            {"broadcasterLangFail", "Что-то пошло не так, и я по-прежнему ищу трансляции на всех языках."},
            {"broadcasterLangSuccess", " :ok_hand: Я буду искать только те трансляции, которые находятся на этом языке!"},
            {"canNotRemoveOwner", "Глупо. Вы не можете удалить владельца сервера из списка менеджеров. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Хм... Что-то пошло не так... Лучше попробуйте это еще раз."},
            {"cleanupHelp", "```Markdown\n# ОЧИСТКА\n*  Изменение способа очистки моих уведомлений о трансляциях.\n\n## ПРИМЕНЕНИЕ:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone   - Я ничего не буду менять в своих объявлениях! (по умолчанию)"
                    + "\n\tedit   - Я отредактирую свои объявления, чтобы сказать \"OFFLINE\" , когда стрим окончен"
                    + "\n\tdelete - Я удалю объявление, когда стрим окончен"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Как скажете!  Теперь я буду удалять мои объявления, если трансляция окончена!"},
            {"cleanupSuccessEdit", "Я буду редактировать мои объявления, если трансляция началась или окончена."},
            {"cleanupSuccessNone", " :ok_hand: Я ничего не буду делать с моими объявлениями."},
            {"compactFail", "Эм... что-то пошло не так. Мой компактный режим не изменился."},
            {"compactHelp", "```Markdown\n# КОМПАКТНОСТЬ\n* Мои объявления возможно изменить на более компактную версию.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed     - Использование короткого объявления."
                    + "\n\tsmallEmbed  - Объявление с маленьким изображением."
                    + "\n\tfullEmbed   - Полное объявление, с больщим изображением."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: С этого момента вы будете получать полные объявления."},
            {"compactSmallEmbed", " :compression: С этого момента вы будете получать объявления с маленькими изображениями."},
            {"compactNoEmbed", " :compression: Теперь ваши объявления будут в виде коротких предложений."},
            {"configHelp", "# КОНФИГУРАЦИЯ\n* Базовая команда для установки моих различных параметров. Проверьте каждую специальную справку по настройкам для получения дополнительной информации.\n\n" +
                    "* defaultOfflineMessage - Offline сообщение по умолчанию (используется в отредактированных объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "* defaultOnlineMessage - Оnline сообщение по умолчанию (используется во всех объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "* setOfflineMessage - Настраиваемое offline сообщение (используется в отредактированных объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "* setOnlineMessage - Настраиваемое online сообщение (используется во всех объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help"},
            {"defaultAnnounceMessage", "%CHANNEL% начал стрим! Подробнее здесь (кликабельно): %URL%"},
            {"defaultOfflineHelp", "# КОНФИГУРАЦИЯ OFFLINE СООБЩЕНИЯ ОБЪЯВЛЕНИЯ ПО УМОЛЧАНИЮ\n* Сбрасывает моё offline сообщение до значения по умолчанию.\n\n" +
                    "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% закончил трансляцию!"},
            {"defaultOnlineHelp", "# КОНФИГУРАЦИЯ ONLINE СООБЩЕНИЯ ОБЪЯВЛЕНИЯ ПО УМОЛЧАНИЮ\n* Сбросывает мое online сообщение до значения по умолчанию.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " defaultOnlineMessage"},
            {"devMessage", "*Сообщение от " + Const.BOT_NAME + " разработчиков:*\n\n\t"},
            {"discordChannelNoExist", "Данный текстовый канал отсутствует на вашем сервере.."},
            {"discordLink", "Хотите присоединиться к серверу Now Live Discord? Если у вас возникли проблемы, то там есть много " +
                    "тех, кто поможет! Перейдите по ссылке:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Показывает ссылку для подключения к серверу Now Live Discord."},
            {"discordUserNoExist", "Данного пользователя Discord не существует! Попробуй еще раз!"},
            {"doesNotExist", "Это никогда не добавлялось в мою базу данных."},
            {"embedFull", "полноразмерное объявление"},
            {"embedSmall", "объявление с маленьким изображением"},
            {"embedNone", "краткое объявление, без изображений"},
            {"emptyArgs", "Кажется вы забыли какую-то команду.  Изучите команды помощи для получения дополнительной информации.."},
            {"emptyCommand", "В следующий раз, когда ты меня разбудишь, пожалуйста отправьте также команду."},
            {"followersEmbed", "Подписчиков"},
            {"guildJoinSuccess", "Всем привет!  Я Now Live. Я объявлю, если стример(ы) начинают трансляцию(и)!  Type `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` для списка моих команд.\n\nЕсли вам нужна помощь в настройке, приходите " +
                    "присоединяйтесь к моему Discord на " + Const.DISCORD_URL + " и ознакомьтесь с инструкциями по настройке и списком команд " +
                    "каналы для всей информации!\n\nНе забудьте поздороваться!"},
            {"helpPm", "Привет %s! Итак, я слышал, что вам нужна помощь? Ниже приведен список моих команд.\n\n" +
                    "```Markdown\n" +
                    "# ДОБАВЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# ЯЗЫКБОТА\n" +
                    "* Поддерживаемые языки: Английский, Чешский, Германский, Французский, Русский" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# УДАЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# КОМПАКТНОСТЬ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# ПРИГЛАШЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# СПИСОК\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# ПЕРЕНАПРАВЛЕНИЕ\n" +
                    "*Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " move help\n\n" +
                    "# УВЕДОМЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# ПИНГ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# УДАЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# ЯЗЫКТРАНСЛЯЦИИ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# ТРАНСЛЯЦИИ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Добавление и удаление связанных с Twitch.tv вещей. Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n" +
                    "# PATREON/ПОЖЕРТВОВАНИЕ\n" +
                    "Команды для просмотра ссылки на Patreon бота:\n"+
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/ОШИБКА/ЗАПРОС\n" +
                    "Команды для просмотра ссылки на наш Trello, который используется для сообщений об ошибках и для запроса функций:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request```"+
                    "Если вам нужна дополнительная помощь, присоединяйтесь к моему серверу в Discord.  Там много пользователей, которые будут полезны вам:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Вы передали мне неверные или отсутствующие значения.  Проверьте команду help для получения дополнительной информации.."},
            {"invite", "Привет %s! Вы можете пригласить меня на свой сервер!\n\n\t"
                    + "**Кликабельно:** https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token() + "&scope=bot&permissions=8"},
            {"inviteHelp", "```Markdown\n# ПРИГЛАШЕНИЕ\n* Используется для показа моей ссылки приглашения.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tПриглашение бота NowLive на ваш сервер Discord.```"},
            {"listHelp", "```Markdown\n# СПИСОК\n* Эта команда показывает базу данных.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list *option*"
                    + "\n\ttwitchChannel   - Перечисляет Twitch каналы, которые вы назначали"
                    + "\n\ttwitchCommunity - Список Twitch сообществ, которые вы назначали"
                    + "\n\tgfilter         - Список всех, установленных вами, игровых фильтров"
                    + "\n\ttwitchGame      - Список всех условий ваших игровых фильтров"
                    + "\n\tmanager         - Список менеджеров на этом сервере"
                    + "\n\ttfilter         - Выводит список всех фильтров заголовков, которые вы создали"
                    + "\n\ttwitchTeam      - Перечисляет Twitch team, которые вы назначали"
                    + "\n\tsetting         - Список общих настроек бота"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel" + "```"},
            {"listSettings", "```Markdown\n" +
                    "# Параметры бота на вашем сервере" +
                    "\n* Компактный режим: %s:" +
                    "\n* Уведомление настроено для %s:" +
                    "\n* Очистка установлена на %s." +
                    "\n* Язык объявлений о стриме: %s." +
                    "\n* Язык бота: %s." +
                    "\n* Current online announcement message format is: %s." +
                    "\n* Current offline announcement message format is: %s.```"},
            {"moveDoNotOwnChannel", " :no_entry: Теперь, я не объявляю в канале которого нет на " +
                    "сервере!"},
            {"moveFail", " :no_entry: Кажется, я не могу отправлять объявления.  Удостоверьтесь, что у меня есть соответствующие разрешения " +
                    "на этом канале."},
            {"moveHelp", "```Markdown\n# ПЕРЕНАПРАВЛЕНИЕ\n* Изменить канал, в котором я делаю свои объявления.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " move <channel>\n\t"
                    + "<channel> - Название канала, на который вы хотите переместить мои объявления: (ОБЯЗАТЕЛЬНО используйте символ #)\n"
                    + "Этот параметр устарел и может работать не так, как вы думаете. Пожалуйста смотрите Twitch команды."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " move #discordchannel" + "```"},
            {"moveSuccess", " :ok_hand: Я буду делать объявления в данном канале!"},
            {"needOneManager", "Если вы удалите этого менеджера, кто будет управлять мной?"},
            {"noBotManager", "Это противоречит Уставу Союза Discord Бота, чтобы боты управляли мной. Извините, попробуйте найти " +
                    "подходящего человека для работы. :thumbsup:"},
            {"noneOnline", "Извините %s, Но нет никого онлайн прямо сейчас на этом сервере."},
            {"notAManager", "Извините, но только мои руководители могут это сделать. Type `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` для списка людей, которые могут."},
            {"notAnAdmin", "К кому это может относиться: я твой слуга, но ты не мой господин."},
            {"notifyEveryone", ":tada: ВАУ!!  **ВСЕ** на сервере уведомляются, когда я " +
                    "объявляю о трансляциях!  *(Ты уверен?  Я не рекомендую это для больших серверов...  Это может " +
                    "рассердить людей.)*"},
            {"notifyHelp", "```Markdown\n# УВЕДОМЛЕНИЕ\n* Используется для изменения опции глобального уведомления для этого сервера.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone     - Нет @ упоминаний любого вида (по умолчанию)"
                    + "\n\there     - Я буду уведомлять только тех людей, которые находятся в сети, когда я делаю объявление"
                    + "\n\teveryone - Я сообщу ВСЕМ!!  Ахаха!!  (Я не рекомендую это на больших серверах)"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", " :bellhop_bell: Все, кто онлайн, получат упоминание, когда я анонсирую трансляции."},
            {"notifyNone", " :ok_hand: Я не буду упоминать никого в моих объявлениях."},
            {"nowLive", "НАЧАЛ(А) ТРАНСЛЯЦИЮ!\\\n"},
            {"nowPlayingEmbed", "Сейчас играет в"},
            {"nowPlayingLower", " сейчас играет в "},
            {"nowStreamingEmbed", " сейчас в сети!"},
            {"numUniqueMembers", "Количество Уникальных Участников"},
            {"offline", "НЕ В СЕТИ!\n"},
            {"offlineEmbed", " отключился!"},
            {"on", " on "},
            {"onlineStreamPm1", "Всем привет!  Сейчас есть "},
            {"onlineStreamPm2", " трансляция(и) онлайн, которая(ые) могут вас заинтересовать!  Переходите по ссылке(ам), чтобы проверить " +
                    "их: \n\n"},
            {"oops", "Упс!  Что-то пошло не так. Ничего не изменилось! Попробуем снова."},
            {"patreon", "Если вы желаете пожертвовать для бота, перейдите в Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp" , "Дает ссылку на нашу страницу patreon."},
            {"ping", "Когда я был в Китае от Американской сборной по пинг-понгу ,  я очень любил играть моей " +
                    "Flexolite ракеткой."},
            {"pingHelp", "```Markdown\n# ПИНГ\n* Используйте для проверки моего времени отклика. Если я правильно работаю, я пришлю вам pong.\n\n## ПРИМЕНЕНИЕ: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"privateMessageReply", "Я извиняюсь, но бот, которого вы пытаетесь достать, имеет автоответчик, который " +
                    "еще не настроен. Повторите попытку позже.."},
            {"removed", "Удалено %s %s."},
            {"removeManagerFail", "Я не могу удалить %s , так как их нет в моей базе данных."},
            {"removeHelp", "```Markdown\n# УДАЛЕНИЕ\n* Используется для удаления менеджеров из моей базы данных.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - @ Упомяните пользователя для удалении из менеджеров"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Сервера"},
            {"setOfflineHelp", "# НАСТРОЙКА OFFLINE СООБЩЕНИЯ ОБЪЯВЛЕНИЯ\n* Детальная настройка offline сообщения для редактируемого offline объявления.\n\n" +
                    "## Доступные значения для использования в вашем сообщении:\n" +
                    "\t* %CHANNEL%   - Название канала в Discord\n" +
                    "\t* %FOLLOWERS% - Общее количество подписчиков\n" +
                    "\t* %GAME%      - Название игры трансляции\n" +
                    "\t* %STATUS%    - Статус (описание) трансляции\n" +
                    "\t* %URL%       - Ссылка на стрим\n" +
                    "\t* %USER%      - Название Twitch канала\n" +
                    "\t* %VIEWERS%   - Общее количество просмотров\n\n" +
                    "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + "config setOfflineMessage " +
                    "%CHANNEL% НЕ В СЕТИ."},// <--- Do not translate between the %
            {"setOnlineHelp", "# НАСТРОЙКА ONLINE СООБЩЕНИЯ ОБЪЯВЛЕНИЯ\n* Детальная настройка online сообщения.\n\n" +
                    "## Доступные значения для использования в вашем сообщении:\n" +
                    "\t* %CHANNEL%   - Название канала в Discord\n" +
                    "\t* %FOLLOWERS% - Общее количество подписчиков\n" +
                    "\t* %GAME%      - Название игры трансляции\n" +
                    "\t* %STATUS%    - Статус (описание) трансляции\n" +
                    "\t* %URL%       - Ссылка на стрим\n" +
                    "\t* %USER%      - Название Twitch канала\n" +
                    "\t* %VIEWERS%   - Общее количество просмотров\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + "config setOnlineMessage " +
                    "%CHANNEL% начал стрим! Подробнее здесь (кликабельно): %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Shard Номер"},
            {"shardsTotal", "Количество Shards"},
            {"statusHelp", "```Markdown\n# СТАТУС\n* Показывает различную статистику бота.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# ЯЗЫКТРАНСЛЯЦИИ\n* Позволяет фильтровать потоки по тому языку, который транслируется " +
                    "in.  Это поддерживает английское правописание языка, или родное правописание. Должен быть поддержан " +
                    "язык на Twitch, указынный в профиле.\n\n## ПРИМЕНЕНИЕ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Вы можете ввести слово на Английском, либо на родном языке."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Описание"},
            {"streamsHelp", "```Markdown\n# ТРАНСЛЯЦИИ\n* Я вышлю вам список активных трансляций в личные сообщения.\n* (ПРИМЕЧАНИЕ: вы скорее всего " +
                    "получите несколько личных сообщений, используя эту команду, в зависимости от того, сколько трансляций " +
                    "отслеживается!)\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Всего просмотров"},
            {"trello", "Чтобы сообщить об ошибке или запросить функции, которые будут добавлены к боту, пожалуйста, используйте наш Trello. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Выдаёт ссылку на Trello для бота"},
            {"twitchCommunities", "Twitch Сообщества"},
            {"twitchAnnounceUpdate", "\n# Обновлен канал объявлений Twitch %s на: %s."},
            {"twitchAnnounceUpdateFail", "\n! Не удалось изменить канал объявления Twitch с %s на: %s."},
            {"twitchChannelAdd", "\n# Добавлен(ы) канал(ы): %s."},
            {"twitchChannelAddFail", "\n# Не удалось добавить канал(ы): %s."},
            {"twitchChannelAnnounce", "\n# Он(и) будут объявлен(ы) в: #%s."},
            {"twitchChannelGameFilter", "\n# Он(и) будут объявлен(ы) только тогда, когда они играют: %s."},
            {"twitchChannelNotFound", "\n# Канал(ы) не найден(ы): %s"},
            {"twitchChannelRemove", "\n# Удален(ы) канал(ы): %s."},
            {"twitchChannelRemoveFail", "\n! Не удалось удалить канал(ы): %s."},
            {"twitchChannelTitleFilter", "\n# Он(и) будут объявлен(ы) только тогда, когда в названии есть слово(а): %s."},
            {"twitchCommunityAdd", "\n# Добавлена(ы) сообщество(а): %s."},
            {"twitchCommunityAddFail", "\n# Не удалось добавить сообщество(а): %s."},
            {"twitchCommunityAnnounce", "\n# Сообщество(а) будет(ут) объявляться в: #%s."},
            {"twitchCommunityNotFound", "\n# Сообщество(а) не найдены на Twitch: %s."},
            {"twitchCommunityRemove", "\n# Сообщество(а) удалено(ы): %s."},
            {"twitchCommunityRemoveFail", "\n# Добавлена(ы) сообщество(ва): %s."},
            {"twitchGameAdd", "\n# Добавлена(ы) игра(ы): %s."},
            {"twitchGameAddFail", "\n# Не удалось добавить игру(ы): %s."},
            {"twitchGameAnnounce", "\n# Игра будет объявляться в: #%s."},
            {"twitchGameFilterAdd", "\n# Добавлен(ы) игровой(ые) фильтр(ы): %s."},
            {"twitchGameFilterAddFail", "\n# Не удалось добавить игровой(ые) фильтр(ы): %s."},
            {"twitchGameFilterRemove", "\n# Удален(ы) игровой(ые) фильтр(ы): %s."},
            {"twitchGameFilterRemoveFail", "\n# Не удалось удалить игровой(ые) фильтр(ы): %s."},
            {"twitchGameRemove", "\n# Удалена(ы) игра(ы): %s."},
            {"twitchGameRemoveFail", "\n# Не удалось удалить игру(ы): %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Добавление и удаление объектов, связанных с Twitch.tv.\n"
                    + "* Примечания:\n\t"
                    + "Чтобы добавить игровые фильтры и фильтры заголовков, вы ДОЛЖНЫ включить скобки.\n\t"
                    + "НЕ ИСПОЛЬЗУЙТЕ полный URL Twitch. Это не будет работать! Используйте только название канала (www.twitch.tv/channelName)\n\t"
                    + "Имя команды должно быть взято из URL, а не с отображаемого имени команды. (www.twitch.tv/team/teamName)\n\t"
                    + "Вы можете добавить несколько каналов, команд, игр, сообществ, фильтров игр и заголовков, используя символ | между ними.\n\t"
                    + "Единственные необходимые параметры: имя канала / имя сообщества / название команды / название игры\n\n"
                    + "## Twitch Каналы\n"
                    + "Добавление канала объявлений, игр и фильтров заголовков необязательно."
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Twitch Сообщества (Объявление ВСЕХ трансляций сообщества)\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community communityName #announcementChannel\n\n"
                    + "## Twitch Игры (Объявление ВСЕХ трансляций игры)\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game gameName #announcementChannel\n\n"
                    + "## Twitch Команды (Объявление ВСЕХ трансляций команды)\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team teamName #announcementChannel\n\n"
                    + "## Twitch Игровые фильтры (Глобальные)\n"
                    + "* Примечание: Это влияет на все потоковые объявления для Twitch\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Twitch фильтры описания (Глобальные)\n"
                    + "* Примечание: Это влияет на все потоковые объявления для Twitch\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter gameName #announcementChannel\n\n"
                    + "* Примеры:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (добавляет twitch канал в заданный канал Discord с игровыми фильтрами)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (добавляет игру с глобальным канал объявлений)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (добавляет сообщество с заданный канал объявлений)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (добавляет команду с заданным каналом объявлений).\n\n"
                    + "```"},
            {"twitchTeamAdd", "\n# Команда(ы) добавлена(ы): %s."},
            {"twitchTeamAddFail", "\n# Не удалось добавить команду(ы): %s."},
            {"twitchTeamAnnounce", "\n# Команда(ы) будут объявляться в: #%s."},
            {"twitchTeamNotFound", "\n# Команда(ы) не найдена(ы) на Twitch: %s."},
            {"twitchTeamRemove", "\n# Команда(ы) удалена(ы): %s."},
            {"twitchTeamRemoveFail", "\n# Не удалось удалить команду(ы): %s."},
            {"twitchTeams", "Twitch Команды"},
            {"twitchTitleFilterAdd", "\n# Добавлен(ы) фильтр(ы) описания: %s."},
            {"twitchTitleFilterAddFail", "\n# Не удалось добавить фильтр(ы)описания: %s."},
            {"twitchTitleFilterRemove", "\n# Фильтр(ы) описания удален(ы): %s."},
            {"twitchTitleFilterRemoveFail", "\n# Не удалось удалить фильтр(ы) описания: %s."},
            {"typeOnce", "Вам нужно всего лишь ввести эту часть."},
            {"uniqueChannels", "Уникальные каналы %s"},
            {"uniqueGames", "Уникальные игры %s"},
            {"updateAnnounceMessageFail", "# Что-то пошло не так. Сообщение в объявлении не было изменено."},
            {"updateAnnounceMessageSuccess", "# Вы обновили объявление! Теперь используется формат:\n\n* %s"},
            {"updateOfflineMessageFail", "# Что-то пошло не так. Offline сообщение не было изменено."},
            {"updateOfflineMessageSuccess", "# Вы обновили offline сообщение!  Теперь используется формат:\n\n* %s"},
            {"usePlatform", "Это старый способ! Используйте команду для конкретной платформы!  Введите `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` для получения дополнительной информации."},
            {"watchThemHere", "Подробнее: "},
            {"wrongCommand", " :thinking: Я не знаю эту команду."}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
