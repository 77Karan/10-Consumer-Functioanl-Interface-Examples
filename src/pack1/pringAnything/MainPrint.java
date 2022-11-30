package pack1.pringAnything;

import java.util.function.Consumer;

public class MainPrint 
{
	public static void main(String[] args) 
	{
		Consumer<String> cs = (name) -> System.out.println(" >> Good morning");
		
		cs.accept("Ashok");
		
	}

}
