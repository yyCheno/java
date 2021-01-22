package observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditions currentConditions = new CurrentConditions();
		weatherData.registerObserver(currentConditions);
		
		weatherData.setData(10f, 100f, 3f);
	}

}
