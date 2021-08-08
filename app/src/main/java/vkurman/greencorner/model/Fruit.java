package vkurman.greencorner.model;

import vkurman.greencorner.interfaces.Plantable;
import vkurman.greencorner.interfaces.Prunable;

public class Fruit extends Plant implements Plantable, Prunable {

    private int[] plant;
    private String planting;
    private int[] prune;
    private String pruning;

    public Fruit(String name, String variety) {
       super(name, variety);
    }

    @Override
    public int[] prune() {
        return prune == null ? new int[0] : prune;
    }
    @Override
    public String pruning() { return pruning; }
    @Override
    public void setPrune(int[] months) { prune = months; }
    @Override
    public void setPruning(String description) { pruning = description; }
    @Override
    public int[] plant() {
        return plant == null ? new int[0] : plant;
    }
    @Override
    public String planting() {
        return planting;
    }
    @Override
    public void setPlant(int[] months) { plant = months; }
    @Override
    public void setPlanting(String description) { planting = description; }
}