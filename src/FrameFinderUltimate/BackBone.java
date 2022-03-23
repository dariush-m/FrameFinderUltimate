package FrameFinderUltimate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class BackBone {
    static List<ORF> ORFs;
    static HashMap<String, String> parameters;
    static String fileContent;
    static String nucSequence;
    static String inputFilePath;
    static String saveFilePath;

    private static void extractSequence() throws IOException {
        inputFilePath = FileHandling.selectInputFile();
        // Sets the this.inputFilePath to the chosen file path.
        String line;
        StringBuilder builder = new StringBuilder();
        BufferedReader inFile = null;
        if (inputFilePath != null) {
            inFile = new BufferedReader(new FileReader(inputFilePath));
        }
        inFile.readLine();
        // Reads the header to move onto the sequence.
        while ((line = inFile.readLine()) != null) {
            builder.append(line).append("\n");
        }
        // Builds a string by adding each line of the file.
        nucSequence = builder.toString();
        // Sets the value of this.nucSequence to the sequence extracted out of this.fileContent.
    }
}
