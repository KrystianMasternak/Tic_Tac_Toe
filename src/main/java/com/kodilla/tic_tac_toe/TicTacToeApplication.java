package com.kodilla.tic_tac_toe;


import java.util.Scanner;

public class TicTacToeApplication {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        Scanner scan = new Scanner(System.in);
        GameMechanics gameMechanics = new GameMechanics();

        boolean win = false;

        while (!win) {
            int pos = gameBoard.pos();
            gameBoard.chooseAField(gameBoard.gameBoardGame, pos, "player1");
            gameBoard.printBoard();
            gameMechanics.checkWin();
        }


    }
}
