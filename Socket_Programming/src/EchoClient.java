import java.io.*;
import java.net.Socket;

public class EchoClient {

	public EchoClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Client Started");
			Socket soc= new Socket("localhost",9806);
			BufferedReader inp= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string");
			String str=inp.readLine();
			PrintWriter out= new PrintWriter(soc.getOutputStream(),true);
			out.println(str);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
			soc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
 
	}

}
