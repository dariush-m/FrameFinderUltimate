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
    static GUI window = new GUI();



    protected static void analyse() throws IOException{
        extractSequence();
        nucSequence.FindORFs();
        var x = nucSequence.getORFs();
        System.out.println(x);

    }

    protected static void extractSequence() throws IOException {
        // Sets the this.inputFilePath to the chosen file path.
        fileContent = FileHandling.retrieveData();
        // Retrieves the sequences from the chosen input file
        nucSequence = new Sequence(fileContent);
    }

    protected static void setInput(){
        inputFilePath = FileHandling.selectInputFile();
        window.inputField.setText(inputFilePath);
    }

    protected static void setOutput(){
        saveFilePath = FileHandling.selectOutputFile();
        window.outputField.setText(saveFilePath);
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


    public static void main(String[] args) {

    }
}

