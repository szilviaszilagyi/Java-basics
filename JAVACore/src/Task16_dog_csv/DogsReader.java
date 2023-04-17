package Task16_dog_csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class DogsReader {
    List<AbstractDog> dogs = new ArrayList<>();

    void readCsvFile() {
        try {
            List<String> fileContent = Files.readAllLines(Path.of("src/resources/dogs.csv"));
            for (String row : fileContent) {
                String[] rowData = row.split(", ");
                String type = rowData[0];
                String name = rowData[1];
                String gender = rowData[2];
                String birthday = rowData[3];
                String weight = rowData[4];
                String additionalProperties = rowData[5];

                switch (type) {
                    case "Bulldog" -> dogs.add(new Bulldog(type, name, gender, birthday, weight, additionalProperties));
                    case "YorkshireTerrier" ->
                            dogs.add(new YorkshireTerrier(type, name, gender, birthday, weight, additionalProperties));
                    case "CaucasianShepherd" ->
                            dogs.add(new CaucasianShepherd(type, name, gender, birthday, weight, additionalProperties));
                    default -> System.out.println("Wrong input: " + row);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<AbstractDog> getDogs() {
        return dogs;
    }
}
