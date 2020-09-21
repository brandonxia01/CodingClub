package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    public String[] readFile(String filePath) {
        File file = new File(filePath);
        try {
            List<String> lines = Files.lines(Paths.get(file.toURI()))
                    .filter(line -> line != null && !line.equals(""))
                    .map(String::trim)
                    .map(this::removeOddCharacters)
                    .collect(Collectors.toList());
            String[] linesArray = new String[lines.size()];
            return lines.toArray(linesArray);
        } catch (Exception e) {
            System.out.println("readFile error - " + e);
            return null;
        }
    }

    private String removeOddCharacters(String s) {
        return s.replaceAll("[^!-~\\u20000-\\uFE1F\\uFF00-\\uFFEF] ", "");
    }

}