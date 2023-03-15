import javax.swing.plaf.RootPaneUI;

public class Booleans {
    public static void main(String[] args) {

        //Comparação de textos ou objetos
        String name1 = "Rui";
        String name2 = "Rui";
        System.out.print("Os dois nomes são :");
        System.out.println(name1 == name2);

        // Creating a new
        System.out.println("Creating a new Object");
        String nameOne = "Rui";
        String nameTwo = new String("Rui");

        System.out.println(nameOne == nameTwo);




        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;
        System.out.println("Numero1 é igual a numero 2?: " + yesNo);

        if (number1 < number2){
            System.out.println("This condition is: " + yesNo);
        }

        // Nova atribuição para a mesma variável
        yesNo = number1 != number2;
        System.out.println("Numero 1 é diferente de Número 2: " + yesNo);

        yesNo = number1 > number2;
        System.out.println("O proimeiro numero é menor que o segundo?: " + yesNo);
    }
}
