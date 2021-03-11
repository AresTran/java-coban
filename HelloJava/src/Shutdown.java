import  java.io.*;

public class Shutdown {
    public static void main(String[] args) throws  IOException{
        Runtime run = Runtime.getRuntime();
        Process proc = run.exec("shutdown -s -t 1");
    }
}
