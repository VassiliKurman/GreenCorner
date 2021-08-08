package vkurman.greencorner.interfaces;

public interface Harvestable {
    /**
     * Returns months starting from 1.
     *
     * @return int[]
     */
    int[] harvest();
    String harvesting();

    /**
     * Months to harvest.
     *
     * @param months
     */
    void setHarvest(int[] months);

    /**
     * Harvesting description.
     *
     * @param description
     */
    void setHarvesting(String description);
}