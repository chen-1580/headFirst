package com.ckx.observer.station;

import com.ckx.observer.conditions.CurrentConditionsDisplay;
import com.ckx.observer.conditions.ForecastDisplay;
import com.ckx.observer.conditions.StatisticsDisplay;
import com.ckx.observer.data.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
