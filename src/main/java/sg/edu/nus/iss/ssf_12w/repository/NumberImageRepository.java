package sg.edu.nus.iss.ssf_12w.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.ssf_12w.model.NumberImage;

@Repository
public class NumberImageRepository {
    private final List<NumberImage> numbers;
    private static final String filePath = "src/main/resources/static/images/numbers/";

    public NumberImageRepository() { 
        this.numbers = new ArrayList<>();
    }

    public List<NumberImage> getNumbers() {
        instantiateList();
        return numbers;
    }

    private void instantiateList() {
        File[] imageFiles = new File(filePath).listFiles((dir, name) -> name.contains(".jpg"));
        // Arrays.sort(imageFiles, (x, y) -> x.getName().compareTo(y.getName()));
        if (numbers.size() != imageFiles.length) {
            numbers.clear();
            for (File numImage : imageFiles) {
                numbers.add(new NumberImage(numImage));
            }
        }
    }
}
