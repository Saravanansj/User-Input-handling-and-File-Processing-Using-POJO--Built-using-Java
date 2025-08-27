package org.saro;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FilesUtils {

    // Reads all lines from a file and returns them as a List<String>
    public static List<String> readLines(File f) throws IOException {
        return Files.readAllLines(f.toPath());
    }
}
