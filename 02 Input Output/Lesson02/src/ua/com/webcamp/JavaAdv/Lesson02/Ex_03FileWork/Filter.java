package ua.com.webcamp.JavaAdv.Lesson02.Ex_03FileWork;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Class for working with filter
 */
public class Filter implements FilenameFilter {

    /**
     * Extension that you need to be filtered
     */
    private String extension;

    public Filter(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(File dir, String name) {
            return (name.endsWith(extension));
    }
}
