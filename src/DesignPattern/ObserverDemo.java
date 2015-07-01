package DesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
}
interface Observer {
	public void update(float temp, float humidity, float pressure);
}
interface DisplayElement {
	public void display();
}
class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	public void notifyObserver() {
		for(int i =0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	public void measurementChanged() {
		notifyObserver();
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
        display();
	}
	public void display() {
		System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
	}
}
public class ObserverDemo {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 78, 40.4f);
	}
}
