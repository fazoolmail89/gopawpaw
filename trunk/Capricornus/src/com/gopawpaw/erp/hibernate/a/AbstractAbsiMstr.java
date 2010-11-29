package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbsiMstr entity provides the base persistence definition of the
 * AbsiMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsiMstr implements java.io.Serializable {

	// Fields

	private AbsiMstrId id;
	private String absiVoyage;
	private String absiOrigin;
	private String absiPortDepart;
	private String absiPortArrive;
	private Date absiDueDate;
	private String absiContents;
	private Date absiModDate;
	private String absiModUserid;
	private String absiUser1;
	private String absiUser2;
	private String absiQadc01;
	private String absiQadc02;
	private String absiCarrierRef2;
	private Double oidAbsiMstr;

	// Constructors

	/** default constructor */
	public AbstractAbsiMstr() {
	}

	/** full constructor */
	public AbstractAbsiMstr(AbsiMstrId id, String absiVoyage,
			String absiOrigin, String absiPortDepart, String absiPortArrive,
			Date absiDueDate, String absiContents, Date absiModDate,
			String absiModUserid, String absiUser1, String absiUser2,
			String absiQadc01, String absiQadc02, String absiCarrierRef2,
			Double oidAbsiMstr) {
		this.id = id;
		this.absiVoyage = absiVoyage;
		this.absiOrigin = absiOrigin;
		this.absiPortDepart = absiPortDepart;
		this.absiPortArrive = absiPortArrive;
		this.absiDueDate = absiDueDate;
		this.absiContents = absiContents;
		this.absiModDate = absiModDate;
		this.absiModUserid = absiModUserid;
		this.absiUser1 = absiUser1;
		this.absiUser2 = absiUser2;
		this.absiQadc01 = absiQadc01;
		this.absiQadc02 = absiQadc02;
		this.absiCarrierRef2 = absiCarrierRef2;
		this.oidAbsiMstr = oidAbsiMstr;
	}

	// Property accessors

	public AbsiMstrId getId() {
		return this.id;
	}

	public void setId(AbsiMstrId id) {
		this.id = id;
	}

	public String getAbsiVoyage() {
		return this.absiVoyage;
	}

	public void setAbsiVoyage(String absiVoyage) {
		this.absiVoyage = absiVoyage;
	}

	public String getAbsiOrigin() {
		return this.absiOrigin;
	}

	public void setAbsiOrigin(String absiOrigin) {
		this.absiOrigin = absiOrigin;
	}

	public String getAbsiPortDepart() {
		return this.absiPortDepart;
	}

	public void setAbsiPortDepart(String absiPortDepart) {
		this.absiPortDepart = absiPortDepart;
	}

	public String getAbsiPortArrive() {
		return this.absiPortArrive;
	}

	public void setAbsiPortArrive(String absiPortArrive) {
		this.absiPortArrive = absiPortArrive;
	}

	public Date getAbsiDueDate() {
		return this.absiDueDate;
	}

	public void setAbsiDueDate(Date absiDueDate) {
		this.absiDueDate = absiDueDate;
	}

	public String getAbsiContents() {
		return this.absiContents;
	}

	public void setAbsiContents(String absiContents) {
		this.absiContents = absiContents;
	}

	public Date getAbsiModDate() {
		return this.absiModDate;
	}

	public void setAbsiModDate(Date absiModDate) {
		this.absiModDate = absiModDate;
	}

	public String getAbsiModUserid() {
		return this.absiModUserid;
	}

	public void setAbsiModUserid(String absiModUserid) {
		this.absiModUserid = absiModUserid;
	}

	public String getAbsiUser1() {
		return this.absiUser1;
	}

	public void setAbsiUser1(String absiUser1) {
		this.absiUser1 = absiUser1;
	}

	public String getAbsiUser2() {
		return this.absiUser2;
	}

	public void setAbsiUser2(String absiUser2) {
		this.absiUser2 = absiUser2;
	}

	public String getAbsiQadc01() {
		return this.absiQadc01;
	}

	public void setAbsiQadc01(String absiQadc01) {
		this.absiQadc01 = absiQadc01;
	}

	public String getAbsiQadc02() {
		return this.absiQadc02;
	}

	public void setAbsiQadc02(String absiQadc02) {
		this.absiQadc02 = absiQadc02;
	}

	public String getAbsiCarrierRef2() {
		return this.absiCarrierRef2;
	}

	public void setAbsiCarrierRef2(String absiCarrierRef2) {
		this.absiCarrierRef2 = absiCarrierRef2;
	}

	public Double getOidAbsiMstr() {
		return this.oidAbsiMstr;
	}

	public void setOidAbsiMstr(Double oidAbsiMstr) {
		this.oidAbsiMstr = oidAbsiMstr;
	}

}