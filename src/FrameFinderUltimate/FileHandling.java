package FrameFinderUltimate;

import javax.swing.*;
import java.io.*;

public class FileHandling {
    protected static String selectInputFile() {
        // Opens a dialog window for the user to choose which file they want as input.
        JFileChooser j = new JFileChooser();
        int option = j.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            // An output file has successfully been chosen
            return j.getSelectedFile().getPath();
        }
        return null;
    }

    protected static String selectOutputFile(){
        // Opens a dialog window for the user to choose where they want to write the output of the program to.
        JFileChooser j = new JFileChooser();
        int option = j.showSaveDialog(null);

        if (option == JFileChooser.APPROVE_OPTION){
            // An output file has successfully been chosen
            return j.getSelectedFile().getPath();
        }
        return null;
    }

    protected static String retrieveData() throws IOException{
        StringBuilder sb = new StringBuilder();

        File inputFile = new File(BackBone.inputFilePath);
        try (BufferedReader br = new BufferedReader(new FileReader(BackBone.inputFilePath))) {
            while (true){
                String line = br.readLine();
                if (line == null){break;}

                sb.append(line);
            }
            return sb.toString();
        }
    }


    protected static void saveData(String data) throws IOException {
        // Writes the data to an already specified output file.
        FileWriter saveFile = new FileWriter(BackBone.saveFilePath);
        saveFile.write(data);
    }
}
