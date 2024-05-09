package virtual_plant_care;

public class PlantModle {
    private String name;
    private int waterIncrement;
    private int sunlightIncrement;

    public PlantModle(String name, int waterIncrement, int sunlightIncrement) {
        this.name = name;
        this.waterIncrement = waterIncrement;
        this.sunlightIncrement = sunlightIncrement;
    }

    public String getName() {
        return name;
    }

    public int getWaterIncrement() {
        return waterIncrement;
    }

    public int getSunlightIncrement() {
        return sunlightIncrement;
    }
}
