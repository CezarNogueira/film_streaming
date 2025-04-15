import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double meanRating = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme:");
            rating = read.nextDouble();
            meanRating += rating;
        }

        System.out.println("Média de avaliações: " + meanRating / 3);

    }
}
