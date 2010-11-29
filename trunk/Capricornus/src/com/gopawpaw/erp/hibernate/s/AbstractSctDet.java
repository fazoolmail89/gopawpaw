package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSctDet entity provides the base persistence definition of the SctDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSctDet implements java.io.Serializable {

	// Fields

	private SctDetId id;
	private Double sctCstTot;
	private Double sctMtlTl;
	private Double sctLbrTl;
	private Double sctBdnTl;
	private Double sctOvhTl;
	private Double sctSubTl;
	private Double sctMtlLl;
	private Double sctLbrLl;
	private Double sctBdnLl;
	private Double sctOvhLl;
	private Double sctSubLl;
	private Date sctCstDate;
	private String sctUser1;
	private String sctUser2;
	private String sctSerial;
	private Boolean sctRollup;
	private String sctRollupId;
	private Double sctNrv;
	private String sctQadc01;
	private Boolean sctCostChanged;
	private Double oidSctDet;

	// Constructors

	/** default constructor */
	public AbstractSctDet() {
	}

	/** minimal constructor */
	public AbstractSctDet(SctDetId id, Double sctNrv, Boolean sctCostChanged,
			Double oidSctDet) {
		this.id = id;
		this.sctNrv = sctNrv;
		this.sctCostChanged = sctCostChanged;
		this.oidSctDet = oidSctDet;
	}

	/** full constructor */
	public AbstractSctDet(SctDetId id, Double sctCstTot, Double sctMtlTl,
			Double sctLbrTl, Double sctBdnTl, Double sctOvhTl, Double sctSubTl,
			Double sctMtlLl, Double sctLbrLl, Double sctBdnLl, Double sctOvhLl,
			Double sctSubLl, Date sctCstDate, String sctUser1, String sctUser2,
			String sctSerial, Boolean sctRollup, String sctRollupId,
			Double sctNrv, String sctQadc01, Boolean sctCostChanged,
			Double oidSctDet) {
		this.id = id;
		this.sctCstTot = sctCstTot;
		this.sctMtlTl = sctMtlTl;
		this.sctLbrTl = sctLbrTl;
		this.sctBdnTl = sctBdnTl;
		this.sctOvhTl = sctOvhTl;
		this.sctSubTl = sctSubTl;
		this.sctMtlLl = sctMtlLl;
		this.sctLbrLl = sctLbrLl;
		this.sctBdnLl = sctBdnLl;
		this.sctOvhLl = sctOvhLl;
		this.sctSubLl = sctSubLl;
		this.sctCstDate = sctCstDate;
		this.sctUser1 = sctUser1;
		this.sctUser2 = sctUser2;
		this.sctSerial = sctSerial;
		this.sctRollup = sctRollup;
		this.sctRollupId = sctRollupId;
		this.sctNrv = sctNrv;
		this.sctQadc01 = sctQadc01;
		this.sctCostChanged = sctCostChanged;
		this.oidSctDet = oidSctDet;
	}

	// Property accessors

	public SctDetId getId() {
		return this.id;
	}

	public void setId(SctDetId id) {
		this.id = id;
	}

	public Double getSctCstTot() {
		return this.sctCstTot;
	}

	public void setSctCstTot(Double sctCstTot) {
		this.sctCstTot = sctCstTot;
	}

	public Double getSctMtlTl() {
		return this.sctMtlTl;
	}

	public void setSctMtlTl(Double sctMtlTl) {
		this.sctMtlTl = sctMtlTl;
	}

	public Double getSctLbrTl() {
		return this.sctLbrTl;
	}

	public void setSctLbrTl(Double sctLbrTl) {
		this.sctLbrTl = sctLbrTl;
	}

	public Double getSctBdnTl() {
		return this.sctBdnTl;
	}

	public void setSctBdnTl(Double sctBdnTl) {
		this.sctBdnTl = sctBdnTl;
	}

	public Double getSctOvhTl() {
		return this.sctOvhTl;
	}

	public void setSctOvhTl(Double sctOvhTl) {
		this.sctOvhTl = sctOvhTl;
	}

	public Double getSctSubTl() {
		return this.sctSubTl;
	}

	public void setSctSubTl(Double sctSubTl) {
		this.sctSubTl = sctSubTl;
	}

	public Double getSctMtlLl() {
		return this.sctMtlLl;
	}

	public void setSctMtlLl(Double sctMtlLl) {
		this.sctMtlLl = sctMtlLl;
	}

	public Double getSctLbrLl() {
		return this.sctLbrLl;
	}

	public void setSctLbrLl(Double sctLbrLl) {
		this.sctLbrLl = sctLbrLl;
	}

	public Double getSctBdnLl() {
		return this.sctBdnLl;
	}

	public void setSctBdnLl(Double sctBdnLl) {
		this.sctBdnLl = sctBdnLl;
	}

	public Double getSctOvhLl() {
		return this.sctOvhLl;
	}

	public void setSctOvhLl(Double sctOvhLl) {
		this.sctOvhLl = sctOvhLl;
	}

	public Double getSctSubLl() {
		return this.sctSubLl;
	}

	public void setSctSubLl(Double sctSubLl) {
		this.sctSubLl = sctSubLl;
	}

	public Date getSctCstDate() {
		return this.sctCstDate;
	}

	public void setSctCstDate(Date sctCstDate) {
		this.sctCstDate = sctCstDate;
	}

	public String getSctUser1() {
		return this.sctUser1;
	}

	public void setSctUser1(String sctUser1) {
		this.sctUser1 = sctUser1;
	}

	public String getSctUser2() {
		return this.sctUser2;
	}

	public void setSctUser2(String sctUser2) {
		this.sctUser2 = sctUser2;
	}

	public String getSctSerial() {
		return this.sctSerial;
	}

	public void setSctSerial(String sctSerial) {
		this.sctSerial = sctSerial;
	}

	public Boolean getSctRollup() {
		return this.sctRollup;
	}

	public void setSctRollup(Boolean sctRollup) {
		this.sctRollup = sctRollup;
	}

	public String getSctRollupId() {
		return this.sctRollupId;
	}

	public void setSctRollupId(String sctRollupId) {
		this.sctRollupId = sctRollupId;
	}

	public Double getSctNrv() {
		return this.sctNrv;
	}

	public void setSctNrv(Double sctNrv) {
		this.sctNrv = sctNrv;
	}

	public String getSctQadc01() {
		return this.sctQadc01;
	}

	public void setSctQadc01(String sctQadc01) {
		this.sctQadc01 = sctQadc01;
	}

	public Boolean getSctCostChanged() {
		return this.sctCostChanged;
	}

	public void setSctCostChanged(Boolean sctCostChanged) {
		this.sctCostChanged = sctCostChanged;
	}

	public Double getOidSctDet() {
		return this.oidSctDet;
	}

	public void setOidSctDet(Double oidSctDet) {
		this.oidSctDet = oidSctDet;
	}

}