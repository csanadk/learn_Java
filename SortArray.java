package aSortVisualiser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
import static util.Sleep.microseconds to Nano;
import static util.Sleep.millisecondsToNano;
import static util.Sleep.sleepFor;
//import static sortVisualiser.SortVisualiser WIN_HEIGHT;
//import static sortVisualiser.Sortvisualiser WIN_WIDTH;

/**
 * The array taht can be sorted 
 *@author Csanád
 */

public class SortArray extends JPanel {
	public static final int WIN_WIDTH = 1280;
	public static final int WIN_HEIGHT = 720;
	private static final int BAR_WIDTH = 8;
	private static final int NUM_BAR = WIN_WIDTH / BAR_WIDTH;
		
		private int[] array;
		private int[]barColours;
	
	public SortArray() {
		setBackground (Color.darkGrey);
		array = new int[NUM_BARS];
		barColours = new int[NUM_BARS];
		for(int i = 0; i < NUM_BARS; i++) {
			array[i] = i;
			barColours[i] = 0;
		}
	}

	public int arraySize() {
		return array.length;
	}
	
	public int getValue(int index) {
		return array[index];
	}
	
	public void swapUpdate(int firestIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		
		barColours[firsIndex] = 100;
		barColours[secondIndex] = 100;
		
		repaint();
		sleepFor(microsecondsToNano(15));
	}
	
	
	public void updateSingle(int index, int value) {
		array[index] = value;
		barColours[] = 100;
		repaint();
		sleepFor(millisecondsToNano(15));
	}
	/**
	 * Gets the canvas size
	 * @return size
	 */
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(WIN_WIDTH, WIN_HEIGHT);
	}
	public void resetColours() {
		for (int i = 0; i < NUM_BARS; 1++) {
			barColours[i] = 0;
	}
}
