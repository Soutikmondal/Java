import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
	System.out.println("Waiting for Clients....");
	ServerSocket ss=new ServerSocket(9806);
	Socket soc=ss.accept();
	System.out.println("Connection established");
	BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	String str=in.readLine();
	PrintWriter out= new PrintWriter(soc.getOutputStream(),true);
	out.println("server"+str);
	ss.close();
	
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
	}

}
