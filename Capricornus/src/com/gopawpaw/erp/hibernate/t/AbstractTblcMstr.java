package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTblcMstr entity provides the base persistence definition of the
 * TblcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTblcMstr implements java.io.Serializable {

	// Fields

	private TblcMstrId id;
	private Boolean tblcActive;
	private Boolean tblcDelete;
	private String tblcDesc;
	private String tblcUser1;
	private String tblcUser2;
	private Date tblcModDate;
	private String tblcModUserid;
	private String tblcQadc01;
	private String tblcQadc02;
	private Double oidTblcMstr;

	// Constructors

	/** default constructor */
	public AbstractTblcMstr() {
	}

	/** full constructor */
	public AbstractTblcMstr(TblcMstrId id, Boolean tblcActive,
			Boolean tblcDelete, String tblcDesc, String tblcUser1,
			String tblcUser2, Date tblcModDate, String tblcModUserid,
			String tblcQadc01, String tblcQadc02, Double oidTblcMstr) {
		this.id = id;
		this.tblcActive = tblcActive;
		this.tblcDelete = tblcDelete;
		this.tblcDesc = tblcDesc;
		this.tblcUser1 = tblcUser1;
		this.tblcUser2 = tblcUser2;
		this.tblcModDate = tblcModDate;
		this.tblcModUserid = tblcModUserid;
		this.tblcQadc01 = tblcQadc01;
		this.tblcQadc02 = tblcQadc02;
		this.oidTblcMstr = oidTblcMstr;
	}

	// Property accessors

	public TblcMstrId getId() {
		return this.id;
	}

	public void setId(TblcMstrId id) {
		this.id = id;
	}

	public Boolean getTblcActive() {
		return this.tblcActive;
	}

	public void setTblcActive(Boolean tblcActive) {
		this.tblcActive = tblcActive;
	}

	public Boolean getTblcDelete() {
		return this.tblcDelete;
	}

	public void setTblcDelete(Boolean tblcDelete) {
		this.tblcDelete = tblcDelete;
	}

	public String getTblcDesc() {
		return this.tblcDesc;
	}

	public void setTblcDesc(String tblcDesc) {
		this.tblcDesc = tblcDesc;
	}

	public String getTblcUser1() {
		return this.tblcUser1;
	}

	public void setTblcUser1(String tblcUser1) {
		this.tblcUser1 = tblcUser1;
	}

	public String getTblcUser2() {
		return this.tblcUser2;
	}

	public void setTblcUser2(String tblcUser2) {
		this.tblcUser2 = tblcUser2;
	}

	public Date getTblcModDate() {
		return this.tblcModDate;
	}

	public void setTblcModDate(Date tblcModDate) {
		this.tblcModDate = tblcModDate;
	}

	public String getTblcModUserid() {
		return this.tblcModUserid;
	}

	public void setTblcModUserid(String tblcModUserid) {
		this.tblcModUserid = tblcModUserid;
	}

	public String getTblcQadc01() {
		return this.tblcQadc01;
	}

	public void setTblcQadc01(String tblcQadc01) {
		this.tblcQadc01 = tblcQadc01;
	}

	public String getTblcQadc02() {
		return this.tblcQadc02;
	}

	public void setTblcQadc02(String tblcQadc02) {
		this.tblcQadc02 = tblcQadc02;
	}

	public Double getOidTblcMstr() {
		return this.oidTblcMstr;
	}

	public void setOidTblcMstr(Double oidTblcMstr) {
		this.oidTblcMstr = oidTblcMstr;
	}

}