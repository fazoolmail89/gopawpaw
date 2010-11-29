package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBkpmMstr entity provides the base persistence definition of the
 * BkpmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkpmMstr implements java.io.Serializable {

	// Fields

	private BkpmMstrId id;
	private String bkpmFilename;
	private Date bkpmCreateDate;
	private String bkpmCreateTime;
	private String bkpmBkAcct;
	private Boolean bkpmProcessed;
	private Date bkpmCkDate;
	private Double bkpmMaxAmt;
	private Boolean bkpmReconCredit;
	private Double bkpmAmt;
	private String bkpmMediaNbr;
	private String bkpmUser1;
	private String bkpmUser2;
	private String bkpmUserc03;
	private String bkpmUserc04;
	private Date bkpmUsert01;
	private Date bkpmUsert02;
	private Boolean bkpmUserl01;
	private Boolean bkpmUserl02;
	private String bkpmQadc01;
	private String bkpmQadc02;
	private String bkpmBatch;
	private Boolean bkpmExceedBalance;
	private String bkpmFullBkAcct;
	private String bkpmCompAddr;
	private Date bkpmModDate;
	private String bkpmModUserid;
	private String bkpmUserc05;
	private Double bkpmUserd01;
	private Double bkpmUserd02;
	private Integer bkpmUseri01;
	private Integer bkpmUseri02;
	private String bkpmQadc03;
	private String bkpmQadc04;
	private String bkpmQadc05;
	private Double bkpmQadd01;
	private Double bkpmQadd02;
	private Integer bkpmQadi01;
	private Integer bkpmQadi02;
	private Boolean bkpmQadl01;
	private Boolean bkpmQadl02;
	private Date bkpmQadt01;
	private Date bkpmQadt02;
	private Double oidBkpmMstr;

	// Constructors

	/** default constructor */
	public AbstractBkpmMstr() {
	}

	/** minimal constructor */
	public AbstractBkpmMstr(BkpmMstrId id, String bkpmFilename,
			String bkpmCreateTime, String bkpmBkAcct, Boolean bkpmProcessed,
			Double bkpmMaxAmt, Boolean bkpmReconCredit, Double bkpmAmt,
			String bkpmMediaNbr, String bkpmUser1, String bkpmUser2,
			String bkpmUserc03, String bkpmUserc04, Boolean bkpmUserl01,
			Boolean bkpmUserl02, String bkpmQadc01, String bkpmQadc02,
			String bkpmBatch, Boolean bkpmExceedBalance, String bkpmFullBkAcct,
			String bkpmCompAddr, Date bkpmModDate, String bkpmModUserid,
			String bkpmUserc05, Double bkpmUserd01, Double bkpmUserd02,
			Integer bkpmUseri01, Integer bkpmUseri02, String bkpmQadc03,
			String bkpmQadc04, String bkpmQadc05, Double bkpmQadd01,
			Double bkpmQadd02, Integer bkpmQadi01, Integer bkpmQadi02,
			Boolean bkpmQadl01, Boolean bkpmQadl02, Double oidBkpmMstr) {
		this.id = id;
		this.bkpmFilename = bkpmFilename;
		this.bkpmCreateTime = bkpmCreateTime;
		this.bkpmBkAcct = bkpmBkAcct;
		this.bkpmProcessed = bkpmProcessed;
		this.bkpmMaxAmt = bkpmMaxAmt;
		this.bkpmReconCredit = bkpmReconCredit;
		this.bkpmAmt = bkpmAmt;
		this.bkpmMediaNbr = bkpmMediaNbr;
		this.bkpmUser1 = bkpmUser1;
		this.bkpmUser2 = bkpmUser2;
		this.bkpmUserc03 = bkpmUserc03;
		this.bkpmUserc04 = bkpmUserc04;
		this.bkpmUserl01 = bkpmUserl01;
		this.bkpmUserl02 = bkpmUserl02;
		this.bkpmQadc01 = bkpmQadc01;
		this.bkpmQadc02 = bkpmQadc02;
		this.bkpmBatch = bkpmBatch;
		this.bkpmExceedBalance = bkpmExceedBalance;
		this.bkpmFullBkAcct = bkpmFullBkAcct;
		this.bkpmCompAddr = bkpmCompAddr;
		this.bkpmModDate = bkpmModDate;
		this.bkpmModUserid = bkpmModUserid;
		this.bkpmUserc05 = bkpmUserc05;
		this.bkpmUserd01 = bkpmUserd01;
		this.bkpmUserd02 = bkpmUserd02;
		this.bkpmUseri01 = bkpmUseri01;
		this.bkpmUseri02 = bkpmUseri02;
		this.bkpmQadc03 = bkpmQadc03;
		this.bkpmQadc04 = bkpmQadc04;
		this.bkpmQadc05 = bkpmQadc05;
		this.bkpmQadd01 = bkpmQadd01;
		this.bkpmQadd02 = bkpmQadd02;
		this.bkpmQadi01 = bkpmQadi01;
		this.bkpmQadi02 = bkpmQadi02;
		this.bkpmQadl01 = bkpmQadl01;
		this.bkpmQadl02 = bkpmQadl02;
		this.oidBkpmMstr = oidBkpmMstr;
	}

	/** full constructor */
	public AbstractBkpmMstr(BkpmMstrId id, String bkpmFilename,
			Date bkpmCreateDate, String bkpmCreateTime, String bkpmBkAcct,
			Boolean bkpmProcessed, Date bkpmCkDate, Double bkpmMaxAmt,
			Boolean bkpmReconCredit, Double bkpmAmt, String bkpmMediaNbr,
			String bkpmUser1, String bkpmUser2, String bkpmUserc03,
			String bkpmUserc04, Date bkpmUsert01, Date bkpmUsert02,
			Boolean bkpmUserl01, Boolean bkpmUserl02, String bkpmQadc01,
			String bkpmQadc02, String bkpmBatch, Boolean bkpmExceedBalance,
			String bkpmFullBkAcct, String bkpmCompAddr, Date bkpmModDate,
			String bkpmModUserid, String bkpmUserc05, Double bkpmUserd01,
			Double bkpmUserd02, Integer bkpmUseri01, Integer bkpmUseri02,
			String bkpmQadc03, String bkpmQadc04, String bkpmQadc05,
			Double bkpmQadd01, Double bkpmQadd02, Integer bkpmQadi01,
			Integer bkpmQadi02, Boolean bkpmQadl01, Boolean bkpmQadl02,
			Date bkpmQadt01, Date bkpmQadt02, Double oidBkpmMstr) {
		this.id = id;
		this.bkpmFilename = bkpmFilename;
		this.bkpmCreateDate = bkpmCreateDate;
		this.bkpmCreateTime = bkpmCreateTime;
		this.bkpmBkAcct = bkpmBkAcct;
		this.bkpmProcessed = bkpmProcessed;
		this.bkpmCkDate = bkpmCkDate;
		this.bkpmMaxAmt = bkpmMaxAmt;
		this.bkpmReconCredit = bkpmReconCredit;
		this.bkpmAmt = bkpmAmt;
		this.bkpmMediaNbr = bkpmMediaNbr;
		this.bkpmUser1 = bkpmUser1;
		this.bkpmUser2 = bkpmUser2;
		this.bkpmUserc03 = bkpmUserc03;
		this.bkpmUserc04 = bkpmUserc04;
		this.bkpmUsert01 = bkpmUsert01;
		this.bkpmUsert02 = bkpmUsert02;
		this.bkpmUserl01 = bkpmUserl01;
		this.bkpmUserl02 = bkpmUserl02;
		this.bkpmQadc01 = bkpmQadc01;
		this.bkpmQadc02 = bkpmQadc02;
		this.bkpmBatch = bkpmBatch;
		this.bkpmExceedBalance = bkpmExceedBalance;
		this.bkpmFullBkAcct = bkpmFullBkAcct;
		this.bkpmCompAddr = bkpmCompAddr;
		this.bkpmModDate = bkpmModDate;
		this.bkpmModUserid = bkpmModUserid;
		this.bkpmUserc05 = bkpmUserc05;
		this.bkpmUserd01 = bkpmUserd01;
		this.bkpmUserd02 = bkpmUserd02;
		this.bkpmUseri01 = bkpmUseri01;
		this.bkpmUseri02 = bkpmUseri02;
		this.bkpmQadc03 = bkpmQadc03;
		this.bkpmQadc04 = bkpmQadc04;
		this.bkpmQadc05 = bkpmQadc05;
		this.bkpmQadd01 = bkpmQadd01;
		this.bkpmQadd02 = bkpmQadd02;
		this.bkpmQadi01 = bkpmQadi01;
		this.bkpmQadi02 = bkpmQadi02;
		this.bkpmQadl01 = bkpmQadl01;
		this.bkpmQadl02 = bkpmQadl02;
		this.bkpmQadt01 = bkpmQadt01;
		this.bkpmQadt02 = bkpmQadt02;
		this.oidBkpmMstr = oidBkpmMstr;
	}

	// Property accessors

	public BkpmMstrId getId() {
		return this.id;
	}

	public void setId(BkpmMstrId id) {
		this.id = id;
	}

	public String getBkpmFilename() {
		return this.bkpmFilename;
	}

	public void setBkpmFilename(String bkpmFilename) {
		this.bkpmFilename = bkpmFilename;
	}

	public Date getBkpmCreateDate() {
		return this.bkpmCreateDate;
	}

	public void setBkpmCreateDate(Date bkpmCreateDate) {
		this.bkpmCreateDate = bkpmCreateDate;
	}

	public String getBkpmCreateTime() {
		return this.bkpmCreateTime;
	}

	public void setBkpmCreateTime(String bkpmCreateTime) {
		this.bkpmCreateTime = bkpmCreateTime;
	}

	public String getBkpmBkAcct() {
		return this.bkpmBkAcct;
	}

	public void setBkpmBkAcct(String bkpmBkAcct) {
		this.bkpmBkAcct = bkpmBkAcct;
	}

	public Boolean getBkpmProcessed() {
		return this.bkpmProcessed;
	}

	public void setBkpmProcessed(Boolean bkpmProcessed) {
		this.bkpmProcessed = bkpmProcessed;
	}

	public Date getBkpmCkDate() {
		return this.bkpmCkDate;
	}

	public void setBkpmCkDate(Date bkpmCkDate) {
		this.bkpmCkDate = bkpmCkDate;
	}

	public Double getBkpmMaxAmt() {
		return this.bkpmMaxAmt;
	}

	public void setBkpmMaxAmt(Double bkpmMaxAmt) {
		this.bkpmMaxAmt = bkpmMaxAmt;
	}

	public Boolean getBkpmReconCredit() {
		return this.bkpmReconCredit;
	}

	public void setBkpmReconCredit(Boolean bkpmReconCredit) {
		this.bkpmReconCredit = bkpmReconCredit;
	}

	public Double getBkpmAmt() {
		return this.bkpmAmt;
	}

	public void setBkpmAmt(Double bkpmAmt) {
		this.bkpmAmt = bkpmAmt;
	}

	public String getBkpmMediaNbr() {
		return this.bkpmMediaNbr;
	}

	public void setBkpmMediaNbr(String bkpmMediaNbr) {
		this.bkpmMediaNbr = bkpmMediaNbr;
	}

	public String getBkpmUser1() {
		return this.bkpmUser1;
	}

	public void setBkpmUser1(String bkpmUser1) {
		this.bkpmUser1 = bkpmUser1;
	}

	public String getBkpmUser2() {
		return this.bkpmUser2;
	}

	public void setBkpmUser2(String bkpmUser2) {
		this.bkpmUser2 = bkpmUser2;
	}

	public String getBkpmUserc03() {
		return this.bkpmUserc03;
	}

	public void setBkpmUserc03(String bkpmUserc03) {
		this.bkpmUserc03 = bkpmUserc03;
	}

	public String getBkpmUserc04() {
		return this.bkpmUserc04;
	}

	public void setBkpmUserc04(String bkpmUserc04) {
		this.bkpmUserc04 = bkpmUserc04;
	}

	public Date getBkpmUsert01() {
		return this.bkpmUsert01;
	}

	public void setBkpmUsert01(Date bkpmUsert01) {
		this.bkpmUsert01 = bkpmUsert01;
	}

	public Date getBkpmUsert02() {
		return this.bkpmUsert02;
	}

	public void setBkpmUsert02(Date bkpmUsert02) {
		this.bkpmUsert02 = bkpmUsert02;
	}

	public Boolean getBkpmUserl01() {
		return this.bkpmUserl01;
	}

	public void setBkpmUserl01(Boolean bkpmUserl01) {
		this.bkpmUserl01 = bkpmUserl01;
	}

	public Boolean getBkpmUserl02() {
		return this.bkpmUserl02;
	}

	public void setBkpmUserl02(Boolean bkpmUserl02) {
		this.bkpmUserl02 = bkpmUserl02;
	}

	public String getBkpmQadc01() {
		return this.bkpmQadc01;
	}

	public void setBkpmQadc01(String bkpmQadc01) {
		this.bkpmQadc01 = bkpmQadc01;
	}

	public String getBkpmQadc02() {
		return this.bkpmQadc02;
	}

	public void setBkpmQadc02(String bkpmQadc02) {
		this.bkpmQadc02 = bkpmQadc02;
	}

	public String getBkpmBatch() {
		return this.bkpmBatch;
	}

	public void setBkpmBatch(String bkpmBatch) {
		this.bkpmBatch = bkpmBatch;
	}

	public Boolean getBkpmExceedBalance() {
		return this.bkpmExceedBalance;
	}

	public void setBkpmExceedBalance(Boolean bkpmExceedBalance) {
		this.bkpmExceedBalance = bkpmExceedBalance;
	}

	public String getBkpmFullBkAcct() {
		return this.bkpmFullBkAcct;
	}

	public void setBkpmFullBkAcct(String bkpmFullBkAcct) {
		this.bkpmFullBkAcct = bkpmFullBkAcct;
	}

	public String getBkpmCompAddr() {
		return this.bkpmCompAddr;
	}

	public void setBkpmCompAddr(String bkpmCompAddr) {
		this.bkpmCompAddr = bkpmCompAddr;
	}

	public Date getBkpmModDate() {
		return this.bkpmModDate;
	}

	public void setBkpmModDate(Date bkpmModDate) {
		this.bkpmModDate = bkpmModDate;
	}

	public String getBkpmModUserid() {
		return this.bkpmModUserid;
	}

	public void setBkpmModUserid(String bkpmModUserid) {
		this.bkpmModUserid = bkpmModUserid;
	}

	public String getBkpmUserc05() {
		return this.bkpmUserc05;
	}

	public void setBkpmUserc05(String bkpmUserc05) {
		this.bkpmUserc05 = bkpmUserc05;
	}

	public Double getBkpmUserd01() {
		return this.bkpmUserd01;
	}

	public void setBkpmUserd01(Double bkpmUserd01) {
		this.bkpmUserd01 = bkpmUserd01;
	}

	public Double getBkpmUserd02() {
		return this.bkpmUserd02;
	}

	public void setBkpmUserd02(Double bkpmUserd02) {
		this.bkpmUserd02 = bkpmUserd02;
	}

	public Integer getBkpmUseri01() {
		return this.bkpmUseri01;
	}

	public void setBkpmUseri01(Integer bkpmUseri01) {
		this.bkpmUseri01 = bkpmUseri01;
	}

	public Integer getBkpmUseri02() {
		return this.bkpmUseri02;
	}

	public void setBkpmUseri02(Integer bkpmUseri02) {
		this.bkpmUseri02 = bkpmUseri02;
	}

	public String getBkpmQadc03() {
		return this.bkpmQadc03;
	}

	public void setBkpmQadc03(String bkpmQadc03) {
		this.bkpmQadc03 = bkpmQadc03;
	}

	public String getBkpmQadc04() {
		return this.bkpmQadc04;
	}

	public void setBkpmQadc04(String bkpmQadc04) {
		this.bkpmQadc04 = bkpmQadc04;
	}

	public String getBkpmQadc05() {
		return this.bkpmQadc05;
	}

	public void setBkpmQadc05(String bkpmQadc05) {
		this.bkpmQadc05 = bkpmQadc05;
	}

	public Double getBkpmQadd01() {
		return this.bkpmQadd01;
	}

	public void setBkpmQadd01(Double bkpmQadd01) {
		this.bkpmQadd01 = bkpmQadd01;
	}

	public Double getBkpmQadd02() {
		return this.bkpmQadd02;
	}

	public void setBkpmQadd02(Double bkpmQadd02) {
		this.bkpmQadd02 = bkpmQadd02;
	}

	public Integer getBkpmQadi01() {
		return this.bkpmQadi01;
	}

	public void setBkpmQadi01(Integer bkpmQadi01) {
		this.bkpmQadi01 = bkpmQadi01;
	}

	public Integer getBkpmQadi02() {
		return this.bkpmQadi02;
	}

	public void setBkpmQadi02(Integer bkpmQadi02) {
		this.bkpmQadi02 = bkpmQadi02;
	}

	public Boolean getBkpmQadl01() {
		return this.bkpmQadl01;
	}

	public void setBkpmQadl01(Boolean bkpmQadl01) {
		this.bkpmQadl01 = bkpmQadl01;
	}

	public Boolean getBkpmQadl02() {
		return this.bkpmQadl02;
	}

	public void setBkpmQadl02(Boolean bkpmQadl02) {
		this.bkpmQadl02 = bkpmQadl02;
	}

	public Date getBkpmQadt01() {
		return this.bkpmQadt01;
	}

	public void setBkpmQadt01(Date bkpmQadt01) {
		this.bkpmQadt01 = bkpmQadt01;
	}

	public Date getBkpmQadt02() {
		return this.bkpmQadt02;
	}

	public void setBkpmQadt02(Date bkpmQadt02) {
		this.bkpmQadt02 = bkpmQadt02;
	}

	public Double getOidBkpmMstr() {
		return this.oidBkpmMstr;
	}

	public void setOidBkpmMstr(Double oidBkpmMstr) {
		this.oidBkpmMstr = oidBkpmMstr;
	}

}