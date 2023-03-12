package br.dio.com;

public class JavaAnatomyClasses {
    public static void main(String[] args) {

        System.out.println("\nHello Java World.");

        // Declaração de variáveis
        String myName = "Rui";
        int dateIfBirth = 1972;

        boolean yes = true;

        System.out.println("My Name is: " + myName + " and my bithdate is: "
                + dateIfBirth);
        System.out.println("-------Methods---------");

    }

    // Method
    public static String fullName(String firstName, String lastName) {
        return firstName.concat(" ").concat((lastName));
    }
}
