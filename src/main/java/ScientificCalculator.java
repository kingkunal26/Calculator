
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class ScientificCalculator {

    private static final Logger LOGGER = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) {

            ScientificCalculator scientificCalculator = new ScientificCalculator();
            Scanner sc = new Scanner(System.in);
            boolean flag=true;
            int choice;
                while(flag) {
                    System.out.println("Select the options : \n 1. Natural Logarithm\n 2. Power\n 3. Square root\n 4. Factorial\n 5. Exit\n");
                    System.out.print("Enter your choice:  ");
                    try {
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Enter the number: ");
                                double log = sc.nextDouble();
                                System.out.println("Natural Logarithmic value of " + log + " is: " + scientificCalculator.logarithm(log));
                                break;

                            case 2:
                                System.out.print("Enter the base number:  ");
                                double num = sc.nextDouble();
                                System.out.print("Enter the power: ");
                                double pow = sc.nextDouble();
                                System.out.println("Power function: " + num + "^" + pow + " = " + scientificCalculator.power(num, pow));
                                break;

                            case 3:
                                System.out.print("Enter the number: ");
                                double sq = sc.nextDouble();
                                System.out.println("Square root of " + sq + " is: " + scientificCalculator.squareRoot(sq));
                                break;

                            case 4:
                                System.out.print("Enter the number: ");
                                int fact = sc.nextInt();
                                System.out.println("Factorial of " + fact + " is: " + scientificCalculator.factorial(fact));
                                break;
                            case 5:
                                System.out.println("Exit!!!!");
                                flag = false;
                                break;
                            default:
                                System.out.println("Input is invalid, please choose the  proper input.");
                        }


                    } catch (Exception exception) {
                        System.out.println("Input is invalid, please choose the  proper input.");
                        LOGGER.error("Input is invalid, please choose the  proper input.");
                    }
                }
            }


    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        LOGGER.info("Square root - Input : " + number + " Output :" + result);
        return result;
    }

    public long factorial(int number) {
        int i = 1;
        long fact = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        LOGGER.info("Factorial - Input :" + number + " Output :" + fact);
        return fact;
    }

    public double logarithm(double number) {
        double result = Math.log(number);
        LOGGER.info("Natural Log - Input :" + number + " Output :" + result);
        return result;
    }

    public double power(double number, double power) {
        double result = Math.pow(number, power);
        LOGGER.info("Power - Input :" + number + " " + power + " Output :" + result);
        return result;
    }

}
