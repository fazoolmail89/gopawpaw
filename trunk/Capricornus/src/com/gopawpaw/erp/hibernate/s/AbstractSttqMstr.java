package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSttqMstr entity provides the base persistence definition of the
 * SttqMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSttqMstr implements java.io.Serializable {

	// Fields

	private SttqMstrId id;
	private String sttqDesc;
	private String sttqQadc01;
	private String sttqQadc02;
	private String sttqModUserid;
	private Date sttqModDate;
	private String sttqUser1;
	private String sttqUser2;
	private Double oidSttqMstr;

	// Constructors

	/** default constructor */
	public AbstractSttqMstr() {
	}

	/** full constructor */
	public AbstractSttqMstr(SttqMstrId id, String sttqDesc, String sttqQadc01,
			String sttqQadc02, String sttqModUserid, Date sttqModDate,
			String sttqUser1, String sttqUser2, Double oidSttqMstr) {
		this.id = id;
		this.sttqDesc = sttqDesc;
		this.sttqQadc01 = sttqQadc01;
		this.sttqQadc02 = sttqQadc02;
		this.sttqModUserid = sttqModUserid;
		this.sttqModDate = sttqModDate;
		this.sttqUser1 = sttqUser1;
		this.sttqUser2 = sttqUser2;
		this.oidSttqMstr = oidSttqMstr;
	}

	// Property accessors

	public SttqMstrId getId() {
		return this.id;
	}

	public void setId(SttqMstrId id) {
		this.id = id;
	}

	public String getSttqDesc() {
		return this.sttqDesc;
	}

	public void setSttqDesc(String sttqDesc) {
		this.sttqDesc = sttqDesc;
	}

	public String getSttqQadc01() {
		return this.sttqQadc01;
	}

	public void setSttqQadc01(String sttqQadc01) {
		this.sttqQadc01 = sttqQadc01;
	}

	public String getSttqQadc02() {
		return this.sttqQadc02;
	}

	public void setSttqQadc02(String sttqQadc02) {
		this.sttqQadc02 = sttqQadc02;
	}

	public String getSttqModUserid() {
		return this.sttqModUserid;
	}

	public void setSttqModUserid(String sttqModUserid) {
		this.sttqModUserid = sttqModUserid;
	}

	public Date getSttqModDate() {
		return this.sttqModDate;
	}

	public void setSttqModDate(Date sttqModDate) {
		this.sttqModDate = sttqModDate;
	}

	public String getSttqUser1() {
		return this.sttqUser1;
	}

	public void setSttqUser1(String sttqUser1) {
		this.sttqUser1 = sttqUser1;
	}

	public String getSttqUser2() {
		return this.sttqUser2;
	}

	public void setSttqUser2(String sttqUser2) {
		this.sttqUser2 = sttqUser2;
	}

	public Double getOidSttqMstr() {
		return this.oidSttqMstr;
	}

	public void setOidSttqMstr(Double oidSttqMstr) {
		this.oidSttqMstr = oidSttqMstr;
	}

}