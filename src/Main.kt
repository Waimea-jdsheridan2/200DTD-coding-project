/**
 * ------------------------------------------------------------------------
 * 2-Player based game
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
    val grid = mutableListOf <String>()
    val player1 = mutableListOf <String>()
    val player2 = mutableListOf <String>()
    val counters = mutableListOf<String>()

    player1.add("Player 1")
    player2.add("Player 2")
    counters.add("G")
    counters.add("S")

    setupGame(grid)
    showGameState()
    getPlayerMove()
}

//Setting up the game
fun setupGame(gridList: MutableList<String>) {
//Getting player 1's name
    print("Enter player1: ")
    val player1 = readln()

//Getting player 2's name
    print("Enter player2: ")
    val player2 = readln()

//Building the grid
print("+----------".repeat(gridList.size))
    println("+")

//Show the counters
for (counter in gridList) {
    print("| %-8s ".format(counter))
}
    println("|")

    //Build the bottom
    print("+----------".repeat(gridList.size))
    println("+")
}

fun showGameState(counters: String, gridList: MutableList<String>) {

}

fun getPlayerMove(counters: String, gridList: MutableList<String>) {
println("Enter 'G' or 'S' to do your move")
    while (true) {

    }
}



