

import java.math.BigDecimal;

public class BaseHouseType {

	private Integer id;
	
	private BigDecimal price;
	
	private Double squareMeter;

	private Integer roomCount;
	
	private Integer livingRoomCount;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Double getSquareMeter() {
		return squareMeter;
	}

	public void setSquareMeter(Double squareMeter) {
		this.squareMeter = squareMeter;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public Integer getLivingRoomCount() {
		return livingRoomCount;
	}

	public void setLivingRoomCount(Integer livingRoomCount) {
		this.livingRoomCount = livingRoomCount;
	}

	public BaseHouseType(BigDecimal price, Double squareMeter, Integer roomCount, Integer livingRoomCount, Integer id) {
		super();
		this.price = price;
		this.squareMeter = squareMeter;
		this.roomCount = roomCount;
		this.livingRoomCount = livingRoomCount;
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseHouseType {price=" + price + ", squareMeter=" + squareMeter + ", roomCount=" + roomCount
				+ ", livingRoomCount=" + livingRoomCount + "}";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
