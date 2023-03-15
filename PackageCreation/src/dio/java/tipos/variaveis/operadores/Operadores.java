package dio.java.tipos.variaveis.operadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = 1 + 1 + 1 + "1"; // (soma de 1+1+1 Concatenado com a string "1")
        System.out.println(concatenacao);

        String concatenacao2 = 1 + "1" + 1 + 1;
        System.out.println(concatenacao2);

        String concatenacao3 = "1" + 1 + 1; // Quando o 1º carater é string deixa de realizar a soma seguinte
        System.out.println(concatenacao3);

        String concatenacao4 = "1" + (1+1+1);
        System.out.println(concatenacao4);
    }
}
