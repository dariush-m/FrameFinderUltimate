package FrameFinderUltimate;

import java.util.HashMap;
import java.util.List;

public class BackBone {
    static List<ORF> ORFs;
    static HashMap<String, String> parameters;
    static String fileContent;
    static String nucSequence;
    static String inputFilePath;
    static String saveFilePath;

    private static void extractSequence(){
        FileHandling.selectOutputFile();
        // Sets the value of this.nucSequence to the sequence extracted out of this.fileContent.
    }
}
