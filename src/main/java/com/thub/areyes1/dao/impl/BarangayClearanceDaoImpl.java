/**
 * Class File Name: BarangayClearanceDaoImpl.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
public class BarangayClearanceDaoImpl extends BaseDao
		implements
			BarangayClearanceDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.areyes1.dao.BarangayClearanceDao#saveClearance(com.thub.areyes1
	 * .obj.BarangayClearance)
	 */
	public BarangayClearance saveClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {

		try {
			// Check if id exist, if it does then it's an update
			if (barangayClearance.getId() == 0) {
				String insertSql = ""
						+ "INSERT INTO "
						+ " bgy_clearance "
						+ " (name,address,activity,building,ownership,manager_owner,assoc_president,second_endorsment,"
						+ "seconde_location)"
						+ "VALUES "
						+ " (?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = this.getConnection().prepareStatement(
						insertSql);
				ps.setString(1, barangayClearance.getBusinessName());
				ps.setString(2, barangayClearance.getAddress());
				ps.setString(3, "");
				ps.setString(4, "");
				ps.setString(5, barangayClearance.getOwnership());
				ps.setString(6, barangayClearance.getAssocHomeOwnerPresident());
				ps.setString(7, barangayClearance.getAssocHomeOwnerPresident());
				ps.setInt(8, 0);
				ps.setString(9, barangayClearance.getAddress());
				
				
				ps.execute();

			}
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new BarangayClearanceServiceException();
		}

		return barangayClearance;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.areyes1.dao.BarangayClearanceDao#removeClearance(com.thub.areyes1
	 * .obj.BarangayClearance)
	 */
	public boolean removeClearance(BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		try {
			// Check if id exist, if it does then it's an update
			if (barangayClearance.getId() == 0) {
				String insertSql = ""
						+ "DELETE FROM "
						+ " bgy_clearance "
						+ " WHERE id = ?";
				PreparedStatement ps = this.getConnection().prepareStatement(
						insertSql);
				ps.setInt(1, barangayClearance.getId());
			
				ps.execute();

			}
		} catch (SQLException ex) {
			System.out.println(ex);
			return false;
			
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.areyes1.dao.BarangayClearanceDao#generateBarangayReport(com.
	 * thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearanceReport generateBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.areyes1.dao.BarangayClearanceDao#generateAndSaveBarangayReport
	 * (com.thub.areyes1.obj.BarangayClearance)
	 */
	public BarangayClearanceReport generateAndSaveBarangayReport(
			BarangayClearance barangayClearance)
			throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
