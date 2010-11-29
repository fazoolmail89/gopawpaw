package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFpciMstr entity provides the base persistence definition of the
 * FpciMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpciMstr implements java.io.Serializable {

	// Fields

	private FpciMstrId id;
	private Date fpciModDate;
	private Double fpciRevalLink;
	private String fpciUserid;
	private String fpciValues;
	private String fpciChr01;
	private String fpciChr02;
	private String fpciChr03;
	private String fpciChr04;
	private Double fpciDec01;
	private Double fpciDec02;
	private Double fpciDec03;
	private Date fpciDte01;
	private Date fpciDte02;
	private Date fpciDte03;
	private Boolean fpciLog01;
	private Boolean fpciLog02;
	private Boolean fpciLog03;
	private String fpciQadc01;
	private String fpciQadc02;
	private String fpciQadc03;
	private String fpciQadc04;
	private Date fpciQadd01;
	private Date fpciQadd02;
	private Date fpciQadd03;
	private Double fpciQadde01;
	private Double fpciQadde02;
	private Double fpciQadde03;
	private Boolean fpciQadl01;
	private Boolean fpciQadl02;
	private Boolean fpciQadl03;
	private String fpciUser1;
	private String fpciUser2;
	private Double oidFpciMstr;

	// Constructors

	/** default constructor */
	public AbstractFpciMstr() {
	}

	/** minimal constructor */
	public AbstractFpciMstr(FpciMstrId id, Double oidFpciMstr) {
		this.id = id;
		this.oidFpciMstr = oidFpciMstr;
	}

	/** full constructor */
	public AbstractFpciMstr(FpciMstrId id, Date fpciModDate,
			Double fpciRevalLink, String fpciUserid, String fpciValues,
			String fpciChr01, String fpciChr02, String fpciChr03,
			String fpciChr04, Double fpciDec01, Double fpciDec02,
			Double fpciDec03, Date fpciDte01, Date fpciDte02, Date fpciDte03,
			Boolean fpciLog01, Boolean fpciLog02, Boolean fpciLog03,
			String fpciQadc01, String fpciQadc02, String fpciQadc03,
			String fpciQadc04, Date fpciQadd01, Date fpciQadd02,
			Date fpciQadd03, Double fpciQadde01, Double fpciQadde02,
			Double fpciQadde03, Boolean fpciQadl01, Boolean fpciQadl02,
			Boolean fpciQadl03, String fpciUser1, String fpciUser2,
			Double oidFpciMstr) {
		this.id = id;
		this.fpciModDate = fpciModDate;
		this.fpciRevalLink = fpciRevalLink;
		this.fpciUserid = fpciUserid;
		this.fpciValues = fpciValues;
		this.fpciChr01 = fpciChr01;
		this.fpciChr02 = fpciChr02;
		this.fpciChr03 = fpciChr03;
		this.fpciChr04 = fpciChr04;
		this.fpciDec01 = fpciDec01;
		this.fpciDec02 = fpciDec02;
		this.fpciDec03 = fpciDec03;
		this.fpciDte01 = fpciDte01;
		this.fpciDte02 = fpciDte02;
		this.fpciDte03 = fpciDte03;
		this.fpciLog01 = fpciLog01;
		this.fpciLog02 = fpciLog02;
		this.fpciLog03 = fpciLog03;
		this.fpciQadc01 = fpciQadc01;
		this.fpciQadc02 = fpciQadc02;
		this.fpciQadc03 = fpciQadc03;
		this.fpciQadc04 = fpciQadc04;
		this.fpciQadd01 = fpciQadd01;
		this.fpciQadd02 = fpciQadd02;
		this.fpciQadd03 = fpciQadd03;
		this.fpciQadde01 = fpciQadde01;
		this.fpciQadde02 = fpciQadde02;
		this.fpciQadde03 = fpciQadde03;
		this.fpciQadl01 = fpciQadl01;
		this.fpciQadl02 = fpciQadl02;
		this.fpciQadl03 = fpciQadl03;
		this.fpciUser1 = fpciUser1;
		this.fpciUser2 = fpciUser2;
		this.oidFpciMstr = oidFpciMstr;
	}

	// Property accessors

	public FpciMstrId getId() {
		return this.id;
	}

	public void setId(FpciMstrId id) {
		this.id = id;
	}

	public Date getFpciModDate() {
		return this.fpciModDate;
	}

	public void setFpciModDate(Date fpciModDate) {
		this.fpciModDate = fpciModDate;
	}

	public Double getFpciRevalLink() {
		return this.fpciRevalLink;
	}

	public void setFpciRevalLink(Double fpciRevalLink) {
		this.fpciRevalLink = fpciRevalLink;
	}

	public String getFpciUserid() {
		return this.fpciUserid;
	}

	public void setFpciUserid(String fpciUserid) {
		this.fpciUserid = fpciUserid;
	}

	public String getFpciValues() {
		return this.fpciValues;
	}

	public void setFpciValues(String fpciValues) {
		this.fpciValues = fpciValues;
	}

	public String getFpciChr01() {
		return this.fpciChr01;
	}

	public void setFpciChr01(String fpciChr01) {
		this.fpciChr01 = fpciChr01;
	}

	public String getFpciChr02() {
		return this.fpciChr02;
	}

	public void setFpciChr02(String fpciChr02) {
		this.fpciChr02 = fpciChr02;
	}

	public String getFpciChr03() {
		return this.fpciChr03;
	}

	public void setFpciChr03(String fpciChr03) {
		this.fpciChr03 = fpciChr03;
	}

	public String getFpciChr04() {
		return this.fpciChr04;
	}

	public void setFpciChr04(String fpciChr04) {
		this.fpciChr04 = fpciChr04;
	}

	public Double getFpciDec01() {
		return this.fpciDec01;
	}

	public void setFpciDec01(Double fpciDec01) {
		this.fpciDec01 = fpciDec01;
	}

	public Double getFpciDec02() {
		return this.fpciDec02;
	}

	public void setFpciDec02(Double fpciDec02) {
		this.fpciDec02 = fpciDec02;
	}

	public Double getFpciDec03() {
		return this.fpciDec03;
	}

	public void setFpciDec03(Double fpciDec03) {
		this.fpciDec03 = fpciDec03;
	}

	public Date getFpciDte01() {
		return this.fpciDte01;
	}

	public void setFpciDte01(Date fpciDte01) {
		this.fpciDte01 = fpciDte01;
	}

	public Date getFpciDte02() {
		return this.fpciDte02;
	}

	public void setFpciDte02(Date fpciDte02) {
		this.fpciDte02 = fpciDte02;
	}

	public Date getFpciDte03() {
		return this.fpciDte03;
	}

	public void setFpciDte03(Date fpciDte03) {
		this.fpciDte03 = fpciDte03;
	}

	public Boolean getFpciLog01() {
		return this.fpciLog01;
	}

	public void setFpciLog01(Boolean fpciLog01) {
		this.fpciLog01 = fpciLog01;
	}

	public Boolean getFpciLog02() {
		return this.fpciLog02;
	}

	public void setFpciLog02(Boolean fpciLog02) {
		this.fpciLog02 = fpciLog02;
	}

	public Boolean getFpciLog03() {
		return this.fpciLog03;
	}

	public void setFpciLog03(Boolean fpciLog03) {
		this.fpciLog03 = fpciLog03;
	}

	public String getFpciQadc01() {
		return this.fpciQadc01;
	}

	public void setFpciQadc01(String fpciQadc01) {
		this.fpciQadc01 = fpciQadc01;
	}

	public String getFpciQadc02() {
		return this.fpciQadc02;
	}

	public void setFpciQadc02(String fpciQadc02) {
		this.fpciQadc02 = fpciQadc02;
	}

	public String getFpciQadc03() {
		return this.fpciQadc03;
	}

	public void setFpciQadc03(String fpciQadc03) {
		this.fpciQadc03 = fpciQadc03;
	}

	public String getFpciQadc04() {
		return this.fpciQadc04;
	}

	public void setFpciQadc04(String fpciQadc04) {
		this.fpciQadc04 = fpciQadc04;
	}

	public Date getFpciQadd01() {
		return this.fpciQadd01;
	}

	public void setFpciQadd01(Date fpciQadd01) {
		this.fpciQadd01 = fpciQadd01;
	}

	public Date getFpciQadd02() {
		return this.fpciQadd02;
	}

	public void setFpciQadd02(Date fpciQadd02) {
		this.fpciQadd02 = fpciQadd02;
	}

	public Date getFpciQadd03() {
		return this.fpciQadd03;
	}

	public void setFpciQadd03(Date fpciQadd03) {
		this.fpciQadd03 = fpciQadd03;
	}

	public Double getFpciQadde01() {
		return this.fpciQadde01;
	}

	public void setFpciQadde01(Double fpciQadde01) {
		this.fpciQadde01 = fpciQadde01;
	}

	public Double getFpciQadde02() {
		return this.fpciQadde02;
	}

	public void setFpciQadde02(Double fpciQadde02) {
		this.fpciQadde02 = fpciQadde02;
	}

	public Double getFpciQadde03() {
		return this.fpciQadde03;
	}

	public void setFpciQadde03(Double fpciQadde03) {
		this.fpciQadde03 = fpciQadde03;
	}

	public Boolean getFpciQadl01() {
		return this.fpciQadl01;
	}

	public void setFpciQadl01(Boolean fpciQadl01) {
		this.fpciQadl01 = fpciQadl01;
	}

	public Boolean getFpciQadl02() {
		return this.fpciQadl02;
	}

	public void setFpciQadl02(Boolean fpciQadl02) {
		this.fpciQadl02 = fpciQadl02;
	}

	public Boolean getFpciQadl03() {
		return this.fpciQadl03;
	}

	public void setFpciQadl03(Boolean fpciQadl03) {
		this.fpciQadl03 = fpciQadl03;
	}

	public String getFpciUser1() {
		return this.fpciUser1;
	}

	public void setFpciUser1(String fpciUser1) {
		this.fpciUser1 = fpciUser1;
	}

	public String getFpciUser2() {
		return this.fpciUser2;
	}

	public void setFpciUser2(String fpciUser2) {
		this.fpciUser2 = fpciUser2;
	}

	public Double getOidFpciMstr() {
		return this.oidFpciMstr;
	}

	public void setOidFpciMstr(Double oidFpciMstr) {
		this.oidFpciMstr = oidFpciMstr;
	}

}