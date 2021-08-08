package vkurman.greencorner.interfaces;

public interface Prunable {
    /**
     * Returns months starting from 1.
     *
     * @return int[]
     */
    int[] prune();
    String pruning();
    void setPrune(int[] months);
    void setPruning(String description);
}
