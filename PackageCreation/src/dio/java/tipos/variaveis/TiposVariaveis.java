package dio.java.tipos.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroMediano = numeroCurto;
        short numeroCurto2 = (short) numeroMediano;

        int numero = 1;
        numero = 2; // Atribuição de outro valor à mesma variável
        System.out.println("Alterando o valor a uma variável: " + numero );

        // Quando queremos definir que o valor não poderá ser alterado
        // Usamos a palavra reservada Final e nome da variável
        //escrita em maiúsculas


        final double VALOR_NUNCA_PODE_ALTERAR = 3.14; // Variável declarada como uma constante
        System.out.println("Usando a palvra reservada final.\nO valor de PI é : " + VALOR_NUNCA_PODE_ALTERAR);








    }
}
