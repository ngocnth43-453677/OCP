enum Season {
    WINTER("Low", "Low"),
    SPRING("Medium", "Medium"),
    SUMMER("High", "High"),
    FALL("Medium", "High"),
    NOM("Wet");
    public String temperature;
    public String expectedVisitors;

    Season(String temperature, String expectedVisitors) {
        this.temperature = temperature;
        this.expectedVisitors = expectedVisitors;
    }

    Season(String temperature) {
        this.temperature = temperature;
    }
/*
    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    } ]

 */
}

public class TestEnum {
    public static void main(String[] args) {
        Season season = Season.NOM;
        //Season season = null;
        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(season.temperature + " temperature " + season.expectedVisitors + " expected visitors");
    }
}
