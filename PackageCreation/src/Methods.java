

public class Methods {
    public static void main(String[] args) {

        String firstName = "Rui";
        String lastName = "Lagos";


        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public  static  String fullName (String firstName, String lastName){
        return "Result from Method: " + firstName.concat(" ").concat(lastName);



    }
}
