package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVesMstr entity provides the base persistence definition of the
 * VesMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVesMstr implements java.io.Serializable {

	// Fields

	private VesMstrId id;
	private String vesCommCode;
	private Double vesRcvdQty;
	private Integer vesOccuranceCount;
	private String vesDb;
	private String vesModUserid;
	private Date vesModDate;
	private String vesUser1;
	private String vesUser2;
	private String vesUser3;
	private String vesUser4;
	private String vesQadc01;
	private String vesQadc02;
	private String vesQadc03;
	private String vesQadc04;
	private Double vesQadd01;
	private Double vesQadd02;
	private Boolean vesQadl01;
	private Boolean vesQadl02;
	private Date vesQadt01;
	private Date vesQadt02;
	private Integer vesQadi01;
	private Integer vesQadi02;
	private Double oidVesMstr;

	// Constructors

	/** default constructor */
	public AbstractVesMstr() {
	}

	/** minimal constructor */
	public AbstractVesMstr(VesMstrId id, String vesCommCode, Double oidVesMstr) {
		this.id = id;
		this.vesCommCode = vesCommCode;
		this.oidVesMstr = oidVesMstr;
	}

	/** full constructor */
	public AbstractVesMstr(VesMstrId id, String vesCommCode, Double vesRcvdQty,
			Integer vesOccuranceCount, String vesDb, String vesModUserid,
			Date vesModDate, String vesUser1, String vesUser2, String vesUser3,
			String vesUser4, String vesQadc01, String vesQadc02,
			String vesQadc03, String vesQadc04, Double vesQadd01,
			Double vesQadd02, Boolean vesQadl01, Boolean vesQadl02,
			Date vesQadt01, Date vesQadt02, Integer vesQadi01,
			Integer vesQadi02, Double oidVesMstr) {
		this.id = id;
		this.vesCommCode = vesCommCode;
		this.vesRcvdQty = vesRcvdQty;
		this.vesOccuranceCount = vesOccuranceCount;
		this.vesDb = vesDb;
		this.vesModUserid = vesModUserid;
		this.vesModDate = vesModDate;
		this.vesUser1 = vesUser1;
		this.vesUser2 = vesUser2;
		this.vesUser3 = vesUser3;
		this.vesUser4 = vesUser4;
		this.vesQadc01 = vesQadc01;
		this.vesQadc02 = vesQadc02;
		this.vesQadc03 = vesQadc03;
		this.vesQadc04 = vesQadc04;
		this.vesQadd01 = vesQadd01;
		this.vesQadd02 = vesQadd02;
		this.vesQadl01 = vesQadl01;
		this.vesQadl02 = vesQadl02;
		this.vesQadt01 = vesQadt01;
		this.vesQadt02 = vesQadt02;
		this.vesQadi01 = vesQadi01;
		this.vesQadi02 = vesQadi02;
		this.oidVesMstr = oidVesMstr;
	}

	// Property accessors

	public VesMstrId getId() {
		return this.id;
	}

	public void setId(VesMstrId id) {
		this.id = id;
	}

	public String getVesCommCode() {
		return this.vesCommCode;
	}

	public void setVesCommCode(String vesCommCode) {
		this.vesCommCode = vesCommCode;
	}

	public Double getVesRcvdQty() {
		return this.vesRcvdQty;
	}

	public void setVesRcvdQty(Double vesRcvdQty) {
		this.vesRcvdQty = vesRcvdQty;
	}

	public Integer getVesOccuranceCount() {
		return this.vesOccuranceCount;
	}

	public void setVesOccuranceCount(Integer vesOccuranceCount) {
		this.vesOccuranceCount = vesOccuranceCount;
	}

	public String getVesDb() {
		return this.vesDb;
	}

	public void setVesDb(String vesDb) {
		this.vesDb = vesDb;
	}

	public String getVesModUserid() {
		return this.vesModUserid;
	}

	public void setVesModUserid(String vesModUserid) {
		this.vesModUserid = vesModUserid;
	}

	public Date getVesModDate() {
		return this.vesModDate;
	}

	public void setVesModDate(Date vesModDate) {
		this.vesModDate = vesModDate;
	}

	public String getVesUser1() {
		return this.vesUser1;
	}

	public void setVesUser1(String vesUser1) {
		this.vesUser1 = vesUser1;
	}

	public String getVesUser2() {
		return this.vesUser2;
	}

	public void setVesUser2(String vesUser2) {
		this.vesUser2 = vesUser2;
	}

	public String getVesUser3() {
		return this.vesUser3;
	}

	public void setVesUser3(String vesUser3) {
		this.vesUser3 = vesUser3;
	}

	public String getVesUser4() {
		return this.vesUser4;
	}

	public void setVesUser4(String vesUser4) {
		this.vesUser4 = vesUser4;
	}

	public String getVesQadc01() {
		return this.vesQadc01;
	}

	public void setVesQadc01(String vesQadc01) {
		this.vesQadc01 = vesQadc01;
	}

	public String getVesQadc02() {
		return this.vesQadc02;
	}

	public void setVesQadc02(String vesQadc02) {
		this.vesQadc02 = vesQadc02;
	}

	public String getVesQadc03() {
		return this.vesQadc03;
	}

	public void setVesQadc03(String vesQadc03) {
		this.vesQadc03 = vesQadc03;
	}

	public String getVesQadc04() {
		return this.vesQadc04;
	}

	public void setVesQadc04(String vesQadc04) {
		this.vesQadc04 = vesQadc04;
	}

	public Double getVesQadd01() {
		return this.vesQadd01;
	}

	public void setVesQadd01(Double vesQadd01) {
		this.vesQadd01 = vesQadd01;
	}

	public Double getVesQadd02() {
		return this.vesQadd02;
	}

	public void setVesQadd02(Double vesQadd02) {
		this.vesQadd02 = vesQadd02;
	}

	public Boolean getVesQadl01() {
		return this.vesQadl01;
	}

	public void setVesQadl01(Boolean vesQadl01) {
		this.vesQadl01 = vesQadl01;
	}

	public Boolean getVesQadl02() {
		return this.vesQadl02;
	}

	public void setVesQadl02(Boolean vesQadl02) {
		this.vesQadl02 = vesQadl02;
	}

	public Date getVesQadt01() {
		return this.vesQadt01;
	}

	public void setVesQadt01(Date vesQadt01) {
		this.vesQadt01 = vesQadt01;
	}

	public Date getVesQadt02() {
		return this.vesQadt02;
	}

	public void setVesQadt02(Date vesQadt02) {
		this.vesQadt02 = vesQadt02;
	}

	public Integer getVesQadi01() {
		return this.vesQadi01;
	}

	public void setVesQadi01(Integer vesQadi01) {
		this.vesQadi01 = vesQadi01;
	}

	public Integer getVesQadi02() {
		return this.vesQadi02;
	}

	public void setVesQadi02(Integer vesQadi02) {
		this.vesQadi02 = vesQadi02;
	}

	public Double getOidVesMstr() {
		return this.oidVesMstr;
	}

	public void setOidVesMstr(Double oidVesMstr) {
		this.oidVesMstr = oidVesMstr;
	}

}