package aEnumsRFun;
	
public class LetsDoEnums {
	
	enum Flavor {
		CHOCOLATE, VANILLA, STRAWBERRY;
		
		public static void getVanilla() {
			System.out.println(Flavor.VANILLA);
		}
	}
	
	public static void main(String[] args) {
		Flavor flav = Flavor.VANILLA;
		flav.getVanilla();
	}
	
}