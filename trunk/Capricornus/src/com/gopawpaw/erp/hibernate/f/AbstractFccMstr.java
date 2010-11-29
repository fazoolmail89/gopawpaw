package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFccMstr entity provides the base persistence definition of the
 * FccMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFccMstr implements java.io.Serializable {

	// Fields

	private FccMstrId id;
	private String fccProdLine;
	private String fccChr01;
	private String fccChr02;
	private String fccChr03;
	private String fccChr04;
	private Double fccDec01;
	private Double fccDec02;
	private Double fccDec03;
	private Date fccDte01;
	private Date fccDte02;
	private Date fccDte03;
	private Boolean fccLog01;
	private Boolean fccLog02;
	private Boolean fccLog03;
	private String fccQadc01;
	private String fccQadc02;
	private String fccQadc03;
	private String fccQadc04;
	private Date fccQadt01;
	private Date fccQadt02;
	private Date fccQadt03;
	private Double fccQadd01;
	private Double fccQadd02;
	private Double fccQadd03;
	private Boolean fccQadl01;
	private Boolean fccQadl02;
	private Boolean fccQadl03;
	private Date fccModDate;
	private String fccModUserid;
	private String fccUser1;
	private String fccUser2;
	private Double oidFccMstr;

	// Constructors

	/** default constructor */
	public AbstractFccMstr() {
	}

	/** minimal constructor */
	public AbstractFccMstr(FccMstrId id, Double oidFccMstr) {
		this.id = id;
		this.oidFccMstr = oidFccMstr;
	}

	/** full constructor */
	public AbstractFccMstr(FccMstrId id, String fccProdLine, String fccChr01,
			String fccChr02, String fccChr03, String fccChr04, Double fccDec01,
			Double fccDec02, Double fccDec03, Date fccDte01, Date fccDte02,
			Date fccDte03, Boolean fccLog01, Boolean fccLog02,
			Boolean fccLog03, String fccQadc01, String fccQadc02,
			String fccQadc03, String fccQadc04, Date fccQadt01, Date fccQadt02,
			Date fccQadt03, Double fccQadd01, Double fccQadd02,
			Double fccQadd03, Boolean fccQadl01, Boolean fccQadl02,
			Boolean fccQadl03, Date fccModDate, String fccModUserid,
			String fccUser1, String fccUser2, Double oidFccMstr) {
		this.id = id;
		this.fccProdLine = fccProdLine;
		this.fccChr01 = fccChr01;
		this.fccChr02 = fccChr02;
		this.fccChr03 = fccChr03;
		this.fccChr04 = fccChr04;
		this.fccDec01 = fccDec01;
		this.fccDec02 = fccDec02;
		this.fccDec03 = fccDec03;
		this.fccDte01 = fccDte01;
		this.fccDte02 = fccDte02;
		this.fccDte03 = fccDte03;
		this.fccLog01 = fccLog01;
		this.fccLog02 = fccLog02;
		this.fccLog03 = fccLog03;
		this.fccQadc01 = fccQadc01;
		this.fccQadc02 = fccQadc02;
		this.fccQadc03 = fccQadc03;
		this.fccQadc04 = fccQadc04;
		this.fccQadt01 = fccQadt01;
		this.fccQadt02 = fccQadt02;
		this.fccQadt03 = fccQadt03;
		this.fccQadd01 = fccQadd01;
		this.fccQadd02 = fccQadd02;
		this.fccQadd03 = fccQadd03;
		this.fccQadl01 = fccQadl01;
		this.fccQadl02 = fccQadl02;
		this.fccQadl03 = fccQadl03;
		this.fccModDate = fccModDate;
		this.fccModUserid = fccModUserid;
		this.fccUser1 = fccUser1;
		this.fccUser2 = fccUser2;
		this.oidFccMstr = oidFccMstr;
	}

	// Property accessors

	public FccMstrId getId() {
		return this.id;
	}

	public void setId(FccMstrId id) {
		this.id = id;
	}

	public String getFccProdLine() {
		return this.fccProdLine;
	}

	public void setFccProdLine(String fccProdLine) {
		this.fccProdLine = fccProdLine;
	}

	public String getFccChr01() {
		return this.fccChr01;
	}

	public void setFccChr01(String fccChr01) {
		this.fccChr01 = fccChr01;
	}

	public String getFccChr02() {
		return this.fccChr02;
	}

	public void setFccChr02(String fccChr02) {
		this.fccChr02 = fccChr02;
	}

	public String getFccChr03() {
		return this.fccChr03;
	}

	public void setFccChr03(String fccChr03) {
		this.fccChr03 = fccChr03;
	}

	public String getFccChr04() {
		return this.fccChr04;
	}

	public void setFccChr04(String fccChr04) {
		this.fccChr04 = fccChr04;
	}

	public Double getFccDec01() {
		return this.fccDec01;
	}

	public void setFccDec01(Double fccDec01) {
		this.fccDec01 = fccDec01;
	}

	public Double getFccDec02() {
		return this.fccDec02;
	}

	public void setFccDec02(Double fccDec02) {
		this.fccDec02 = fccDec02;
	}

	public Double getFccDec03() {
		return this.fccDec03;
	}

	public void setFccDec03(Double fccDec03) {
		this.fccDec03 = fccDec03;
	}

	public Date getFccDte01() {
		return this.fccDte01;
	}

	public void setFccDte01(Date fccDte01) {
		this.fccDte01 = fccDte01;
	}

	public Date getFccDte02() {
		return this.fccDte02;
	}

	public void setFccDte02(Date fccDte02) {
		this.fccDte02 = fccDte02;
	}

	public Date getFccDte03() {
		return this.fccDte03;
	}

	public void setFccDte03(Date fccDte03) {
		this.fccDte03 = fccDte03;
	}

	public Boolean getFccLog01() {
		return this.fccLog01;
	}

	public void setFccLog01(Boolean fccLog01) {
		this.fccLog01 = fccLog01;
	}

	public Boolean getFccLog02() {
		return this.fccLog02;
	}

	public void setFccLog02(Boolean fccLog02) {
		this.fccLog02 = fccLog02;
	}

	public Boolean getFccLog03() {
		return this.fccLog03;
	}

	public void setFccLog03(Boolean fccLog03) {
		this.fccLog03 = fccLog03;
	}

	public String getFccQadc01() {
		return this.fccQadc01;
	}

	public void setFccQadc01(String fccQadc01) {
		this.fccQadc01 = fccQadc01;
	}

	public String getFccQadc02() {
		return this.fccQadc02;
	}

	public void setFccQadc02(String fccQadc02) {
		this.fccQadc02 = fccQadc02;
	}

	public String getFccQadc03() {
		return this.fccQadc03;
	}

	public void setFccQadc03(String fccQadc03) {
		this.fccQadc03 = fccQadc03;
	}

	public String getFccQadc04() {
		return this.fccQadc04;
	}

	public void setFccQadc04(String fccQadc04) {
		this.fccQadc04 = fccQadc04;
	}

	public Date getFccQadt01() {
		return this.fccQadt01;
	}

	public void setFccQadt01(Date fccQadt01) {
		this.fccQadt01 = fccQadt01;
	}

	public Date getFccQadt02() {
		return this.fccQadt02;
	}

	public void setFccQadt02(Date fccQadt02) {
		this.fccQadt02 = fccQadt02;
	}

	public Date getFccQadt03() {
		return this.fccQadt03;
	}

	public void setFccQadt03(Date fccQadt03) {
		this.fccQadt03 = fccQadt03;
	}

	public Double getFccQadd01() {
		return this.fccQadd01;
	}

	public void setFccQadd01(Double fccQadd01) {
		this.fccQadd01 = fccQadd01;
	}

	public Double getFccQadd02() {
		return this.fccQadd02;
	}

	public void setFccQadd02(Double fccQadd02) {
		this.fccQadd02 = fccQadd02;
	}

	public Double getFccQadd03() {
		return this.fccQadd03;
	}

	public void setFccQadd03(Double fccQadd03) {
		this.fccQadd03 = fccQadd03;
	}

	public Boolean getFccQadl01() {
		return this.fccQadl01;
	}

	public void setFccQadl01(Boolean fccQadl01) {
		this.fccQadl01 = fccQadl01;
	}

	public Boolean getFccQadl02() {
		return this.fccQadl02;
	}

	public void setFccQadl02(Boolean fccQadl02) {
		this.fccQadl02 = fccQadl02;
	}

	public Boolean getFccQadl03() {
		return this.fccQadl03;
	}

	public void setFccQadl03(Boolean fccQadl03) {
		this.fccQadl03 = fccQadl03;
	}

	public Date getFccModDate() {
		return this.fccModDate;
	}

	public void setFccModDate(Date fccModDate) {
		this.fccModDate = fccModDate;
	}

	public String getFccModUserid() {
		return this.fccModUserid;
	}

	public void setFccModUserid(String fccModUserid) {
		this.fccModUserid = fccModUserid;
	}

	public String getFccUser1() {
		return this.fccUser1;
	}

	public void setFccUser1(String fccUser1) {
		this.fccUser1 = fccUser1;
	}

	public String getFccUser2() {
		return this.fccUser2;
	}

	public void setFccUser2(String fccUser2) {
		this.fccUser2 = fccUser2;
	}

	public Double getOidFccMstr() {
		return this.oidFccMstr;
	}

	public void setOidFccMstr(Double oidFccMstr) {
		this.oidFccMstr = oidFccMstr;
	}

}