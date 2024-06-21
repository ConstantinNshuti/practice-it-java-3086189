package _03_03b;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    GradingSystem gradingSystem = new GradingSystem();

    Scanner scanner = new Scanner(System.in);
    System.out.println("\nPlease enter your Note percentage: ");
    int percentage = scanner.nextInt();
    
    System.out.println("Percentage: " + percentage);
    System.out.println("Pass: " + gradingSystem.isAPass(percentage));
    System.out.println("Grade: " + gradingSystem.getGrade(percentage));
    System.out.println(gradingSystem.retakeMessage(percentage, true));
  }

}
