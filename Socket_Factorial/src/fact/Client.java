package fact;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
  * Client
  */
 public class Client {
 
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",1000);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number");
            int num=Integer.parseInt( br.readLine());
            PrintWriter pr=new PrintWriter(soc.getOutputStream(),true);
            pr.println(num);
            BufferedReader b= new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(b.readLine());
            soc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
 }