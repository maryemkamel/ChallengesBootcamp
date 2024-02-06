package Day11;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sentence implements Serializable {

    private String message;
    private String author;

    public Sentence(String message, String author) {
        this.message = message;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ": " + message;
    }
}

class Story implements Serializable {
    private List<Sentence> sentences;

    public Story() {
        this.sentences = new ArrayList<>();
    }

    public void addSentence(String message, String author) {
        sentences.add(new Sentence(message, author));
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentences) {
            result += sentence.toString() + "\n";
        }
        return result;
    }
}

public class CollaborativeStoryteller {
    private static final String FILE_PATH = "story.txt";

    public static void saveStoryTrack(Story story) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(story);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Story loadStoryTrack() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (Story) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new Story();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Story story = loadStoryTrack();
        System.out.println(story.toString());
        System.out.println("Welcome to the Collaborative Storyteller!");

        while (true) {
            System.out.print("\nEnter your name (Auter): ");
            String author = scanner.nextLine();

            System.out.print("Add a sentence to the story: ");
            String sentenceMessage = scanner.nextLine();

            story.addSentence(sentenceMessage, author);

            System.out.print("Do you want to save the story? (yes/no): ");
            String saveChoice = scanner.nextLine().toLowerCase();
            if (saveChoice.equals("yes")) {
                saveStoryTrack(story);
                System.out.println("Story saved succesfully!!!!.");
            } else {
                System.out.println("Story not saved,Try again.");
            }

            System.out.print("Do you want to add another sentence? (yes/no): ");
            String continueChoice = scanner.nextLine().toLowerCase();
            if (!continueChoice.equals("yes")) {
                System.out.println("Exiting the program!!!!!!");
                break;
            }
        }
        scanner.close();
    }
}
