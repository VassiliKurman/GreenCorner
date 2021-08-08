package vkurman.greencorner.interfaces;

public interface Feedable {

    /**
     * Returns months starting from 1.
     *
     * @return int[]
     */
    int[] feed();
    String feeding();
    void setFeed(int[] months);
    void setFeeding(String description);
}