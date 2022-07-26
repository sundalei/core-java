package sample;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowTemperature = 25;
        int highTemperature = summer ? 45 : 35;

        return (temperature >= lowTemperature && temperature <= highTemperature);
    }
    
}
