/**
 * Class File Name: BarangayClearanceDao.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao;

import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.obj.BarangayClearanceReport;

/**
 * The Interface BarangayClearanceDao.
 */
public interface BarangayClearanceDao {
	
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
}
