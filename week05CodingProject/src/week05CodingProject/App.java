package week05CodingProject;

public class App {

	public static void main(String[] args) {
	
		Logger astLogger = new AsteriskLogger();
		
		
		astLogger.log("Everything is fine");
		
		System.out.println();
		
		
		astLogger.error("There's definitely a broken thingy!");
		
		System.out.println();			//added some extra empty lines to the console for better visibility
				
		
	
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.log("Spaces should appear between the characters");
		
		System.out.println("\n");
		
		spacedLogger.error("Spaces DO appear between the characters!!!");
	}

}
