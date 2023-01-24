
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreateHouseType {
	
	House house1 = new House(BigDecimal.valueOf(100000), (double) 56, 3, 1,0);
	House house2 = new House(BigDecimal.valueOf(200000), (double) 120, 2, 1,1);
	House house3 = new House(BigDecimal.valueOf(300000), (double) 96, 2, 1,2);
	
	Summery summery1 = new Summery(BigDecimal.valueOf(100000), (double) 165, 5, 2,3);
	Summery summery2 = new Summery(BigDecimal.valueOf(200000), (double) 140, 8, 1,4);
	Summery summery3 = new Summery(BigDecimal.valueOf(300000), (double) 180, 6, 1,5);
	
	Villa villa1 = new Villa(BigDecimal.valueOf(600000), (double) 156, 5, 2,6);
	Villa villa2 = new Villa(BigDecimal.valueOf(1000000), (double) 180, 6, 3,7);
	Villa villa3 = new Villa(BigDecimal.valueOf(2500000), (double) 220, 8, 2,10);
	
	public List<House> getHouseList(){
		List<House> houseList = new ArrayList<>();
		houseList.add(house1);
		houseList.add(house2);
		houseList.add(house3);
		return houseList;
	}
	public List<Summery> getSummeryList(){
		List<Summery> summeryList = new ArrayList<>();
		summeryList.add(summery1);
		summeryList.add(summery2);
		summeryList.add(summery3);
		return summeryList;
	}
	public List<Villa> getVillaList(){
		List<Villa> houseList = new ArrayList<>();
		houseList.add(villa1);
		houseList.add(villa2);
		houseList.add(villa3);
		return houseList;
	}
	
}
