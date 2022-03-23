import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    protected String selectInputFile() {
        // Opens a dialog window for the user to choose which file they want as input.
        JFileChooser j = new JFileChooser();
        int option = j.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            // An output file has successfully been chosen
            return j.getSelectedFile().getPath();
        }
        return null;
    }

    protected String selectOutputFile(){
        // Opens a dialog window for the user to choose where they want to write the output of the program to.
        JFileChooser j = new JFileChooser();
        int option = j.showSaveDialog(null);

        if (option == JFileChooser.APPROVE_OPTION){
            // An output file has successfully been chosen
            return j.getSelectedFile().getPath();
        }
        return null;
    }

    protected String retrieveData(){
        // Returns the data stored inside the input file.
        return "";
    }


    protected void saveData(String data) throws IOException {
        // Writes the data to an already specified output file.
        FileWriter saveFile = new FileWriter(BackBone.saveFilePath);
        saveFile.write(data);
    }
}
