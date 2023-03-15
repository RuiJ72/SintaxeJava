

public class LogicalOperators {
    public static void main(String[] args) {
         boolean condition1 = true;
         boolean condition2 = false;

         // Verifiying if the two expressions are True
        if (condition1 && condition2){
            System.out.println("The two conditions are true");
        }
        else {
            System.out.println("The two conditions are false");
        }

        if (condition1 || condition2){
            System.out.println("One of the two conditions is true");
        }

        if (condition1 && (7 > 4)){
            System.out.println("Both conditions are true");
        }
    }
}
