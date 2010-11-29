package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCrefMstr entity provides the base persistence definition of the
 * CrefMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCrefMstr implements java.io.Serializable {

	// Fields

	private CrefMstrId id;
	private String crefItem3;
	private String crefItem4;
	private String crefCset;
	private Boolean crefQadLog01;
	private Boolean crefQadLog02;
	private Date crefQadDate1;
	private Double crefQadDec01;
	private Date crefQadDate2;
	private Double crefQadDec02;
	private String crefUser1;
	private String crefUser2;
	private String crefQadc01;
	private Double oidCrefMstr;

	// Constructors

	/** default constructor */
	public AbstractCrefMstr() {
	}

	/** minimal constructor */
	public AbstractCrefMstr(CrefMstrId id, Double oidCrefMstr) {
		this.id = id;
		this.oidCrefMstr = oidCrefMstr;
	}

	/** full constructor */
	public AbstractCrefMstr(CrefMstrId id, String crefItem3, String crefItem4,
			String crefCset, Boolean crefQadLog01, Boolean crefQadLog02,
			Date crefQadDate1, Double crefQadDec01, Date crefQadDate2,
			Double crefQadDec02, String crefUser1, String crefUser2,
			String crefQadc01, Double oidCrefMstr) {
		this.id = id;
		this.crefItem3 = crefItem3;
		this.crefItem4 = crefItem4;
		this.crefCset = crefCset;
		this.crefQadLog01 = crefQadLog01;
		this.crefQadLog02 = crefQadLog02;
		this.crefQadDate1 = crefQadDate1;
		this.crefQadDec01 = crefQadDec01;
		this.crefQadDate2 = crefQadDate2;
		this.crefQadDec02 = crefQadDec02;
		this.crefUser1 = crefUser1;
		this.crefUser2 = crefUser2;
		this.crefQadc01 = crefQadc01;
		this.oidCrefMstr = oidCrefMstr;
	}

	// Property accessors

	public CrefMstrId getId() {
		return this.id;
	}

	public void setId(CrefMstrId id) {
		this.id = id;
	}

	public String getCrefItem3() {
		return this.crefItem3;
	}

	public void setCrefItem3(String crefItem3) {
		this.crefItem3 = crefItem3;
	}

	public String getCrefItem4() {
		return this.crefItem4;
	}

	public void setCrefItem4(String crefItem4) {
		this.crefItem4 = crefItem4;
	}

	public String getCrefCset() {
		return this.crefCset;
	}

	public void setCrefCset(String crefCset) {
		this.crefCset = crefCset;
	}

	public Boolean getCrefQadLog01() {
		return this.crefQadLog01;
	}

	public void setCrefQadLog01(Boolean crefQadLog01) {
		this.crefQadLog01 = crefQadLog01;
	}

	public Boolean getCrefQadLog02() {
		return this.crefQadLog02;
	}

	public void setCrefQadLog02(Boolean crefQadLog02) {
		this.crefQadLog02 = crefQadLog02;
	}

	public Date getCrefQadDate1() {
		return this.crefQadDate1;
	}

	public void setCrefQadDate1(Date crefQadDate1) {
		this.crefQadDate1 = crefQadDate1;
	}

	public Double getCrefQadDec01() {
		return this.crefQadDec01;
	}

	public void setCrefQadDec01(Double crefQadDec01) {
		this.crefQadDec01 = crefQadDec01;
	}

	public Date getCrefQadDate2() {
		return this.crefQadDate2;
	}

	public void setCrefQadDate2(Date crefQadDate2) {
		this.crefQadDate2 = crefQadDate2;
	}

	public Double getCrefQadDec02() {
		return this.crefQadDec02;
	}

	public void setCrefQadDec02(Double crefQadDec02) {
		this.crefQadDec02 = crefQadDec02;
	}

	public String getCrefUser1() {
		return this.crefUser1;
	}

	public void setCrefUser1(String crefUser1) {
		this.crefUser1 = crefUser1;
	}

	public String getCrefUser2() {
		return this.crefUser2;
	}

	public void setCrefUser2(String crefUser2) {
		this.crefUser2 = crefUser2;
	}

	public String getCrefQadc01() {
		return this.crefQadc01;
	}

	public void setCrefQadc01(String crefQadc01) {
		this.crefQadc01 = crefQadc01;
	}

	public Double getOidCrefMstr() {
		return this.oidCrefMstr;
	}

	public void setOidCrefMstr(Double oidCrefMstr) {
		this.oidCrefMstr = oidCrefMstr;
	}

}