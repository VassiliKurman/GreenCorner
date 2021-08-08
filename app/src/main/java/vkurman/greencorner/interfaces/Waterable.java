package vkurman.greencorner.interfaces;

public interface Waterable {
    /**
     * Returns frequency of watering, where [0] is min and [1] is max days.
     *
     * @return int[]
     */
    int[] water();
    String watering();
    void setWater(int[] frequency);
    void setWatering(String description);
}