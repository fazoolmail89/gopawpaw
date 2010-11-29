package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractApcCtrl entity provides the base persistence definition of the
 * ApcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractApcCtrl implements java.io.Serializable {

	// Fields

	private String apcDomain;
	private Integer apcBatch;
	private Integer apcVoucher;
	private Integer apcJrnl;
	private Boolean apcVchrAll;
	private Boolean apcGlSum;
	private Integer apcQad01;
	private String apcCkfrm;
	private String apcUser1;
	private String apcUser2;
	private String apcShip;
	private String apcQad03;
	private Date apcQad02;
	private Integer apcQadi01;
	private Double apcExTol;
	private String apcBank;
	private String apcQadc03;
	private String apcQadc05;
	private Boolean apcConfirm;
	private Boolean apcPip;
	private String apcVoPre;
	private String apcQadc01;
	private String apcQadc02;
	private Boolean apcUseDrft;
	private Boolean apcExpvar;
	private Boolean apcRvConf;
	private Boolean apcApprov;
	private Boolean apcExtRef;
	private Boolean apcQad04;
	private Boolean apcErsPsErr;
	private Boolean apcGlAvgCst;
	private Integer apcErsVoTp;
	private String apcExRatetype;
	private Integer apcSumLvl;
	private String apcQadc04;
	private Boolean apcMultiEntityPay;
	private Double oidApcCtrl;

	// Constructors

	/** default constructor */
	public AbstractApcCtrl() {
	}

	/** minimal constructor */
	public AbstractApcCtrl(String apcExRatetype, Boolean apcMultiEntityPay,
			Double oidApcCtrl) {
		this.apcExRatetype = apcExRatetype;
		this.apcMultiEntityPay = apcMultiEntityPay;
		this.oidApcCtrl = oidApcCtrl;
	}

	/** full constructor */
	public AbstractApcCtrl(Integer apcBatch, Integer apcVoucher,
			Integer apcJrnl, Boolean apcVchrAll, Boolean apcGlSum,
			Integer apcQad01, String apcCkfrm, String apcUser1,
			String apcUser2, String apcShip, String apcQad03, Date apcQad02,
			Integer apcQadi01, Double apcExTol, String apcBank,
			String apcQadc03, String apcQadc05, Boolean apcConfirm,
			Boolean apcPip, String apcVoPre, String apcQadc01,
			String apcQadc02, Boolean apcUseDrft, Boolean apcExpvar,
			Boolean apcRvConf, Boolean apcApprov, Boolean apcExtRef,
			Boolean apcQad04, Boolean apcErsPsErr, Boolean apcGlAvgCst,
			Integer apcErsVoTp, String apcExRatetype, Integer apcSumLvl,
			String apcQadc04, Boolean apcMultiEntityPay, Double oidApcCtrl) {
		this.apcBatch = apcBatch;
		this.apcVoucher = apcVoucher;
		this.apcJrnl = apcJrnl;
		this.apcVchrAll = apcVchrAll;
		this.apcGlSum = apcGlSum;
		this.apcQad01 = apcQad01;
		this.apcCkfrm = apcCkfrm;
		this.apcUser1 = apcUser1;
		this.apcUser2 = apcUser2;
		this.apcShip = apcShip;
		this.apcQad03 = apcQad03;
		this.apcQad02 = apcQad02;
		this.apcQadi01 = apcQadi01;
		this.apcExTol = apcExTol;
		this.apcBank = apcBank;
		this.apcQadc03 = apcQadc03;
		this.apcQadc05 = apcQadc05;
		this.apcConfirm = apcConfirm;
		this.apcPip = apcPip;
		this.apcVoPre = apcVoPre;
		this.apcQadc01 = apcQadc01;
		this.apcQadc02 = apcQadc02;
		this.apcUseDrft = apcUseDrft;
		this.apcExpvar = apcExpvar;
		this.apcRvConf = apcRvConf;
		this.apcApprov = apcApprov;
		this.apcExtRef = apcExtRef;
		this.apcQad04 = apcQad04;
		this.apcErsPsErr = apcErsPsErr;
		this.apcGlAvgCst = apcGlAvgCst;
		this.apcErsVoTp = apcErsVoTp;
		this.apcExRatetype = apcExRatetype;
		this.apcSumLvl = apcSumLvl;
		this.apcQadc04 = apcQadc04;
		this.apcMultiEntityPay = apcMultiEntityPay;
		this.oidApcCtrl = oidApcCtrl;
	}

	// Property accessors

	public String getApcDomain() {
		return this.apcDomain;
	}

	public void setApcDomain(String apcDomain) {
		this.apcDomain = apcDomain;
	}

	public Integer getApcBatch() {
		return this.apcBatch;
	}

	public void setApcBatch(Integer apcBatch) {
		this.apcBatch = apcBatch;
	}

	public Integer getApcVoucher() {
		return this.apcVoucher;
	}

	public void setApcVoucher(Integer apcVoucher) {
		this.apcVoucher = apcVoucher;
	}

	public Integer getApcJrnl() {
		return this.apcJrnl;
	}

	public void setApcJrnl(Integer apcJrnl) {
		this.apcJrnl = apcJrnl;
	}

	public Boolean getApcVchrAll() {
		return this.apcVchrAll;
	}

	public void setApcVchrAll(Boolean apcVchrAll) {
		this.apcVchrAll = apcVchrAll;
	}

	public Boolean getApcGlSum() {
		return this.apcGlSum;
	}

	public void setApcGlSum(Boolean apcGlSum) {
		this.apcGlSum = apcGlSum;
	}

	public Integer getApcQad01() {
		return this.apcQad01;
	}

	public void setApcQad01(Integer apcQad01) {
		this.apcQad01 = apcQad01;
	}

	public String getApcCkfrm() {
		return this.apcCkfrm;
	}

	public void setApcCkfrm(String apcCkfrm) {
		this.apcCkfrm = apcCkfrm;
	}

	public String getApcUser1() {
		return this.apcUser1;
	}

	public void setApcUser1(String apcUser1) {
		this.apcUser1 = apcUser1;
	}

	public String getApcUser2() {
		return this.apcUser2;
	}

	public void setApcUser2(String apcUser2) {
		this.apcUser2 = apcUser2;
	}

	public String getApcShip() {
		return this.apcShip;
	}

	public void setApcShip(String apcShip) {
		this.apcShip = apcShip;
	}

	public String getApcQad03() {
		return this.apcQad03;
	}

	public void setApcQad03(String apcQad03) {
		this.apcQad03 = apcQad03;
	}

	public Date getApcQad02() {
		return this.apcQad02;
	}

	public void setApcQad02(Date apcQad02) {
		this.apcQad02 = apcQad02;
	}

	public Integer getApcQadi01() {
		return this.apcQadi01;
	}

	public void setApcQadi01(Integer apcQadi01) {
		this.apcQadi01 = apcQadi01;
	}

	public Double getApcExTol() {
		return this.apcExTol;
	}

	public void setApcExTol(Double apcExTol) {
		this.apcExTol = apcExTol;
	}

	public String getApcBank() {
		return this.apcBank;
	}

	public void setApcBank(String apcBank) {
		this.apcBank = apcBank;
	}

	public String getApcQadc03() {
		return this.apcQadc03;
	}

	public void setApcQadc03(String apcQadc03) {
		this.apcQadc03 = apcQadc03;
	}

	public String getApcQadc05() {
		return this.apcQadc05;
	}

	public void setApcQadc05(String apcQadc05) {
		this.apcQadc05 = apcQadc05;
	}

	public Boolean getApcConfirm() {
		return this.apcConfirm;
	}

	public void setApcConfirm(Boolean apcConfirm) {
		this.apcConfirm = apcConfirm;
	}

	public Boolean getApcPip() {
		return this.apcPip;
	}

	public void setApcPip(Boolean apcPip) {
		this.apcPip = apcPip;
	}

	public String getApcVoPre() {
		return this.apcVoPre;
	}

	public void setApcVoPre(String apcVoPre) {
		this.apcVoPre = apcVoPre;
	}

	public String getApcQadc01() {
		return this.apcQadc01;
	}

	public void setApcQadc01(String apcQadc01) {
		this.apcQadc01 = apcQadc01;
	}

	public String getApcQadc02() {
		return this.apcQadc02;
	}

	public void setApcQadc02(String apcQadc02) {
		this.apcQadc02 = apcQadc02;
	}

	public Boolean getApcUseDrft() {
		return this.apcUseDrft;
	}

	public void setApcUseDrft(Boolean apcUseDrft) {
		this.apcUseDrft = apcUseDrft;
	}

	public Boolean getApcExpvar() {
		return this.apcExpvar;
	}

	public void setApcExpvar(Boolean apcExpvar) {
		this.apcExpvar = apcExpvar;
	}

	public Boolean getApcRvConf() {
		return this.apcRvConf;
	}

	public void setApcRvConf(Boolean apcRvConf) {
		this.apcRvConf = apcRvConf;
	}

	public Boolean getApcApprov() {
		return this.apcApprov;
	}

	public void setApcApprov(Boolean apcApprov) {
		this.apcApprov = apcApprov;
	}

	public Boolean getApcExtRef() {
		return this.apcExtRef;
	}

	public void setApcExtRef(Boolean apcExtRef) {
		this.apcExtRef = apcExtRef;
	}

	public Boolean getApcQad04() {
		return this.apcQad04;
	}

	public void setApcQad04(Boolean apcQad04) {
		this.apcQad04 = apcQad04;
	}

	public Boolean getApcErsPsErr() {
		return this.apcErsPsErr;
	}

	public void setApcErsPsErr(Boolean apcErsPsErr) {
		this.apcErsPsErr = apcErsPsErr;
	}

	public Boolean getApcGlAvgCst() {
		return this.apcGlAvgCst;
	}

	public void setApcGlAvgCst(Boolean apcGlAvgCst) {
		this.apcGlAvgCst = apcGlAvgCst;
	}

	public Integer getApcErsVoTp() {
		return this.apcErsVoTp;
	}

	public void setApcErsVoTp(Integer apcErsVoTp) {
		this.apcErsVoTp = apcErsVoTp;
	}

	public String getApcExRatetype() {
		return this.apcExRatetype;
	}

	public void setApcExRatetype(String apcExRatetype) {
		this.apcExRatetype = apcExRatetype;
	}

	public Integer getApcSumLvl() {
		return this.apcSumLvl;
	}

	public void setApcSumLvl(Integer apcSumLvl) {
		this.apcSumLvl = apcSumLvl;
	}

	public String getApcQadc04() {
		return this.apcQadc04;
	}

	public void setApcQadc04(String apcQadc04) {
		this.apcQadc04 = apcQadc04;
	}

	public Boolean getApcMultiEntityPay() {
		return this.apcMultiEntityPay;
	}

	public void setApcMultiEntityPay(Boolean apcMultiEntityPay) {
		this.apcMultiEntityPay = apcMultiEntityPay;
	}

	public Double getOidApcCtrl() {
		return this.oidApcCtrl;
	}

	public void setOidApcCtrl(Double oidApcCtrl) {
		this.oidApcCtrl = oidApcCtrl;
	}

}