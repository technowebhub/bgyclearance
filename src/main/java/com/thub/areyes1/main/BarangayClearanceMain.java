/**
 * Class File Name: BarangayClearanceMain.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.main;


import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.thub.areyes1.ui.BgyClearanceFrame;

/**
 * The Class BarangayClearanceMain.
 */
public class BarangayClearanceMain {

	/**
	 * The main BarangayClearanceMain constructor.
	 */
	public BarangayClearanceMain() {
		
		JFrame bgyClearanceFrame = new BgyClearanceFrame();
		bgyClearanceFrame.setLocationByPlatform(true);
		bgyClearanceFrame.setLocationRelativeTo(null);
		bgyClearanceFrame.setVisible(true);
		
	}
	
	/**
	 * This is the main class.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(
		            UIManager.getSystemLookAndFeelClassName());
			}catch(UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}catch(IllegalAccessException iae) {
				iae.printStackTrace();
			}catch(InstantiationException ie) {
				ie.printStackTrace();
			}
		
		new BarangayClearanceMain();
	}
}
