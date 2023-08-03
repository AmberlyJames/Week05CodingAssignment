package week05CodingProject;

public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		for (int i = 0; i < str.length(); i++){
			System.out.print(str.charAt(i)+ " ");
		}
		
	}

	@Override
	public void error(String str) {
		StringBuilder message = new StringBuilder();
		message.append("ERROR: ");
		for (int i = 0; i < str.length(); i++) {
			message.append(str.charAt(i)+ " ");
		}
		System.out.print(message.toString());
	
	}
	
}


