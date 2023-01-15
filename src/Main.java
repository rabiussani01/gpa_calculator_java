import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Totall subject :");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] nc = new double[x];
        double sum = 0;

        for (int i=0; i< nc.length; i++){
            System.out.println("Enter Your mark"  + (i+1) +  ":" );
            nc[i] = scan.nextDouble();
        }
        for (int i=0; i< nc.length; i++){
            sum = sum + nc[i];
        }
        double avg = sum/ nc.length;

        if (avg>90){
            System.out.println("Your Grade is : Golden A+" );
        }
        else if (avg<=90 && avg>80) {
            System.out.println("Your grade is : A+" );
        }
        else if (avg<=80 && avg>70) {
            System.out.println("Your grade is : A" );
        }
        else if (avg<=70 && avg>60) {
            System.out.println("Your grade is : B+" );
        }
        else if (avg<=60 && avg>50) {
            System.out.println("Your grade is : B" );
        }
        else if (avg<=50 && avg>40) {
            System.out.println("Your grade is : c" );
        }
        else if (avg<=40 && avg>33) {
            System.out.println("Your grade is : D" );
        }
        else {
            System.out.println("You grade is : F");
        }

        System.out.println("Your avg is :" + avg );
    }
}