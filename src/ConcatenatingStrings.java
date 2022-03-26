import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        System.out.print("Enter your first name: ");
        String firstName = new Scanner(System.in).nextLine();
        System.out.print("Enter your second name: ");
        String secondName =new Scanner(System.in).nextLine();

        String fullName = firstName.concat(" "+secondName);
        System.out.println("Your full name is : "+fullName);

        String fullName2 = secondName.concat(" "+firstName);
        System.out.println("Your full name starting with your second name is: "+fullName2);


       if(fullName.equals(fullName2)){
           System.out.println("True");
       }else{
           System.out.println("False");
       }


    }

}
