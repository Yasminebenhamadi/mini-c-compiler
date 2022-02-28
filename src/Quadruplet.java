public class Quadruplet implements Comparable<Quadruplet>{
    private static int num_quad = 0;
    private int quadID;
    private String operation ;
    private String source1;
    private String source2;
    private String destination;

    public Quadruplet (String operation, String source1, String source2, String destination) {
        this.quadID = num_quad;
        num_quad ++ ;
        this.operation = operation;
        this.source1 = source1;
        this.source2 = source2;
        this.destination = destination;
    }

    public Quadruplet(int quadID, String operation, String source1, String source2, String destination) {
        this.quadID = quadID;
        this.operation = operation;
        this.source1 = source1;
        this.source2 = source2;
        this.destination = destination;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  quadID  + ":    "
                +operation  + ",    "
                + source1 + ",    "
                +source2 + ",    "
                + destination ;
    }

    public static void incrementNum_quad() {Quadruplet.num_quad ++;}

    public static int getNum_quad() {
        return num_quad;
    }

    public static void setNum_quad(int num_quad) {
        Quadruplet.num_quad = num_quad;
    }

    public int compareTo(Quadruplet q){
        if(this.quadID==q.quadID)
            return 0;
        else if(this.quadID>q.quadID)
            return 1;
        else
            return -1;
    }
}