import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

    double weight;
    double height;
    boolean useLbs;
    boolean useFt;
    double bmi;
    Scanner scanner;
    DecimalFormat dF;

    BMI() {
        scanner = new Scanner(System.in);
        dF = new DecimalFormat("#.00");

        chooseWeight();
        chooseHeight();
        bmiCalc();
    }

    public static void main(String[] args) {
        new BMI();
    }

    public void chooseWeight() {
        while(true) {
            System.out.println("kgs or lbs");
            String choice = scanner.nextLine();

            if (choice.equals("kgs")) {
                useLbs = false;
                break;
            } else if (choice.equals("lbs")) {
                useLbs = true;
                break;
            } else {
                System.out.println("Error");
            }
        }
    }
    public void chooseHeight() {
        while(true) {
            System.out.println("meters or feet");
            String choice = scanner.nextLine();

            if (choice.equals("meters")) {
                useFt = false;
                break;
            } else if (choice.equals("feet")) {
                useFt = true;
                break;
            } else {
                System.out.println("Error");
            }
        }
    }
    public void bmiCalc() {
        System.out.println("Enter weight:");
        weight = scanner.nextDouble();
        System.out.println("Enter height:");
        height = scanner.nextDouble();

        if(useLbs) {
            weight = weight/2.205;
        }
        if(useFt) {
            height = height/3.281;
        }

        bmi = weight/(height*height);

        System.out.println("your bmi is " + dF.format(bmi));
    }
}