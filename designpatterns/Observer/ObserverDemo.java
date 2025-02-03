package designpatterns.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation weather = new WeatherStation();
        Temperature phone = new Temperature("phone");
        Temperature Laptop = new Temperature("laptop");

        weather.attach(phone);
        weather.attach(Laptop);

        System.out.println("Weather Station temperature changes to 22 degree celcius");
        weather.setTemperature(22.0f);

        System.out.println("Weather Station temperature changes to 30 degree celcius");
        weather.setTemperature(30.0f);

        weather.detach(Laptop);

        System.out.println("Weather Station temperature changes to 18 degree celcius");
        weather.setTemperature(18.0f);

    }
}
