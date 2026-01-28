# Tic-Tac-Toe: Championship Edition

A JavaFX-based Tic-Tac-Toe game featuring a 3x3 grid and an Artificial Intelligence opponent. This project demonstrates core Object-Oriented Programming (OOP) principles, including encapsulation, inheritance, polymorphism, and abstraction.

---

## 🎮 Features

* **Game Logic**: Full implementation of Tic-Tac-Toe rules where the goal is to form a line of three connected pieces horizontally, vertically, or diagonally.


* **AI Opponent**: Includes a simple AI that initially moves randomly, later enhanced with the **Minimax Algorithm** for optimal, competitive play.


* **Interactive UI**: Developed using **JavaFX** to provide a clean graphical user interface.


* **Robust Architecture**: Utilizes a strict class hierarchy including interfaces, abstract classes, and enumerations.



---

## 🛠️ Technical Specifications

* **Language**: Java 11 (Oracle JDK 11) or later.


* **Build Tool**: Maven 3.8.1 or later.


* **Design Patterns**: Layered architecture focusing on the service package.


* **Key Algorithms**:
* **Minimax**: A decision-making algorithm used to minimize possible loss in worst-case scenarios.


* **Terminal State Evaluation**: Assigns scores for AI wins (+1), human wins (-1), and draws (0).





---

## 📂 Class Hierarchy

The project is structured according to the following specifications:

* **`Piece` (Enum)**: Represents states `X`, `O`, and `EMPTY`.


* **`Board` (Interface)**: Defines essential methods like `initializeBoard`, `isLegalMove`, and `checkWinner`.


* **`BoardImpl`**: Handles core game logic and maintains the 3x3 grid.


* **`Player` (Abstract)**: Base class for human and AI participants.


* **`AiPlayer`**: Implements the Minimax logic to maximize AI winning chances.


* **`HumanPlayer`**: Allows manual move selection by row and column.



---

## 🚀 Getting Started

1. **Prerequisites**: Ensure Java 11, Maven, and Git are installed.


2. **Installation**:
* Clone the repository.
* Open the project in an IDE (e.g., IntelliJ IDEA).


* Build the project using Maven to handle dependencies.


3. **Running the Game**: Execute the `Main` class to start the game loop.




