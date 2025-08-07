package aSortVisualiser;

import javax.swing.JFrame;
/**
 * The main class for the sort viusaliser FUI
 * @author csanad
 */

import sortVisualiser.algorithms.InsertionSort;
 public class SortVisualiser {
	public static final WIN_WIDTH = 1280;
	public static final WIN_HEIGHT = 720;
	
	private JFrame window;
	private SortArray sortArray;
	private Shuffle shuffler = new Shuffle();
	
	private ArrayList<ISortAlgorithm> SortQueue;
	
	/**
	 * Creates the GUI
	 */
	public SortVisualiser() {
		window = new JFrame("Sort Visualiser");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sortArray = new SortArray();
		window.add(sortArray);
		window.pack();
		window.setVisible(true);
		
		sortQueue = new ArrayList<>();
		sortQueue.add(new SelectionSort());
		sortQueue.add(new InsertionSort());
		sortQueue.add(new BubbleSort());
	}
	private void highlightArray() {
		for (int i = 0; i < sortArray.arraySize(); i++) {
			sortArray.swapUpdate(i, i);	
	}
}
	private void shuffleAndWait() {
		shuffler.runSort(sortArray);
		sortArray.resetColours();
		sleepFor(secondToNano(2));
	}
	public void run() {
		for (ISortAlgorithm algorithm : sortQueu) {
			sleepFor(secondsToNano(2) );
			shuffleAndWait();
			algorithm.runSort(sortArray);
			sortArray.resetColours();
			highlightArray();
			sortArray.resetColours();
		}
	 }
	public static void main(String... args) {
		SortVisualiser sortVisualiser = new SortVisualiser();
	
	}
}
