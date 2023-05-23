
import java.util.Scanner;

public class InputVariables {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int now = 2023;
        String name;
        int age;
        double mass;
        System.out.print("Your name: ");
        name = input.nextLine();
        System.out.print("Your age: ");
        age = input.nextInt();
        System.out.print("Your height in meters: ");
        double height = input.nextDouble();
        System.out.print("Your weight in kilos: ");
        mass=input.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Hello, " +name+ "!");
        System.out.println("You were born in"+(now -age)+" year.");
        System.out.printf("Your index of body mass: %5.2f\n",bmi);
    }
}