package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFndDet entity provides the base persistence definition of the FndDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFndDet implements java.io.Serializable {

	// Fields

	private FndDetId id;
	private Date fndCompDate;
	private String fndEcmNbr;
	private String fndModUserid;
	private String fndChr01;
	private String fndChr02;
	private String fndChr03;
	private String fndChr04;
	private Double fndDec01;
	private Double fndDec02;
	private Double fndDec03;
	private Date fndDte01;
	private Date fndDte02;
	private Date fndDte03;
	private Boolean fndLog01;
	private Boolean fndLog02;
	private Boolean fndLog03;
	private String fndQadc01;
	private String fndQadc02;
	private String fndQadc03;
	private String fndQadc04;
	private Date fndQadt01;
	private Date fndQadt02;
	private Date fndQadt03;
	private Double fndQade01;
	private Double fndQade02;
	private Double fndQade03;
	private Boolean fndQadl01;
	private Boolean fndQadl02;
	private Boolean fndQadl03;
	private Date fndModDate;
	private String fndUser1;
	private String fndUser2;
	private Double oidFndDet;

	// Constructors

	/** default constructor */
	public AbstractFndDet() {
	}

	/** minimal constructor */
	public AbstractFndDet(FndDetId id, Double oidFndDet) {
		this.id = id;
		this.oidFndDet = oidFndDet;
	}

	/** full constructor */
	public AbstractFndDet(FndDetId id, Date fndCompDate, String fndEcmNbr,
			String fndModUserid, String fndChr01, String fndChr02,
			String fndChr03, String fndChr04, Double fndDec01, Double fndDec02,
			Double fndDec03, Date fndDte01, Date fndDte02, Date fndDte03,
			Boolean fndLog01, Boolean fndLog02, Boolean fndLog03,
			String fndQadc01, String fndQadc02, String fndQadc03,
			String fndQadc04, Date fndQadt01, Date fndQadt02, Date fndQadt03,
			Double fndQade01, Double fndQade02, Double fndQade03,
			Boolean fndQadl01, Boolean fndQadl02, Boolean fndQadl03,
			Date fndModDate, String fndUser1, String fndUser2, Double oidFndDet) {
		this.id = id;
		this.fndCompDate = fndCompDate;
		this.fndEcmNbr = fndEcmNbr;
		this.fndModUserid = fndModUserid;
		this.fndChr01 = fndChr01;
		this.fndChr02 = fndChr02;
		this.fndChr03 = fndChr03;
		this.fndChr04 = fndChr04;
		this.fndDec01 = fndDec01;
		this.fndDec02 = fndDec02;
		this.fndDec03 = fndDec03;
		this.fndDte01 = fndDte01;
		this.fndDte02 = fndDte02;
		this.fndDte03 = fndDte03;
		this.fndLog01 = fndLog01;
		this.fndLog02 = fndLog02;
		this.fndLog03 = fndLog03;
		this.fndQadc01 = fndQadc01;
		this.fndQadc02 = fndQadc02;
		this.fndQadc03 = fndQadc03;
		this.fndQadc04 = fndQadc04;
		this.fndQadt01 = fndQadt01;
		this.fndQadt02 = fndQadt02;
		this.fndQadt03 = fndQadt03;
		this.fndQade01 = fndQade01;
		this.fndQade02 = fndQade02;
		this.fndQade03 = fndQade03;
		this.fndQadl01 = fndQadl01;
		this.fndQadl02 = fndQadl02;
		this.fndQadl03 = fndQadl03;
		this.fndModDate = fndModDate;
		this.fndUser1 = fndUser1;
		this.fndUser2 = fndUser2;
		this.oidFndDet = oidFndDet;
	}

	// Property accessors

	public FndDetId getId() {
		return this.id;
	}

	public void setId(FndDetId id) {
		this.id = id;
	}

	public Date getFndCompDate() {
		return this.fndCompDate;
	}

	public void setFndCompDate(Date fndCompDate) {
		this.fndCompDate = fndCompDate;
	}

	public String getFndEcmNbr() {
		return this.fndEcmNbr;
	}

	public void setFndEcmNbr(String fndEcmNbr) {
		this.fndEcmNbr = fndEcmNbr;
	}

	public String getFndModUserid() {
		return this.fndModUserid;
	}

	public void setFndModUserid(String fndModUserid) {
		this.fndModUserid = fndModUserid;
	}

	public String getFndChr01() {
		return this.fndChr01;
	}

	public void setFndChr01(String fndChr01) {
		this.fndChr01 = fndChr01;
	}

	public String getFndChr02() {
		return this.fndChr02;
	}

	public void setFndChr02(String fndChr02) {
		this.fndChr02 = fndChr02;
	}

	public String getFndChr03() {
		return this.fndChr03;
	}

	public void setFndChr03(String fndChr03) {
		this.fndChr03 = fndChr03;
	}

	public String getFndChr04() {
		return this.fndChr04;
	}

	public void setFndChr04(String fndChr04) {
		this.fndChr04 = fndChr04;
	}

	public Double getFndDec01() {
		return this.fndDec01;
	}

	public void setFndDec01(Double fndDec01) {
		this.fndDec01 = fndDec01;
	}

	public Double getFndDec02() {
		return this.fndDec02;
	}

	public void setFndDec02(Double fndDec02) {
		this.fndDec02 = fndDec02;
	}

	public Double getFndDec03() {
		return this.fndDec03;
	}

	public void setFndDec03(Double fndDec03) {
		this.fndDec03 = fndDec03;
	}

	public Date getFndDte01() {
		return this.fndDte01;
	}

	public void setFndDte01(Date fndDte01) {
		this.fndDte01 = fndDte01;
	}

	public Date getFndDte02() {
		return this.fndDte02;
	}

	public void setFndDte02(Date fndDte02) {
		this.fndDte02 = fndDte02;
	}

	public Date getFndDte03() {
		return this.fndDte03;
	}

	public void setFndDte03(Date fndDte03) {
		this.fndDte03 = fndDte03;
	}

	public Boolean getFndLog01() {
		return this.fndLog01;
	}

	public void setFndLog01(Boolean fndLog01) {
		this.fndLog01 = fndLog01;
	}

	public Boolean getFndLog02() {
		return this.fndLog02;
	}

	public void setFndLog02(Boolean fndLog02) {
		this.fndLog02 = fndLog02;
	}

	public Boolean getFndLog03() {
		return this.fndLog03;
	}

	public void setFndLog03(Boolean fndLog03) {
		this.fndLog03 = fndLog03;
	}

	public String getFndQadc01() {
		return this.fndQadc01;
	}

	public void setFndQadc01(String fndQadc01) {
		this.fndQadc01 = fndQadc01;
	}

	public String getFndQadc02() {
		return this.fndQadc02;
	}

	public void setFndQadc02(String fndQadc02) {
		this.fndQadc02 = fndQadc02;
	}

	public String getFndQadc03() {
		return this.fndQadc03;
	}

	public void setFndQadc03(String fndQadc03) {
		this.fndQadc03 = fndQadc03;
	}

	public String getFndQadc04() {
		return this.fndQadc04;
	}

	public void setFndQadc04(String fndQadc04) {
		this.fndQadc04 = fndQadc04;
	}

	public Date getFndQadt01() {
		return this.fndQadt01;
	}

	public void setFndQadt01(Date fndQadt01) {
		this.fndQadt01 = fndQadt01;
	}

	public Date getFndQadt02() {
		return this.fndQadt02;
	}

	public void setFndQadt02(Date fndQadt02) {
		this.fndQadt02 = fndQadt02;
	}

	public Date getFndQadt03() {
		return this.fndQadt03;
	}

	public void setFndQadt03(Date fndQadt03) {
		this.fndQadt03 = fndQadt03;
	}

	public Double getFndQade01() {
		return this.fndQade01;
	}

	public void setFndQade01(Double fndQade01) {
		this.fndQade01 = fndQade01;
	}

	public Double getFndQade02() {
		return this.fndQade02;
	}

	public void setFndQade02(Double fndQade02) {
		this.fndQade02 = fndQade02;
	}

	public Double getFndQade03() {
		return this.fndQade03;
	}

	public void setFndQade03(Double fndQade03) {
		this.fndQade03 = fndQade03;
	}

	public Boolean getFndQadl01() {
		return this.fndQadl01;
	}

	public void setFndQadl01(Boolean fndQadl01) {
		this.fndQadl01 = fndQadl01;
	}

	public Boolean getFndQadl02() {
		return this.fndQadl02;
	}

	public void setFndQadl02(Boolean fndQadl02) {
		this.fndQadl02 = fndQadl02;
	}

	public Boolean getFndQadl03() {
		return this.fndQadl03;
	}

	public void setFndQadl03(Boolean fndQadl03) {
		this.fndQadl03 = fndQadl03;
	}

	public Date getFndModDate() {
		return this.fndModDate;
	}

	public void setFndModDate(Date fndModDate) {
		this.fndModDate = fndModDate;
	}

	public String getFndUser1() {
		return this.fndUser1;
	}

	public void setFndUser1(String fndUser1) {
		this.fndUser1 = fndUser1;
	}

	public String getFndUser2() {
		return this.fndUser2;
	}

	public void setFndUser2(String fndUser2) {
		this.fndUser2 = fndUser2;
	}

	public Double getOidFndDet() {
		return this.oidFndDet;
	}

	public void setOidFndDet(Double oidFndDet) {
		this.oidFndDet = oidFndDet;
	}

}