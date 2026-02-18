import java.util.Scanner;
public class SpringSeason {

    public static void main(String[] args) {
        System.out.println(" Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season");
        Scanner sc = new Scanner(System.in);

        try {
            while(true) {
                System.out.println("Enter month in digits");
                int month = sc.nextInt();
                System.out.println("Enter days in digit");
                int day = sc.nextInt();
                if (month == 3 && (day >= 20 && day <= 31) || month == 4 && (day >= 1 && day <= 30) || month == 5 && (day >= 1 && day <= 31) || month == 6 && (day >= 1 && day <= 20)) {
                    {
                        System.out.println("Its a Spring Season");
                        
                    }
                    

                }

                else if (month == 1 && (day >= 1 && day <= 31)|| month ==2 && (day >= 1 && day <= 28) || month == 3 && (day >= 1 && day < 20) || month == 6 && (day >= 21 && day <= 30) ||month == 7 && (day >= 1 && day <= 31)  || month == 8 && (day >= 1 && day <= 31) || month == 9 && (day >= 1 && day <= 30)|| month == 10 && (day >= 1 && day <= 31) || month == 11 && (day >= 1 && day <= 30) || month == 12 && (day >= 1 && day <= 31)) {
                    if (day >= 1 && day <= 31 ) {
                        System.out.println("Not a Spring Season");

                    }
                }

                else {
                    System.out.println("Invalid" );
                }

                

                
            




            }

        }
        finally{
            sc.close();
        }



    }
    
}
