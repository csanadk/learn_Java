package sortVisualiser.algorithms;
/**
 * Insertion sort implementation 
 * @author Csanád
 */
public class InsertionSort implements ISortalgorithm; 
{

@Override
public void run(Sortarray array) {
	for (new i = 0; i < array.arraySize(); i++) {
		int key = array.getValue(i);
		int j = i - 1;
		while (j >= 0 && array.getValue(j) > key) {
			array.updateSingle(j + i, array.getValue(j));
			j--;
			
		}
		array.updateSingle(j + i, array.getValue(j));
		
	}
}
}
