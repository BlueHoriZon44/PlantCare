package virtual_plant_care;

import java.util.HashMap;
import java.util.Map;

public class service {
    private Map<String, Plant> plantMap;

    public service() {
        this.plantMap = new HashMap<>();
    }

    public void addNewPlant(String name, String type, String PlantType) {
        Plant newPlant = new Plant(name, type);
        this.plantMap.put(name, newPlant);
    }

    public void waterASpesificPLant(String name) {
        Plant plant = this.plantMap.get(name);
        if (plant != null) {
            plant.waterPLant();
        }
    }

    public void provideSunlightToCertainPlant(String name) {
        Plant plant = this.plantMap.get(name);
        if (plant != null) {
            plant.provideSunlight();
        }
    }

    public void displayStatusOfAllPLants() {
        for (Plant plant : this.plantMap.values()) {
            plant.checkAndDisplayStatus();
        }
    }

}
