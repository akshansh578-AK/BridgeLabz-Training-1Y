import java.util.Scanner;
public class CheckVotersEligibility {

    public static void main(String args[]) {
        System.out.println("A Program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18. ");
        Scanner sc = new Scanner(System.in);

        try {
            while(true) {
                System.out.println("\nEnter your Gender :");
                System.out.println("1. Male");
                System.out.println("2. Female");
                int gender = sc.nextInt();
                if (gender == 1) {
                    System.out.println("Sir, kindly enter your age :");
                    int ageOfMale = sc.nextInt();
                    if (ageOfMale >= 18) {
                        System.out.println("Sir, you are eligible to vote");
                    }
                    else if(ageOfMale < 18) { 
                        System.out.println("Sorry, you are not eligible to vote");
                        

                    }

                }

                else if (gender == 2) {
                    System.out.println("Madam, kindly enter your age :");
                    int ageOfFemale = sc.nextInt();
                    if (ageOfFemale >= 18) {
                        System.out.println("Madam, you are eligible to vote");
                    }
                    else if(ageOfFemale < 18) { 
                        System.out.println("Sorry, you are not eligible to vote");
                        

                    }

                }

            }
        }
        finally {
            sc.close();
        }

    }
    
}
