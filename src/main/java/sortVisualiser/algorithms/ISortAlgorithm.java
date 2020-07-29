package sortVisualiser.algorithms;

import sortVisualiser.SortArray;

/**
 * Base interface for the sort algorithms

 */
public interface ISortAlgorithm 
{
    public String getName();
    public long getDelay();
    public void runSort(SortArray array);
}
