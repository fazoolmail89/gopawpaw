package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPvoMstr entity provides the base persistence definition of the
 * PvoMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPvoMstr implements java.io.Serializable {

	// Fields

	private PvoMstrId id;
	private String pvoBuyer;
	private String pvoLcCharge;
	private String pvoSupplier;
	private String pvoInternalRefType;
	private String pvoInternalRef;
	private String pvoExternalRef;
	private Date pvoTransDate;
	private Date pvoEffDate;
	private Boolean pvoCostUpdate;
	private String pvoLastVoucher;
	private Integer pvoErsStatus;
	private Integer pvoErsOpt;
	private Integer pvoErsPriceLstOpt;
	private String pvoShipfrom;
	private String pvoShipto;
	private String pvoOrderType;
	private String pvoOrder;
	private Integer pvoLine;
	private String pvoPart;
	private Double pvoTransQty;
	private Double pvoVoucheredQty;
	private String pvoCurr;
	private Double pvoExRate;
	private Double pvoExRate2;
	private String pvoExRatetype;
	private Integer pvoExruSeq;
	private Double pvoAccruedAmt;
	private Double pvoVoucheredAmt;
	private String pvoAccrualAcct;
	private String pvoAccrualSub;
	private String pvoAccrualCc;
	private String pvoProject;
	private Boolean pvoTaxable;
	private String pvoTaxc;
	private String pvoTaxEnv;
	private Boolean pvoTaxIn;
	private String pvoTaxUsage;
	private String pvoApprover;
	private Boolean pvoConsignment;
	private String pvoModUserid;
	private Date pvoModDate;
	private String pvoUser1;
	private String pvoUser2;
	private String pvoQadc01;
	private String pvoQadc02;
	private String pvoQadc03;
	private Double pvoQadd01;
	private Double oidPvoMstr;

	// Constructors

	/** default constructor */
	public AbstractPvoMstr() {
	}

	/** full constructor */
	public AbstractPvoMstr(PvoMstrId id, String pvoBuyer, String pvoLcCharge,
			String pvoSupplier, String pvoInternalRefType,
			String pvoInternalRef, String pvoExternalRef, Date pvoTransDate,
			Date pvoEffDate, Boolean pvoCostUpdate, String pvoLastVoucher,
			Integer pvoErsStatus, Integer pvoErsOpt, Integer pvoErsPriceLstOpt,
			String pvoShipfrom, String pvoShipto, String pvoOrderType,
			String pvoOrder, Integer pvoLine, String pvoPart,
			Double pvoTransQty, Double pvoVoucheredQty, String pvoCurr,
			Double pvoExRate, Double pvoExRate2, String pvoExRatetype,
			Integer pvoExruSeq, Double pvoAccruedAmt, Double pvoVoucheredAmt,
			String pvoAccrualAcct, String pvoAccrualSub, String pvoAccrualCc,
			String pvoProject, Boolean pvoTaxable, String pvoTaxc,
			String pvoTaxEnv, Boolean pvoTaxIn, String pvoTaxUsage,
			String pvoApprover, Boolean pvoConsignment, String pvoModUserid,
			Date pvoModDate, String pvoUser1, String pvoUser2,
			String pvoQadc01, String pvoQadc02, String pvoQadc03,
			Double pvoQadd01, Double oidPvoMstr) {
		this.id = id;
		this.pvoBuyer = pvoBuyer;
		this.pvoLcCharge = pvoLcCharge;
		this.pvoSupplier = pvoSupplier;
		this.pvoInternalRefType = pvoInternalRefType;
		this.pvoInternalRef = pvoInternalRef;
		this.pvoExternalRef = pvoExternalRef;
		this.pvoTransDate = pvoTransDate;
		this.pvoEffDate = pvoEffDate;
		this.pvoCostUpdate = pvoCostUpdate;
		this.pvoLastVoucher = pvoLastVoucher;
		this.pvoErsStatus = pvoErsStatus;
		this.pvoErsOpt = pvoErsOpt;
		this.pvoErsPriceLstOpt = pvoErsPriceLstOpt;
		this.pvoShipfrom = pvoShipfrom;
		this.pvoShipto = pvoShipto;
		this.pvoOrderType = pvoOrderType;
		this.pvoOrder = pvoOrder;
		this.pvoLine = pvoLine;
		this.pvoPart = pvoPart;
		this.pvoTransQty = pvoTransQty;
		this.pvoVoucheredQty = pvoVoucheredQty;
		this.pvoCurr = pvoCurr;
		this.pvoExRate = pvoExRate;
		this.pvoExRate2 = pvoExRate2;
		this.pvoExRatetype = pvoExRatetype;
		this.pvoExruSeq = pvoExruSeq;
		this.pvoAccruedAmt = pvoAccruedAmt;
		this.pvoVoucheredAmt = pvoVoucheredAmt;
		this.pvoAccrualAcct = pvoAccrualAcct;
		this.pvoAccrualSub = pvoAccrualSub;
		this.pvoAccrualCc = pvoAccrualCc;
		this.pvoProject = pvoProject;
		this.pvoTaxable = pvoTaxable;
		this.pvoTaxc = pvoTaxc;
		this.pvoTaxEnv = pvoTaxEnv;
		this.pvoTaxIn = pvoTaxIn;
		this.pvoTaxUsage = pvoTaxUsage;
		this.pvoApprover = pvoApprover;
		this.pvoConsignment = pvoConsignment;
		this.pvoModUserid = pvoModUserid;
		this.pvoModDate = pvoModDate;
		this.pvoUser1 = pvoUser1;
		this.pvoUser2 = pvoUser2;
		this.pvoQadc01 = pvoQadc01;
		this.pvoQadc02 = pvoQadc02;
		this.pvoQadc03 = pvoQadc03;
		this.pvoQadd01 = pvoQadd01;
		this.oidPvoMstr = oidPvoMstr;
	}

	// Property accessors

	public PvoMstrId getId() {
		return this.id;
	}

	public void setId(PvoMstrId id) {
		this.id = id;
	}

	public String getPvoBuyer() {
		return this.pvoBuyer;
	}

	public void setPvoBuyer(String pvoBuyer) {
		this.pvoBuyer = pvoBuyer;
	}

	public String getPvoLcCharge() {
		return this.pvoLcCharge;
	}

	public void setPvoLcCharge(String pvoLcCharge) {
		this.pvoLcCharge = pvoLcCharge;
	}

	public String getPvoSupplier() {
		return this.pvoSupplier;
	}

	public void setPvoSupplier(String pvoSupplier) {
		this.pvoSupplier = pvoSupplier;
	}

	public String getPvoInternalRefType() {
		return this.pvoInternalRefType;
	}

	public void setPvoInternalRefType(String pvoInternalRefType) {
		this.pvoInternalRefType = pvoInternalRefType;
	}

	public String getPvoInternalRef() {
		return this.pvoInternalRef;
	}

	public void setPvoInternalRef(String pvoInternalRef) {
		this.pvoInternalRef = pvoInternalRef;
	}

	public String getPvoExternalRef() {
		return this.pvoExternalRef;
	}

	public void setPvoExternalRef(String pvoExternalRef) {
		this.pvoExternalRef = pvoExternalRef;
	}

	public Date getPvoTransDate() {
		return this.pvoTransDate;
	}

	public void setPvoTransDate(Date pvoTransDate) {
		this.pvoTransDate = pvoTransDate;
	}

	public Date getPvoEffDate() {
		return this.pvoEffDate;
	}

	public void setPvoEffDate(Date pvoEffDate) {
		this.pvoEffDate = pvoEffDate;
	}

	public Boolean getPvoCostUpdate() {
		return this.pvoCostUpdate;
	}

	public void setPvoCostUpdate(Boolean pvoCostUpdate) {
		this.pvoCostUpdate = pvoCostUpdate;
	}

	public String getPvoLastVoucher() {
		return this.pvoLastVoucher;
	}

	public void setPvoLastVoucher(String pvoLastVoucher) {
		this.pvoLastVoucher = pvoLastVoucher;
	}

	public Integer getPvoErsStatus() {
		return this.pvoErsStatus;
	}

	public void setPvoErsStatus(Integer pvoErsStatus) {
		this.pvoErsStatus = pvoErsStatus;
	}

	public Integer getPvoErsOpt() {
		return this.pvoErsOpt;
	}

	public void setPvoErsOpt(Integer pvoErsOpt) {
		this.pvoErsOpt = pvoErsOpt;
	}

	public Integer getPvoErsPriceLstOpt() {
		return this.pvoErsPriceLstOpt;
	}

	public void setPvoErsPriceLstOpt(Integer pvoErsPriceLstOpt) {
		this.pvoErsPriceLstOpt = pvoErsPriceLstOpt;
	}

	public String getPvoShipfrom() {
		return this.pvoShipfrom;
	}

	public void setPvoShipfrom(String pvoShipfrom) {
		this.pvoShipfrom = pvoShipfrom;
	}

	public String getPvoShipto() {
		return this.pvoShipto;
	}

	public void setPvoShipto(String pvoShipto) {
		this.pvoShipto = pvoShipto;
	}

	public String getPvoOrderType() {
		return this.pvoOrderType;
	}

	public void setPvoOrderType(String pvoOrderType) {
		this.pvoOrderType = pvoOrderType;
	}

	public String getPvoOrder() {
		return this.pvoOrder;
	}

	public void setPvoOrder(String pvoOrder) {
		this.pvoOrder = pvoOrder;
	}

	public Integer getPvoLine() {
		return this.pvoLine;
	}

	public void setPvoLine(Integer pvoLine) {
		this.pvoLine = pvoLine;
	}

	public String getPvoPart() {
		return this.pvoPart;
	}

	public void setPvoPart(String pvoPart) {
		this.pvoPart = pvoPart;
	}

	public Double getPvoTransQty() {
		return this.pvoTransQty;
	}

	public void setPvoTransQty(Double pvoTransQty) {
		this.pvoTransQty = pvoTransQty;
	}

	public Double getPvoVoucheredQty() {
		return this.pvoVoucheredQty;
	}

	public void setPvoVoucheredQty(Double pvoVoucheredQty) {
		this.pvoVoucheredQty = pvoVoucheredQty;
	}

	public String getPvoCurr() {
		return this.pvoCurr;
	}

	public void setPvoCurr(String pvoCurr) {
		this.pvoCurr = pvoCurr;
	}

	public Double getPvoExRate() {
		return this.pvoExRate;
	}

	public void setPvoExRate(Double pvoExRate) {
		this.pvoExRate = pvoExRate;
	}

	public Double getPvoExRate2() {
		return this.pvoExRate2;
	}

	public void setPvoExRate2(Double pvoExRate2) {
		this.pvoExRate2 = pvoExRate2;
	}

	public String getPvoExRatetype() {
		return this.pvoExRatetype;
	}

	public void setPvoExRatetype(String pvoExRatetype) {
		this.pvoExRatetype = pvoExRatetype;
	}

	public Integer getPvoExruSeq() {
		return this.pvoExruSeq;
	}

	public void setPvoExruSeq(Integer pvoExruSeq) {
		this.pvoExruSeq = pvoExruSeq;
	}

	public Double getPvoAccruedAmt() {
		return this.pvoAccruedAmt;
	}

	public void setPvoAccruedAmt(Double pvoAccruedAmt) {
		this.pvoAccruedAmt = pvoAccruedAmt;
	}

	public Double getPvoVoucheredAmt() {
		return this.pvoVoucheredAmt;
	}

	public void setPvoVoucheredAmt(Double pvoVoucheredAmt) {
		this.pvoVoucheredAmt = pvoVoucheredAmt;
	}

	public String getPvoAccrualAcct() {
		return this.pvoAccrualAcct;
	}

	public void setPvoAccrualAcct(String pvoAccrualAcct) {
		this.pvoAccrualAcct = pvoAccrualAcct;
	}

	public String getPvoAccrualSub() {
		return this.pvoAccrualSub;
	}

	public void setPvoAccrualSub(String pvoAccrualSub) {
		this.pvoAccrualSub = pvoAccrualSub;
	}

	public String getPvoAccrualCc() {
		return this.pvoAccrualCc;
	}

	public void setPvoAccrualCc(String pvoAccrualCc) {
		this.pvoAccrualCc = pvoAccrualCc;
	}

	public String getPvoProject() {
		return this.pvoProject;
	}

	public void setPvoProject(String pvoProject) {
		this.pvoProject = pvoProject;
	}

	public Boolean getPvoTaxable() {
		return this.pvoTaxable;
	}

	public void setPvoTaxable(Boolean pvoTaxable) {
		this.pvoTaxable = pvoTaxable;
	}

	public String getPvoTaxc() {
		return this.pvoTaxc;
	}

	public void setPvoTaxc(String pvoTaxc) {
		this.pvoTaxc = pvoTaxc;
	}

	public String getPvoTaxEnv() {
		return this.pvoTaxEnv;
	}

	public void setPvoTaxEnv(String pvoTaxEnv) {
		this.pvoTaxEnv = pvoTaxEnv;
	}

	public Boolean getPvoTaxIn() {
		return this.pvoTaxIn;
	}

	public void setPvoTaxIn(Boolean pvoTaxIn) {
		this.pvoTaxIn = pvoTaxIn;
	}

	public String getPvoTaxUsage() {
		return this.pvoTaxUsage;
	}

	public void setPvoTaxUsage(String pvoTaxUsage) {
		this.pvoTaxUsage = pvoTaxUsage;
	}

	public String getPvoApprover() {
		return this.pvoApprover;
	}

	public void setPvoApprover(String pvoApprover) {
		this.pvoApprover = pvoApprover;
	}

	public Boolean getPvoConsignment() {
		return this.pvoConsignment;
	}

	public void setPvoConsignment(Boolean pvoConsignment) {
		this.pvoConsignment = pvoConsignment;
	}

	public String getPvoModUserid() {
		return this.pvoModUserid;
	}

	public void setPvoModUserid(String pvoModUserid) {
		this.pvoModUserid = pvoModUserid;
	}

	public Date getPvoModDate() {
		return this.pvoModDate;
	}

	public void setPvoModDate(Date pvoModDate) {
		this.pvoModDate = pvoModDate;
	}

	public String getPvoUser1() {
		return this.pvoUser1;
	}

	public void setPvoUser1(String pvoUser1) {
		this.pvoUser1 = pvoUser1;
	}

	public String getPvoUser2() {
		return this.pvoUser2;
	}

	public void setPvoUser2(String pvoUser2) {
		this.pvoUser2 = pvoUser2;
	}

	public String getPvoQadc01() {
		return this.pvoQadc01;
	}

	public void setPvoQadc01(String pvoQadc01) {
		this.pvoQadc01 = pvoQadc01;
	}

	public String getPvoQadc02() {
		return this.pvoQadc02;
	}

	public void setPvoQadc02(String pvoQadc02) {
		this.pvoQadc02 = pvoQadc02;
	}

	public String getPvoQadc03() {
		return this.pvoQadc03;
	}

	public void setPvoQadc03(String pvoQadc03) {
		this.pvoQadc03 = pvoQadc03;
	}

	public Double getPvoQadd01() {
		return this.pvoQadd01;
	}

	public void setPvoQadd01(Double pvoQadd01) {
		this.pvoQadd01 = pvoQadd01;
	}

	public Double getOidPvoMstr() {
		return this.oidPvoMstr;
	}

	public void setOidPvoMstr(Double oidPvoMstr) {
		this.oidPvoMstr = oidPvoMstr;
	}

}