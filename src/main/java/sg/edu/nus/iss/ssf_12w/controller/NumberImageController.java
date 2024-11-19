package sg.edu.nus.iss.ssf_12w.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sg.edu.nus.iss.ssf_12w.model.NumberImage;
import sg.edu.nus.iss.ssf_12w.service.NumberImageService;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class NumberImageController {
    private final NumberImageService numberImageService;
    
    public NumberImageController(NumberImageService numberImageService) {
        this.numberImageService = numberImageService;
    }

    @PostMapping("/numbers")
    public String postRandomNumbers(@RequestParam String numbers, Model model) {
        int n = Integer.parseInt(numbers);
        List<NumberImage> generatedImages = numberImageService.getRandomNumbers(n);
        
        model.addAttribute("numberImages", generatedImages);
        
        return "numbers";
    }

    @GetMapping("/numbers")
    public String randomNumbers() {
        return "numbers";
    }
    
    
}
