package testnwk;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.Calendar;
public class nwk {

	public static void main(String[] args) throws UnknownHostException, IOException {
	 
		// Adding Timestamp class
		
		Calendar calendar = Calendar.getInstance();
	    Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
	    
	    //PrintStream out = new PrintStream(new FileOutputStream("c:/Java/output.out", true));
	    //System.setOut(out);
	    
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("NEXT ******************NEXT************************NEXT");
	    //KFS 3 Application Servers execution
		System.out.println("");
		System.out.println("KFS 3 Application Servers ");
		System.out.println("===========================");
		System.out.println("");		
		String ipAddress = "uaz-kf-a02.mosaic.arizona.edu";
	    InetAddress inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to DEV: " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : "/  Host is NOT reachable");
	    
	    ipAddress = "uaz-kf-a05.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to TST: " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    ipAddress = "uaz-kf-a06.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to TRN: " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-kf-a07.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG: " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-kf-a09.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to Tools Box: " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : "Host is NOT reachable");
	    
	    ipAddress = "uaz-kc-a25.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to SUP1 " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-kc-a26.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to SUP2 " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-kc-a50.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to PRD1 " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-kc-a51.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to PRD2 " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	  
	    System.out.println("");	
	    System.out.println("KFS 6 Application Servers ");
		System.out.println("===========================");
		System.out.println("");		
		
		ipAddress = "uaz-ka-a09.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to Tool " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-ka-a02.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to Dev " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-ka-a05.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to Test " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	    
	    ipAddress = "uaz-ka-a07.mosaic.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
	    System.out.println("");	
	    System.out.println(" UAR Env");
	    System.out.println(" =========");

		System.out.println("");		
	    ipAddress = "nox.dev.uaccess-aws2.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
	    ipAddress = "luna.dev.uaccess-aws2.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
	    ipAddress = "avocado.tst.uaccess-aws2.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
	    ipAddress = "avocado.tst.uaccess-aws2.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
	    ipAddress = "tucson.stg.uaccess-aws2.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
 	    ipAddress = "mesa.stg.uaccess-aws2.arizona.edu";
	    inet = InetAddress.getByName(ipAddress);
	    System.out.print(currentTimestamp + "  Sending Ping Request to STG " + ipAddress);
	    System.out.println(inet.isReachable(5) ? " / Host is reachable" : " / Host is NOT reachable");
	   
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("NEXT ******************NEXT************************NEXT");
	    System.out.println(".");
	    System.out.println(".");
	    System.out.println(".");
	    System.out.println(".");
	    System.out.println(".");
	    System.out.println(".");
	}
}
