package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTrqMstr entity provides the base persistence definition of the
 * TrqMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrqMstr implements java.io.Serializable {

	// Fields

	private TrqMstrId id;
	private String trqDocType;
	private String trqDocRef;
	private String trqAddRef;
	private String trqMsgType;
	private String trqModUserid;
	private Date trqModDate;
	private String trqUser1;
	private String trqUser2;
	private String trqQadc01;
	private Double oidTrqMstr;

	// Constructors

	/** default constructor */
	public AbstractTrqMstr() {
	}

	/** full constructor */
	public AbstractTrqMstr(TrqMstrId id, String trqDocType, String trqDocRef,
			String trqAddRef, String trqMsgType, String trqModUserid,
			Date trqModDate, String trqUser1, String trqUser2,
			String trqQadc01, Double oidTrqMstr) {
		this.id = id;
		this.trqDocType = trqDocType;
		this.trqDocRef = trqDocRef;
		this.trqAddRef = trqAddRef;
		this.trqMsgType = trqMsgType;
		this.trqModUserid = trqModUserid;
		this.trqModDate = trqModDate;
		this.trqUser1 = trqUser1;
		this.trqUser2 = trqUser2;
		this.trqQadc01 = trqQadc01;
		this.oidTrqMstr = oidTrqMstr;
	}

	// Property accessors

	public TrqMstrId getId() {
		return this.id;
	}

	public void setId(TrqMstrId id) {
		this.id = id;
	}

	public String getTrqDocType() {
		return this.trqDocType;
	}

	public void setTrqDocType(String trqDocType) {
		this.trqDocType = trqDocType;
	}

	public String getTrqDocRef() {
		return this.trqDocRef;
	}

	public void setTrqDocRef(String trqDocRef) {
		this.trqDocRef = trqDocRef;
	}

	public String getTrqAddRef() {
		return this.trqAddRef;
	}

	public void setTrqAddRef(String trqAddRef) {
		this.trqAddRef = trqAddRef;
	}

	public String getTrqMsgType() {
		return this.trqMsgType;
	}

	public void setTrqMsgType(String trqMsgType) {
		this.trqMsgType = trqMsgType;
	}

	public String getTrqModUserid() {
		return this.trqModUserid;
	}

	public void setTrqModUserid(String trqModUserid) {
		this.trqModUserid = trqModUserid;
	}

	public Date getTrqModDate() {
		return this.trqModDate;
	}

	public void setTrqModDate(Date trqModDate) {
		this.trqModDate = trqModDate;
	}

	public String getTrqUser1() {
		return this.trqUser1;
	}

	public void setTrqUser1(String trqUser1) {
		this.trqUser1 = trqUser1;
	}

	public String getTrqUser2() {
		return this.trqUser2;
	}

	public void setTrqUser2(String trqUser2) {
		this.trqUser2 = trqUser2;
	}

	public String getTrqQadc01() {
		return this.trqQadc01;
	}

	public void setTrqQadc01(String trqQadc01) {
		this.trqQadc01 = trqQadc01;
	}

	public Double getOidTrqMstr() {
		return this.oidTrqMstr;
	}

	public void setOidTrqMstr(Double oidTrqMstr) {
		this.oidTrqMstr = oidTrqMstr;
	}

}