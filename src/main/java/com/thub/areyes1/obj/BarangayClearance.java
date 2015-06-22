/**
 * Class File Name: BarangayClearance.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.obj;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.thub.areyes1.exception.BarangayClearanceValidationException;

/**
 * The Class BarangayClearance.
 */
public class BarangayClearance {
	
	/** The barangay. */
	private Barangay barangay;
	
	/** The id. */
	private int id;
	
	/** The control number. */
	private Integer controlNumber;
	
	/** The barangay clearance type. */
	private BarangayClearanceType barangayClearanceType;
	
	/** The current date. */
	private Date currentDate;
	
	/** The business name. */
	private String businessName;
	
	/** The address. */
	private String address;
	
	/** The type of business. */
	private String typeOfBusiness;
	
	/** The building type. */
	private BuildingType buildingType;
	
	/** The capitalization. */
	private String capitalization;
	
	/** The ownership. */
	private String ownership;
	
	/** The assoc home owner president. */
	private String assocHomeOwnerPresident;
	
	/** The applicant member of. */
	private String applicantMemberOf;
	
	/** The second endorsment number. */
	private Integer secondEndorsmentNumber;
	
	/** The or number. */
	private Integer orNumber;
	
	/** The amount paid. */
	private Float amountPaid;
	
	/** The data. */
	private Map<String,Object> data = new HashMap<String, Object>();
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the barangay clearance type.
	 *
	 * @return the barangay clearance type
	 */
	public BarangayClearanceType getBarangayClearanceType() {
		return barangayClearanceType;
	}
	
	/**
	 * Sets the barangay clearance type.
	 *
	 * @param barangayClearanceType the new barangay clearance type
	 */
	public void setBarangayClearanceType(BarangayClearanceType barangayClearanceType) throws BarangayClearanceValidationException {
		
		if(barangayClearanceType.equals("")) {
			throw new BarangayClearanceValidationException("Please enter a barangay clearance type");
		}
		this.data.put("CLEARANCE_TYPE",barangayClearanceType);
		this.barangayClearanceType = barangayClearanceType;
	}
	
	/**
	 * Gets the current date.
	 *
	 * @return the current date
	 */
	public Date getCurrentDate() {
		return currentDate;
	}
	
	/**
	 * Sets the current date.
	 *
	 * @param currentDate the new current date
	 */
	public void setCurrentDate(Date currentDate) throws BarangayClearanceValidationException {
		if(currentDate.equals("")) {
			throw new BarangayClearanceValidationException("Please enter a barangay clearance type");
		}
		this.data.put("CURRENT_DATE",currentDate);
		this.currentDate = currentDate;
	}
	
	/**
	 * Gets the business name.
	 *
	 * @return the business name
	 */
	public String getBusinessName() {
		return businessName;
	}
	
	/**
	 * Sets the business name.
	 *
	 * @param businessName the new business name
	 */
	public void setBusinessName(String businessName) throws BarangayClearanceValidationException {
		this.data.put("BUSINESS_NAME",businessName);
		this.businessName = businessName;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) throws BarangayClearanceValidationException{
		this.data.put("ADDRESS",address);
		this.address = address;
	}
	
	/**
	 * Gets the type of business.
	 *
	 * @return the type of business
	 */
	public String getTypeOfBusiness() {
		return typeOfBusiness;
	}
	
	/**
	 * Sets the type of business.
	 *
	 * @param typeOfBusiness the new type of business
	 */
	public void setTypeOfBusiness(String typeOfBusiness) throws BarangayClearanceValidationException{
		this.data.put("TYPE_OF_BUSINESS",typeOfBusiness);
		this.typeOfBusiness = typeOfBusiness;
	}
	
	/**
	 * Gets the building type.
	 *
	 * @return the building type
	 */
	public BuildingType getBuildingType() {
		return buildingType;
	}
	
	/**
	 * Sets the building type.
	 *
	 * @param buildingType the new building type
	 */
	public void setBuildingType(BuildingType buildingType) throws BarangayClearanceValidationException {
		this.data.put("BUILDING_TYPE",buildingType);
		this.buildingType = buildingType;
	}
	
	/**
	 * Gets the capitalization.
	 *
	 * @return the capitalization
	 */
	public String getCapitalization() {
		return capitalization;
	}
	
