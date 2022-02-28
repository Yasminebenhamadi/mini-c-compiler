
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
    private void printFile (String function){
        try {
            Collections.sort(quadList);
            int i = quadList.size();
            String quadFile = function+".quad" ;
            FileWriter myWriter = new FileWriter(quadFile);
            myWriter.write(function+": \n");
            for ( Quadruplet q : quadList) {
                myWriter.write(q.toString()+"\n");
            }
            myWriter.write(Integer.toString(i)+": STOP\n");
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

    public void printResult (String function){
        if (errors.isEmpty()){
            String quadFile = function+".quad" ;
            printFile (function);
            System.out.println("File: "+quadFile+" has been generated.");
        }
        else {
            printErrors();
        }
    }

}