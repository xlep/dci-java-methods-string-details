import java.util.Scanner;

public class StringDetails {

  public static void main(String[] args) {
    StringDetails stringDetails = new StringDetails();
    Scanner scanner = new Scanner(System.in);

    String input = stringDetails.queryInput(scanner);
    stringDetails.inputLength(input);

    stringDetails.wordCount(input);
    String lettersToHide = stringDetails.queryLettersToHide(scanner);
    stringDetails.hideLetters(input, lettersToHide);

    String newSentence = stringDetails.addSentence(scanner);
    stringDetails.hideLetters(input + newSentence, lettersToHide);
  }

  // Basics: scan input
  String queryInput(Scanner scanner) {
    System.out.println("Please enter the text that you want to analyze:");
    String input = scanInput(scanner);
    System.out.println("\nYour input was: " + input);
    return input;
  }

  private String scanInput(Scanner scanner) {
    return scanner.nextLine();
  }


  // Basics: text length
  void inputLength(String input) {
    System.out.println("The input is " + input.length() + " characters long.");
  }

  // word count
  int wordCount(String input) {
    String[] words = input.split(" ");
    System.out.println("There are " + words.length + " words in your text.");

    return words.length;
  }

  // hide letters
  String queryLettersToHide(Scanner scanner) {
    System.out.println("\nPlease tell me a letter to hide in your text:");
    String lettersToHide = scanInput(scanner);

    return lettersToHide;
  }

  void hideLetters(String text, String lettersToHide) {
    String hiddenLetters = text.replaceAll("[" + lettersToHide + "]", "*");
    System.out.println(hiddenLetters);
  }

  // add sentence
  // note: can also be done by overloading the queryInput method
  String addSentence(Scanner scanner) {
    System.out.println("\nPlease tell me another sentence:");
    String newSentence = scanner.nextLine();

    return newSentence;
  }

  void printFullString(String firstInput, String secondInput) {
    System.out.println("The full input is:");
    System.out.println(firstInput + " " + secondInput);
  }


}
