package week05CodingProject;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void error(String str) {
		String message = "***ERROR: " + str + "***";
		StringBuilder outerAsterisks = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			outerAsterisks.append("*");
		}
		System.out.println(outerAsterisks);
		System.out.println(message);
		System.out.println(outerAsterisks);
	}

}
