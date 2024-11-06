# Test Plan and Evidence / Results of Testing

## Game Description

The project involves the programming of a two-player game.

1. This is a 2-player game that involves a 20 square table and counters that the players have to move.  
2. The counters are labeled 'S' for Silver and 'G' for Gold, the table is a 20-square horizontal grid.  
3. The players move the counters to the left when it is their turn and have to make there move get the gold counter.
4. If one of the players gets the gold counter then that player has won the game and the other one loses.
5. Once one of the players have won, the game can either end or start-over.

### Game Features and Rules

The game has the following features and/or rules:
- The player can only move a coin left once every time it is their turn.
- The goal of this game is to be the player who takes the gold coin from the other player.
- The player cannot move a coin to the left if there is a coin right next to it to the left.

---

## Test Plan

The following game features / functionality and player actions will need to be tested:

- Getting the player names.
- Showing the Grid and Counters.
- Making the players do their moves.
- Moving the counters around.
- Ending the game once one of the players wins the Gold.

The following tests will be run against the completed game. The tests should result in the expected outcomes shown.

### Getting the Player Names

The code should tell the player that it wants their names.

#### Test Data / Actions to Use

The players must type in their name e.g. "Jayarn" and "Brian".

#### Expected Outcome

The game should use these names throughout the games progression.


### Showing the Grid and Counters

The game should setup the grid and show the counters in random positions.

#### Test Data / Actions to Use

Running the code many times to see if it works.

#### Expected Outcome

The grid should be shown with the Counters shown in random places in the grid.

### Making the players do their moves

The players should be able to do their moves with the counters.

#### Test Data / Actions to Use

The 2 players should make moves each time it is their turn.

#### Expected Outcome

The game should tell them to do a move.

### Moving the Counters around

The counters will be moving around on the grid from the players moves.

#### Test Data / Actions to Use

The players should be able to do a normal move (any row to the left of the counter).

#### Expected Outcome

The counters should get moved into a new location on the grid by the player.

### Ending the game once one of the players wins the Gold

Once one of the players wins the gold, the game should end.

### Test Data / Actions to Use

The players will keep taking turns until one of them wins the gold.

### Expected Outcome

One of the players wins the gold coin and the game ends.

---

## Evidence / Results of Testing

### Getting the Player Names

This video shows the players getting their names:
https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/jdsheridan2_waimea_school_nz/EcMGpb_9KNxApY4RnIRyyasBvZ1unQOwZ1lmHovLeMcksw?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=T93nC2

The users type in their names and the system accepts them and uses them.

### Showing the grid and Counters

This video shows the grid and counters being formed:
https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/jdsheridan2_waimea_school_nz/ESzasvnKDLNOiB4JYczqBksB7G__DS02RMwx4RMvAL3_MA?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=GzBwRo

The video shows the grid being built and the counters getting randomly placed throughout the grid.

### Making the players do their moves

This video shows the players doing their moves:
https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/jdsheridan2_waimea_school_nz/Ef4mfph_n59LliYXEGTUZNQB7jKI4wpI77wYOvMWR9ermA?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=EJNXRP

The players are seen doing their moves via a number below the counters, 
when they type in a new number, the coin get moved that the location that is shown above the new number.


### Ending the game once one of the players wins the Gold

This video shows the player winning the gold and the game ending:
https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/jdsheridan2_waimea_school_nz/EYaML3F_RfdFkzlJSJ0N6AcBvA3NnkaqvkSV8KzfPAzb9Q?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=9wIbSK

Brian and Jayarn take turns to see who gets the Gold first, after alot of back and forth switching, Brian comes out victorious and the game ends.

