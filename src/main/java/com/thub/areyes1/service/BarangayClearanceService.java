/**
 * Class File Name: BarangayClearanceService.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.obj.BarangayClearanceReport;

/**
 * The Interface BarangayClearanceService.
 */
public interface BarangayClearanceService {
	
	/**
	 * Save clearance.
	 *
	 * @param barangayClearance the barangay clearance
	 * @return the barangay clearance
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public BarangayClearance saveClearance(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	
	/**
	 * Removes the clearance.
	 *
	 * @param barangayClearance the barangay clearance
	 * @return true, if successful
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public boolean removeClearance(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	
	/**
	 * Generate barangay report.
	 *
	 * @param barangayClearance the barangay clearance
	 * @return the barangay clearance report
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public BarangayClearanceReport generateBarangayReport(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	
	/**
	 * Generate and save barangay report.
	 *
	 * @param barangayClearance the barangay clearance
	 * @return the barangay clearance report
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public BarangayClearanceReport generateAndSaveBarangayReport(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	
	/**
	 * Gets all the Barangay Clearance
	 * @return
	 * @throws BarangayClearanceServiceException
	 */
	public List<BarangayClearance> getAllBarangayClearance() throws BarangayClearanceServiceException;
	public BarangayClearance getBarangayClearanceData(int id) throws BarangayClearanceServiceException;

}
