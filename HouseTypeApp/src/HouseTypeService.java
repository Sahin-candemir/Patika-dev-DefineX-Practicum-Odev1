import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HouseTypeService {

	CreateHouseType createHouseType = new CreateHouseType();

	public BigDecimal getTotalHousePrice() {

		List<House> houseList = createHouseType.getHouseList();
		Function<House, BigDecimal> mapper = house->house.getPrice();
		return houseList.stream()
				.map(mapper)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public BigDecimal getTotalSummeryPrice() {

		List<Summery> summeryList = createHouseType.getSummeryList();
		
		Function<Summery, BigDecimal> mapper = summery->summery.getPrice();
		return summeryList.stream()
				.map(mapper)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	public BigDecimal getTotalVillaPrice() {

		List<Villa> villaList = createHouseType.getVillaList();
		
		Function<Villa, BigDecimal> mapper = villa->villa.getPrice();
		return villaList.stream()
				.map(mapper)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public BigDecimal getTotalAllHouseTypePrice() {	
		return getTotalHousePrice().add(getTotalSummeryPrice()).add(getTotalVillaPrice());
	}
	
	public Double getMeanHouseSquareMeters() {
		List<House> houseList = createHouseType.getHouseList();

		Long houseCount = houseList.stream().count();
		return houseList.stream().mapToDouble(house -> house.getSquareMeter()).sum() /houseCount;
	}
	public Double getMeanSummerySquareMeters() {
		List<Summery> summeryList = createHouseType.getSummeryList();

		Long summeryCount = summeryList.stream().count();
		return summeryList.stream().mapToDouble(summery -> summery.getSquareMeter()).sum() /summeryCount;
	}
	public Double getMeanVillaSquareMeters() {
		List<Villa> villaList = createHouseType.getVillaList();

		Long villaCount = villaList.stream().count();
		return villaList.stream().mapToDouble(villa -> villa.getSquareMeter()).sum() /villaCount;
	}
	
	public double getMeanAllHouseTypeSquareMeters() {
		List<House> houseList = createHouseType.getHouseList();
		List<Summery> summeryList = createHouseType.getSummeryList();
		List<Villa> villaList = createHouseType.getVillaList();
		
		double totalSquareMeters =Double.sum(houseList.stream().mapToDouble(house -> house.getSquareMeter()).sum(),summeryList.stream().mapToDouble(summery -> summery.getSquareMeter()).sum()) ;
		totalSquareMeters = Double.sum(totalSquareMeters, villaList.stream().mapToDouble(villa -> villa.getSquareMeter()).sum());
		Long totalCount = houseList.stream().count()+summeryList.stream().count()+villaList.stream().count();
		return totalSquareMeters/totalCount;
	}
	public Map<Integer, String> filterRoomAndLivingRoomCount(){
		Map<Integer, String> s= new HashMap<>();
		List<BaseHouseType> a = new ArrayList<>();
		List<House> houseList = createHouseType.getHouseList();
		List<Summery> summeryList = createHouseType.getSummeryList();
		List<Villa> villaList = createHouseType.getVillaList();
		a.addAll(villaList);
		a.addAll(houseList);
		a.addAll(summeryList);
		for(BaseHouseType i : a) {
			s.put(i.getId(),i.getRoomCount().toString()+"+"+i.getLivingRoomCount().toString());
		}
		
		return s;
	}
	/*	public List<BaseHouseType> filterRoomAndLivingRoomCount(Integer odas, float salons){
		Map<String, List<BaseHouseType>> s= new HashMap<>();
		List<BaseHouseType> a = new ArrayList<>();
		List<House> houseList = createHouseType.getHouseList().stream().filter(house->house.getRoomCount().equals(odas) && house.getLivingRoomCount()==salons).collect(Collectors.toList());
		List<Summery> summeryList = createHouseType.getSummeryList().stream().filter(summery->summery.getRoomCount().equals(odas) && summery.getLivingRoomCount()==salons).collect(Collectors.toList());
		List<Villa> villaList = createHouseType.getVillaList().stream().filter(villa->villa.getRoomCount().equals(odas) && villa.getLivingRoomCount()==salons).collect(Collectors.toList());
		a.addAll(villaList);
		a.addAll(houseList);
		a.addAll(summeryList);
		("2+1", "house2")
		houseList.contains(houseList)
		return a;
	}
	*/
}
