import java.util.List;

public class Sequence {

    private List<ORF> ORFs;
    private String seq;

    public Sequence(String seq){
        setSeq(seq);
    }

    protected void setSeq(String seq){
        // Checks if the seq parameter is a valid nucleotide sequence,
        // before setting the instance variable to the new value.
    }

    protected String getSeq(){
        return this.seq;
    }

    protected void FindORFs(){
        // Checks for ORF's in the this.seq instance variable. Every hit is added to the internal ORF's list as an
        // instance of the ORF class.
    }

    protected List<ORF> getORFs(){
        return this.ORFs;
    }

}
