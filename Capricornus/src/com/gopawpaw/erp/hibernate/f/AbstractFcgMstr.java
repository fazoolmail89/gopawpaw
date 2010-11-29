package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFcgMstr entity provides the base persistence definition of the
 * FcgMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcgMstr implements java.io.Serializable {

	// Fields

	private FcgMstrId id;
	private Boolean fcgBillable;
	private Boolean fcgContract;
	private String fcgDesc;
	private Boolean fcgFixBillable;
	private Boolean fcgGiveaway;
	private Integer fcgIndex;
	private Boolean fcgProject;
	private Boolean fcgWarranty;
	private String fcgChr01;
	private String fcgChr02;
	private String fcgChr03;
	private String fcgChr04;
	private Double fcgDec01;
	private Double fcgDec02;
	private Double fcgDec03;
	private Date fcgDte01;
	private Date fcgDte02;
	private Date fcgDte03;
	private Boolean fcgLog01;
	private Boolean fcgLog02;
	private Boolean fcgLog03;
	private String fcgQadc01;
	private String fcgQadc02;
	private String fcgQadc03;
	private String fcgQadc04;
	private Date fcgQadd01;
	private Date fcgQadd02;
	private Date fcgQadd03;
	private Double fcgQadde01;
	private Double fcgQadde02;
	private Double fcgQadde03;
	private Boolean fcgQadl01;
	private Boolean fcgQadl02;
	private Boolean fcgQadl03;
	private Boolean fcgFixIndex;
	private Boolean fcgCovered;
	private String fcgUser1;
	private String fcgUser2;
	private String fcgModUserid;
	private Date fcgModDate;
	private Double oidFcgMstr;

	// Constructors

	/** default constructor */
	public AbstractFcgMstr() {
	}

	/** minimal constructor */
	public AbstractFcgMstr(FcgMstrId id, Double oidFcgMstr) {
		this.id = id;
		this.oidFcgMstr = oidFcgMstr;
	}

	/** full constructor */
	public AbstractFcgMstr(FcgMstrId id, Boolean fcgBillable,
			Boolean fcgContract, String fcgDesc, Boolean fcgFixBillable,
			Boolean fcgGiveaway, Integer fcgIndex, Boolean fcgProject,
			Boolean fcgWarranty, String fcgChr01, String fcgChr02,
			String fcgChr03, String fcgChr04, Double fcgDec01, Double fcgDec02,
			Double fcgDec03, Date fcgDte01, Date fcgDte02, Date fcgDte03,
			Boolean fcgLog01, Boolean fcgLog02, Boolean fcgLog03,
			String fcgQadc01, String fcgQadc02, String fcgQadc03,
			String fcgQadc04, Date fcgQadd01, Date fcgQadd02, Date fcgQadd03,
			Double fcgQadde01, Double fcgQadde02, Double fcgQadde03,
			Boolean fcgQadl01, Boolean fcgQadl02, Boolean fcgQadl03,
			Boolean fcgFixIndex, Boolean fcgCovered, String fcgUser1,
			String fcgUser2, String fcgModUserid, Date fcgModDate,
			Double oidFcgMstr) {
		this.id = id;
		this.fcgBillable = fcgBillable;
		this.fcgContract = fcgContract;
		this.fcgDesc = fcgDesc;
		this.fcgFixBillable = fcgFixBillable;
		this.fcgGiveaway = fcgGiveaway;
		this.fcgIndex = fcgIndex;
		this.fcgProject = fcgProject;
		this.fcgWarranty = fcgWarranty;
		this.fcgChr01 = fcgChr01;
		this.fcgChr02 = fcgChr02;
		this.fcgChr03 = fcgChr03;
		this.fcgChr04 = fcgChr04;
		this.fcgDec01 = fcgDec01;
		this.fcgDec02 = fcgDec02;
		this.fcgDec03 = fcgDec03;
		this.fcgDte01 = fcgDte01;
		this.fcgDte02 = fcgDte02;
		this.fcgDte03 = fcgDte03;
		this.fcgLog01 = fcgLog01;
		this.fcgLog02 = fcgLog02;
		this.fcgLog03 = fcgLog03;
		this.fcgQadc01 = fcgQadc01;
		this.fcgQadc02 = fcgQadc02;
		this.fcgQadc03 = fcgQadc03;
		this.fcgQadc04 = fcgQadc04;
		this.fcgQadd01 = fcgQadd01;
		this.fcgQadd02 = fcgQadd02;
		this.fcgQadd03 = fcgQadd03;
		this.fcgQadde01 = fcgQadde01;
		this.fcgQadde02 = fcgQadde02;
		this.fcgQadde03 = fcgQadde03;
		this.fcgQadl01 = fcgQadl01;
		this.fcgQadl02 = fcgQadl02;
		this.fcgQadl03 = fcgQadl03;
		this.fcgFixIndex = fcgFixIndex;
		this.fcgCovered = fcgCovered;
		this.fcgUser1 = fcgUser1;
		this.fcgUser2 = fcgUser2;
		this.fcgModUserid = fcgModUserid;
		this.fcgModDate = fcgModDate;
		this.oidFcgMstr = oidFcgMstr;
	}

	// Property accessors

	public FcgMstrId getId() {
		return this.id;
	}

	public void setId(FcgMstrId id) {
		this.id = id;
	}

	public Boolean getFcgBillable() {
		return this.fcgBillable;
	}

	public void setFcgBillable(Boolean fcgBillable) {
		this.fcgBillable = fcgBillable;
	}

	public Boolean getFcgContract() {
		return this.fcgContract;
	}

	public void setFcgContract(Boolean fcgContract) {
		this.fcgContract = fcgContract;
	}

	public String getFcgDesc() {
		return this.fcgDesc;
	}

	public void setFcgDesc(String fcgDesc) {
		this.fcgDesc = fcgDesc;
	}

	public Boolean getFcgFixBillable() {
		return this.fcgFixBillable;
	}

	public void setFcgFixBillable(Boolean fcgFixBillable) {
		this.fcgFixBillable = fcgFixBillable;
	}

	public Boolean getFcgGiveaway() {
		return this.fcgGiveaway;
	}

	public void setFcgGiveaway(Boolean fcgGiveaway) {
		this.fcgGiveaway = fcgGiveaway;
	}

	public Integer getFcgIndex() {
		return this.fcgIndex;
	}

	public void setFcgIndex(Integer fcgIndex) {
		this.fcgIndex = fcgIndex;
	}

	public Boolean getFcgProject() {
		return this.fcgProject;
	}

	public void setFcgProject(Boolean fcgProject) {
		this.fcgProject = fcgProject;
	}

	public Boolean getFcgWarranty() {
		return this.fcgWarranty;
	}

	public void setFcgWarranty(Boolean fcgWarranty) {
		this.fcgWarranty = fcgWarranty;
	}

	public String getFcgChr01() {
		return this.fcgChr01;
	}

	public void setFcgChr01(String fcgChr01) {
		this.fcgChr01 = fcgChr01;
	}

	public String getFcgChr02() {
		return this.fcgChr02;
	}

	public void setFcgChr02(String fcgChr02) {
		this.fcgChr02 = fcgChr02;
	}

	public String getFcgChr03() {
		return this.fcgChr03;
	}

	public void setFcgChr03(String fcgChr03) {
		this.fcgChr03 = fcgChr03;
	}

	public String getFcgChr04() {
		return this.fcgChr04;
	}

	public void setFcgChr04(String fcgChr04) {
		this.fcgChr04 = fcgChr04;
	}

	public Double getFcgDec01() {
		return this.fcgDec01;
	}

	public void setFcgDec01(Double fcgDec01) {
		this.fcgDec01 = fcgDec01;
	}

	public Double getFcgDec02() {
		return this.fcgDec02;
	}

	public void setFcgDec02(Double fcgDec02) {
		this.fcgDec02 = fcgDec02;
	}

	public Double getFcgDec03() {
		return this.fcgDec03;
	}

	public void setFcgDec03(Double fcgDec03) {
		this.fcgDec03 = fcgDec03;
	}

	public Date getFcgDte01() {
		return this.fcgDte01;
	}

	public void setFcgDte01(Date fcgDte01) {
		this.fcgDte01 = fcgDte01;
	}

	public Date getFcgDte02() {
		return this.fcgDte02;
	}

	public void setFcgDte02(Date fcgDte02) {
		this.fcgDte02 = fcgDte02;
	}

	public Date getFcgDte03() {
		return this.fcgDte03;
	}

	public void setFcgDte03(Date fcgDte03) {
		this.fcgDte03 = fcgDte03;
	}

	public Boolean getFcgLog01() {
		return this.fcgLog01;
	}

	public void setFcgLog01(Boolean fcgLog01) {
		this.fcgLog01 = fcgLog01;
	}

	public Boolean getFcgLog02() {
		return this.fcgLog02;
	}

	public void setFcgLog02(Boolean fcgLog02) {
		this.fcgLog02 = fcgLog02;
	}

	public Boolean getFcgLog03() {
		return this.fcgLog03;
	}

	public void setFcgLog03(Boolean fcgLog03) {
		this.fcgLog03 = fcgLog03;
	}

	public String getFcgQadc01() {
		return this.fcgQadc01;
	}

	public void setFcgQadc01(String fcgQadc01) {
		this.fcgQadc01 = fcgQadc01;
	}

	public String getFcgQadc02() {
		return this.fcgQadc02;
	}

	public void setFcgQadc02(String fcgQadc02) {
		this.fcgQadc02 = fcgQadc02;
	}

	public String getFcgQadc03() {
		return this.fcgQadc03;
	}

	public void setFcgQadc03(String fcgQadc03) {
		this.fcgQadc03 = fcgQadc03;
	}

	public String getFcgQadc04() {
		return this.fcgQadc04;
	}

	public void setFcgQadc04(String fcgQadc04) {
		this.fcgQadc04 = fcgQadc04;
	}

	public Date getFcgQadd01() {
		return this.fcgQadd01;
	}

	public void setFcgQadd01(Date fcgQadd01) {
		this.fcgQadd01 = fcgQadd01;
	}

	public Date getFcgQadd02() {
		return this.fcgQadd02;
	}

	public void setFcgQadd02(Date fcgQadd02) {
		this.fcgQadd02 = fcgQadd02;
	}

	public Date getFcgQadd03() {
		return this.fcgQadd03;
	}

	public void setFcgQadd03(Date fcgQadd03) {
		this.fcgQadd03 = fcgQadd03;
	}

	public Double getFcgQadde01() {
		return this.fcgQadde01;
	}

	public void setFcgQadde01(Double fcgQadde01) {
		this.fcgQadde01 = fcgQadde01;
	}

	public Double getFcgQadde02() {
		return this.fcgQadde02;
	}

	public void setFcgQadde02(Double fcgQadde02) {
		this.fcgQadde02 = fcgQadde02;
	}

	public Double getFcgQadde03() {
		return this.fcgQadde03;
	}

	public void setFcgQadde03(Double fcgQadde03) {
		this.fcgQadde03 = fcgQadde03;
	}

	public Boolean getFcgQadl01() {
		return this.fcgQadl01;
	}

	public void setFcgQadl01(Boolean fcgQadl01) {
		this.fcgQadl01 = fcgQadl01;
	}

	public Boolean getFcgQadl02() {
		return this.fcgQadl02;
	}

	public void setFcgQadl02(Boolean fcgQadl02) {
		this.fcgQadl02 = fcgQadl02;
	}

	public Boolean getFcgQadl03() {
		return this.fcgQadl03;
	}

	public void setFcgQadl03(Boolean fcgQadl03) {
		this.fcgQadl03 = fcgQadl03;
	}

	public Boolean getFcgFixIndex() {
		return this.fcgFixIndex;
	}

	public void setFcgFixIndex(Boolean fcgFixIndex) {
		this.fcgFixIndex = fcgFixIndex;
	}

	public Boolean getFcgCovered() {
		return this.fcgCovered;
	}

	public void setFcgCovered(Boolean fcgCovered) {
		this.fcgCovered = fcgCovered;
	}

	public String getFcgUser1() {
		return this.fcgUser1;
	}

	public void setFcgUser1(String fcgUser1) {
		this.fcgUser1 = fcgUser1;
	}

	public String getFcgUser2() {
		return this.fcgUser2;
	}

	public void setFcgUser2(String fcgUser2) {
		this.fcgUser2 = fcgUser2;
	}

	public String getFcgModUserid() {
		return this.fcgModUserid;
	}

	public void setFcgModUserid(String fcgModUserid) {
		this.fcgModUserid = fcgModUserid;
	}

	public Date getFcgModDate() {
		return this.fcgModDate;
	}

	public void setFcgModDate(Date fcgModDate) {
		this.fcgModDate = fcgModDate;
	}

	public Double getOidFcgMstr() {
		return this.oidFcgMstr;
	}

	public void setOidFcgMstr(Double oidFcgMstr) {
		this.oidFcgMstr = oidFcgMstr;
	}

}