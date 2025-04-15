import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String movie = read.nextLine();
        System.out.println(movie);
        System.out.println("Qual o ano de lançamento?");
        int releaseYear = read.nextInt();
        System.out.println("Diga sua avaliação para o filme:");
        double rating = read.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
