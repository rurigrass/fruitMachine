package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import java.util.Scanner;

public class RunnerTwo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Please select which machine you would like to play");
        System.out.println("Press C to play 'CodeClan Fruit Machine' else select any other button to play 'Yang Busters'");
        String select = keyboard.next();
        char gameSelection = select.charAt(0);

        //CODECLAN FRUITMACHINE

        if (gameSelection == ('C') || gameSelection == ('c')) {

            Player player = new Player(20);
            Machine machine = new Machine(100);

            int playerInput;
            boolean runGame = true;
            int lines;

            while (runGame) {

                // Set player instructions
                System.out.println("                            ");
                System.out.println("@@ CODECLAN FRUIT MACHINE @@");
                System.out.println("Enter 1 to play : 2 to cash out!");

                // Get player input
                Scanner getPlayerInput = new Scanner(System.in);
                playerInput = getPlayerInput.nextInt();
                //

                if (playerInput != 1 && playerInput != 2) {
                    System.out.println("Invalid input - try again");
                }

                // player exits game
                if (playerInput == 2) {
                    System.out.println("Game Over - Collect your £ " + player.checkCoins());
                    runGame = false;
                }

                // player spins
                if (playerInput == 1) {

                    // exit clause if no credit
                    if (player.checkCoins() <= 0) {
                        System.out.println("Credit Required - Game Over - Collect any Payout!!!");
                        runGame = false;
                    }

                    // player spins reel
                    else if (player.checkCoins() > 0) {

                        machine.spin();
                        machine.play();

                        //space

                        for (lines = 0; lines <= 1; lines++)
                            System.out.println();

                    }


                }

            }

        }

        else if (gameSelection != ('C') || gameSelection == ('c')) {



        }

    }

}
