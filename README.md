# No Rocket Boost
No Rocket Boost is a Minecraft mod that aims to balance elytra by removing rocket boosting and adding back punch bow boosting.

## Configuration
This mod is configured using gamerules. You can set these by using the `/gamerule` command or by setting them in the Game Rules screen when creating a world.

### `eg_EnableElytraRocketBoosting`
- Enables or disables elytra rocket boosting.
- When set to `false`, players can use rockets to boost themselves while flying.
- When set to `true`, players won't be able to use rockets to boost.

### `eg_EnablePunchBowBoosting`
- Enables or disables elytra punch bow boosting.
- When set to `false`, the vanilla behaviour for arrows hitting their shooter is used.
- When set to `true`, arrows can hit their shooter while flying with an elytra if some conditions are met. [See the code](https://github.com/Enchanted-Games/no-elytra-boost/blob/1.20.6/common/src/main/java/games/enchanted/norocketboosting/mixin/ProjectileMixin.java#L30) if you want to know exactly how this works
- This doesn't work exactly how it did in 1.9/1.10, however, I have tried to make it feel pretty similar

## Installation
The mod has to be installed on the server side in order to work. 

If it is installed on the client, it will remove the arm swing animation when attempting to rocket boost. It will only work in singleplayer or servers that also have the mod installed

## License
<p xmlns:cc="http://creativecommons.org/ns#" >No Rocket Boost by <a rel="cc:attributionURL dct:creator" property="cc:attributionName" href="https://enchanted.games">ioblackshaw (a.k.a. Enchanted_Games)</a> is licensed under <a href="http://creativecommons.org/licenses/by-nc/4.0/?ref=chooser-v1" target="_blank" rel="license noopener noreferrer" style="display:inline-block;">CC BY-NC 4.0<img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/cc.svg?ref=chooser-v1"><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/by.svg?ref=chooser-v1"><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/nc.svg?ref=chooser-v1"></a></p> 
Video content creators may monetise videos including this work provided the license is followed.
