package utilities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs 
{
	public static Logger log;

	public Logs(String name) {
		// TODO Auto-generated constructor stub
		log=LogManager.getLogger(name);	
	}
	
}
