public class Conditional {
    public static void main(String[] args) {
        int realease_year = 2022;
        System.out.println("Ano de Lançamento: " + realease_year);

        boolean include_plan = true;
        double film_grade = 8.1;
        String typePlan = "Premium";

        if (realease_year >= 2025) {
            System.out.println("Lançamentos");
        } else {
            System.out.println("Filmes Disponiveis");
        }

        if (include_plan == true && typePlan.equals("Premium")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve Pagar a Locação");
        }
    }
}
