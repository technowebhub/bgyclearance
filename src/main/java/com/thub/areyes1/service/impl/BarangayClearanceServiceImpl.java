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

public class BarangayClearanceServiceImpl extends BaseService implements BarangayClearanceService {

	private BarangayClearanceDao barangayClearanceDao;
	
	{
		barangayClearanceDao = new DaoFactory().getDao(DaoType.BGY_CLEARANCE_DAO);
	}
	
	public BarangayClearance saveClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return this.barangayClearanceDao.saveClearance(barangayClearance);
	}

	public boolean removeClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return this.barangayClearanceDao.removeClearance(barangayClearance);
	}

	public BarangayClearanceReport generateBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public BarangayClearanceReport generateAndSaveBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
