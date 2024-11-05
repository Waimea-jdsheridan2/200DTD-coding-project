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

    showIntro()
    var currentPlayer = player1

    // Main loop for the game
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

//explaining the rules of the game
fun showIntro() {
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

fun playerMove(grid: MutableList<String>, name: String) {
    //Making the player choose their move
    println("Your turn $name")
    println("what coin would you like to move?")
    var movedFrom = readln()
    println("and where would you like to move it?")
    var movedTo = readln()
}
