package edu.AnastasiiaTkachuk;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Runner {
    private static final String VOWELS = "уеыаоэяиюУЕЫАОЭЯИЮ";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "task1.txt");
        try (Scanner scanner = new Scanner(path)) {
            while(scanner.hasNext()){
                String word = scanner.next();
                char first = word.charAt(0);
                if(VOWELS.indexOf(first) != -1){
                    System.out.println(word);
                }
            }
        }
    }
}
