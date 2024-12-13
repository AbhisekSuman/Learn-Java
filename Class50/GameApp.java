package Class50;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[][] game = new float[7][];


        for (int i = 0; i < game.length; i++) {
            System.out.println("Enter Player Size");
            game[i] = new float[scanner.nextInt()];
            System.out.println("Enter heights: ");
            for (int j = 0; j < game[i].length; j++) {
                game[i][j] = scanner.nextFloat();
            }
        }

        for (int i = 0; i < game.length; i++) {
            for (float x : game[i]){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
