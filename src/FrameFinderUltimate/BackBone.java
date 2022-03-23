package FrameFinderUltimate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class BackBone {
    //    static List<ORF> ORFs;
    static HashMap<String, String> parameters;
    static String fileContent;
    static Sequence nucSequence;
    static String inputFilePath;
    static String saveFilePath;

    protected static void extractSequence() throws IOException {
        inputFilePath = FileHandling.selectInputFile();
        // Sets the this.inputFilePath to the chosen file path.
        fileContent = FileHandling.retrieveData();
        // Retrieves the sequences from the chosen input file
    }

    protected static void setInput(){
        inputFilePath = FileHandling.selectInputFile();
    }

    protected static void setOutput(){
        saveFilePath = FileHandling.selectOutputFile();
    }

    protected static void setFileContent() throws IOException {
        fileContent = FileHandling.retrieveData();
    }

    protected static void setNucSequence(){
        // Extract sequence
        nucSequence = new Sequence(fileContent);
    }

    protected static void setParameters(){
        parameters.put("test", "test");
    }
}
