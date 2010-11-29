package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTrcsDet entity provides the base persistence definition of the
 * TrcsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrcsDet implements java.io.Serializable {

	// Fields

	private TrcsDetId id;
	private Double trcsBdnStd;
	private String trcsCurr;
	private Double trcsExRate;
	private Double trcsLbrStd;
	private Double trcsMtlStd;
	private Double trcsOvhStd;
	private Double trcsPrice;
	private Double trcsSubStd;
	private String trcsUser1;
	private String trcsUser2;
	private String trcsUserid;
	private String trcsQad01;
	private String trcsQad02;
	private String trcsQad03;
	private Double trcsQad04;
	private Double trcsQad05;
	private Double trcsQad06;
	private Date trcsQad07;
	private Date trcsQad08;
	private Date trcsQad09;
	private Boolean trcsQad10;
	private Double oidTrcsDet;

	// Constructors

	/** default constructor */
	public AbstractTrcsDet() {
	}

	/** minimal constructor */
	public AbstractTrcsDet(TrcsDetId id, Double oidTrcsDet) {
		this.id = id;
		this.oidTrcsDet = oidTrcsDet;
	}

	/** full constructor */
	public AbstractTrcsDet(TrcsDetId id, Double trcsBdnStd, String trcsCurr,
			Double trcsExRate, Double trcsLbrStd, Double trcsMtlStd,
			Double trcsOvhStd, Double trcsPrice, Double trcsSubStd,
			String trcsUser1, String trcsUser2, String trcsUserid,
			String trcsQad01, String trcsQad02, String trcsQad03,
			Double trcsQad04, Double trcsQad05, Double trcsQad06,
			Date trcsQad07, Date trcsQad08, Date trcsQad09, Boolean trcsQad10,
			Double oidTrcsDet) {
		this.id = id;
		this.trcsBdnStd = trcsBdnStd;
		this.trcsCurr = trcsCurr;
		this.trcsExRate = trcsExRate;
		this.trcsLbrStd = trcsLbrStd;
		this.trcsMtlStd = trcsMtlStd;
		this.trcsOvhStd = trcsOvhStd;
		this.trcsPrice = trcsPrice;
		this.trcsSubStd = trcsSubStd;
		this.trcsUser1 = trcsUser1;
		this.trcsUser2 = trcsUser2;
		this.trcsUserid = trcsUserid;
		this.trcsQad01 = trcsQad01;
		this.trcsQad02 = trcsQad02;
		this.trcsQad03 = trcsQad03;
		this.trcsQad04 = trcsQad04;
		this.trcsQad05 = trcsQad05;
		this.trcsQad06 = trcsQad06;
		this.trcsQad07 = trcsQad07;
		this.trcsQad08 = trcsQad08;
		this.trcsQad09 = trcsQad09;
		this.trcsQad10 = trcsQad10;
		this.oidTrcsDet = oidTrcsDet;
	}

	// Property accessors

	public TrcsDetId getId() {
		return this.id;
	}

	public void setId(TrcsDetId id) {
		this.id = id;
	}

	public Double getTrcsBdnStd() {
		return this.trcsBdnStd;
	}

	public void setTrcsBdnStd(Double trcsBdnStd) {
		this.trcsBdnStd = trcsBdnStd;
	}

	public String getTrcsCurr() {
		return this.trcsCurr;
	}

	public void setTrcsCurr(String trcsCurr) {
		this.trcsCurr = trcsCurr;
	}

	public Double getTrcsExRate() {
		return this.trcsExRate;
	}

	public void setTrcsExRate(Double trcsExRate) {
		this.trcsExRate = trcsExRate;
	}

	public Double getTrcsLbrStd() {
		return this.trcsLbrStd;
	}

	public void setTrcsLbrStd(Double trcsLbrStd) {
		this.trcsLbrStd = trcsLbrStd;
	}

	public Double getTrcsMtlStd() {
		return this.trcsMtlStd;
	}

	public void setTrcsMtlStd(Double trcsMtlStd) {
		this.trcsMtlStd = trcsMtlStd;
	}

	public Double getTrcsOvhStd() {
		return this.trcsOvhStd;
	}

	public void setTrcsOvhStd(Double trcsOvhStd) {
		this.trcsOvhStd = trcsOvhStd;
	}

	public Double getTrcsPrice() {
		return this.trcsPrice;
	}

	public void setTrcsPrice(Double trcsPrice) {
		this.trcsPrice = trcsPrice;
	}

	public Double getTrcsSubStd() {
		return this.trcsSubStd;
	}

	public void setTrcsSubStd(Double trcsSubStd) {
		this.trcsSubStd = trcsSubStd;
	}

	public String getTrcsUser1() {
		return this.trcsUser1;
	}

	public void setTrcsUser1(String trcsUser1) {
		this.trcsUser1 = trcsUser1;
	}

	public String getTrcsUser2() {
		return this.trcsUser2;
	}

	public void setTrcsUser2(String trcsUser2) {
		this.trcsUser2 = trcsUser2;
	}

	public String getTrcsUserid() {
		return this.trcsUserid;
	}

	public void setTrcsUserid(String trcsUserid) {
		this.trcsUserid = trcsUserid;
	}

	public String getTrcsQad01() {
		return this.trcsQad01;
	}

	public void setTrcsQad01(String trcsQad01) {
		this.trcsQad01 = trcsQad01;
	}

	public String getTrcsQad02() {
		return this.trcsQad02;
	}

	public void setTrcsQad02(String trcsQad02) {
		this.trcsQad02 = trcsQad02;
	}

	public String getTrcsQad03() {
		return this.trcsQad03;
	}

	public void setTrcsQad03(String trcsQad03) {
		this.trcsQad03 = trcsQad03;
	}

	public Double getTrcsQad04() {
		return this.trcsQad04;
	}

	public void setTrcsQad04(Double trcsQad04) {
		this.trcsQad04 = trcsQad04;
	}

	public Double getTrcsQad05() {
		return this.trcsQad05;
	}

	public void setTrcsQad05(Double trcsQad05) {
		this.trcsQad05 = trcsQad05;
	}

	public Double getTrcsQad06() {
		return this.trcsQad06;
	}

	public void setTrcsQad06(Double trcsQad06) {
		this.trcsQad06 = trcsQad06;
	}

	public Date getTrcsQad07() {
		return this.trcsQad07;
	}

	public void setTrcsQad07(Date trcsQad07) {
		this.trcsQad07 = trcsQad07;
	}

	public Date getTrcsQad08() {
		return this.trcsQad08;
	}

	public void setTrcsQad08(Date trcsQad08) {
		this.trcsQad08 = trcsQad08;
	}

	public Date getTrcsQad09() {
		return this.trcsQad09;
	}

	public void setTrcsQad09(Date trcsQad09) {
		this.trcsQad09 = trcsQad09;
	}

	public Boolean getTrcsQad10() {
		return this.trcsQad10;
	}

	public void setTrcsQad10(Boolean trcsQad10) {
		this.trcsQad10 = trcsQad10;
	}

	public Double getOidTrcsDet() {
		return this.oidTrcsDet;
	}

	public void setOidTrcsDet(Double oidTrcsDet) {
		this.oidTrcsDet = oidTrcsDet;
	}

}