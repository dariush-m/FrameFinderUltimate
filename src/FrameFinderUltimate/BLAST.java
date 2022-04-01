package FrameFinderUltimate;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BLAST {

    protected static void blastORFs(List<ORF> ORFs) throws IOException {
        // Run the BLAST search and return the results in XML format
        // Maybe make a separate thread.
        var input_sequence = new StringBuilder();

        for (ORF orf:
             ORFs) {
            input_sequence.append("%3Eseq%0A");
            input_sequence.append(orf.seq()).append("%0A");
        }

        String url="https://blast.ncbi.nlm.nih.gov/Blast.cgi?PAGE_TYPE=BlastSearch&QUERY="+input_sequence;

        Desktop.getDesktop().browse(URI.create(url));

    }
}
