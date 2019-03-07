import java.util.Scanner;
public class Ch2_Practice_Lab {

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    final double HOMEWORK_MAX = 80.0;
    final double MIDTERM_MAX = 40.0;
    final double FINAL_MAX = 70.0;
    final double HOMEWORK_WEIGHT = 0.10; // 20%
    final double MIDTERM_WEIGHT = 0.30;
    final double FINAL_WEIGHT = 0.45;
    final double QUIZ_MAX = 20.0;
    final double QUIZ_WEIGHT = 0.15;

    double homeworkScore;
    double quizScore;
    double midtermScore;
    double finalScore;
    double coursePercentage;
    double homeworkPart;
    double quizPart;
    double midtermPart;
    double finalPart;

    System.out.println("Enter homework score:");
    homeworkScore = scnr.nextDouble();

    System.out.println("Enter quiz score:");
    quizScore = scnr.nextDouble();

    System.out.println("Enter midterm exam score:");
    midtermScore = scnr.nextDouble();

    System.out.println("Enter final exam score:");
    finalScore = scnr.nextDouble();

    homeworkPart = ((homeworkScore / HOMEWORK_MAX) * HOMEWORK_WEIGHT);
    quizPart = ((quizScore/QUIZ_MAX)*QUIZ_WEIGHT);
    midtermPart = ((midtermScore/MIDTERM_MAX)*MIDTERM_WEIGHT);// FIXME for midterm
    finalPart = ((finalScore/FINAL_MAX)*FINAL_WEIGHT);// FIXME for final

    coursePercentage = (homeworkPart+quizPart+midtermPart+finalPart) * 100; // Convert fraction to %

    System.out.print("Your course percentage (FIXME): ");
    System.out.println(coursePercentage+"%");
}
}