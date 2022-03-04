package Lesson2;
import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        double kg,m,bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Weight : ");
        kg = input.nextDouble();
        System.out.print("Please Enter Your Height(in Meters) : ");
        m = input.nextDouble();

        bmi = kg / (m*m);
        System.out.print("Your Body Mass Index : "+bmi);



    }
}
