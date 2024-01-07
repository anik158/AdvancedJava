package exercise_treeset_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        TreeSet<String> orderedWords = new TreeSet<>();
        File file = new File("E:\\Java\\Intellij Idea\\AdvancedJava\\src\\exercise_treeset\\alice_story.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               String[] lineWords = line.split("[ ,]+");
               words.addAll(Arrays.asList(lineWords));
                orderedWords.addAll(Arrays.asList(lineWords));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the number of words in the txt file

        System.out.println("Total words " +words.size());
        System.out.println("Unique words "+orderedWords.size());

    }
}
