# Number Guessing Game

## Overview

This Java program implements a **Number Guessing Game** where the user tries to guess a randomly generated number between 1 and 100. The game offers multiple difficulty levels, and the player has a limited number of attempts based on the chosen level. After each guess, the program provides feedback to guide the player.

---

## Features
1. **Difficulty Levels:**
    - **Easy:** 10 attempts
    - **Medium:** 5 attempts
    - **Hard:** 3 attempts

2. **Hints After Each Guess:**
    - If the guess is too high, the program informs the user.
    - If the guess is too low, the program provides a similar hint.

3. **Win/Loss Feedback:**
    - Displays a congratulatory message on correct guesses, along with the number of attempts and time taken.
    - Informs the player of the correct number if they run out of attempts.

4. **Replay Option:**
    - After each game, the user is asked if they would like to play again.

5. **Input Validation:**
    - Handles invalid input gracefully, asking the player to re-enter their choice.

---

## How to Play

1. Run the program.
2. Choose a difficulty level:
    - Type `1` for Easy, `2` for Medium, or `3` for Hard.
3. Enter your guesses based on the hints provided.
4. Try to guess the correct number within the allocated attempts.
5. At the end of the game, choose whether to play again by typing `y` (yes) or `n` (no).

---

## How to Compile and Run

1. Clone Project `Game.java`.
   ```bash
   git clone https://github.com/ErickBrayan/Number-Guessing-Game.git
   ```
2. Open a terminal or command prompt.
3. Navigate to the directory where `Game.java` is saved.
4. Compile the program:
   ```bash
   javac Game.java
   ```
   ```bash
   java Game.java
   ```
https://roadmap.sh/projects/number-guessing-game