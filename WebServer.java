import java.io.* ;
import java.net.* ;
import java.util.* ;
public class WebServer {
	
	public static void main(String argv[]) throws Exception
	{
        // Set the port number.
		int port = 6789;
		ServerSocket Socks = new ServerSocket(port);
		//Process HTTP service requests in an infinite loop.
		while (true) {
			// Listen for a TCP connection request.
		      Socket connectionSocket = Socks.accept();
		      //Construct object to process HTTP request message
		      HttpRequest request = new HttpRequest(connectionSocket);
		      
		      
		      Thread thread = new Thread(request);
		      thread.start(); //start thread
		     }
	}
	
	
    
    
}
