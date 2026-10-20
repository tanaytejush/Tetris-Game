# Tetris Clone

A desktop re-creation of [Tetris](https://en.wikipedia.org/wiki/Tetris) written in Java with a Swing GUI, a persistent scoreboard and the classic theme music.

> Original project by **Eugene Chau** ([MIT License](LICENSE.txt), 2020). This repository keeps a copy of that work.

## Features

- All seven tetromino pieces (I, J, L, O, S, T, Z)
- Selectable starting level, including very fast levels such as 19
- "Next piece" preview and live game info panel
- Game over screen where you can add scores to a scoreboard, remove scores, and save or view them
- Scoreboard saved to a file, with checks for corrupted entries
- Background theme music
- JUnit tests for the model and persistence layers

## Screenshots

Basic gameplay:

![Basic Gameplay](https://user-images.githubusercontent.com/25561432/90330121-3c9c8800-df5f-11ea-81ec-2e8de26c4d24.gif)

Game over screen with scoreboard:

![Game Over Screen](https://user-images.githubusercontent.com/25561432/90454458-2817d700-e0a8-11ea-8cac-e6a7b9be9863.gif)

Starting at Level 19:

![Level 19 Start](https://user-images.githubusercontent.com/25561432/90455327-a7a6a580-e0aa-11ea-9ca8-f03b96094563.gif)

## Project structure

```
src/main/
  model/         Game logic, pieces and scoreboard
  persistence/   Scoreboard file reading and writing
  ui/            Swing GUI, dialogs and sound
  exceptions/    Custom exceptions
src/test/        JUnit tests
resources/       Theme music
lib/             JUnit jars
```

## Run it

Requires a JDK (Java 8 or later). Open the project in IntelliJ IDEA and run `ui.Main`, or compile from the command line:

```bash
javac -d out -sourcepath src/main src/main/ui/Main.java
java -cp out:resources ui.Main
```

On Windows use `;` instead of `:` in the classpath.

## License

MIT, copyright Eugene Chau. See [LICENSE.txt](LICENSE.txt).


---

<sub>Made by [tanaytejush](https://github.com/tanaytejush)</sub>
