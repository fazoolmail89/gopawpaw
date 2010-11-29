package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVerdDet entity provides the base persistence definition of the
 * VerdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVerdDet implements java.io.Serializable {

	// Fields

	private VerdDetId id;
	private Boolean verdActiveFlag;
	private String verdModUserid;
	private Date verdModDate;
	private String verdUser1;
	private String verdUser2;
	private String verdUser3;
	private String verdUser4;
	private String verdQadc01;
	private String verdQadc02;
	private String verdQadc03;
	private String verdQadc04;
	private Double verdQadd01;
	private Double verdQadd02;
	private Boolean verdQadl01;
	private Boolean verdQadl02;
	private Date verdQadt01;
	private Date verdQadt02;
	private Integer verdQadi01;
	private Integer verdQadi02;
	private Double oidVerdDet;

	// Constructors

	/** default constructor */
	public AbstractVerdDet() {
	}

	/** minimal constructor */
	public AbstractVerdDet(VerdDetId id, Double oidVerdDet) {
		this.id = id;
		this.oidVerdDet = oidVerdDet;
	}

	/** full constructor */
	public AbstractVerdDet(VerdDetId id, Boolean verdActiveFlag,
			String verdModUserid, Date verdModDate, String verdUser1,
			String verdUser2, String verdUser3, String verdUser4,
			String verdQadc01, String verdQadc02, String verdQadc03,
			String verdQadc04, Double verdQadd01, Double verdQadd02,
			Boolean verdQadl01, Boolean verdQadl02, Date verdQadt01,
			Date verdQadt02, Integer verdQadi01, Integer verdQadi02,
			Double oidVerdDet) {
		this.id = id;
		this.verdActiveFlag = verdActiveFlag;
		this.verdModUserid = verdModUserid;
		this.verdModDate = verdModDate;
		this.verdUser1 = verdUser1;
		this.verdUser2 = verdUser2;
		this.verdUser3 = verdUser3;
		this.verdUser4 = verdUser4;
		this.verdQadc01 = verdQadc01;
		this.verdQadc02 = verdQadc02;
		this.verdQadc03 = verdQadc03;
		this.verdQadc04 = verdQadc04;
		this.verdQadd01 = verdQadd01;
		this.verdQadd02 = verdQadd02;
		this.verdQadl01 = verdQadl01;
		this.verdQadl02 = verdQadl02;
		this.verdQadt01 = verdQadt01;
		this.verdQadt02 = verdQadt02;
		this.verdQadi01 = verdQadi01;
		this.verdQadi02 = verdQadi02;
		this.oidVerdDet = oidVerdDet;
	}

	// Property accessors

	public VerdDetId getId() {
		return this.id;
	}

	public void setId(VerdDetId id) {
		this.id = id;
	}

	public Boolean getVerdActiveFlag() {
		return this.verdActiveFlag;
	}

	public void setVerdActiveFlag(Boolean verdActiveFlag) {
		this.verdActiveFlag = verdActiveFlag;
	}

	public String getVerdModUserid() {
		return this.verdModUserid;
	}

	public void setVerdModUserid(String verdModUserid) {
		this.verdModUserid = verdModUserid;
	}

	public Date getVerdModDate() {
		return this.verdModDate;
	}

	public void setVerdModDate(Date verdModDate) {
		this.verdModDate = verdModDate;
	}

	public String getVerdUser1() {
		return this.verdUser1;
	}

	public void setVerdUser1(String verdUser1) {
		this.verdUser1 = verdUser1;
	}

	public String getVerdUser2() {
		return this.verdUser2;
	}

	public void setVerdUser2(String verdUser2) {
		this.verdUser2 = verdUser2;
	}

	public String getVerdUser3() {
		return this.verdUser3;
	}

	public void setVerdUser3(String verdUser3) {
		this.verdUser3 = verdUser3;
	}

	public String getVerdUser4() {
		return this.verdUser4;
	}

	public void setVerdUser4(String verdUser4) {
		this.verdUser4 = verdUser4;
	}

	public String getVerdQadc01() {
		return this.verdQadc01;
	}

	public void setVerdQadc01(String verdQadc01) {
		this.verdQadc01 = verdQadc01;
	}

	public String getVerdQadc02() {
		return this.verdQadc02;
	}

	public void setVerdQadc02(String verdQadc02) {
		this.verdQadc02 = verdQadc02;
	}

	public String getVerdQadc03() {
		return this.verdQadc03;
	}

	public void setVerdQadc03(String verdQadc03) {
		this.verdQadc03 = verdQadc03;
	}

	public String getVerdQadc04() {
		return this.verdQadc04;
	}

	public void setVerdQadc04(String verdQadc04) {
		this.verdQadc04 = verdQadc04;
	}

	public Double getVerdQadd01() {
		return this.verdQadd01;
	}

	public void setVerdQadd01(Double verdQadd01) {
		this.verdQadd01 = verdQadd01;
	}

	public Double getVerdQadd02() {
		return this.verdQadd02;
	}

	public void setVerdQadd02(Double verdQadd02) {
		this.verdQadd02 = verdQadd02;
	}

	public Boolean getVerdQadl01() {
		return this.verdQadl01;
	}

	public void setVerdQadl01(Boolean verdQadl01) {
		this.verdQadl01 = verdQadl01;
	}

	public Boolean getVerdQadl02() {
		return this.verdQadl02;
	}

	public void setVerdQadl02(Boolean verdQadl02) {
		this.verdQadl02 = verdQadl02;
	}

	public Date getVerdQadt01() {
		return this.verdQadt01;
	}

	public void setVerdQadt01(Date verdQadt01) {
		this.verdQadt01 = verdQadt01;
	}

	public Date getVerdQadt02() {
		return this.verdQadt02;
	}

	public void setVerdQadt02(Date verdQadt02) {
		this.verdQadt02 = verdQadt02;
	}

	public Integer getVerdQadi01() {
		return this.verdQadi01;
	}

	public void setVerdQadi01(Integer verdQadi01) {
		this.verdQadi01 = verdQadi01;
	}

	public Integer getVerdQadi02() {
		return this.verdQadi02;
	}

	public void setVerdQadi02(Integer verdQadi02) {
		this.verdQadi02 = verdQadi02;
	}

	public Double getOidVerdDet() {
		return this.oidVerdDet;
	}

	public void setOidVerdDet(Double oidVerdDet) {
		this.oidVerdDet = oidVerdDet;
	}

}