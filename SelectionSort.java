package sortVisualiser.algorithms;
import sortVisulaiser.SortArray;

/**
 * Selection sort implementation
 * @author Csanád
 */
public class SelectionSort implements ISortAlgorithm

@Override
public void runSort (SortArray array) {
	for (int i = 0; i < array.arraySize() - 1; i++) {
		int minIndex = i;
		for (int j = i + 1; j < array.arraySize(); j++)	{
			if(array.getValue(j) < array.getValue(minIndex)) {
				minIndex = j;
			}
		}
		array.sortUpdate(i, minIndex);
	}
}
