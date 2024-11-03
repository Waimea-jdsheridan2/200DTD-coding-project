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
    val Grid = mutableListOf <String>()

    setupGame(Grid)
    // Getting the player names
    println("Enter player1")
    val player1 = readLine()

    println("Enter player2")
    val player2 = readLine()

    showStart()
    var firstPlayer = player1

    //Main loop for the game
    while (true) {
        showGrid(Grid)
        playerMove(Grid, firstPlayer)

        if (firstPlayer == player1) {
            firstPlayer = player2
        }
        else {
            firstPlayer = player1
        }
    }
}

//Talking about the game, rules, how to play etc.
fun showStart() {
    print("Welcome to 'Old Gold'!")
    print("The rules of this grid game are simple")
    print("You can only move a coin to the left once every time it is your turn")
    print("The goal of this game is to be the one who wins the gold coin")
    print("You cannot move a coin to the left if there is a coin right next to it on the left")


}

//Setting up the game
fun setupGame(Grid: MutableList<String>) {
repeat(20){
    Grid.add(" ")
}
    repeat(4){
        Grid.add("S")
    }
    Grid.add("G")

    Grid.shuffle()
}

//building the Grid
fun showGrid(Grid: MutableList<String>) {
   print("╔═════╗".repeat(Grid.size))
    print("╗")

    for (row in Grid) {
        print("| %-2s|".format(row))
    }
    println("|")

    //Build the bottom
    print("╚═════╝".repeat(Grid.size))
    print("╝")
}

fun playerMove(Grid: MutableList<String>, name: String) {
    println("Your move $name")
    var movedFrom = readln()
    var movedTo = readln()
}



