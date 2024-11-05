/**
 * ------------------------------------------------------------------------
 * 2-Player based game (Old Gold)
 * Level 2 programming project
 *
 * by Jayarn Sheridan
 *
 * This is a 2-player based game involving counters in a grid that the players have to move.
 * The 2 players have to move their counter until one of them wins the overall game.
 * Once one of the players have won, the game will either end or you can start over.
 * ------------------------------------------------------------------------
 */

/**
 * Program entry point
 */
fun main() {
    val grid = mutableListOf <String> ()
    setupGame(grid)
    //getting player names
    println("Enter Player1's name:")
    val player1 = readln()
    println("Enter Player2's name:")
    val player2 = readln()

    showStart()
    var currentPlayer = player1

    // Main loop for the game.
    while (true) {
        showGrid(grid)
        playerMove(grid, currentPlayer)

        if (currentPlayer == player1) {
            currentPlayer = player2
        }
        else {
            currentPlayer = player1
        }
    }
}

//Talking about the game, rules, how to play etc.
fun showStart() {
    println("Welcome to 'Old Gold'!")
    println("The rules of this grid game are simple")
    println("You can only move a coin to the left once every time it is your turn")
    println("The goal of this game is to be the one who wins the gold coin")
    println("You cannot move a coin to the left if there is a coin right next to it on the left")
}

//Setting up the game
fun setupGame(grid: MutableList<String>) {
    repeat(15){
        grid.add(" ")
    }
    repeat(4){

        grid.add("C")

        grid.add("S")
    }
    grid.add("G")

    grid.shuffle()
}

//Setting up the grid
fun showGrid(grid:MutableList<String>) {
    //Building the top
    print("┌────┐".repeat(grid.size))

    println("┐")
    for (row in grid) {
        print("| %-2s |".format(row))
    }

    println("|")

    // Building the bottom
    print("└────┘".repeat(grid.size))
    println("┘")
}

fun coinPosition(prompt: String): Int {
    while (true) {
        // Display the question to the user
        print(prompt)
        val input = readln()

        // Check if the input is a number or not
        val number = input.toIntOrNull()
        if (number != null) return number

        // If it is not a number, re ask the prompt.
        println("You can't choose a letter here. Please enter a number.")
    }
}

fun playerMove(currentPlayer: String, coins: MutableList<String>): Boolean {
    var move = false
    while (!move) {
        // Ask the player which coin they want to move
        val position = coinPosition("Enter the position of the coin you'd like to move or remove: ") - 1

        // Check if the coin has any possible moves
        if (position > 0 && coins[position - 1] != " ") {
            println("Sorry that coin has no possible moves")
            continue
        }

        // Check if it's in position 1 and remove it
        if (position == 0) {
            println("$currentPlayer has removed a coin")
            val removedCoin = coins[0]
            coins[0] = " "
            // Check if the removed coin was the gold coin.
            if (removedCoin == "G") {
                return true
            } else {
                return false
            }
        }
        else {
            // Ask player which square they want to move the coin to
            val newSquare = coinPosition("Enter the square number to move the coin to:") - 1

            // Does the move
            move = moveCoin(coins, position, newSquare)
        }
    }

    return false
}
