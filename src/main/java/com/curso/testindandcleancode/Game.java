package com.curso.testindandcleancode;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {

        printGameRules();
        String choice = input.nextLine().toUpperCase();
        ScoreBoard scoreBoard = new ScoreBoard();

        while (!choice.equals("quit"))
        {
            GameOption choicenum = getChoiceNum(choice);
            while (choicenum == null)
            {
                System.out.println("Sorry, it looks like you didn't enter a correct input. Try again.");
                choice = input.nextLine().toUpperCase();
                choicenum = getChoiceNum(choice);
            }
            GameOption compnum = getChoiseComputer();

            completeGamePlay(scoreBoard, choicenum, compnum);
            printFinalGame(scoreBoard);
            choice = input.nextLine().toUpperCase();
        }
    }

    private void printFinalGame(ScoreBoard scoreBoard) {
        System.out.println(
                "wins:" + scoreBoard.getWins() + "\nloses:" + scoreBoard.getLosses() + "\nties:" + scoreBoard.getTie()); // print
                                                                                                                         // out
                                                                                                                         // number
                                                                                                                         // of
        // wins, ties, and loses
        System.out.println("Let's play again! \n \n"); // start game again
        System.out.println(
                "Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
    }

    private void completeGamePlay(ScoreBoard scoreBoard, GameOption choicenum, GameOption compnum) {
        if (choicenum == compnum) 
        {
            tie(scoreBoard);
        } else if (choicenum == GameOption.ROCK && compnum == GameOption.SCISSORS ||
            choicenum == GameOption.SCISSORS && compnum == GameOption.PAPER || 
            choicenum == GameOption.PAPER && compnum == GameOption.ROCK) {
            win(scoreBoard);
        }
        lose(scoreBoard);
    }

    private void lose(ScoreBoard scoreBoard) {
        System.out.println("you lose.");
        scoreBoard.incrementsLosses();
    }

    private void tie(ScoreBoard scoreBoard) {
        System.out.println("It's a tie");
        scoreBoard.incrementsTie();
    }

    private void win(ScoreBoard scoreBoard) {
        System.out.println("you win!");
        scoreBoard.incrementsWins();
    }

    private GameOption getChoiseComputer() {
        GameOption option = GameOption.values()[random.nextInt(3)];
        System.out.println("Computer chose " + option.toString().toLowerCase());
        return option;
    }

    private void printGameRules() {
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println(
                "Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
    }

    private GameOption getChoiceNum(String choice) {
        GameOption selectedOption = null;

        if (choice.equals("quit")) {
            System.exit(0);
        }
        try {
            selectedOption = GameOption.valueOf(choice);
        } catch (Exception e) {
            return null;
        }
        selectedOption = GameOption.valueOf(choice);

        return selectedOption;
    }

}
