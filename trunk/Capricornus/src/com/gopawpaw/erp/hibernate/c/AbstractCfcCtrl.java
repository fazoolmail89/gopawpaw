package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCfcCtrl entity provides the base persistence definition of the
 * CfcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCfcCtrl implements java.io.Serializable {

	// Fields

	private String cfcDomain;
	private Double cfcExTol;
	private Integer cfcQadi01;
	private Integer cfcCfnbr;
	private String cfcNbrPre;
	private String cfcUser1;
	private String cfcUser2;
	private String cfcChr01;
	private String cfcChr02;
	private String cfcChr03;
	private String cfcChr04;
	private String cfcChr05;
	private Double cfcDec01;
	private Double cfcDec02;
	private Date cfcDte01;
	private Date cfcDte02;
	private Boolean cfcLog01;
	private Integer cfcExRound;
	private Boolean cfcInclSo;
	private Boolean cfcInclAr;
	private Boolean cfcInclAp;
	private Boolean cfcInclPo;
	private Boolean cfcInclCf;
	private Boolean cfcInclFs;
	private Boolean cfcInclQad01;
	private Boolean cfcInclQad02;
	private Double oidCfcCtrl;

	// Constructors

	/** default constructor */
	public AbstractCfcCtrl() {
	}

	/** minimal constructor */
	public AbstractCfcCtrl(Double oidCfcCtrl) {
		this.oidCfcCtrl = oidCfcCtrl;
	}

	/** full constructor */
	public AbstractCfcCtrl(Double cfcExTol, Integer cfcQadi01,
			Integer cfcCfnbr, String cfcNbrPre, String cfcUser1,
			String cfcUser2, String cfcChr01, String cfcChr02, String cfcChr03,
			String cfcChr04, String cfcChr05, Double cfcDec01, Double cfcDec02,
			Date cfcDte01, Date cfcDte02, Boolean cfcLog01, Integer cfcExRound,
			Boolean cfcInclSo, Boolean cfcInclAr, Boolean cfcInclAp,
			Boolean cfcInclPo, Boolean cfcInclCf, Boolean cfcInclFs,
			Boolean cfcInclQad01, Boolean cfcInclQad02, Double oidCfcCtrl) {
		this.cfcExTol = cfcExTol;
		this.cfcQadi01 = cfcQadi01;
		this.cfcCfnbr = cfcCfnbr;
		this.cfcNbrPre = cfcNbrPre;
		this.cfcUser1 = cfcUser1;
		this.cfcUser2 = cfcUser2;
		this.cfcChr01 = cfcChr01;
		this.cfcChr02 = cfcChr02;
		this.cfcChr03 = cfcChr03;
		this.cfcChr04 = cfcChr04;
		this.cfcChr05 = cfcChr05;
		this.cfcDec01 = cfcDec01;
		this.cfcDec02 = cfcDec02;
		this.cfcDte01 = cfcDte01;
		this.cfcDte02 = cfcDte02;
		this.cfcLog01 = cfcLog01;
		this.cfcExRound = cfcExRound;
		this.cfcInclSo = cfcInclSo;
		this.cfcInclAr = cfcInclAr;
		this.cfcInclAp = cfcInclAp;
		this.cfcInclPo = cfcInclPo;
		this.cfcInclCf = cfcInclCf;
		this.cfcInclFs = cfcInclFs;
		this.cfcInclQad01 = cfcInclQad01;
		this.cfcInclQad02 = cfcInclQad02;
		this.oidCfcCtrl = oidCfcCtrl;
	}

	// Property accessors

	public String getCfcDomain() {
		return this.cfcDomain;
	}

	public void setCfcDomain(String cfcDomain) {
		this.cfcDomain = cfcDomain;
	}

	public Double getCfcExTol() {
		return this.cfcExTol;
	}

	public void setCfcExTol(Double cfcExTol) {
		this.cfcExTol = cfcExTol;
	}

	public Integer getCfcQadi01() {
		return this.cfcQadi01;
	}

	public void setCfcQadi01(Integer cfcQadi01) {
		this.cfcQadi01 = cfcQadi01;
	}

	public Integer getCfcCfnbr() {
		return this.cfcCfnbr;
	}

	public void setCfcCfnbr(Integer cfcCfnbr) {
		this.cfcCfnbr = cfcCfnbr;
	}

	public String getCfcNbrPre() {
		return this.cfcNbrPre;
	}

	public void setCfcNbrPre(String cfcNbrPre) {
		this.cfcNbrPre = cfcNbrPre;
	}

	public String getCfcUser1() {
		return this.cfcUser1;
	}

	public void setCfcUser1(String cfcUser1) {
		this.cfcUser1 = cfcUser1;
	}

	public String getCfcUser2() {
		return this.cfcUser2;
	}

	public void setCfcUser2(String cfcUser2) {
		this.cfcUser2 = cfcUser2;
	}

	public String getCfcChr01() {
		return this.cfcChr01;
	}

	public void setCfcChr01(String cfcChr01) {
		this.cfcChr01 = cfcChr01;
	}

	public String getCfcChr02() {
		return this.cfcChr02;
	}

	public void setCfcChr02(String cfcChr02) {
		this.cfcChr02 = cfcChr02;
	}

	public String getCfcChr03() {
		return this.cfcChr03;
	}

	public void setCfcChr03(String cfcChr03) {
		this.cfcChr03 = cfcChr03;
	}

	public String getCfcChr04() {
		return this.cfcChr04;
	}

	public void setCfcChr04(String cfcChr04) {
		this.cfcChr04 = cfcChr04;
	}

	public String getCfcChr05() {
		return this.cfcChr05;
	}

	public void setCfcChr05(String cfcChr05) {
		this.cfcChr05 = cfcChr05;
	}

	public Double getCfcDec01() {
		return this.cfcDec01;
	}

	public void setCfcDec01(Double cfcDec01) {
		this.cfcDec01 = cfcDec01;
	}

	public Double getCfcDec02() {
		return this.cfcDec02;
	}

	public void setCfcDec02(Double cfcDec02) {
		this.cfcDec02 = cfcDec02;
	}

	public Date getCfcDte01() {
		return this.cfcDte01;
	}

	public void setCfcDte01(Date cfcDte01) {
		this.cfcDte01 = cfcDte01;
	}

	public Date getCfcDte02() {
		return this.cfcDte02;
	}

	public void setCfcDte02(Date cfcDte02) {
		this.cfcDte02 = cfcDte02;
	}

	public Boolean getCfcLog01() {
		return this.cfcLog01;
	}

	public void setCfcLog01(Boolean cfcLog01) {
		this.cfcLog01 = cfcLog01;
	}

	public Integer getCfcExRound() {
		return this.cfcExRound;
	}

	public void setCfcExRound(Integer cfcExRound) {
		this.cfcExRound = cfcExRound;
	}

	public Boolean getCfcInclSo() {
		return this.cfcInclSo;
	}

	public void setCfcInclSo(Boolean cfcInclSo) {
		this.cfcInclSo = cfcInclSo;
	}

	public Boolean getCfcInclAr() {
		return this.cfcInclAr;
	}

	public void setCfcInclAr(Boolean cfcInclAr) {
		this.cfcInclAr = cfcInclAr;
	}

	public Boolean getCfcInclAp() {
		return this.cfcInclAp;
	}

	public void setCfcInclAp(Boolean cfcInclAp) {
		this.cfcInclAp = cfcInclAp;
	}

	public Boolean getCfcInclPo() {
		return this.cfcInclPo;
	}

	public void setCfcInclPo(Boolean cfcInclPo) {
		this.cfcInclPo = cfcInclPo;
	}

	public Boolean getCfcInclCf() {
		return this.cfcInclCf;
	}

	public void setCfcInclCf(Boolean cfcInclCf) {
		this.cfcInclCf = cfcInclCf;
	}

	public Boolean getCfcInclFs() {
		return this.cfcInclFs;
	}

	public void setCfcInclFs(Boolean cfcInclFs) {
		this.cfcInclFs = cfcInclFs;
	}

	public Boolean getCfcInclQad01() {
		return this.cfcInclQad01;
	}

	public void setCfcInclQad01(Boolean cfcInclQad01) {
		this.cfcInclQad01 = cfcInclQad01;
	}

	public Boolean getCfcInclQad02() {
		return this.cfcInclQad02;
	}

	public void setCfcInclQad02(Boolean cfcInclQad02) {
		this.cfcInclQad02 = cfcInclQad02;
	}

	public Double getOidCfcCtrl() {
		return this.oidCfcCtrl;
	}

	public void setOidCfcCtrl(Double oidCfcCtrl) {
		this.oidCfcCtrl = oidCfcCtrl;
	}

}