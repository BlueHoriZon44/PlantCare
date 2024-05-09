package virtual_plant_care;

import java.util.HashMap;

public class Plant {
    private String name;
    private String type;
    private int healthLevel;
    private int waterLevel;
    private int sunlightLevel;

    public Plant(String name, String type) {
        this.name = name;
        this.type = type;
        this.healthLevel = 100;
        this.waterLevel = 50;
        this.sunlightLevel = 50;
    }

    public void waterPLant() {
        this.waterLevel += 30;
    }

    public void provideSunlight() {
        this.sunlightLevel += 20;
    }

    public void checkAndDisplayStatus() {
        System.out.println("Plant name: " + this.name);
        System.out.println("Plant type: " + this.type);
        System.out.println("Plants health: " + this.healthLevel);
        System.out.println("Plants water level: " + this.waterLevel);
        System.out.println("Plants sunlight level: " + this.sunlightLevel);
    }

    public static void main(String[] args) {
        HashMap<String, Plant> plantMap = new HashMap<>();

        Plant plant1 = new Plant("Cactus", "Cactacea");
        Plant plant2 = new Plant("Red Spider Lily", "Equinox Flower");
        plantMap.put(plant1.name, plant1);
        plantMap.put(plant2.name, plant2);

        Plant selectedPlant = plantMap.get("Cactus");
        Plant selectedPlant2 = plantMap.get("Red Spider Lily");
        selectedPlant.waterPLant();
        selectedPlant.provideSunlight();
        selectedPlant.checkAndDisplayStatus();
        selectedPlant2.waterPLant();
        selectedPlant2.provideSunlight();
        selectedPlant2.checkAndDisplayStatus();

    }

}
