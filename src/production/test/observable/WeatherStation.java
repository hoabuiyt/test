package production.test.observable;

public class WeatherStation {
    public static void main( String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay xxx = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(89,65,30.5f);
    }

}
