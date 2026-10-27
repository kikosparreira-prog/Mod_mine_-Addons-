# DMZ Combo Rank (addon for DragonMineZ)

Chain hits without taking damage to build a combo. Higher combo = higher rank (D, C, B, A, S, SS)
= more damage. Getting hit, dying, or waiting too long resets it.

- Minecraft 1.20.1, Forge 47.4.0, Java 17
- Requires DragonMineZ (tested against the 2.2.1 jar metadata), server-side logic only (no client install needed beyond the mod itself for translated messages)
- Version 1.0.0

## Config (`dmzcomborank-server.toml`, per world)
- `timeoutTicks` (default 100): time without hitting before the combo expires
- `maxDamageBonus` (default 0.25): bonus at rank SS
- `resetOnDamage` (default true)
- `showActionBar` (default true)

## Build
GitHub: upload everything, then Actions -> Build -> Run workflow -> download the artifact.
Local: install Java 17 and Gradle 8.8, then run `gradle build`. JAR: `build/libs/dmzcomborank-1.0.0.jar`.
