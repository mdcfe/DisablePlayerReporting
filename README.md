# Disable Player Reporting

This mod disables Minecraft's new Player Reporting feature, once and for all!

## Why this mod?

Many of the existing mods that claim to "disable" player reporting contain extra, unnecessary modifications to the game.
At best, these extra changes can affect your ability to play on servers that enforce secure profiles, while at worst
these might introduce "gaslight" exploits that allow you to be falsely reported by other players.

This mod does one simple thing: it disables Player Reporting. You can still play and chat securely on any multiplayer
servers like normal, and you can't get falsely reported by using this mod!

<details>
<summary><small><i>What's the catch?</i></small></summary>

The release of Minecraft 1.19.1 introduced a chat message signing system, which allows Mojang to verify that chat
messages have not been faked when they receive reports about deeply offensive behaviour in multiplayer.

Many "no chat reports" mods appeared after this release, claiming to "prevent" players from being reported to Mojang.
However, these mods are not actually preventing anything. They are simply removing signatures from chat messages, and
this will simply lead to you being unable to play on servers that enforce secure profiles. Any reports faked with the
use of mods will not be considered by Mojang, as they lack the signatures necessary to prove a player actually said what
they were reported for.

This mod is largely a joke, parodying other "no chat reports" mods. This mod just prevents *you* from reporting other
players. It doesn't interfere with signatures at all and will not stop you playing on secure servers.

To repeat, player reporting exists to allow players to be reported for deeply offensive behaviour. Chat signing exists
to allow Mojang to verify these reports. Reporting does not allow Mojang to spy on players or snoop on private
conversations.
</details>

## Usage

### Client

Simply install Minecraft 1.21 and Fabric Loader 0.15.11 or above, then drop this mod in your `mods/` directory. Next
time you start your game and join a server, player reporting will be disabled!  

### Server

Player Reporting is a client-side feature and the Minecraft server does not support Player Reporting. As a result, this
mod is unsupported on the server.
