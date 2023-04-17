package Eloadasanyag.interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentFileOperation implements StudentSaver, StudentReader{
    String filename = "student.txt";
    @Override
    public void save(String student) {
        try {
            Files.writeString(Paths.get("src/resources/"+filename), student);
            System.out.println("Data saved." + student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> read() {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Path.of("src/resources/"+filename));
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
        return result;
    }
}
