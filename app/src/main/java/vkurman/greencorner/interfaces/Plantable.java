package vkurman.greencorner.interfaces;

public interface Plantable {
    /**
     * Returns months starting from 1.
     *
     * @return int[]
     */
    int[] plant();
    String planting();
    void setPlant(int[] months);
    void setPlanting(String description);
}