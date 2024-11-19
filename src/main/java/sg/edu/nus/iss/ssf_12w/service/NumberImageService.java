package sg.edu.nus.iss.ssf_12w.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.ssf_12w.model.NumberImage;
import sg.edu.nus.iss.ssf_12w.repository.NumberImageRepository;

@Service
public class NumberImageService {
    private final NumberImageRepository numberImageRepository;

    public NumberImageService(NumberImageRepository numberImageRepository) {
        this.numberImageRepository = numberImageRepository;
    }

    public List<NumberImage> getRandomNumbers(int n) {
        List<NumberImage> generatedImages = new ArrayList<>();
        generatedImages.addAll(numberImageRepository.getNumbers());
        Collections.shuffle(generatedImages);
        return generatedImages.subList(0, n);
    }

}
