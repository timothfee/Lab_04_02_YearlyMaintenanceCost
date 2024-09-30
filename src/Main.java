import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    //Ask for politicalAffiliation affiliation, if input is "D" display democratic donkey, if input is "R" display reblican elephant, if input is "I" display independent person, otherwise display other
    
    Scanner in = new Scanner(System.in);
    String politicalAffiliation = "";

    System.out.print("Enter your politicalAffiliation affiliation (D, R, I): ");
    politicalAffiliation = in.nextLine().toUpperCase();

    if (politicalAffiliation.equals("D")) {
      System.out.println("You get a Democratic Donkey.");
    }
    else if (politicalAffiliation.equals("R")) {
      System.out.println("You get a Republican Elephant.");
    }
    else if (politicalAffiliation.equals("I")) {
      System.out.println("You get an Independent Person.");
    } 
    else {
      System.out.println("Other.");
    }

  }
}
