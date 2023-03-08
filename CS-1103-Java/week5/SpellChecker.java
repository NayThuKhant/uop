import java.io.*;
import java.util.*;
import javax.swing.*;

public class SpellChecker {

    public static void main(String[] args) throws FileNotFoundException {

        HashSet<String> dictionary = new HashSet<String>();
        Scanner dictScanner = new Scanner(new File("words.txt"));
        dictScanner.useDelimiter("[^a-zA-Z]+");
        while (dictScanner.hasNext()) {
            String word = dictScanner.next().toLowerCase();
            dictionary.add(word);
        }
        System.out.println("Dictionary size: " + dictionary.size());

        // Let user select input file
        File inputFile = getInputFileNameFromUser();
        if (inputFile == null) {
            System.out.println("No input file selected. Exiting.");
            return;
        }
        Scanner inputScanner = new Scanner(inputFile);
        inputScanner.useDelimiter("[^a-zA-Z]+");

        // Set to keep track of misspelled words already outputted
        HashSet<String> misspelled = new HashSet<String>();

        while (inputScanner.hasNext()) {
            String word = inputScanner.next().toLowerCase();
            if (!dictionary.contains(word) && !misspelled.contains(word)) {
                System.out.print(word + ":");
                TreeSet<String> corrections = corrections(word, dictionary);
                if (corrections.isEmpty()) {
                    System.out.print("(no suggestions)");
                } else {
                    for (String c : corrections) {
                        if (!corrections.last().equals(c)) {
                            c = c + ", ";
                        }
                        System.out.print(c);
                    }
                }
                misspelled.add(word);
                System.out.println("");
            }
        }
    }

    static File getInputFileNameFromUser() {
        JFileChooser fileDialog = new JFileChooser();
        fileDialog.setDialogTitle("Select File for Input");
        int option = fileDialog.showOpenDialog(null);
        if (option != JFileChooser.APPROVE_OPTION)
            return null;
        else
            return fileDialog.getSelectedFile();
    }

    static TreeSet<String> corrections(String badWord, HashSet<String> dictionary) {
        TreeSet<String> variations = new TreeSet<String>();
        // Delete any one of the letters from the misspelled word.
        for (int i = 0; i < badWord.length(); i++) {
            String variation = badWord.substring(0, i) + badWord.substring(i + 1);
            if (dictionary.contains(variation)) {
                variations.add(variation);
            }
        }
        // Change any letter in the misspelled word to any other letter.
        for (int i = 0; i < badWord.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String variation = badWord.substring(0, i) + c + badWord.substring(i + 1);
                if (dictionary.contains(variation)) {
                    variations.add(variation);
                }
            }
        }

        for (int i = 0; i <= badWord.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String variation = badWord.substring(0, i) + c + badWord.substring(i);
                if (dictionary.contains(variation)) {
                    variations.add(variation);
                }
            }
        }

        for (int i = 0; i < badWord.length() - 1; i++) {
            String variation = badWord.substring(0, i) + badWord.charAt(i + 1) + badWord.charAt(i) + badWord.substring(i + 2);
            if (dictionary.contains(variation)) {
                variations.add(variation);
            }
        }

        for (int i = 1; i < badWord.length(); i++) {
            String word1 = badWord.substring(0, i);
            String word2 = badWord.substring(i);
            if (dictionary.contains(word1) && dictionary.contains(word2)) {
                variations.add(word1 + " " + word2);
            }
        }
        return variations;
    }

}
