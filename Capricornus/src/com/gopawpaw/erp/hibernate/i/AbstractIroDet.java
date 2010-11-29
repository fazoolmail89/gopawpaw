package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIroDet entity provides the base persistence definition of the IroDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIroDet implements java.io.Serializable {

	// Fields

	private IroDetId id;
	private Double iroCostTot;
	private Date iroDate;
	private Double iroMtlTl;
	private Double iroLbrTl;
	private Double iroBdnTl;
	private Double iroSubTl;
	private Double iroOvhTl;
	private Double iroMtlLl;
	private Double iroLbrLl;
	private Double iroBdnLl;
	private Double iroSubLl;
	private Double iroOvhLl;
	private String iroUser1;
	private String iroUser2;
	private Double iroValue01;
	private Double iroValue02;
	private Double iroValue03;
	private Double iroValue04;
	private Double iroValue05;
	private Double iroNrv;
	private String iroQadc01;
	private Double oidIroDet;

	// Constructors

	/** default constructor */
	public AbstractIroDet() {
	}

	/** minimal constructor */
	public AbstractIroDet(IroDetId id, Double iroNrv, Double oidIroDet) {
		this.id = id;
		this.iroNrv = iroNrv;
		this.oidIroDet = oidIroDet;
	}

	/** full constructor */
	public AbstractIroDet(IroDetId id, Double iroCostTot, Date iroDate,
			Double iroMtlTl, Double iroLbrTl, Double iroBdnTl, Double iroSubTl,
			Double iroOvhTl, Double iroMtlLl, Double iroLbrLl, Double iroBdnLl,
			Double iroSubLl, Double iroOvhLl, String iroUser1, String iroUser2,
			Double iroValue01, Double iroValue02, Double iroValue03,
			Double iroValue04, Double iroValue05, Double iroNrv,
			String iroQadc01, Double oidIroDet) {
		this.id = id;
		this.iroCostTot = iroCostTot;
		this.iroDate = iroDate;
		this.iroMtlTl = iroMtlTl;
		this.iroLbrTl = iroLbrTl;
		this.iroBdnTl = iroBdnTl;
		this.iroSubTl = iroSubTl;
		this.iroOvhTl = iroOvhTl;
		this.iroMtlLl = iroMtlLl;
		this.iroLbrLl = iroLbrLl;
		this.iroBdnLl = iroBdnLl;
		this.iroSubLl = iroSubLl;
		this.iroOvhLl = iroOvhLl;
		this.iroUser1 = iroUser1;
		this.iroUser2 = iroUser2;
		this.iroValue01 = iroValue01;
		this.iroValue02 = iroValue02;
		this.iroValue03 = iroValue03;
		this.iroValue04 = iroValue04;
		this.iroValue05 = iroValue05;
		this.iroNrv = iroNrv;
		this.iroQadc01 = iroQadc01;
		this.oidIroDet = oidIroDet;
	}

	// Property accessors

	public IroDetId getId() {
		return this.id;
	}

	public void setId(IroDetId id) {
		this.id = id;
	}

	public Double getIroCostTot() {
		return this.iroCostTot;
	}

	public void setIroCostTot(Double iroCostTot) {
		this.iroCostTot = iroCostTot;
	}

	public Date getIroDate() {
		return this.iroDate;
	}

	public void setIroDate(Date iroDate) {
		this.iroDate = iroDate;
	}

	public Double getIroMtlTl() {
		return this.iroMtlTl;
	}

	public void setIroMtlTl(Double iroMtlTl) {
		this.iroMtlTl = iroMtlTl;
	}

	public Double getIroLbrTl() {
		return this.iroLbrTl;
	}

	public void setIroLbrTl(Double iroLbrTl) {
		this.iroLbrTl = iroLbrTl;
	}

	public Double getIroBdnTl() {
		return this.iroBdnTl;
	}

	public void setIroBdnTl(Double iroBdnTl) {
		this.iroBdnTl = iroBdnTl;
	}

	public Double getIroSubTl() {
		return this.iroSubTl;
	}

	public void setIroSubTl(Double iroSubTl) {
		this.iroSubTl = iroSubTl;
	}

	public Double getIroOvhTl() {
		return this.iroOvhTl;
	}

	public void setIroOvhTl(Double iroOvhTl) {
		this.iroOvhTl = iroOvhTl;
	}

	public Double getIroMtlLl() {
		return this.iroMtlLl;
	}

	public void setIroMtlLl(Double iroMtlLl) {
		this.iroMtlLl = iroMtlLl;
	}

	public Double getIroLbrLl() {
		return this.iroLbrLl;
	}

	public void setIroLbrLl(Double iroLbrLl) {
		this.iroLbrLl = iroLbrLl;
	}

	public Double getIroBdnLl() {
		return this.iroBdnLl;
	}

	public void setIroBdnLl(Double iroBdnLl) {
		this.iroBdnLl = iroBdnLl;
	}

	public Double getIroSubLl() {
		return this.iroSubLl;
	}

	public void setIroSubLl(Double iroSubLl) {
		this.iroSubLl = iroSubLl;
	}

	public Double getIroOvhLl() {
		return this.iroOvhLl;
	}

	public void setIroOvhLl(Double iroOvhLl) {
		this.iroOvhLl = iroOvhLl;
	}

	public String getIroUser1() {
		return this.iroUser1;
	}

	public void setIroUser1(String iroUser1) {
		this.iroUser1 = iroUser1;
	}

	public String getIroUser2() {
		return this.iroUser2;
	}

	public void setIroUser2(String iroUser2) {
		this.iroUser2 = iroUser2;
	}

	public Double getIroValue01() {
		return this.iroValue01;
	}

	public void setIroValue01(Double iroValue01) {
		this.iroValue01 = iroValue01;
	}

	public Double getIroValue02() {
		return this.iroValue02;
	}

	public void setIroValue02(Double iroValue02) {
		this.iroValue02 = iroValue02;
	}

	public Double getIroValue03() {
		return this.iroValue03;
	}

	public void setIroValue03(Double iroValue03) {
		this.iroValue03 = iroValue03;
	}

	public Double getIroValue04() {
		return this.iroValue04;
	}

	public void setIroValue04(Double iroValue04) {
		this.iroValue04 = iroValue04;
	}

	public Double getIroValue05() {
		return this.iroValue05;
	}

	public void setIroValue05(Double iroValue05) {
		this.iroValue05 = iroValue05;
	}

	public Double getIroNrv() {
		return this.iroNrv;
	}

	public void setIroNrv(Double iroNrv) {
		this.iroNrv = iroNrv;
	}

	public String getIroQadc01() {
		return this.iroQadc01;
	}

	public void setIroQadc01(String iroQadc01) {
		this.iroQadc01 = iroQadc01;
	}

	public Double getOidIroDet() {
		return this.oidIroDet;
	}

	public void setOidIroDet(Double oidIroDet) {
		this.oidIroDet = oidIroDet;
	}

}