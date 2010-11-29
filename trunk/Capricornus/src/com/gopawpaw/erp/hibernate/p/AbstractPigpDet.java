package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPigpDet entity provides the base persistence definition of the
 * PigpDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPigpDet implements java.io.Serializable {

	// Fields

	private PigpDetId id;
	private String pigpDiv;
	private Date pigpExpire;
	private Boolean pigpInclude;
	private String pigpListId;
	private Date pigpStart;
	private String pigpUser1;
	private String pigpUser2;
	private String pigpQadc01;
	private String pigpQadc02;
	private String pigpQadc03;
	private Double pigpQadd01;
	private Double pigpQadd02;
	private Integer pigpQadi01;
	private Integer pigpQadi02;
	private Boolean pigpQadl01;
	private Boolean pigpQadl02;
	private Date pigpQadt01;
	private Date pigpQadt02;
	private String pigpCurr;
	private Integer pigpSrchType;
	private Double oidPigpDet;

	// Constructors

	/** default constructor */
	public AbstractPigpDet() {
	}

	/** minimal constructor */
	public AbstractPigpDet(PigpDetId id, Double oidPigpDet) {
		this.id = id;
		this.oidPigpDet = oidPigpDet;
	}

	/** full constructor */
	public AbstractPigpDet(PigpDetId id, String pigpDiv, Date pigpExpire,
			Boolean pigpInclude, String pigpListId, Date pigpStart,
			String pigpUser1, String pigpUser2, String pigpQadc01,
			String pigpQadc02, String pigpQadc03, Double pigpQadd01,
			Double pigpQadd02, Integer pigpQadi01, Integer pigpQadi02,
			Boolean pigpQadl01, Boolean pigpQadl02, Date pigpQadt01,
			Date pigpQadt02, String pigpCurr, Integer pigpSrchType,
			Double oidPigpDet) {
		this.id = id;
		this.pigpDiv = pigpDiv;
		this.pigpExpire = pigpExpire;
		this.pigpInclude = pigpInclude;
		this.pigpListId = pigpListId;
		this.pigpStart = pigpStart;
		this.pigpUser1 = pigpUser1;
		this.pigpUser2 = pigpUser2;
		this.pigpQadc01 = pigpQadc01;
		this.pigpQadc02 = pigpQadc02;
		this.pigpQadc03 = pigpQadc03;
		this.pigpQadd01 = pigpQadd01;
		this.pigpQadd02 = pigpQadd02;
		this.pigpQadi01 = pigpQadi01;
		this.pigpQadi02 = pigpQadi02;
		this.pigpQadl01 = pigpQadl01;
		this.pigpQadl02 = pigpQadl02;
		this.pigpQadt01 = pigpQadt01;
		this.pigpQadt02 = pigpQadt02;
		this.pigpCurr = pigpCurr;
		this.pigpSrchType = pigpSrchType;
		this.oidPigpDet = oidPigpDet;
	}

	// Property accessors

	public PigpDetId getId() {
		return this.id;
	}

	public void setId(PigpDetId id) {
		this.id = id;
	}

	public String getPigpDiv() {
		return this.pigpDiv;
	}

	public void setPigpDiv(String pigpDiv) {
		this.pigpDiv = pigpDiv;
	}

	public Date getPigpExpire() {
		return this.pigpExpire;
	}

	public void setPigpExpire(Date pigpExpire) {
		this.pigpExpire = pigpExpire;
	}

	public Boolean getPigpInclude() {
		return this.pigpInclude;
	}

	public void setPigpInclude(Boolean pigpInclude) {
		this.pigpInclude = pigpInclude;
	}

	public String getPigpListId() {
		return this.pigpListId;
	}

	public void setPigpListId(String pigpListId) {
		this.pigpListId = pigpListId;
	}

	public Date getPigpStart() {
		return this.pigpStart;
	}

	public void setPigpStart(Date pigpStart) {
		this.pigpStart = pigpStart;
	}

	public String getPigpUser1() {
		return this.pigpUser1;
	}

	public void setPigpUser1(String pigpUser1) {
		this.pigpUser1 = pigpUser1;
	}

	public String getPigpUser2() {
		return this.pigpUser2;
	}

	public void setPigpUser2(String pigpUser2) {
		this.pigpUser2 = pigpUser2;
	}

	public String getPigpQadc01() {
		return this.pigpQadc01;
	}

	public void setPigpQadc01(String pigpQadc01) {
		this.pigpQadc01 = pigpQadc01;
	}

	public String getPigpQadc02() {
		return this.pigpQadc02;
	}

	public void setPigpQadc02(String pigpQadc02) {
		this.pigpQadc02 = pigpQadc02;
	}

	public String getPigpQadc03() {
		return this.pigpQadc03;
	}

	public void setPigpQadc03(String pigpQadc03) {
		this.pigpQadc03 = pigpQadc03;
	}

	public Double getPigpQadd01() {
		return this.pigpQadd01;
	}

	public void setPigpQadd01(Double pigpQadd01) {
		this.pigpQadd01 = pigpQadd01;
	}

	public Double getPigpQadd02() {
		return this.pigpQadd02;
	}

	public void setPigpQadd02(Double pigpQadd02) {
		this.pigpQadd02 = pigpQadd02;
	}

	public Integer getPigpQadi01() {
		return this.pigpQadi01;
	}

	public void setPigpQadi01(Integer pigpQadi01) {
		this.pigpQadi01 = pigpQadi01;
	}

	public Integer getPigpQadi02() {
		return this.pigpQadi02;
	}

	public void setPigpQadi02(Integer pigpQadi02) {
		this.pigpQadi02 = pigpQadi02;
	}

	public Boolean getPigpQadl01() {
		return this.pigpQadl01;
	}

	public void setPigpQadl01(Boolean pigpQadl01) {
		this.pigpQadl01 = pigpQadl01;
	}

	public Boolean getPigpQadl02() {
		return this.pigpQadl02;
	}

	public void setPigpQadl02(Boolean pigpQadl02) {
		this.pigpQadl02 = pigpQadl02;
	}

	public Date getPigpQadt01() {
		return this.pigpQadt01;
	}

	public void setPigpQadt01(Date pigpQadt01) {
		this.pigpQadt01 = pigpQadt01;
	}

	public Date getPigpQadt02() {
		return this.pigpQadt02;
	}

	public void setPigpQadt02(Date pigpQadt02) {
		this.pigpQadt02 = pigpQadt02;
	}

	public String getPigpCurr() {
		return this.pigpCurr;
	}

	public void setPigpCurr(String pigpCurr) {
		this.pigpCurr = pigpCurr;
	}

	public Integer getPigpSrchType() {
		return this.pigpSrchType;
	}

	public void setPigpSrchType(Integer pigpSrchType) {
		this.pigpSrchType = pigpSrchType;
	}

	public Double getOidPigpDet() {
		return this.oidPigpDet;
	}

	public void setOidPigpDet(Double oidPigpDet) {
		this.oidPigpDet = oidPigpDet;
	}

}