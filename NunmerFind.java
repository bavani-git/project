package phase1.mphasis;
import java.util.regex.*;  
public class NunmerFind {

	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("^[A-Z]{1}[^/W][0-9]{4}[a-z]{4}$", "P@5816rasa"));
	}

}
