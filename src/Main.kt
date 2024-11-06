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
import kotlin.random.Random

fun main() {
    //Setting up game Grid.
    val game = buildGrid()

    //Asking for the players names.
    print("Enter Player 1's name: ")
    val player1 = readln()
    print("Enter Player 2's name: ")
    val player2 = readln()

    var turn = 1
    var takeCoin: Int
    showStart()

    //Main loop for the game.
    while (true) {

        displayGrid(game)

        //Making the Players have turns.
        if (turn == 1) {
            println("$player1's turn.")
        } else {
            println("$player2's turn.")
        }

        //Taking the Coin
        takeCoin = 0
        if (game.elementAt(0) != " ") {
            println("Take coin on the left? [Y]/[N]")
            if (readln().first().uppercase() == "Y") {
                // If taken coin is Gold then Stop game loop
                if (game.elementAt(0).toString() == "G") {
                    break
                } else {
                    game[0] = " "
                    displayGrid(game)
                }
                takeCoin = 1
            }
        }

        //Moving the coin in the grid
        if (takeCoin != 1) {

            var movedCoin: Int?
            var moveTo: Int?

            while (true) {
                print("Which coin would you like to move? (See number below coin): ")
                movedCoin = readln().toIntOrNull()
                if (movedCoin == null) continue
                movedCoin--

                if (game.elementAt(movedCoin) == " ") {
                    println("No coin there!")
                    continue
                }

                print("Where would you like to move the coin? (See number below space): ")
                moveTo = readln().toIntOrNull()
                if (moveTo == null) continue
                moveTo--

                //If we get down to this part, everything must be going well.
                break
            }

            game[moveTo!!] = game.elementAt(movedCoin!!)
            game[movedCoin] = " "

            // Taking the coin
            if (moveTo == 0) {
                if (game.elementAt(0) != " ") {
                    displayGrid(game)
                    println("Take coin on the left? [Y]/[N]")
                    if (readln().first().uppercase() == "Y") {
                        if (game.elementAt(0).toString() == "G") {
                            break
                        } else {
                            game[0] = " "
                        }
                    }
                }
            }
        }
        // Switch the players turns
        turn = if (turn == 1) 2 else 1
    }
    // Check to see who has won, if anybody has won, we break

    if (turn == 1) println("$player1 won!")
    if (turn == 2) println("$player2 won!")

}

//Talking about the game rules and how to play.
fun showStart() {
    println("Welcome to 'Old Gold'!")
    println("The rules of this grid game are simple")
    println("You can only move a coin to the left once every time it is your turn")
    println("The goal of this game is to be the one who wins the gold coin")
    println("You cannot move a coin to the left if there is a coin right next to it on the left")
}

//Building and showing the grid.
fun displayGrid(grid: MutableList <String>) {
    print("╔")
    print("═════╦".repeat(grid.size-1))
    println("═════╗")

    for (item in grid) {
        print("║ ")
        if (item == "G"){
            print("%-4s".format(item))
        }else {
            print("%-4s".format(item))
        }
    }
    println("║")

    print("╠")
    print("═════╬".repeat(grid.size-1))
    println("═════╣")

    for (index in grid.indices) {
        print("║")
        print(" %-4s".format(index + 1))
    }
    println("║")

    print("╚")
    print("═════╩".repeat(grid.size-1))
    println("═════╝")
}

//Showing the counters in the grid.
fun buildGrid(): MutableList<String> {
    //Placing the coins
    val list = mutableListOf<String>()

    //Place 20 empty spaces.
    repeat(20){
        list.add( " " )
    }

    //Place silver coins.
    repeat(4){
        list.add(Random.nextInt(1, list.size), "S")
    }

    //Place gold coin.
    list.add(Random.nextInt(1, list.size), "G")

    return list
}
