/**
 * Class File Name: BarangayClearanceReport.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

import net.sf.jasperreports.engine.JasperPrint;

public class BarangayClearanceReport {

	private int id;
	
	private BarangayClearance barangayClearance;
	private JasperPrint barangayClearancePrint;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BarangayClearance getBarangayClearance() {
		return barangayClearance;
	}
	public void setBarangayClearance(BarangayClearance barangayClearance) {
		this.barangayClearance = barangayClearance;
	}
	public JasperPrint getBarangayClearancePrint() {
		return barangayClearancePrint;
	}
	public void setBarangayClearancePrint(JasperPrint barangayClearancePrint) {
		this.barangayClearancePrint = barangayClearancePrint;
	}
	
}
