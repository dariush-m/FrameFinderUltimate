import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Sequence {
    static private final Pattern VALID_BASES = Pattern.compile("[ATGC]+");
    static private final Set<String> STOP_CODONS = Set.of("TAA", "TAG", "TGA");

    private final List<ORF> ORFs = new ArrayList<>();
    private String seq;



    public Sequence(String seq){
        setSeq(seq);
    }


    public static void main(String[] args) {
        var seq = new Sequence("ATTGCGTGA");
        seq.monoReadingFrameSearch(1);
        System.out.println(seq.getORFs());
    }

    /** Sets a new value for the internal sequence variable.
     *
     * @param seq New sequence to be used.
     */
    protected void setSeq(String seq){
        // Checks if the seq parameter is a valid nucleotide sequence,
        // before setting the instance variable to the new value.
        var matcher = VALID_BASES.matcher(seq);
        if (matcher.matches()){
            this.seq = seq;
        }

    }

    /** Returns the value of the internal sequence.
     *
     * @return The internal sequence.
     */
    protected String getSeq(){
        return this.seq;
    }

    protected void FindORFs(){
        // Checks for ORF's in the this.seq instance variable. Every hit is added to the internal ORF's list as an
        // instance of the ORF class.
        for (int offset = -3; offset < 3; offset++) {


            for (int i = 0; i < seq.length()+offset; i++) {
                // TODO: Create multi reading frame finder
            }

        }
    }


    private void monoReadingFrameSearch(int readingFrame) {
        if (3 < readingFrame || readingFrame < -3 || readingFrame == 0) {
            throw new IllegalArgumentException("Value of readingFrame must be in range -3 to 3, excluding 0");
        }

        int seqLength = seq.length();
        int sign = readingFrame > 0 ? 1 : -1;
        int start_index = readingFrame > 0 ? readingFrame-1 : seqLength+readingFrame+1;


        int startPosition = 0; // Setting the start position of the first ORF
        int codonEndPosition = 0; // Setting the default end position
        for (int i = start_index; i < (sign * seqLength); i+=sign*3) {
            codonEndPosition = i + (3 * sign);
            System.out.println(codonEndPosition);

            String currentCodon = seq.substring(i, codonEndPosition);

            if (STOP_CODONS.contains(currentCodon)) {
                // The current ORF has ended
                ORFs.add(new ORF(startPosition, codonEndPosition));
                startPosition = codonEndPosition + sign; // Setting the start position of the next ORF
            }
        }
        // Loop has ended
        // Final ORF gets added
        ORFs.add(new ORF(startPosition, codonEndPosition));
    }

    protected List<ORF> getORFs(){
        return this.ORFs;
    }

}
