package day46_static_keyword;

public class CampusRunner {
	public static void main(String[] args) {
		Campus campus1 = new Campus("McLean");
		Campus campus2 = new Campus("Chacago");
//		Campus campus3 = new Campus("New Jersey");
//	
		Campus.campusInfo();
		Campus.campusInfo();
		Campus.campusInfo();
		
		System.out.println(Campus.country);
	}

}