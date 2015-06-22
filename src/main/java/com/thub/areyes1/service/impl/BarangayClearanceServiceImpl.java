/**
 * Class File Name: BarangayClearanceServiceImpl.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thub.areyes1.dao.BarangayClearanceDao;
import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.factory.DaoFactory;
import com.thub.areyes1.factory.DaoType;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.obj.BarangayClearanceReport;
import com.thub.areyes1.service.BarangayClearanceService;
import com.thub.areyes1.service.BaseService;
import com.thub.areyes1.util.ReportUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class BarangayClearanceServiceImpl.
 */
@Service
public class BarangayClearanceServiceImpl extends BaseService implements BarangayClearanceService {
	
	/** The barangay clearance dao. */
	@Autowired
	private BarangayClearanceDao barangayClearanceDao;
	
	/* (non-Javadoc)
	 * @see com.thub.areyes1.service.BarangayClearanceService#saveClearance(com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearance saveClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return this.barangayClearanceDao.saveClearance(barangayClearance);
	}

	/* (non-Javadoc)
	 * @see com.thub.areyes1.service.BarangayClearanceService#removeClearance(com.thub.areyes1.obj.BarangayClearance)
	 */
	public boolean removeClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return this.barangayClearanceDao.removeClearance(barangayClearance);
	}

	/* (non-Javadoc)
	 * @see com.thub.areyes1.service.BarangayClearanceService#generateBarangayReport(com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearanceReport generateBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.thub.areyes1.service.BarangayClearanceService#generateAndSaveBarangayReport(com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearanceReport generateAndSaveBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		
		BarangayClearanceReport bgyClearanceRpt = new BarangayClearanceReport();
		
		//	Save and Generate Report!
		//this.saveClearance(barangayClearance);
		bgyClearanceRpt.setBarangayClearance(barangayClearance);
		bgyClearanceRpt.setBarangayClearancePrint(ReportUtil.generateJasperPrintReport(barangayClearance));
	
		return bgyClearanceRpt;
	}
	

}
