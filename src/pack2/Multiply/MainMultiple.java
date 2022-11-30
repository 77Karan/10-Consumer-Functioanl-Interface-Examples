package pack2.Multiply;

import java.util.function.Consumer;

public class MainMultiple
{
	public static void main(String[] args) 
	{
		Consumer<Integer> cs = (i) -> System.out.println(i*i);
		cs.accept(100);
		
	}

}
