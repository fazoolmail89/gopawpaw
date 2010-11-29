package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMfrelMstr entity provides the base persistence definition of the
 * MfrelMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMfrelMstr implements java.io.Serializable {

	// Fields

	private MfrelMstrId id;
	private String mfrelQadc01;
	private String mfrelQadc02;
	private String mfrelQadc03;
	private String mfrelQadc04;
	private String mfrelQadc05;
	private Double mfrelQadd01;
	private Double mfrelQadd02;
	private Double mfrelQadd03;
	private Double mfrelQadd04;
	private Double mfrelQadd05;
	private Boolean mfrelQadl01;
	private Boolean mfrelQadl02;
	private Date mfrelQaddt01;
	private Date mfrelQaddt02;
	private String mfrelModUserid;
	private Date mfrelModDate;
	private String mfrelUser1;
	private String mfrelUser2;
	private Double oidMfrelMstr;

	// Constructors

	/** default constructor */
	public AbstractMfrelMstr() {
	}

	/** minimal constructor */
	public AbstractMfrelMstr(MfrelMstrId id, String mfrelQadc01,
			String mfrelQadc02, String mfrelQadc03, String mfrelQadc04,
			String mfrelQadc05, Double mfrelQadd01, Double mfrelQadd02,
			Double mfrelQadd03, Double mfrelQadd04, Double mfrelQadd05,
			Boolean mfrelQadl01, Boolean mfrelQadl02, String mfrelModUserid,
			Date mfrelModDate, String mfrelUser1, String mfrelUser2,
			Double oidMfrelMstr) {
		this.id = id;
		this.mfrelQadc01 = mfrelQadc01;
		this.mfrelQadc02 = mfrelQadc02;
		this.mfrelQadc03 = mfrelQadc03;
		this.mfrelQadc04 = mfrelQadc04;
		this.mfrelQadc05 = mfrelQadc05;
		this.mfrelQadd01 = mfrelQadd01;
		this.mfrelQadd02 = mfrelQadd02;
		this.mfrelQadd03 = mfrelQadd03;
		this.mfrelQadd04 = mfrelQadd04;
		this.mfrelQadd05 = mfrelQadd05;
		this.mfrelQadl01 = mfrelQadl01;
		this.mfrelQadl02 = mfrelQadl02;
		this.mfrelModUserid = mfrelModUserid;
		this.mfrelModDate = mfrelModDate;
		this.mfrelUser1 = mfrelUser1;
		this.mfrelUser2 = mfrelUser2;
		this.oidMfrelMstr = oidMfrelMstr;
	}

	/** full constructor */
	public AbstractMfrelMstr(MfrelMstrId id, String mfrelQadc01,
			String mfrelQadc02, String mfrelQadc03, String mfrelQadc04,
			String mfrelQadc05, Double mfrelQadd01, Double mfrelQadd02,
			Double mfrelQadd03, Double mfrelQadd04, Double mfrelQadd05,
			Boolean mfrelQadl01, Boolean mfrelQadl02, Date mfrelQaddt01,
			Date mfrelQaddt02, String mfrelModUserid, Date mfrelModDate,
			String mfrelUser1, String mfrelUser2, Double oidMfrelMstr) {
		this.id = id;
		this.mfrelQadc01 = mfrelQadc01;
		this.mfrelQadc02 = mfrelQadc02;
		this.mfrelQadc03 = mfrelQadc03;
		this.mfrelQadc04 = mfrelQadc04;
		this.mfrelQadc05 = mfrelQadc05;
		this.mfrelQadd01 = mfrelQadd01;
		this.mfrelQadd02 = mfrelQadd02;
		this.mfrelQadd03 = mfrelQadd03;
		this.mfrelQadd04 = mfrelQadd04;
		this.mfrelQadd05 = mfrelQadd05;
		this.mfrelQadl01 = mfrelQadl01;
		this.mfrelQadl02 = mfrelQadl02;
		this.mfrelQaddt01 = mfrelQaddt01;
		this.mfrelQaddt02 = mfrelQaddt02;
		this.mfrelModUserid = mfrelModUserid;
		this.mfrelModDate = mfrelModDate;
		this.mfrelUser1 = mfrelUser1;
		this.mfrelUser2 = mfrelUser2;
		this.oidMfrelMstr = oidMfrelMstr;
	}

	// Property accessors

	public MfrelMstrId getId() {
		return this.id;
	}

	public void setId(MfrelMstrId id) {
		this.id = id;
	}

	public String getMfrelQadc01() {
		return this.mfrelQadc01;
	}

	public void setMfrelQadc01(String mfrelQadc01) {
		this.mfrelQadc01 = mfrelQadc01;
	}

	public String getMfrelQadc02() {
		return this.mfrelQadc02;
	}

	public void setMfrelQadc02(String mfrelQadc02) {
		this.mfrelQadc02 = mfrelQadc02;
	}

	public String getMfrelQadc03() {
		return this.mfrelQadc03;
	}

	public void setMfrelQadc03(String mfrelQadc03) {
		this.mfrelQadc03 = mfrelQadc03;
	}

	public String getMfrelQadc04() {
		return this.mfrelQadc04;
	}

	public void setMfrelQadc04(String mfrelQadc04) {
		this.mfrelQadc04 = mfrelQadc04;
	}

	public String getMfrelQadc05() {
		return this.mfrelQadc05;
	}

	public void setMfrelQadc05(String mfrelQadc05) {
		this.mfrelQadc05 = mfrelQadc05;
	}

	public Double getMfrelQadd01() {
		return this.mfrelQadd01;
	}

	public void setMfrelQadd01(Double mfrelQadd01) {
		this.mfrelQadd01 = mfrelQadd01;
	}

	public Double getMfrelQadd02() {
		return this.mfrelQadd02;
	}

	public void setMfrelQadd02(Double mfrelQadd02) {
		this.mfrelQadd02 = mfrelQadd02;
	}

	public Double getMfrelQadd03() {
		return this.mfrelQadd03;
	}

	public void setMfrelQadd03(Double mfrelQadd03) {
		this.mfrelQadd03 = mfrelQadd03;
	}

	public Double getMfrelQadd04() {
		return this.mfrelQadd04;
	}

	public void setMfrelQadd04(Double mfrelQadd04) {
		this.mfrelQadd04 = mfrelQadd04;
	}

	public Double getMfrelQadd05() {
		return this.mfrelQadd05;
	}

	public void setMfrelQadd05(Double mfrelQadd05) {
		this.mfrelQadd05 = mfrelQadd05;
	}

	public Boolean getMfrelQadl01() {
		return this.mfrelQadl01;
	}

	public void setMfrelQadl01(Boolean mfrelQadl01) {
		this.mfrelQadl01 = mfrelQadl01;
	}

	public Boolean getMfrelQadl02() {
		return this.mfrelQadl02;
	}

	public void setMfrelQadl02(Boolean mfrelQadl02) {
		this.mfrelQadl02 = mfrelQadl02;
	}

	public Date getMfrelQaddt01() {
		return this.mfrelQaddt01;
	}

	public void setMfrelQaddt01(Date mfrelQaddt01) {
		this.mfrelQaddt01 = mfrelQaddt01;
	}

	public Date getMfrelQaddt02() {
		return this.mfrelQaddt02;
	}

	public void setMfrelQaddt02(Date mfrelQaddt02) {
		this.mfrelQaddt02 = mfrelQaddt02;
	}

	public String getMfrelModUserid() {
		return this.mfrelModUserid;
	}

	public void setMfrelModUserid(String mfrelModUserid) {
		this.mfrelModUserid = mfrelModUserid;
	}

	public Date getMfrelModDate() {
		return this.mfrelModDate;
	}

	public void setMfrelModDate(Date mfrelModDate) {
		this.mfrelModDate = mfrelModDate;
	}

	public String getMfrelUser1() {
		return this.mfrelUser1;
	}

	public void setMfrelUser1(String mfrelUser1) {
		this.mfrelUser1 = mfrelUser1;
	}

	public String getMfrelUser2() {
		return this.mfrelUser2;
	}

	public void setMfrelUser2(String mfrelUser2) {
		this.mfrelUser2 = mfrelUser2;
	}

	public Double getOidMfrelMstr() {
		return this.oidMfrelMstr;
	}

	public void setOidMfrelMstr(Double oidMfrelMstr) {
		this.oidMfrelMstr = oidMfrelMstr;
	}

}