	/**
	 * Sets the capitalization.
	 *
	 * @param capitalization the new capitalization
	 */
	public void setCapitalization(String capitalization) throws BarangayClearanceValidationException{
		this.data.put("CAPITALIZATION",capitalization);
		this.capitalization = capitalization;
	}
	
	/**
	 * Gets the ownership.
	 *
	 * @return the ownership
	 */
	public String getOwnership() {
		return ownership;
	}
	
	/**
	 * Sets the ownership.
	 *
	 * @param ownership the new ownership
	 */
	public void setOwnership(String ownership) throws BarangayClearanceValidationException{
		this.data.put("OWNERSHIP",ownership);
		this.ownership = ownership;
	}
	
	/**
	 * Gets the assoc home owner president.
	 *
	 * @return the assoc home owner president
	 */
	public String getAssocHomeOwnerPresident() {
		return assocHomeOwnerPresident;
	}
	
	/**
	 * Sets the assoc home owner president.
	 *
	 * @param assocHomeOwnerPresident the new assoc home owner president
	 */
	public void setAssocHomeOwnerPresident(String assocHomeOwnerPresident) throws BarangayClearanceValidationException {
		this.data.put("ASSOC_HOME_OWNER_PRESIDENT",assocHomeOwnerPresident);
		this.assocHomeOwnerPresident = assocHomeOwnerPresident;
	}
	
	/**
	 * Gets the applicant member of.
	 *
	 * @return the applicant member of
	 */
	public String getApplicantMemberOf() {
		return applicantMemberOf;
	}
	
	/**
	 * Sets the applicant member of.
	 *
	 * @param applicantMemberOf the new applicant member of
	 */
	public void setApplicantMemberOf(String applicantMemberOf) throws BarangayClearanceValidationException{
		this.data.put("APPLICANT_MEMBER_OF",applicantMemberOf);
		this.applicantMemberOf = applicantMemberOf;
	}
	
	/**
	 * Gets the second endorsment number.
	 *
	 * @return the second endorsment number
	 */
	public Integer getSecondEndorsmentNumber() {
		return secondEndorsmentNumber;
	}
	
	/**
	 * Sets the second endorsment number.
	 *
	 * @param secondEndorsmentNumber the new second endorsment number
	 */
	public void setSecondEndorsmentNumber(Integer secondEndorsmentNumber) throws BarangayClearanceValidationException{
		this.data.put("SECOND_ENDORSMENT_NUMBER",secondEndorsmentNumber);
		this.secondEndorsmentNumber = secondEndorsmentNumber;
	}
	
	/**
	 * Gets the or number.
	 *
	 * @return the or number
	 */
	public Integer getOrNumber() {
		return orNumber;
	}
	
	/**
	 * Sets the or number.
	 *
	 * @param orNumber the new or number
	 */
	public void setOrNumber(Integer orNumber) throws BarangayClearanceValidationException{
		this.data.put("OR_NUMBER",orNumber);
		this.orNumber = orNumber;
	}
	
	/**
	 * Gets the amount paid.
	 *
	 * @return the amount paid
	 */
	public Float getAmountPaid() {
		return amountPaid;
	}
	
	/**
	 * Sets the amount paid.
	 *
	 * @param amountPaid the new amount paid
	 */
	public void setAmountPaid(Float amountPaid) throws BarangayClearanceValidationException {
		this.data.put("AMOUNT_PAID",amountPaid);
		this.amountPaid = amountPaid;
	}
	
	/**
	 * Gets the barangay.
	 *
	 * @return the barangay
	 */
	public Barangay getBarangay() {
		return barangay;
	}
	
	/**
	 * Sets the barangay.
	 *
	 * @param barangay the new barangay
	 */
	public void setBarangay(Barangay barangay) throws BarangayClearanceValidationException {
		this.data.put("BARANGAY",barangay);
		this.barangay = barangay;
	}
	
	/**
	 * Gets the control number.
	 *
	 * @return the control number
	 */
	public Integer getControlNumber() {
		return controlNumber;
	}
	
	/**
	 * Sets the control number.
	 *
	 * @param controlNumber the new control number
	 */
	public void setControlNumber(Integer controlNumber) throws BarangayClearanceValidationException {
		this.data.put("CONTROL_NUMBER",controlNumber);
		this.controlNumber = controlNumber;
	}
	
	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Map<String, Object> getData() {
		return data;
	}
	
}
