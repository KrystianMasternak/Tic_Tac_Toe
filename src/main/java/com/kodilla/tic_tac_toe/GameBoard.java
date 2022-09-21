package com.kodilla.tic_tac_toe;

import java.util.Scanner;

public class GameBoard {


   public char [][] gameBoardGame = {{'|', ' ', '|', ' ', '|', ' ', '|'},
            {'|', ' ', '|', ' ', '|', ' ', '|'},
            {'|',' ', '|', ' ', '|', ' ', '|'}};


    public void printBoard(){
        for (char[] row : gameBoardGame){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public int pos(){
        System.out.println("Wybierz pole 1-9");
        Scanner scan = new Scanner(System.in);
        int pos = scan.nextInt();
        return pos;
    }


    public void chooseAField(char [][] gameBoardGame, int pos, String user){
        System.out.println("Wybierz pole 1-9");
        char symbol = ' ';

        if (user.equals("player1")){
            symbol = 'X';
        } else if (user.equals("player2")) {
            symbol = 'O';
        }

        System.out.println(pos);
        switch (pos){
            case 1:
                gameBoardGame[0][1] = symbol;
                break;
            case 2:
                gameBoardGame[0][3] = symbol;
                break;
            case 3:
                gameBoardGame[0][5] = symbol;
                break;
            case 4:
                gameBoardGame[1][1] = symbol;
                break;
            case 5:
                gameBoardGame[1][3] = symbol;
                break;
            case 6:
                gameBoardGame[1][5] = symbol;
                break;
            case 7:
                gameBoardGame[2][1] = symbol;
                break;
            case 8:
                gameBoardGame[2][3] = symbol;
                break;
            case 9:
                gameBoardGame[2][5] = symbol;
                break;
        }
    }



}

