package builder;

public class Cilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonHouse commonHouse = new CommonHouse();
		HouseDiector houseDiector = new HouseDiector(commonHouse);
		House house = houseDiector.constructHouse();
		HightBuilding hightBuilding = new HightBuilding();
		houseDiector.sethouseBuilder(hightBuilding);
		houseDiector.constructHouse();
	}

}
