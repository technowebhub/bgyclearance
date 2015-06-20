/**
 * Class File Name: BarangayClearanceService.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.service;

import org.springframework.stereotype.Service;

import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.obj.BarangayClearanceReport;

public interface BarangayClearanceService {
	public BarangayClearance saveClearance(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	public boolean removeClearance(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	public BarangayClearanceReport generateBarangayReport(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;
	public BarangayClearanceReport generateAndSaveBarangayReport(BarangayClearance barangayClearance) throws BarangayClearanceServiceException;

}
