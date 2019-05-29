package office_hour_may29;

public class PetSmart {
	
	public static void main(String[] args) {
		Cat muradilsCat = new Cat();
		muradilsCat.beed ="persian cat";
		muradilsCat.name = "Bars";
		
		sellCat(muradilsCat);
		
		OnlineCat marufsImaginaryCat = new OnlineCat();
		marufsImaginaryCat.beed = "lebanese cat";
		marufsImaginaryCat.name = "Tars";
		marufsImaginaryCat.location = "Arlington,TX";
		
		sellCatOnline(marufsImaginaryCat);
		muradilsCat.makeSomeNoice();
		marufsImaginaryCat.makeSomeNoice();
		
	}
	
	public static void sellCat(Cat cat) {
		System.out.println("selling "+ cat.beed);
		System.out.println("it's name is "+ cat.name);
	}
	
	public static void sellCatOnline(Cat cat) {//OnlineCat
		System.out.println("selling "+ cat.beed);
		System.out.println("it's name is "+ cat.name);
//		System.out.println("its location is "+ cat.location);//location will work
		
	}
	


	

}
