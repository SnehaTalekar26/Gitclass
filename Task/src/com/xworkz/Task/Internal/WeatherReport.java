package com.xworkz.Task.Internal;

public class WeatherReport {
    private String city;
    private int temperature;
    private boolean isRainy;

    public WeatherReport(String city, int temperature, boolean isRainy){
        this.city = city;
        this.temperature = temperature;
        this.isRainy = isRainy;
    }

    @Override
    public String toString(){
        return " WeatherReport city: " + this.city + " ,Temperature: " + this.temperature + "°C ,Rainy: " + this.isRainy;
    }
    @Override
    public int hashCode(){
        return 29;
    }
}
