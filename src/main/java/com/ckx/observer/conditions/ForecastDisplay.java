package com.ckx.observer.conditions;

import com.ckx.observer.elements.DisplayElement;
import com.ckx.observer.observers.Observer;
import com.ckx.observer.subjects.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserve(this);
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}

}
