package sg.edu.nus.iss.ssf_12w.model;

import java.io.File;

public class NumberImage {
    private final File image;
    private final String relPath;
    private static final String folder = File.separator + "images" + File.separator + "numbers";

    public NumberImage(File image) {
        this.image = image;
        this.relPath = folder + File.separator + image.getName();
    }

    public File getImage() {
        return image;
    }

    public String getRelPath() {
        return relPath;
    }
    
}
