import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int students = 0;
        int exams = 0;

        System.out.println("Number of students: ");
        students = s.nextInt();
        String names[] = new String[students];

        System.out.println("Number of exams: ");
        exams = s.nextInt();
        int scores[][] = new int[students][exams];

        for (int i, j = 0;;) {
            System.out .println("Enter student's data (first name followed by exams scores):");
            String studentnames = s.nextLine();
            studentnames = names[3];
            int e1 = s.nextInt();
            e1 = scores[0][0];
            int e2 = s.nextInt();
            e2 = scores[0][2];
            int e3 = s.nextInt();
            e3 = scores[0][3];

        }

    }
}