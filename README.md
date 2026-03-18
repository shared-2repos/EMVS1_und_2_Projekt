# Mittelalter Mod

Minecraft Mittelalter Mod – a medieval-themed mod adding new ores, armor, weapons, food, and world generation to enhance your Minecraft experience.

## Overview

This mod brings a variety of content inspired by the Middle Ages. Explore new ore (silver) and use it to craft powerful tools, weapons, and armor. Discover new food items, cook hearty meals, and equip yourself with historically flavored gear.

## Features

### Blocks
- **Silver Ore** – Generates in the Overworld. Mine it to obtain raw silver.
- **Silver Block** – A decorative block crafted from silver ingots.
- **Castle Brick** – A new building block for your medieval constructions.

### Items
- **Materials**: Raw silver, silver ingot, silver nugget, carbon, fat, cloth, lead.
- **Coins**: Bronze, silver, and gold coins (currency items).
- **Foods**: Bread loaf, cheese, fried egg, fat, and various soups (chicken, gulas, stew, vegan).
- **Tools & Weapons**:
  - Long swords and halberts made from wood, stone, copper, iron, gold, diamond, netherite, and silver.
  - Silver sword.
- **Armor Sets** (each with helmet, chestplate, leggings, boots):
  - Bronze armor
  - Cloth armor
  - Lead armor
  - Royale armor
  - Silver armor

### World Generation
- Silver ore spawns in the Overworld (configurable via datapacks).

### Gameplay Enhancements
- Food poisoning event that adds a layer of challenge when consuming certain foods.

## Requirements
- **Minecraft**: 1.21.11
- **Forge**: 61.0.8 or later (version range [61,))

## Installation (Players)
1. Download the latest release `.jar` file from the [Releases](https://github.com/shared-2repos/EMVS1_und_2_Projekt/releases) page.
2. Place the `.jar` file into your Minecraft `mods` folder.
3. Launch Minecraft with the Forge profile.

## For Developers

### Setting up the development environment
This project uses Minecraft Forge and follows the standard MDK setup.

#### Prerequisites
- Java JDK 21 or later
- Git
- Gradle (included via wrapper)

#### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/shared-2repos/EMVS1_und_2_Projekt.git
   cd mittelaltermod
   ```
2. Choose your IDE:
   - **Eclipse**: Run `./gradlew genEclipseRuns` (or `gradlew eclipse`), then import as an existing Gradle project.
   - **IntelliJ IDEA**: Open the project as a Gradle project, then run `./gradlew genIntellijRuns` and refresh the Gradle project.

3. If you encounter missing libraries, run:
   ```bash
   ./gradlew --refresh-dependencies
   ```
4. To clean the project:
   ```bash
   ./gradlew clean
   ```

### Building
To build the mod JAR, run:
```bash
./gradlew build
```
The output JAR will be in `build/libs/`.

### Project Structure
- `src/main/java/com/mittelaltermod` – Mod source code.
- `src/main/resources` – Assets, data, and configuration.
- `gradle.properties` – Contains mod version, mappings, and Forge versions.

### Mapping Information
This mod uses the official Mojang mappings (channel `official`, version `1.21.11`). For more details, see the [Mojang license](https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md).

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This mod is licensed under the [LGPL 2.1](LICENSE).

## Credits
- **Authors**: Rombaldoni Diego, Vovev Denis, Magony Zsombor, Hallenbarter Jürg Georg
- **Minecraft Forge** – For the modding framework.

---

*For more information, visit the [Minecraft Forge Documentation](https://docs.minecraftforge.net/).*