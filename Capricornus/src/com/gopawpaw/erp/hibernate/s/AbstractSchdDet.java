package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSchdDet entity provides the base persistence definition of the
 * SchdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSchdDet implements java.io.Serializable {

	// Fields

	private SchdDetId id;
	private Double schdUpdQty;
	private Double schdDiscrQty;
	private String schdFcQual;
	private Double schdCumQty;
	private Integer schdCmtindx;
	private String schdChr01;
	private String schdChr02;
	private String schdChr03;
	private String schdChr04;
	private String schdChr05;
	private String schdChr06;
	private String schdChr07;
	private String schdChr08;
	private String schdChr09;
	private String schdChr10;
	private Double schdDec01;
	private Double schdDec02;
	private Double schdDec03;
	private Double schdDec04;
	private Double schdDec05;
	private Double schdDec06;
	private Double schdDec07;
	private Double schdDec08;
	private Double schdDec09;
	private Double schdDec10;
	private Date schdDte01;
	private Date schdDte02;
	private Boolean schdLog01;
	private Boolean schdLog02;
	private String schdUser1;
	private String schdUser2;
	private Double schdShipQty;
	private Double schdAllQty;
	private Date schdPerDate;
	private String schdReferenceType;
	private Double oidSchdDet;

	// Constructors

	/** default constructor */
	public AbstractSchdDet() {
	}

	/** minimal constructor */
	public AbstractSchdDet(SchdDetId id, String schdReferenceType,
			Double oidSchdDet) {
		this.id = id;
		this.schdReferenceType = schdReferenceType;
		this.oidSchdDet = oidSchdDet;
	}

	/** full constructor */
	public AbstractSchdDet(SchdDetId id, Double schdUpdQty,
			Double schdDiscrQty, String schdFcQual, Double schdCumQty,
			Integer schdCmtindx, String schdChr01, String schdChr02,
			String schdChr03, String schdChr04, String schdChr05,
			String schdChr06, String schdChr07, String schdChr08,
			String schdChr09, String schdChr10, Double schdDec01,
			Double schdDec02, Double schdDec03, Double schdDec04,
			Double schdDec05, Double schdDec06, Double schdDec07,
			Double schdDec08, Double schdDec09, Double schdDec10,
			Date schdDte01, Date schdDte02, Boolean schdLog01,
			Boolean schdLog02, String schdUser1, String schdUser2,
			Double schdShipQty, Double schdAllQty, Date schdPerDate,
			String schdReferenceType, Double oidSchdDet) {
		this.id = id;
		this.schdUpdQty = schdUpdQty;
		this.schdDiscrQty = schdDiscrQty;
		this.schdFcQual = schdFcQual;
		this.schdCumQty = schdCumQty;
		this.schdCmtindx = schdCmtindx;
		this.schdChr01 = schdChr01;
		this.schdChr02 = schdChr02;
		this.schdChr03 = schdChr03;
		this.schdChr04 = schdChr04;
		this.schdChr05 = schdChr05;
		this.schdChr06 = schdChr06;
		this.schdChr07 = schdChr07;
		this.schdChr08 = schdChr08;
		this.schdChr09 = schdChr09;
		this.schdChr10 = schdChr10;
		this.schdDec01 = schdDec01;
		this.schdDec02 = schdDec02;
		this.schdDec03 = schdDec03;
		this.schdDec04 = schdDec04;
		this.schdDec05 = schdDec05;
		this.schdDec06 = schdDec06;
		this.schdDec07 = schdDec07;
		this.schdDec08 = schdDec08;
		this.schdDec09 = schdDec09;
		this.schdDec10 = schdDec10;
		this.schdDte01 = schdDte01;
		this.schdDte02 = schdDte02;
		this.schdLog01 = schdLog01;
		this.schdLog02 = schdLog02;
		this.schdUser1 = schdUser1;
		this.schdUser2 = schdUser2;
		this.schdShipQty = schdShipQty;
		this.schdAllQty = schdAllQty;
		this.schdPerDate = schdPerDate;
		this.schdReferenceType = schdReferenceType;
		this.oidSchdDet = oidSchdDet;
	}

	// Property accessors

	public SchdDetId getId() {
		return this.id;
	}

	public void setId(SchdDetId id) {
		this.id = id;
	}

	public Double getSchdUpdQty() {
		return this.schdUpdQty;
	}

	public void setSchdUpdQty(Double schdUpdQty) {
		this.schdUpdQty = schdUpdQty;
	}

	public Double getSchdDiscrQty() {
		return this.schdDiscrQty;
	}

	public void setSchdDiscrQty(Double schdDiscrQty) {
		this.schdDiscrQty = schdDiscrQty;
	}

	public String getSchdFcQual() {
		return this.schdFcQual;
	}

	public void setSchdFcQual(String schdFcQual) {
		this.schdFcQual = schdFcQual;
	}

	public Double getSchdCumQty() {
		return this.schdCumQty;
	}

	public void setSchdCumQty(Double schdCumQty) {
		this.schdCumQty = schdCumQty;
	}

	public Integer getSchdCmtindx() {
		return this.schdCmtindx;
	}

	public void setSchdCmtindx(Integer schdCmtindx) {
		this.schdCmtindx = schdCmtindx;
	}

	public String getSchdChr01() {
		return this.schdChr01;
	}

	public void setSchdChr01(String schdChr01) {
		this.schdChr01 = schdChr01;
	}

	public String getSchdChr02() {
		return this.schdChr02;
	}

	public void setSchdChr02(String schdChr02) {
		this.schdChr02 = schdChr02;
	}

	public String getSchdChr03() {
		return this.schdChr03;
	}

	public void setSchdChr03(String schdChr03) {
		this.schdChr03 = schdChr03;
	}

	public String getSchdChr04() {
		return this.schdChr04;
	}

	public void setSchdChr04(String schdChr04) {
		this.schdChr04 = schdChr04;
	}

	public String getSchdChr05() {
		return this.schdChr05;
	}

	public void setSchdChr05(String schdChr05) {
		this.schdChr05 = schdChr05;
	}

	public String getSchdChr06() {
		return this.schdChr06;
	}

	public void setSchdChr06(String schdChr06) {
		this.schdChr06 = schdChr06;
	}

	public String getSchdChr07() {
		return this.schdChr07;
	}

	public void setSchdChr07(String schdChr07) {
		this.schdChr07 = schdChr07;
	}

	public String getSchdChr08() {
		return this.schdChr08;
	}

	public void setSchdChr08(String schdChr08) {
		this.schdChr08 = schdChr08;
	}

	public String getSchdChr09() {
		return this.schdChr09;
	}

	public void setSchdChr09(String schdChr09) {
		this.schdChr09 = schdChr09;
	}

	public String getSchdChr10() {
		return this.schdChr10;
	}

	public void setSchdChr10(String schdChr10) {
		this.schdChr10 = schdChr10;
	}

	public Double getSchdDec01() {
		return this.schdDec01;
	}

	public void setSchdDec01(Double schdDec01) {
		this.schdDec01 = schdDec01;
	}

	public Double getSchdDec02() {
		return this.schdDec02;
	}

	public void setSchdDec02(Double schdDec02) {
		this.schdDec02 = schdDec02;
	}

	public Double getSchdDec03() {
		return this.schdDec03;
	}

	public void setSchdDec03(Double schdDec03) {
		this.schdDec03 = schdDec03;
	}

	public Double getSchdDec04() {
		return this.schdDec04;
	}

	public void setSchdDec04(Double schdDec04) {
		this.schdDec04 = schdDec04;
	}

	public Double getSchdDec05() {
		return this.schdDec05;
	}

	public void setSchdDec05(Double schdDec05) {
		this.schdDec05 = schdDec05;
	}

	public Double getSchdDec06() {
		return this.schdDec06;
	}

	public void setSchdDec06(Double schdDec06) {
		this.schdDec06 = schdDec06;
	}

	public Double getSchdDec07() {
		return this.schdDec07;
	}

	public void setSchdDec07(Double schdDec07) {
		this.schdDec07 = schdDec07;
	}

	public Double getSchdDec08() {
		return this.schdDec08;
	}

	public void setSchdDec08(Double schdDec08) {
		this.schdDec08 = schdDec08;
	}

	public Double getSchdDec09() {
		return this.schdDec09;
	}

	public void setSchdDec09(Double schdDec09) {
		this.schdDec09 = schdDec09;
	}

	public Double getSchdDec10() {
		return this.schdDec10;
	}

	public void setSchdDec10(Double schdDec10) {
		this.schdDec10 = schdDec10;
	}

	public Date getSchdDte01() {
		return this.schdDte01;
	}

	public void setSchdDte01(Date schdDte01) {
		this.schdDte01 = schdDte01;
	}

	public Date getSchdDte02() {
		return this.schdDte02;
	}

	public void setSchdDte02(Date schdDte02) {
		this.schdDte02 = schdDte02;
	}

	public Boolean getSchdLog01() {
		return this.schdLog01;
	}

	public void setSchdLog01(Boolean schdLog01) {
		this.schdLog01 = schdLog01;
	}

	public Boolean getSchdLog02() {
		return this.schdLog02;
	}

	public void setSchdLog02(Boolean schdLog02) {
		this.schdLog02 = schdLog02;
	}

	public String getSchdUser1() {
		return this.schdUser1;
	}

	public void setSchdUser1(String schdUser1) {
		this.schdUser1 = schdUser1;
	}

	public String getSchdUser2() {
		return this.schdUser2;
	}

	public void setSchdUser2(String schdUser2) {
		this.schdUser2 = schdUser2;
	}

	public Double getSchdShipQty() {
		return this.schdShipQty;
	}

	public void setSchdShipQty(Double schdShipQty) {
		this.schdShipQty = schdShipQty;
	}

	public Double getSchdAllQty() {
		return this.schdAllQty;
	}

	public void setSchdAllQty(Double schdAllQty) {
		this.schdAllQty = schdAllQty;
	}

	public Date getSchdPerDate() {
		return this.schdPerDate;
	}

	public void setSchdPerDate(Date schdPerDate) {
		this.schdPerDate = schdPerDate;
	}

	public String getSchdReferenceType() {
		return this.schdReferenceType;
	}

	public void setSchdReferenceType(String schdReferenceType) {
		this.schdReferenceType = schdReferenceType;
	}

	public Double getOidSchdDet() {
		return this.oidSchdDet;
	}

	public void setOidSchdDet(Double oidSchdDet) {
		this.oidSchdDet = oidSchdDet;
	}

}