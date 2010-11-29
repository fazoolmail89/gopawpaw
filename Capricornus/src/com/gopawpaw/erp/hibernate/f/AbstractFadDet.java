package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFadDet entity provides the base persistence definition of the FadDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFadDet implements java.io.Serializable {

	// Fields

	private FadDetId id;
	private String fadFaId;
	private String fadDesc;
	private String fadSerial;
	private Double fadPuramt;
	private String fadModUserid;
	private Date fadModDate;
	private String fadUser1;
	private String fadUser2;
	private String fadChr01;
	private Double fadDec01;
	private Boolean fadLog01;
	private Integer fadInt01;
	private Date fadDte01;
	private String fadQadc01;
	private Double fadQadd01;
	private Boolean fadQadl01;
	private Integer fadQadi01;
	private Date fadQadt01;
	private Double oidFadDet;

	// Constructors

	/** default constructor */
	public AbstractFadDet() {
	}

	/** minimal constructor */
	public AbstractFadDet(FadDetId id, String fadFaId, String fadDesc,
			String fadSerial, Double fadPuramt, String fadModUserid,
			Date fadModDate, String fadUser1, String fadUser2, String fadChr01,
			Double fadDec01, Boolean fadLog01, Integer fadInt01,
			String fadQadc01, Double fadQadd01, Boolean fadQadl01,
			Integer fadQadi01, Double oidFadDet) {
		this.id = id;
		this.fadFaId = fadFaId;
		this.fadDesc = fadDesc;
		this.fadSerial = fadSerial;
		this.fadPuramt = fadPuramt;
		this.fadModUserid = fadModUserid;
		this.fadModDate = fadModDate;
		this.fadUser1 = fadUser1;
		this.fadUser2 = fadUser2;
		this.fadChr01 = fadChr01;
		this.fadDec01 = fadDec01;
		this.fadLog01 = fadLog01;
		this.fadInt01 = fadInt01;
		this.fadQadc01 = fadQadc01;
		this.fadQadd01 = fadQadd01;
		this.fadQadl01 = fadQadl01;
		this.fadQadi01 = fadQadi01;
		this.oidFadDet = oidFadDet;
	}

	/** full constructor */
	public AbstractFadDet(FadDetId id, String fadFaId, String fadDesc,
			String fadSerial, Double fadPuramt, String fadModUserid,
			Date fadModDate, String fadUser1, String fadUser2, String fadChr01,
			Double fadDec01, Boolean fadLog01, Integer fadInt01, Date fadDte01,
			String fadQadc01, Double fadQadd01, Boolean fadQadl01,
			Integer fadQadi01, Date fadQadt01, Double oidFadDet) {
		this.id = id;
		this.fadFaId = fadFaId;
		this.fadDesc = fadDesc;
		this.fadSerial = fadSerial;
		this.fadPuramt = fadPuramt;
		this.fadModUserid = fadModUserid;
		this.fadModDate = fadModDate;
		this.fadUser1 = fadUser1;
		this.fadUser2 = fadUser2;
		this.fadChr01 = fadChr01;
		this.fadDec01 = fadDec01;
		this.fadLog01 = fadLog01;
		this.fadInt01 = fadInt01;
		this.fadDte01 = fadDte01;
		this.fadQadc01 = fadQadc01;
		this.fadQadd01 = fadQadd01;
		this.fadQadl01 = fadQadl01;
		this.fadQadi01 = fadQadi01;
		this.fadQadt01 = fadQadt01;
		this.oidFadDet = oidFadDet;
	}

	// Property accessors

	public FadDetId getId() {
		return this.id;
	}

	public void setId(FadDetId id) {
		this.id = id;
	}

	public String getFadFaId() {
		return this.fadFaId;
	}

	public void setFadFaId(String fadFaId) {
		this.fadFaId = fadFaId;
	}

	public String getFadDesc() {
		return this.fadDesc;
	}

	public void setFadDesc(String fadDesc) {
		this.fadDesc = fadDesc;
	}

	public String getFadSerial() {
		return this.fadSerial;
	}

	public void setFadSerial(String fadSerial) {
		this.fadSerial = fadSerial;
	}

	public Double getFadPuramt() {
		return this.fadPuramt;
	}

	public void setFadPuramt(Double fadPuramt) {
		this.fadPuramt = fadPuramt;
	}

	public String getFadModUserid() {
		return this.fadModUserid;
	}

	public void setFadModUserid(String fadModUserid) {
		this.fadModUserid = fadModUserid;
	}

	public Date getFadModDate() {
		return this.fadModDate;
	}

	public void setFadModDate(Date fadModDate) {
		this.fadModDate = fadModDate;
	}

	public String getFadUser1() {
		return this.fadUser1;
	}

	public void setFadUser1(String fadUser1) {
		this.fadUser1 = fadUser1;
	}

	public String getFadUser2() {
		return this.fadUser2;
	}

	public void setFadUser2(String fadUser2) {
		this.fadUser2 = fadUser2;
	}

	public String getFadChr01() {
		return this.fadChr01;
	}

	public void setFadChr01(String fadChr01) {
		this.fadChr01 = fadChr01;
	}

	public Double getFadDec01() {
		return this.fadDec01;
	}

	public void setFadDec01(Double fadDec01) {
		this.fadDec01 = fadDec01;
	}

	public Boolean getFadLog01() {
		return this.fadLog01;
	}

	public void setFadLog01(Boolean fadLog01) {
		this.fadLog01 = fadLog01;
	}

	public Integer getFadInt01() {
		return this.fadInt01;
	}

	public void setFadInt01(Integer fadInt01) {
		this.fadInt01 = fadInt01;
	}

	public Date getFadDte01() {
		return this.fadDte01;
	}

	public void setFadDte01(Date fadDte01) {
		this.fadDte01 = fadDte01;
	}

	public String getFadQadc01() {
		return this.fadQadc01;
	}

	public void setFadQadc01(String fadQadc01) {
		this.fadQadc01 = fadQadc01;
	}

	public Double getFadQadd01() {
		return this.fadQadd01;
	}

	public void setFadQadd01(Double fadQadd01) {
		this.fadQadd01 = fadQadd01;
	}

	public Boolean getFadQadl01() {
		return this.fadQadl01;
	}

	public void setFadQadl01(Boolean fadQadl01) {
		this.fadQadl01 = fadQadl01;
	}

	public Integer getFadQadi01() {
		return this.fadQadi01;
	}

	public void setFadQadi01(Integer fadQadi01) {
		this.fadQadi01 = fadQadi01;
	}

	public Date getFadQadt01() {
		return this.fadQadt01;
	}

	public void setFadQadt01(Date fadQadt01) {
		this.fadQadt01 = fadQadt01;
	}

	public Double getOidFadDet() {
		return this.oidFadDet;
	}

	public void setOidFadDet(Double oidFadDet) {
		this.oidFadDet = oidFadDet;
	}

}