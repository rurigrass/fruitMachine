package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Machine machine = new Machine(100);
        Player player = new Player(20);

        Integer playerInput;
        boolean runGame = true;

        while (runGame) {

            // Set player instructions
            System.out.println("                            ");
            System.out.println("@@ CODECLAN FRUIT MACHINE @@");
            System.out.println("Enter 1 to play : 2 to exit!");

            // Get player input
            Scanner getPlayerInput = new Scanner(System.in);
            playerInput = getPlayerInput.nextInt();

            // player exits game
            if (playerInput == 2) {
                System.out.println("Game Over - Collect any Payout!!!");
                runGame = false;
            }

            // player spins
            if (playerInput == 1) {

                // exit clause if no credit
                if (player.coins == 0) {
                    System.out.println("Credit Required - Game Over - Collect any Payout!!!");
                    runGame = false;
                }

                // player spins reel
                else if (player.coins != 0) {

                    machine.spin();
                    machine.play();

                }

            }

        }

    }

}
