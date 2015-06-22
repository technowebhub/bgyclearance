/**
 * Class File Name: BarangayClearanceDaoImpl.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao.impl;

import org.springframework.stereotype.Repository;

import com.thub.areyes1.dao.BarangayClearanceDao;
import com.thub.areyes1.dao.BaseDao;
import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.obj.BarangayClearanceReport;

/**
 * The Class BarangayClearanceDaoImpl.
 */
@Repository
public class BarangayClearanceDaoImpl extends BaseDao implements BarangayClearanceDao {
	
	/* (non-Javadoc)
	 * @see com.thub.areyes1.dao.BarangayClearanceDao#saveClearance(com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearance saveClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		
		//	Check if id exist, if it does then it's an update
		if(barangayClearance.getId() == 0) {
			
			String insertSql = "";
			this.getJdbcTemplate().execute(insertSql);
		}
		
		return barangayClearance;
		
	}

	/* (non-Javadoc)
	 * @see com.thub.areyes1.dao.BarangayClearanceDao#removeClearance(com.thub.areyes1.obj.BarangayClearance)
	 */
	public boolean removeClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.thub.areyes1.dao.BarangayClearanceDao#generateBarangayReport(com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearanceReport generateBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.thub.areyes1.dao.BarangayClearanceDao#generateAndSaveBarangayReport(com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearanceReport generateAndSaveBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
