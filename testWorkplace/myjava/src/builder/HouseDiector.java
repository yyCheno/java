package builder;

public class HouseDiector {
	HouseBuilder houseBuilder = null;
	public HouseDiector(HouseBuilder houseBuilder) {
		// TODO Auto-generated constructor stub
		this.houseBuilder = houseBuilder;
	}
	public void sethouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	public House constructHouse() {
		houseBuilder.buildBase();
		houseBuilder.buildWall();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
}
