package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractArcCtrl entity provides the base persistence definition of the
 * ArcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArcCtrl implements java.io.Serializable {

	// Fields

	private String arcDomain;
	private Integer arcMemo;
	private Integer arcBatch;
	private Integer arcJrnl;
	private Boolean arcGlSum;
	private Integer arcQad01;
	private String arcUser1;
	private String arcUser2;
	private String arcQad03;
	private Date arcQad02;
	private Integer arcQadi01;
	private String arcQadc03;
	private String arcQadc05;
	private Double arcExTol;
	private String arcMemoPre;
	private String arcDrftAcc;
	private String arcDrftCc;
	private Boolean arcUseDrft;
	private Boolean arcAutoDrft;
	private Boolean arcAutoLateInt;
	private String arcNxtPmt;
	private String arcNxtDrft;
	private String arcCollMthd;
	private Boolean arcExtDrftRef;
	private Double arcDrftMin;
	private Double arcDrftMax;
	private String arcQadc01;
	private String arcQadc02;
	private String arcExRatetype;
	private Integer arcSumLvl;
	private String arcDrftSub;
	private String arcQadc04;
	private Double oidArcCtrl;

	// Constructors

	/** default constructor */
	public AbstractArcCtrl() {
	}

	/** minimal constructor */
	public AbstractArcCtrl(String arcNxtPmt, String arcNxtDrft,
			String arcCollMthd, Boolean arcExtDrftRef, Double arcDrftMin,
			Double arcDrftMax, String arcQadc01, String arcQadc02,
			String arcExRatetype, Double oidArcCtrl) {
		this.arcNxtPmt = arcNxtPmt;
		this.arcNxtDrft = arcNxtDrft;
		this.arcCollMthd = arcCollMthd;
		this.arcExtDrftRef = arcExtDrftRef;
		this.arcDrftMin = arcDrftMin;
		this.arcDrftMax = arcDrftMax;
		this.arcQadc01 = arcQadc01;
		this.arcQadc02 = arcQadc02;
		this.arcExRatetype = arcExRatetype;
		this.oidArcCtrl = oidArcCtrl;
	}

	/** full constructor */
	public AbstractArcCtrl(Integer arcMemo, Integer arcBatch, Integer arcJrnl,
			Boolean arcGlSum, Integer arcQad01, String arcUser1,
			String arcUser2, String arcQad03, Date arcQad02, Integer arcQadi01,
			String arcQadc03, String arcQadc05, Double arcExTol,
			String arcMemoPre, String arcDrftAcc, String arcDrftCc,
			Boolean arcUseDrft, Boolean arcAutoDrft, Boolean arcAutoLateInt,
			String arcNxtPmt, String arcNxtDrft, String arcCollMthd,
			Boolean arcExtDrftRef, Double arcDrftMin, Double arcDrftMax,
			String arcQadc01, String arcQadc02, String arcExRatetype,
			Integer arcSumLvl, String arcDrftSub, String arcQadc04,
			Double oidArcCtrl) {
		this.arcMemo = arcMemo;
		this.arcBatch = arcBatch;
		this.arcJrnl = arcJrnl;
		this.arcGlSum = arcGlSum;
		this.arcQad01 = arcQad01;
		this.arcUser1 = arcUser1;
		this.arcUser2 = arcUser2;
		this.arcQad03 = arcQad03;
		this.arcQad02 = arcQad02;
		this.arcQadi01 = arcQadi01;
		this.arcQadc03 = arcQadc03;
		this.arcQadc05 = arcQadc05;
		this.arcExTol = arcExTol;
		this.arcMemoPre = arcMemoPre;
		this.arcDrftAcc = arcDrftAcc;
		this.arcDrftCc = arcDrftCc;
		this.arcUseDrft = arcUseDrft;
		this.arcAutoDrft = arcAutoDrft;
		this.arcAutoLateInt = arcAutoLateInt;
		this.arcNxtPmt = arcNxtPmt;
		this.arcNxtDrft = arcNxtDrft;
		this.arcCollMthd = arcCollMthd;
		this.arcExtDrftRef = arcExtDrftRef;
		this.arcDrftMin = arcDrftMin;
		this.arcDrftMax = arcDrftMax;
		this.arcQadc01 = arcQadc01;
		this.arcQadc02 = arcQadc02;
		this.arcExRatetype = arcExRatetype;
		this.arcSumLvl = arcSumLvl;
		this.arcDrftSub = arcDrftSub;
		this.arcQadc04 = arcQadc04;
		this.oidArcCtrl = oidArcCtrl;
	}

	// Property accessors

	public String getArcDomain() {
		return this.arcDomain;
	}

	public void setArcDomain(String arcDomain) {
		this.arcDomain = arcDomain;
	}

	public Integer getArcMemo() {
		return this.arcMemo;
	}

	public void setArcMemo(Integer arcMemo) {
		this.arcMemo = arcMemo;
	}

	public Integer getArcBatch() {
		return this.arcBatch;
	}

	public void setArcBatch(Integer arcBatch) {
		this.arcBatch = arcBatch;
	}

	public Integer getArcJrnl() {
		return this.arcJrnl;
	}

	public void setArcJrnl(Integer arcJrnl) {
		this.arcJrnl = arcJrnl;
	}

	public Boolean getArcGlSum() {
		return this.arcGlSum;
	}

	public void setArcGlSum(Boolean arcGlSum) {
		this.arcGlSum = arcGlSum;
	}

	public Integer getArcQad01() {
		return this.arcQad01;
	}

	public void setArcQad01(Integer arcQad01) {
		this.arcQad01 = arcQad01;
	}

	public String getArcUser1() {
		return this.arcUser1;
	}

	public void setArcUser1(String arcUser1) {
		this.arcUser1 = arcUser1;
	}

	public String getArcUser2() {
		return this.arcUser2;
	}

	public void setArcUser2(String arcUser2) {
		this.arcUser2 = arcUser2;
	}

	public String getArcQad03() {
		return this.arcQad03;
	}

	public void setArcQad03(String arcQad03) {
		this.arcQad03 = arcQad03;
	}

	public Date getArcQad02() {
		return this.arcQad02;
	}

	public void setArcQad02(Date arcQad02) {
		this.arcQad02 = arcQad02;
	}

	public Integer getArcQadi01() {
		return this.arcQadi01;
	}

	public void setArcQadi01(Integer arcQadi01) {
		this.arcQadi01 = arcQadi01;
	}

	public String getArcQadc03() {
		return this.arcQadc03;
	}

	public void setArcQadc03(String arcQadc03) {
		this.arcQadc03 = arcQadc03;
	}

	public String getArcQadc05() {
		return this.arcQadc05;
	}

	public void setArcQadc05(String arcQadc05) {
		this.arcQadc05 = arcQadc05;
	}

	public Double getArcExTol() {
		return this.arcExTol;
	}

	public void setArcExTol(Double arcExTol) {
		this.arcExTol = arcExTol;
	}

	public String getArcMemoPre() {
		return this.arcMemoPre;
	}

	public void setArcMemoPre(String arcMemoPre) {
		this.arcMemoPre = arcMemoPre;
	}

	public String getArcDrftAcc() {
		return this.arcDrftAcc;
	}

	public void setArcDrftAcc(String arcDrftAcc) {
		this.arcDrftAcc = arcDrftAcc;
	}

	public String getArcDrftCc() {
		return this.arcDrftCc;
	}

	public void setArcDrftCc(String arcDrftCc) {
		this.arcDrftCc = arcDrftCc;
	}

	public Boolean getArcUseDrft() {
		return this.arcUseDrft;
	}

	public void setArcUseDrft(Boolean arcUseDrft) {
		this.arcUseDrft = arcUseDrft;
	}

	public Boolean getArcAutoDrft() {
		return this.arcAutoDrft;
	}

	public void setArcAutoDrft(Boolean arcAutoDrft) {
		this.arcAutoDrft = arcAutoDrft;
	}

	public Boolean getArcAutoLateInt() {
		return this.arcAutoLateInt;
	}

	public void setArcAutoLateInt(Boolean arcAutoLateInt) {
		this.arcAutoLateInt = arcAutoLateInt;
	}

	public String getArcNxtPmt() {
		return this.arcNxtPmt;
	}

	public void setArcNxtPmt(String arcNxtPmt) {
		this.arcNxtPmt = arcNxtPmt;
	}

	public String getArcNxtDrft() {
		return this.arcNxtDrft;
	}

	public void setArcNxtDrft(String arcNxtDrft) {
		this.arcNxtDrft = arcNxtDrft;
	}

	public String getArcCollMthd() {
		return this.arcCollMthd;
	}

	public void setArcCollMthd(String arcCollMthd) {
		this.arcCollMthd = arcCollMthd;
	}

	public Boolean getArcExtDrftRef() {
		return this.arcExtDrftRef;
	}

	public void setArcExtDrftRef(Boolean arcExtDrftRef) {
		this.arcExtDrftRef = arcExtDrftRef;
	}

	public Double getArcDrftMin() {
		return this.arcDrftMin;
	}

	public void setArcDrftMin(Double arcDrftMin) {
		this.arcDrftMin = arcDrftMin;
	}

	public Double getArcDrftMax() {
		return this.arcDrftMax;
	}

	public void setArcDrftMax(Double arcDrftMax) {
		this.arcDrftMax = arcDrftMax;
	}

	public String getArcQadc01() {
		return this.arcQadc01;
	}

	public void setArcQadc01(String arcQadc01) {
		this.arcQadc01 = arcQadc01;
	}

	public String getArcQadc02() {
		return this.arcQadc02;
	}

	public void setArcQadc02(String arcQadc02) {
		this.arcQadc02 = arcQadc02;
	}

	public String getArcExRatetype() {
		return this.arcExRatetype;
	}

	public void setArcExRatetype(String arcExRatetype) {
		this.arcExRatetype = arcExRatetype;
	}

	public Integer getArcSumLvl() {
		return this.arcSumLvl;
	}

	public void setArcSumLvl(Integer arcSumLvl) {
		this.arcSumLvl = arcSumLvl;
	}

	public String getArcDrftSub() {
		return this.arcDrftSub;
	}

	public void setArcDrftSub(String arcDrftSub) {
		this.arcDrftSub = arcDrftSub;
	}

	public String getArcQadc04() {
		return this.arcQadc04;
	}

	public void setArcQadc04(String arcQadc04) {
		this.arcQadc04 = arcQadc04;
	}

	public Double getOidArcCtrl() {
		return this.oidArcCtrl;
	}

	public void setOidArcCtrl(Double oidArcCtrl) {
		this.oidArcCtrl = oidArcCtrl;
	}

}