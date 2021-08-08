package vkurman.greencorner.model;

import vkurman.greencorner.interfaces.Growable;
import vkurman.greencorner.interfaces.Harvestable;
import vkurman.greencorner.interfaces.Waterable;

public abstract class Plant implements Growable, Waterable, Harvestable {

    private String name;
    private String variety;
    private String description;

    private String growing;
    private int[] water;
    private String watering;
    private int[] harvest;
    private String harvesting;

    public Plant(String name, String variety) {
        this.name = name;
        this.variety = variety;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getVariety() {
        return variety;
    }
    public void setVariety(String variety) {
        this.variety = variety;
    }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // Implemented methods
    @Override
    public String growing() { return growing; }
    @Override
    public void setGrowing(String description) { growing = description; }
    @Override
    public int[] water() { return water == null ? new int[0] : water; }
    @Override
    public String watering() { return watering; }
    @Override
    public void setWater(int[] frequency) { water = frequency; }
    @Override
    public void setWatering(String description) { watering = description; }
    @Override
    public int[] harvest() {
        return harvest == null ? new int[0] : harvest;
    }
    @Override
    public String harvesting() {
        return harvesting;
    }
    @Override
    public void setHarvest(int[] months) { harvest = months; }
    @Override
    public void setHarvesting(String description) { harvesting = description; }
}