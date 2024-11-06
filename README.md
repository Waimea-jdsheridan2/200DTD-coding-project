# Old Gold

### Level 2 Programming Project by Jayarn Sheridan

This project is assessed against [AS91896](https://www.nzqa.govt.nz/nqfdocs/ncea-resource/achievements/2019/as91896.pdf)

## Project Description

The project involves the programming of a two-player game.

1. This is a 2-player game that involves a 20 square table and counters that the players have to move.
2. The counters are labeled 'S' for Silver and 'G' for Gold, the table is a 20-square horizontal grid.
3. The players move the counters to the left when it is their turn and have to make there move get the gold counter.
4. If one of the players gets the gold counter then that player has won the game and the other one loses.
5. Once one of the players have won, the game can either end or start-over.

## Source Code

The project is written in [Kotlin](https://kotlinlang.org/)

The main source file is [Main.kt](src/Main.kt)


## Documentation

Evidence of testing can be found in [testing.md](testing.md)


## Running the Program

You can either clone this whole repo, open it using [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) and run from source; or you can run the compiled program:

1. Install the [Java runtime (JRE)](https://www.java.com/en/download/) installed to run the program.
2. Go to the [out/artifacts](out/artifacts) folder
3. Locate and download the compiled **JAR file** (e.g. FILENAME.jar)
4. Run the following command:
    ```bash
    java -jar FILENAME.jar
    ```
