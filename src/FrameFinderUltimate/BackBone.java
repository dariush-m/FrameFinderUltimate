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
        fileContent = FileHandling.retrieveData();
        // Retrieves the sequences from the chosen input file
    }
}
