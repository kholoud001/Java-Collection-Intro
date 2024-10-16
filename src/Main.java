import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//  1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

        List<String> colors = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter colors number: ");
        String number = in.nextLine();
        for(int i=0; i<=number.length(); i++){
            System.out.println("Enter colors: ");
            String color = in.nextLine();
            colors.add(color);
        }
        in.close();
        System.out.println("The colors are: ");
        for(String color : colors){
            System.out.println(color);
        }




    }
}