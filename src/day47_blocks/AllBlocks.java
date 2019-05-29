package day47_blocks;

public class AllBlocks {

	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("Static Block - I run first and only once");
		staticInt--;
	}

	{
		System.out.println("Init Block - I run each time object is created. Before constructor");
		nonStaticInt = nonStaticInt+5;
		staticInt = staticInt+5;
		
	}

	public AllBlocks() {
		System.out.println(" Constructor - I run each time object is created. After init block");
		nonStaticInt = nonStaticInt+3;
		staticInt = staticInt+3;
		
	}
	
	

}
