package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAcodMstr entity provides the base persistence definition of the
 * AcodMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcodMstr implements java.io.Serializable {

	// Fields

	private AcodMstrId id;
	private String acodTargVal;
	private String acodDesc;
	private String acodModUserid;
	private Date acodModDate;
	private String acodUser1;
	private String acodUser2;
	private Double acodDec01;
	private Double acodDec02;
	private Integer acodInt01;
	private Integer acodInt02;
	private Boolean acodLog01;
	private Boolean acodLog02;
	private Date acodDte01;
	private Date acodDte02;
	private String acodQadc01;
	private String acodQadc02;
	private String acodQadc03;
	private String acodQadc04;
	private Double acodQadd01;
	private Double acodQadd02;
	private Integer acodQadi01;
	private Integer acodQadi02;
	private Boolean acodQadl01;
	private Boolean acodQadl02;
	private Date acodQadt01;
	private Date acodQadt02;
	private Double oidAcodMstr;

	// Constructors

	/** default constructor */
	public AbstractAcodMstr() {
	}

	/** minimal constructor */
	public AbstractAcodMstr(AcodMstrId id, Double oidAcodMstr) {
		this.id = id;
		this.oidAcodMstr = oidAcodMstr;
	}

	/** full constructor */
	public AbstractAcodMstr(AcodMstrId id, String acodTargVal, String acodDesc,
			String acodModUserid, Date acodModDate, String acodUser1,
			String acodUser2, Double acodDec01, Double acodDec02,
			Integer acodInt01, Integer acodInt02, Boolean acodLog01,
			Boolean acodLog02, Date acodDte01, Date acodDte02,
			String acodQadc01, String acodQadc02, String acodQadc03,
			String acodQadc04, Double acodQadd01, Double acodQadd02,
			Integer acodQadi01, Integer acodQadi02, Boolean acodQadl01,
			Boolean acodQadl02, Date acodQadt01, Date acodQadt02,
			Double oidAcodMstr) {
		this.id = id;
		this.acodTargVal = acodTargVal;
		this.acodDesc = acodDesc;
		this.acodModUserid = acodModUserid;
		this.acodModDate = acodModDate;
		this.acodUser1 = acodUser1;
		this.acodUser2 = acodUser2;
		this.acodDec01 = acodDec01;
		this.acodDec02 = acodDec02;
		this.acodInt01 = acodInt01;
		this.acodInt02 = acodInt02;
		this.acodLog01 = acodLog01;
		this.acodLog02 = acodLog02;
		this.acodDte01 = acodDte01;
		this.acodDte02 = acodDte02;
		this.acodQadc01 = acodQadc01;
		this.acodQadc02 = acodQadc02;
		this.acodQadc03 = acodQadc03;
		this.acodQadc04 = acodQadc04;
		this.acodQadd01 = acodQadd01;
		this.acodQadd02 = acodQadd02;
		this.acodQadi01 = acodQadi01;
		this.acodQadi02 = acodQadi02;
		this.acodQadl01 = acodQadl01;
		this.acodQadl02 = acodQadl02;
		this.acodQadt01 = acodQadt01;
		this.acodQadt02 = acodQadt02;
		this.oidAcodMstr = oidAcodMstr;
	}

	// Property accessors

	public AcodMstrId getId() {
		return this.id;
	}

	public void setId(AcodMstrId id) {
		this.id = id;
	}

	public String getAcodTargVal() {
		return this.acodTargVal;
	}

	public void setAcodTargVal(String acodTargVal) {
		this.acodTargVal = acodTargVal;
	}

	public String getAcodDesc() {
		return this.acodDesc;
	}

	public void setAcodDesc(String acodDesc) {
		this.acodDesc = acodDesc;
	}

	public String getAcodModUserid() {
		return this.acodModUserid;
	}

	public void setAcodModUserid(String acodModUserid) {
		this.acodModUserid = acodModUserid;
	}

	public Date getAcodModDate() {
		return this.acodModDate;
	}

	public void setAcodModDate(Date acodModDate) {
		this.acodModDate = acodModDate;
	}

	public String getAcodUser1() {
		return this.acodUser1;
	}

	public void setAcodUser1(String acodUser1) {
		this.acodUser1 = acodUser1;
	}

	public String getAcodUser2() {
		return this.acodUser2;
	}

	public void setAcodUser2(String acodUser2) {
		this.acodUser2 = acodUser2;
	}

	public Double getAcodDec01() {
		return this.acodDec01;
	}

	public void setAcodDec01(Double acodDec01) {
		this.acodDec01 = acodDec01;
	}

	public Double getAcodDec02() {
		return this.acodDec02;
	}

	public void setAcodDec02(Double acodDec02) {
		this.acodDec02 = acodDec02;
	}

	public Integer getAcodInt01() {
		return this.acodInt01;
	}

	public void setAcodInt01(Integer acodInt01) {
		this.acodInt01 = acodInt01;
	}

	public Integer getAcodInt02() {
		return this.acodInt02;
	}

	public void setAcodInt02(Integer acodInt02) {
		this.acodInt02 = acodInt02;
	}

	public Boolean getAcodLog01() {
		return this.acodLog01;
	}

	public void setAcodLog01(Boolean acodLog01) {
		this.acodLog01 = acodLog01;
	}

	public Boolean getAcodLog02() {
		return this.acodLog02;
	}

	public void setAcodLog02(Boolean acodLog02) {
		this.acodLog02 = acodLog02;
	}

	public Date getAcodDte01() {
		return this.acodDte01;
	}

	public void setAcodDte01(Date acodDte01) {
		this.acodDte01 = acodDte01;
	}

	public Date getAcodDte02() {
		return this.acodDte02;
	}

	public void setAcodDte02(Date acodDte02) {
		this.acodDte02 = acodDte02;
	}

	public String getAcodQadc01() {
		return this.acodQadc01;
	}

	public void setAcodQadc01(String acodQadc01) {
		this.acodQadc01 = acodQadc01;
	}

	public String getAcodQadc02() {
		return this.acodQadc02;
	}

	public void setAcodQadc02(String acodQadc02) {
		this.acodQadc02 = acodQadc02;
	}

	public String getAcodQadc03() {
		return this.acodQadc03;
	}

	public void setAcodQadc03(String acodQadc03) {
		this.acodQadc03 = acodQadc03;
	}

	public String getAcodQadc04() {
		return this.acodQadc04;
	}

	public void setAcodQadc04(String acodQadc04) {
		this.acodQadc04 = acodQadc04;
	}

	public Double getAcodQadd01() {
		return this.acodQadd01;
	}

	public void setAcodQadd01(Double acodQadd01) {
		this.acodQadd01 = acodQadd01;
	}

	public Double getAcodQadd02() {
		return this.acodQadd02;
	}

	public void setAcodQadd02(Double acodQadd02) {
		this.acodQadd02 = acodQadd02;
	}

	public Integer getAcodQadi01() {
		return this.acodQadi01;
	}

	public void setAcodQadi01(Integer acodQadi01) {
		this.acodQadi01 = acodQadi01;
	}

	public Integer getAcodQadi02() {
		return this.acodQadi02;
	}

	public void setAcodQadi02(Integer acodQadi02) {
		this.acodQadi02 = acodQadi02;
	}

	public Boolean getAcodQadl01() {
		return this.acodQadl01;
	}

	public void setAcodQadl01(Boolean acodQadl01) {
		this.acodQadl01 = acodQadl01;
	}

	public Boolean getAcodQadl02() {
		return this.acodQadl02;
	}

	public void setAcodQadl02(Boolean acodQadl02) {
		this.acodQadl02 = acodQadl02;
	}

	public Date getAcodQadt01() {
		return this.acodQadt01;
	}

	public void setAcodQadt01(Date acodQadt01) {
		this.acodQadt01 = acodQadt01;
	}

	public Date getAcodQadt02() {
		return this.acodQadt02;
	}

	public void setAcodQadt02(Date acodQadt02) {
		this.acodQadt02 = acodQadt02;
	}

	public Double getOidAcodMstr() {
		return this.oidAcodMstr;
	}

	public void setOidAcodMstr(Double oidAcodMstr) {
		this.oidAcodMstr = oidAcodMstr;
	}

}