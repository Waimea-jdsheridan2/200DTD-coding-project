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
    /**
     * getting the player names
     */
    println("Enter Player 1's name:")
    val playerOne = readln()
    println("Enter Player 2's name:")
    val playerTwo = readln()



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
    println("welcome to 'Old Gold'!")
    println("the rules of this grid game are simple")
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
        grid.add("S")
    }
    grid.add("G")

    grid.shuffle()
}

//Building the grid
fun showGrid(grid:MutableList<String>) {
    //Build the top
    print("┌────┐".repeat(board.size))
    println("┐")

    for (row in grid) {
        print("| %-2s |".format(row))
    }
    println("|")

    //Build the bottom
    print("└────┘".repeat(grid.size))
    println("┘")


}

fun playerMove(grid: MutableList<String>, name: String) {
    println("Your turn $name")
    println("what coin would you like to move?")
    var movedFrom = readln()
    println("and where would you like to move it?")
    var movedTo = readln()
}



