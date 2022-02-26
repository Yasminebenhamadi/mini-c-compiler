
import java.util.*;
import java.io.*;

public class Result {
    private ArrayList<Quadruplet> quadList = new ArrayList<Quadruplet>();
    private ArrayList<String> errors = new ArrayList<String>();

    void addQuad(Quadruplet q){
        quadList.add(q);
    }
    void addQuad(Quadruplet q, int i){
        quadList.add(i,q);
    }
    void addError(String e){
        errors.add(e);
    }
    public void clear() {
        quadList.clear();
        errors.clear();
        Quadruplet.setNum_quad(0);
    }
    private void printFile (String filename){
        try {
            FileWriter myWriter = new FileWriter(filename);
            for ( Quadruplet q : quadList) {
                myWriter.write(q.toString()+"\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error: can't generate intermediate code file.");
            e.printStackTrace();
        }
    }

    private void printErrors (){
        System.out.println("Error: compilation failed.");
        for ( String e : errors) {
            System.out.println("Error: "+e);
        }
    }

    public void printResult (String filename){
        if (errors.isEmpty()){
            String quadFile = filename+".quad" ;
            printFile (quadFile);
            System.out.println("File: "+quadFile+" has been generated.");
        }
        else {
            printErrors();
        }
    }

}