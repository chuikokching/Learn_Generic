package uni.due.Threads.Notification.Weather;

public class Weather {

    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Weather(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "生成天气数据Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
