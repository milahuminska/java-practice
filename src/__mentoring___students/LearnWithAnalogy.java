package __mentoring___students;

public class LearnWithAnalogy {
	public static void main(String[] args) {
		see();
		hear();
		smell();
		taste("cold");
		feel();
		
		
		
		
	}

	private static void feel() {
		// TODO Auto-generated method stub
		System.out.println("It's cold");
		
	}

	private static void taste(String taste) {
		// TODO Auto-generated method stub
		if(taste!="taste") {
			feel();
		}else {
		System.out.println("It's sweet");
	}
	}

	private static void smell() {
		// TODO Auto-generated method stub
		System.out.println("It's rose smell");
	}

	private static void hear() {
		// TODO Auto-generated method stub
		System.out.println("It's bird chirp");
	}

	private static void see() {
		// TODO Auto-generated method stub
		System.out.println("It's red car");
	}

}
