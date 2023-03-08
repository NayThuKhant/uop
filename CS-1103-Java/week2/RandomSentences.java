
import java.util.Random;

public class RandomSentences {
  static Random random = new Random();
  static String[] properNouns = {"Fred", "Jane", "Richard Nixon", "Miss America"};
  static String[] commonNouns = {"man", "woman", "fish", "elephant", "unicorn"};
  static String[] determiners = {"a", "the", "every", "some"};
  static String[] adjectives = {"big", "tiny", "pretty", "bald"};
  static String[] intransitiveVerbs = {"runs", "jumps", "talks", "sleeps"};
  static String[] transitiveVerbs = {"loves", "hates", "sees", "knows", "looks for", "finds"};
  static String[] conjunctions = {"and", "or", "but", "because"};

  static String randomItem(String[] listOfStrings) {
    int index = random.nextInt(listOfStrings.length);
    return listOfStrings[index];
  }

  static String nounPhrase() {
    String result = "";
    int chance = random.nextInt(2);
    if (chance == 0) {
      result = randomItem(properNouns);
    } else {
      result = randomItem(determiners) + " ";
      chance = random.nextInt(2);
      if (chance == 1) {
        result = result + randomItem(adjectives) + " ";
      }
      result = result + randomItem(commonNouns) + " ";
      chance = random.nextInt(2);
      if (chance == 1) {
        result = result + "who " + verbPhrase();
      }
    }
    return result;
  }

  static String verbPhrase() {
    String result = "";
    int chance = random.nextInt(4);
    switch (chance) {
      case 0:
        result = randomItem(intransitiveVerbs);
        break;
      case 1:
        result = randomItem(transitiveVerbs) + " " + nounPhrase();
        break;
      case 2:
        result = "is " + randomItem(adjectives);
        break;
      case 3:
        result = "believes that " + simpleSentence();
        break;
    }
    return result;
  }

  static String simpleSentence() {
    return nounPhrase() + verbPhrase();
  }

  static String sentence() {
    String result = simpleSentence();
    int chance = random.nextInt(2);
    if (chance == 1) {
      result = result + " " + randomItem(conjunctions) + " " + sentence();
    }
    return result;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(sentence());
    }
  }
}
