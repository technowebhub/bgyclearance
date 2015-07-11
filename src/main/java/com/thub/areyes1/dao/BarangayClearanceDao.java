/**
 * Class File Name: BarangayClearanceDao.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao;

import java.util.List;

import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.obj.Barangay;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.obj.BarangayClearanceReport;

// TODO: Auto-generated Javadoc
/**
 * The Interface BarangayClearanceDao.
 */
public interface BarangayClearanceDao {
	
	/**
	 * Gets the barangay clearance data.
	 *
	 * @param id the id
	 * @return the barangay clearance data
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public BarangayClearance getBarangayClearanceData(int id) throws BarangayClearanceServiceException;
	
	/**
	 * Gets the all barangay clearance in range.
	 *
	 * @param from the from
	 * @param to the to
	 * @return the all barangay clearance in range
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public List<BarangayClearance> getAllBarangayClearanceInRange(int from, int to) throws BarangayClearanceServiceException;
	
	/**
	 * Gets the all barangay clearance.
	 *
	 * @return the all barangay clearance
	 * @throws BarangayClearanceServiceException the barangay clearance service exception
	 */
	public List<BarangayClearance> getAllBarangayClearance() throws BarangayClearanceServiceException;
	
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
