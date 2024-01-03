package fact;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server
 */
public class Server {

    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients...");
            ServerSocket ss=new ServerSocket(1000);
            Socket soc=ss.accept();
            System.out.println("Connection established...");
            BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int a= Integer.parseInt(br.readLine());
            int num=fact(a);
            PrintWriter pr=new PrintWriter(soc.getOutputStream(),true);
            pr.println("The factorial is "+num);
            ss.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    static int fact(int number){
        int fact=number;
        for(int i=1;number -i>0;i++){
            fact=fact*(number-i);
        }
        return fact;
    }
}