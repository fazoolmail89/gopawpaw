package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPigcDet entity provides the base persistence definition of the
 * PigcDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPigcDet implements java.io.Serializable {

	// Fields

	private PigcDetId id;
	private String pigcDiv;
	private Date pigcExpire;
	private Boolean pigcInclude;
	private Date pigcStart;
	private String pigcUser1;
	private String pigcUser2;
	private String pigcQadc01;
	private String pigcQadc02;
	private String pigcQadc03;
	private Double pigcQadd01;
	private Double pigcQadd02;
	private Integer pigcQadi01;
	private Integer pigcQadi02;
	private Boolean pigcQadl01;
	private Boolean pigcQadl02;
	private Date pigcQadt01;
	private Date pigcQadt02;
	private String pigcCurr;
	private Integer pigcSrchType;
	private Double oidPigcDet;

	// Constructors

	/** default constructor */
	public AbstractPigcDet() {
	}

	/** minimal constructor */
	public AbstractPigcDet(PigcDetId id, Double oidPigcDet) {
		this.id = id;
		this.oidPigcDet = oidPigcDet;
	}

	/** full constructor */
	public AbstractPigcDet(PigcDetId id, String pigcDiv, Date pigcExpire,
			Boolean pigcInclude, Date pigcStart, String pigcUser1,
			String pigcUser2, String pigcQadc01, String pigcQadc02,
			String pigcQadc03, Double pigcQadd01, Double pigcQadd02,
			Integer pigcQadi01, Integer pigcQadi02, Boolean pigcQadl01,
			Boolean pigcQadl02, Date pigcQadt01, Date pigcQadt02,
			String pigcCurr, Integer pigcSrchType, Double oidPigcDet) {
		this.id = id;
		this.pigcDiv = pigcDiv;
		this.pigcExpire = pigcExpire;
		this.pigcInclude = pigcInclude;
		this.pigcStart = pigcStart;
		this.pigcUser1 = pigcUser1;
		this.pigcUser2 = pigcUser2;
		this.pigcQadc01 = pigcQadc01;
		this.pigcQadc02 = pigcQadc02;
		this.pigcQadc03 = pigcQadc03;
		this.pigcQadd01 = pigcQadd01;
		this.pigcQadd02 = pigcQadd02;
		this.pigcQadi01 = pigcQadi01;
		this.pigcQadi02 = pigcQadi02;
		this.pigcQadl01 = pigcQadl01;
		this.pigcQadl02 = pigcQadl02;
		this.pigcQadt01 = pigcQadt01;
		this.pigcQadt02 = pigcQadt02;
		this.pigcCurr = pigcCurr;
		this.pigcSrchType = pigcSrchType;
		this.oidPigcDet = oidPigcDet;
	}

	// Property accessors

	public PigcDetId getId() {
		return this.id;
	}

	public void setId(PigcDetId id) {
		this.id = id;
	}

	public String getPigcDiv() {
		return this.pigcDiv;
	}

	public void setPigcDiv(String pigcDiv) {
		this.pigcDiv = pigcDiv;
	}

	public Date getPigcExpire() {
		return this.pigcExpire;
	}

	public void setPigcExpire(Date pigcExpire) {
		this.pigcExpire = pigcExpire;
	}

	public Boolean getPigcInclude() {
		return this.pigcInclude;
	}

	public void setPigcInclude(Boolean pigcInclude) {
		this.pigcInclude = pigcInclude;
	}

	public Date getPigcStart() {
		return this.pigcStart;
	}

	public void setPigcStart(Date pigcStart) {
		this.pigcStart = pigcStart;
	}

	public String getPigcUser1() {
		return this.pigcUser1;
	}

	public void setPigcUser1(String pigcUser1) {
		this.pigcUser1 = pigcUser1;
	}

	public String getPigcUser2() {
		return this.pigcUser2;
	}

	public void setPigcUser2(String pigcUser2) {
		this.pigcUser2 = pigcUser2;
	}

	public String getPigcQadc01() {
		return this.pigcQadc01;
	}

	public void setPigcQadc01(String pigcQadc01) {
		this.pigcQadc01 = pigcQadc01;
	}

	public String getPigcQadc02() {
		return this.pigcQadc02;
	}

	public void setPigcQadc02(String pigcQadc02) {
		this.pigcQadc02 = pigcQadc02;
	}

	public String getPigcQadc03() {
		return this.pigcQadc03;
	}

	public void setPigcQadc03(String pigcQadc03) {
		this.pigcQadc03 = pigcQadc03;
	}

	public Double getPigcQadd01() {
		return this.pigcQadd01;
	}

	public void setPigcQadd01(Double pigcQadd01) {
		this.pigcQadd01 = pigcQadd01;
	}

	public Double getPigcQadd02() {
		return this.pigcQadd02;
	}

	public void setPigcQadd02(Double pigcQadd02) {
		this.pigcQadd02 = pigcQadd02;
	}

	public Integer getPigcQadi01() {
		return this.pigcQadi01;
	}

	public void setPigcQadi01(Integer pigcQadi01) {
		this.pigcQadi01 = pigcQadi01;
	}

	public Integer getPigcQadi02() {
		return this.pigcQadi02;
	}

	public void setPigcQadi02(Integer pigcQadi02) {
		this.pigcQadi02 = pigcQadi02;
	}

	public Boolean getPigcQadl01() {
		return this.pigcQadl01;
	}

	public void setPigcQadl01(Boolean pigcQadl01) {
		this.pigcQadl01 = pigcQadl01;
	}

	public Boolean getPigcQadl02() {
		return this.pigcQadl02;
	}

	public void setPigcQadl02(Boolean pigcQadl02) {
		this.pigcQadl02 = pigcQadl02;
	}

	public Date getPigcQadt01() {
		return this.pigcQadt01;
	}

	public void setPigcQadt01(Date pigcQadt01) {
		this.pigcQadt01 = pigcQadt01;
	}

	public Date getPigcQadt02() {
		return this.pigcQadt02;
	}

	public void setPigcQadt02(Date pigcQadt02) {
		this.pigcQadt02 = pigcQadt02;
	}

	public String getPigcCurr() {
		return this.pigcCurr;
	}

	public void setPigcCurr(String pigcCurr) {
		this.pigcCurr = pigcCurr;
	}

	public Integer getPigcSrchType() {
		return this.pigcSrchType;
	}

	public void setPigcSrchType(Integer pigcSrchType) {
		this.pigcSrchType = pigcSrchType;
	}

	public Double getOidPigcDet() {
		return this.oidPigcDet;
	}

	public void setOidPigcDet(Double oidPigcDet) {
		this.oidPigcDet = oidPigcDet;
	}

}