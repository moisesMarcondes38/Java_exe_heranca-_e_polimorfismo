package games;

import games.model.Games;

public class TesteGames {

    public static void main(String[] args) {

        Games g1 = new Games("Mario kart","Pokemon blue","Call of Duty ultimate","Fifa 2022","Minecraft 5");
        Games g2 = new Games("Mario kart 64","Pokemon red","Call of Duty vietnã","Fifa 2019","Minecraft 5");

        g1.visualizar();
        g2.visualizar();
    }
}
