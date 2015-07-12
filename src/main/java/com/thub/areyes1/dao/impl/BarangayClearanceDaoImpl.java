/**
 * Class File Name: BarangayClearanceDaoImpl.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.thub.areyes1.dao.BarangayClearanceDao;
import com.thub.areyes1.dao.BaseDao;
import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.exception.BarangayClearanceValidationException;
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

		PreparedStatement ps;
		try {
			// Check if id exist, if it does then it's an update
			if (barangayClearance.getId() == 0) {
				String insertSql = ""
						+ "INSERT INTO "
						+ " bgy_clearance "
						+ " ("
						+ "	name,"
						+ "	address,"
						+ "	activity,"
						+ "	building,"
						+ "	ownership,"
						+ "	manager_owner,"
						+ "	assoc_president,"
						+ "	second_endorsment,"
						+ "	seconde_location,"
						+ "	rented,"
						+ "	new,"
						+ "	partnership,"
						+ "	singleprop,"
						+ "	others"
						+ ")"
						+ "VALUES "
						+ " (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ps = this.getConnection().prepareStatement(
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
				ps.setBoolean(10, barangayClearance.isRented());
				ps.setBoolean(11, barangayClearance.isForNew());
				ps.setBoolean(12, barangayClearance.isParntership());
				ps.setBoolean(13, barangayClearance.isSingleProprietorship());
				ps.setBoolean(14, barangayClearance.isOthers());

			}else {
				String updateSql = ""
						+ "UPDATE "
						+ " bgy_clearance "
						+ " set "
						+ "name = ?,"
						+ "address = ?,"
						+ "activity = ?,"
						+ "building =? ,"
						+ "ownership =?,"
						+ "manager_owner =?,"
						+ "assoc_president =? ,"
						+ "second_endorsment =?,"
						+ "seconde_location =?,"
						+ "amount = ?)"
						+ "WHERE  "
						+ " id = ? ";
				ps = this.getConnection().prepareStatement(
						updateSql);
				ps.setString(1, barangayClearance.getBusinessName());
				ps.setString(2, barangayClearance.getAddress());
				ps.setString(3, "");
				ps.setString(4, "");
				ps.setString(5, barangayClearance.getOwnership());
				ps.setString(6, barangayClearance.getAssocHomeOwnerPresident());
				ps.setString(7, barangayClearance.getAssocHomeOwnerPresident());
				ps.setInt(8, 0);
				ps.setString(9, barangayClearance.getAddress());
				ps.setString(10, String.valueOf(barangayClearance.getAmountPaid()));
				ps.setInt(11, barangayClearance.getId());
				
			}
			ps.execute();
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
	
	
	/* (non-Javadoc)
	 * @see com.thub.areyes1.dao.BarangayClearanceDao#getAllBarangayClearance()
	 */
	public List<BarangayClearance> getAllBarangayClearance()
			throws BarangayClearanceServiceException {
		
		List<BarangayClearance> listOfBgyClearance = new ArrayList<BarangayClearance>();
		try {
			// Check if id exist, if it does then it's an update
			
				String getAllsql = ""
						+ "SELECT * FROM "
						+ " bgy_clearance "
						+ " ";
				PreparedStatement ps = this.getConnection().prepareStatement(getAllsql);
				ps.execute();
				
				ResultSet rs = ps.getResultSet();
				while(rs.next()) {
					BarangayClearance bgyClearance = new BarangayClearance();
					bgyClearance.setId(rs.getInt("id"));
					bgyClearance.setControlNumber(rs.getInt("control_no"));
					bgyClearance.setBusinessName(rs.getString("name"));
					bgyClearance.setAddress(rs.getString("address"));
					bgyClearance.setAmountPaid(Float.valueOf(rs.getString("amount")));
					
					//bgyClearance.setApplicantMemberOf(rs.getString(""));
					//address = ?,activity = ?,building =? ,ownership =?,manager_owner =?,assoc_president =? ,second_endorsment =?,"
					listOfBgyClearance.add(bgyClearance);
				}

			
		} 
		catch (SQLException ex) {	System.out.println(ex);return null;}
		catch(BarangayClearanceValidationException bvex) {
			System.out.println(bvex);
			return null;
		}
		
		return listOfBgyClearance;
	}
	
	/* (non-Javadoc)
	 * @see com.thub.areyes1.dao.BarangayClearanceDao#getAllBarangayClearanceInRange(int, int)
	 */
	public List<BarangayClearance> getAllBarangayClearanceInRange(int from,
			int to) throws BarangayClearanceServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BarangayClearance getBarangayClearanceData(int id)
			throws BarangayClearanceServiceException {
		
		BarangayClearance bgyClearance = new BarangayClearance();
		try {
			// Check if id exist, if it does then it's an update
			
				String getAllsql = ""
						+ "SELECT * FROM "
						+ " bgy_clearance "
						+ "WHERE id = ?";
				PreparedStatement ps = this.getConnection().prepareStatement(getAllsql);
				ps.setInt(1, id);
				ps.execute();
				
				ResultSet rs = ps.getResultSet();
				while(rs.next()) {
					bgyClearance.setId(rs.getInt("id"));
					bgyClearance.setControlNumber(rs.getInt("control_no"));
					bgyClearance.setBusinessName(rs.getString("name"));
				}

			
		} 
		catch (SQLException ex) {	System.out.println(ex);return null;}
		catch(BarangayClearanceValidationException bvex) {
			System.out.println(bvex);
			return null;
		}
		
		return bgyClearance;
	}

}
