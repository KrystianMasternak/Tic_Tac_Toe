package com.kodilla.tic_tac_toe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameMechanics {
    ArrayList<Integer> player1Pos = new ArrayList<>();
    ArrayList<Integer> player2Pos = new ArrayList<>();



    public String checkWin(){
       /*
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List middleCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winningPos = new ArrayList<>();
        winningPos.add(topRow);
        winningPos.add(middleRow);
        winningPos.add(botRow);
        winningPos.add(leftCol);
        winningPos.add(middleCol);
        winningPos.add(rightCol);
        winningPos.add(cross1);
        winningPos.add(cross2);
        for (List l : winningPos){
            if (player1Pos.containsAll(l)){
                return "Player1 win";
            } else if (player2Pos.containsAll(l)) {
                return "Player2 win";
            } else if (player1Pos.size() + player2Pos.size() == 9) {
                return "Draw";
            }
        }

        return "";

        */
        // W tutaj potrzeba jest użyć tablicy jednowymiarowej!!!


        return "";
    }
}
