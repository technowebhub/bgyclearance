/**
 * Class File Name: BarangayClearanceReport.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

import net.sf.jasperreports.engine.JasperPrint;

// TODO: Auto-generated Javadoc
/**
 * The Class BarangayClearanceReport.
 */
public class BarangayClearanceReport {

	/** The id. */
	private int id;
	
	/** The barangay clearance. */
	private BarangayClearance barangayClearance;
	
	/** The barangay clearance print. */
	private JasperPrint barangayClearancePrint;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the barangay clearance.
	 *
	 * @return the barangay clearance
	 */
	public BarangayClearance getBarangayClearance() {
		return barangayClearance;
	}
	
	/**
	 * Sets the barangay clearance.
	 *
	 * @param barangayClearance the new barangay clearance
	 */
	public void setBarangayClearance(BarangayClearance barangayClearance) {
		this.barangayClearance = barangayClearance;
	}
	
	/**
	 * Gets the barangay clearance print.
	 *
	 * @return the barangay clearance print
	 */
	public JasperPrint getBarangayClearancePrint() {
		return barangayClearancePrint;
	}
	
	/**
	 * Sets the barangay clearance print.
	 *
	 * @param barangayClearancePrint the new barangay clearance print
	 */
	public void setBarangayClearancePrint(JasperPrint barangayClearancePrint) {
		this.barangayClearancePrint = barangayClearancePrint;
	}
	
}
