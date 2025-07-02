import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]=newint[5];
        

        // Input marks for five subjects
        System.out.println("Enter marks for five subjects (out of 100):");
        System.out.print("Subject 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int sub2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int sub3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int sub4 = scanner.nextInt();
        System.out.print("Subject 5: ");
        int sub5 = scanner.nextInt();

        // Calculate total and percentage
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (total / 5.0f);

        // Output total and percentage
        System.out.println("\nTotal Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");

        // Determine pass/fail using if-else
        if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && sub4 >= 35 && sub5 >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // Assign grade using switch-case
        int gradeCategory = (int) percentage / 10;
        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }
        system.out.println("percentage");
        system.out.println("Result");
        system.out.println("Totak=l Marks");
        

        scanner.close();
    }
}