public class Quadruplet {
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

    @java.lang.Override
    public java.lang.String toString() {
        return quadID + ":     "
                + operation  + ",    "
                + source1 + ",    "
                +source2 + ",    "
                + destination ;
    }

    public static void setNum_quad(int num_quad) {
        Quadruplet.num_quad = num_quad;
    }
}