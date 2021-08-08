package vkurman.greencorner.interfaces;

public interface Sowable {
    /**
     * Returns months starting from 1.
     *
     * @return int[]
     */
    int[] sow();
    String sowing();
    void setSow(int[] months);
    void setSowing(String description);
}