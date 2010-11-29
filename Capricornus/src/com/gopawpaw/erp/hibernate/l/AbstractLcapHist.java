package com.gopawpaw.erp.hibernate.l;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractLcapHist entity provides the base persistence definition of the
 * LcapHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLcapHist implements java.io.Serializable {

	// Fields

	private LcapHistId id;
	private BigDecimal lcapCount1;
	private BigDecimal lcapCount2;
	private BigDecimal lcapCount3;
	private BigDecimal lcapCount4;
	private String lcapHash;
	private String lcapModUserid;
	private Date lcapModDate;
	private String lcapQadc01;
	private String lcapQadc02;
	private Date lcapQadt01;
	private Integer lcapQadi01;
	private Double lcapQadd01;
	private Double lcapQadd02;
	private Boolean lcapQadl01;
	private Double oidLcapHist;

	// Constructors

	/** default constructor */
	public AbstractLcapHist() {
	}

	/** minimal constructor */
	public AbstractLcapHist(LcapHistId id, BigDecimal lcapCount1,
			BigDecimal lcapCount2, BigDecimal lcapCount3,
			BigDecimal lcapCount4, String lcapHash, String lcapModUserid,
			Date lcapModDate, String lcapQadc01, String lcapQadc02,
			Date lcapQadt01, Integer lcapQadi01, Double lcapQadd01,
			Double lcapQadd02, Double oidLcapHist) {
		this.id = id;
		this.lcapCount1 = lcapCount1;
		this.lcapCount2 = lcapCount2;
		this.lcapCount3 = lcapCount3;
		this.lcapCount4 = lcapCount4;
		this.lcapHash = lcapHash;
		this.lcapModUserid = lcapModUserid;
		this.lcapModDate = lcapModDate;
		this.lcapQadc01 = lcapQadc01;
		this.lcapQadc02 = lcapQadc02;
		this.lcapQadt01 = lcapQadt01;
		this.lcapQadi01 = lcapQadi01;
		this.lcapQadd01 = lcapQadd01;
		this.lcapQadd02 = lcapQadd02;
		this.oidLcapHist = oidLcapHist;
	}

	/** full constructor */
	public AbstractLcapHist(LcapHistId id, BigDecimal lcapCount1,
			BigDecimal lcapCount2, BigDecimal lcapCount3,
			BigDecimal lcapCount4, String lcapHash, String lcapModUserid,
			Date lcapModDate, String lcapQadc01, String lcapQadc02,
			Date lcapQadt01, Integer lcapQadi01, Double lcapQadd01,
			Double lcapQadd02, Boolean lcapQadl01, Double oidLcapHist) {
		this.id = id;
		this.lcapCount1 = lcapCount1;
		this.lcapCount2 = lcapCount2;
		this.lcapCount3 = lcapCount3;
		this.lcapCount4 = lcapCount4;
		this.lcapHash = lcapHash;
		this.lcapModUserid = lcapModUserid;
		this.lcapModDate = lcapModDate;
		this.lcapQadc01 = lcapQadc01;
		this.lcapQadc02 = lcapQadc02;
		this.lcapQadt01 = lcapQadt01;
		this.lcapQadi01 = lcapQadi01;
		this.lcapQadd01 = lcapQadd01;
		this.lcapQadd02 = lcapQadd02;
		this.lcapQadl01 = lcapQadl01;
		this.oidLcapHist = oidLcapHist;
	}

	// Property accessors

	public LcapHistId getId() {
		return this.id;
	}

	public void setId(LcapHistId id) {
		this.id = id;
	}

	public BigDecimal getLcapCount1() {
		return this.lcapCount1;
	}

	public void setLcapCount1(BigDecimal lcapCount1) {
		this.lcapCount1 = lcapCount1;
	}

	public BigDecimal getLcapCount2() {
		return this.lcapCount2;
	}

	public void setLcapCount2(BigDecimal lcapCount2) {
		this.lcapCount2 = lcapCount2;
	}

	public BigDecimal getLcapCount3() {
		return this.lcapCount3;
	}

	public void setLcapCount3(BigDecimal lcapCount3) {
		this.lcapCount3 = lcapCount3;
	}

	public BigDecimal getLcapCount4() {
		return this.lcapCount4;
	}

	public void setLcapCount4(BigDecimal lcapCount4) {
		this.lcapCount4 = lcapCount4;
	}

	public String getLcapHash() {
		return this.lcapHash;
	}

	public void setLcapHash(String lcapHash) {
		this.lcapHash = lcapHash;
	}

	public String getLcapModUserid() {
		return this.lcapModUserid;
	}

	public void setLcapModUserid(String lcapModUserid) {
		this.lcapModUserid = lcapModUserid;
	}

	public Date getLcapModDate() {
		return this.lcapModDate;
	}

	public void setLcapModDate(Date lcapModDate) {
		this.lcapModDate = lcapModDate;
	}

	public String getLcapQadc01() {
		return this.lcapQadc01;
	}

	public void setLcapQadc01(String lcapQadc01) {
		this.lcapQadc01 = lcapQadc01;
	}

	public String getLcapQadc02() {
		return this.lcapQadc02;
	}

	public void setLcapQadc02(String lcapQadc02) {
		this.lcapQadc02 = lcapQadc02;
	}

	public Date getLcapQadt01() {
		return this.lcapQadt01;
	}

	public void setLcapQadt01(Date lcapQadt01) {
		this.lcapQadt01 = lcapQadt01;
	}

	public Integer getLcapQadi01() {
		return this.lcapQadi01;
	}

	public void setLcapQadi01(Integer lcapQadi01) {
		this.lcapQadi01 = lcapQadi01;
	}

	public Double getLcapQadd01() {
		return this.lcapQadd01;
	}

	public void setLcapQadd01(Double lcapQadd01) {
		this.lcapQadd01 = lcapQadd01;
	}

	public Double getLcapQadd02() {
		return this.lcapQadd02;
	}

	public void setLcapQadd02(Double lcapQadd02) {
		this.lcapQadd02 = lcapQadd02;
	}

	public Boolean getLcapQadl01() {
		return this.lcapQadl01;
	}

	public void setLcapQadl01(Boolean lcapQadl01) {
		this.lcapQadl01 = lcapQadl01;
	}

	public Double getOidLcapHist() {
		return this.oidLcapHist;
	}

	public void setOidLcapHist(Double oidLcapHist) {
		this.oidLcapHist = oidLcapHist;
	}

}