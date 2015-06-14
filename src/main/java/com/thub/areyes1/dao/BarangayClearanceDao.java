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

public interface BarangayClearanceDao {
	public BarangayClearance saveClearance(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	public boolean removeClearance(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	public BarangayClearanceReport generateBarangayReport(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	public BarangayClearanceReport generateAndSaveBarangayReport(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
}
