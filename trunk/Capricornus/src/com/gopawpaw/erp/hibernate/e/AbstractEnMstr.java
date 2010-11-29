package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEnMstr entity provides the base persistence definition of the EnMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEnMstr implements java.io.Serializable {

	// Fields

	private EnMstrId id;
	private String enName;
	private Boolean enPrimary;
	private Integer enQad02;
	private Boolean enQad01;
	private String enCurr;
	private String enUser1;
	private String enUser2;
	private Boolean enAdjBs;
	private Integer enPageNum;
	private Integer enNextProt;
	private String enSrcDescLang;
	private String enAddr;
	private Boolean enConsolidation;
	private String enType;
	private Double oidEnMstr;

	// Constructors

	/** default constructor */
	public AbstractEnMstr() {
	}

	/** minimal constructor */
	public AbstractEnMstr(EnMstrId id, Integer enNextProt,
			String enSrcDescLang, String enAddr, Boolean enConsolidation,
			String enType, Double oidEnMstr) {
		this.id = id;
		this.enNextProt = enNextProt;
		this.enSrcDescLang = enSrcDescLang;
		this.enAddr = enAddr;
		this.enConsolidation = enConsolidation;
		this.enType = enType;
		this.oidEnMstr = oidEnMstr;
	}

	/** full constructor */
	public AbstractEnMstr(EnMstrId id, String enName, Boolean enPrimary,
			Integer enQad02, Boolean enQad01, String enCurr, String enUser1,
			String enUser2, Boolean enAdjBs, Integer enPageNum,
			Integer enNextProt, String enSrcDescLang, String enAddr,
			Boolean enConsolidation, String enType, Double oidEnMstr) {
		this.id = id;
		this.enName = enName;
		this.enPrimary = enPrimary;
		this.enQad02 = enQad02;
		this.enQad01 = enQad01;
		this.enCurr = enCurr;
		this.enUser1 = enUser1;
		this.enUser2 = enUser2;
		this.enAdjBs = enAdjBs;
		this.enPageNum = enPageNum;
		this.enNextProt = enNextProt;
		this.enSrcDescLang = enSrcDescLang;
		this.enAddr = enAddr;
		this.enConsolidation = enConsolidation;
		this.enType = enType;
		this.oidEnMstr = oidEnMstr;
	}

	// Property accessors

	public EnMstrId getId() {
		return this.id;
	}

	public void setId(EnMstrId id) {
		this.id = id;
	}

	public String getEnName() {
		return this.enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Boolean getEnPrimary() {
		return this.enPrimary;
	}

	public void setEnPrimary(Boolean enPrimary) {
		this.enPrimary = enPrimary;
	}

	public Integer getEnQad02() {
		return this.enQad02;
	}

	public void setEnQad02(Integer enQad02) {
		this.enQad02 = enQad02;
	}

	public Boolean getEnQad01() {
		return this.enQad01;
	}

	public void setEnQad01(Boolean enQad01) {
		this.enQad01 = enQad01;
	}

	public String getEnCurr() {
		return this.enCurr;
	}

	public void setEnCurr(String enCurr) {
		this.enCurr = enCurr;
	}

	public String getEnUser1() {
		return this.enUser1;
	}

	public void setEnUser1(String enUser1) {
		this.enUser1 = enUser1;
	}

	public String getEnUser2() {
		return this.enUser2;
	}

	public void setEnUser2(String enUser2) {
		this.enUser2 = enUser2;
	}

	public Boolean getEnAdjBs() {
		return this.enAdjBs;
	}

	public void setEnAdjBs(Boolean enAdjBs) {
		this.enAdjBs = enAdjBs;
	}

	public Integer getEnPageNum() {
		return this.enPageNum;
	}

	public void setEnPageNum(Integer enPageNum) {
		this.enPageNum = enPageNum;
	}

	public Integer getEnNextProt() {
		return this.enNextProt;
	}

	public void setEnNextProt(Integer enNextProt) {
		this.enNextProt = enNextProt;
	}

	public String getEnSrcDescLang() {
		return this.enSrcDescLang;
	}

	public void setEnSrcDescLang(String enSrcDescLang) {
		this.enSrcDescLang = enSrcDescLang;
	}

	public String getEnAddr() {
		return this.enAddr;
	}

	public void setEnAddr(String enAddr) {
		this.enAddr = enAddr;
	}

	public Boolean getEnConsolidation() {
		return this.enConsolidation;
	}

	public void setEnConsolidation(Boolean enConsolidation) {
		this.enConsolidation = enConsolidation;
	}

	public String getEnType() {
		return this.enType;
	}

	public void setEnType(String enType) {
		this.enType = enType;
	}

	public Double getOidEnMstr() {
		return this.oidEnMstr;
	}

	public void setOidEnMstr(Double oidEnMstr) {
		this.oidEnMstr = oidEnMstr;
	}

}