
public class HouseTypeApp {

	public static void main(String[] args) {
		
		HouseTypeService houseTypeService = new HouseTypeService();
		
		System.out.println("#######################################################");
		System.out.println();
		System.out.println("Total Price Of House : "+ houseTypeService.getTotalHousePrice());
		System.out.println("Total Price Of Villa : "+ houseTypeService.getTotalVillaPrice());
		System.out.println("Total Price Of Summery House : "+ houseTypeService.getTotalSummeryPrice());
		System.out.println("Total Price Of All House types : "+ houseTypeService.getTotalAllHouseTypePrice());
		System.out.println();
		System.out.println("#######################################################");
		System.out.println();
		System.out.println("Mean Square Meter of all Houses : "+ houseTypeService.getMeanHouseSquareMeters());
		System.out.println("Mean Square Meter of all Summery Houses : "+ houseTypeService.getMeanSummerySquareMeters());
		System.out.println("Mean Square Meter of all Villas : "+ houseTypeService.getMeanVillaSquareMeters());
		System.out.println("Mean Square Meter of all House types : "+ houseTypeService.getMeanAllHouseTypeSquareMeters());
		System.out.println();
		System.out.println("#######################################################");
		System.out.println();
		System.out.println("All types of houses to house type id, room count and living room count");
		System.out.println(houseTypeService.filterRoomAndLivingRoomCount());
		
		
		
	}

}
