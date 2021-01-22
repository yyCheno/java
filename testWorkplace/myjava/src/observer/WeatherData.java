package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private float temperature;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		dataChange();
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
		dataChange();
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		dataChange();
	}
	public void dataChange() {
		notifyObserver();
	}
	public void setData(float temperature,float pressure,float humidity) {
		this.temperature =temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(getTemperature(), getPressure(), getHumidity());
		}
	}
}
