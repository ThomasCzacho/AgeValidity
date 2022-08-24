import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    boolean drivingUnderAge=false;
        System.out.println("Enter age:");
        int age = sc.nextInt();
if (age<18) {
drivingUnderAge=true;
        }
        System.out.println("Driving Under Age: "+drivingUnderAge);
sc.close();
    }
}
