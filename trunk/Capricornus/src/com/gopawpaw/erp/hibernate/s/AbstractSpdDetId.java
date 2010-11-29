package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSpdDetId entity provides the base persistence definition of the
 * SpdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSpdDetId implements java.io.Serializable {

	// Fields

	private String spdDomain;
	private String spdAddr;
	private String spdProdLn;
	private String spdPart;
	private String spdCust;

	// Constructors

	/** default constructor */
	public AbstractSpdDetId() {
	}

	/** minimal constructor */
	public AbstractSpdDetId(String spdDomain) {
		this.spdDomain = spdDomain;
	}

	/** full constructor */
	public AbstractSpdDetId(String spdDomain, String spdAddr, String spdProdLn,
			String spdPart, String spdCust) {
		this.spdDomain = spdDomain;
		this.spdAddr = spdAddr;
		this.spdProdLn = spdProdLn;
		this.spdPart = spdPart;
		this.spdCust = spdCust;
	}

	// Property accessors

	public String getSpdDomain() {
		return this.spdDomain;
	}

	public void setSpdDomain(String spdDomain) {
		this.spdDomain = spdDomain;
	}

	public String getSpdAddr() {
		return this.spdAddr;
	}

	public void setSpdAddr(String spdAddr) {
		this.spdAddr = spdAddr;
	}

	public String getSpdProdLn() {
		return this.spdProdLn;
	}

	public void setSpdProdLn(String spdProdLn) {
		this.spdProdLn = spdProdLn;
	}

	public String getSpdPart() {
		return this.spdPart;
	}

	public void setSpdPart(String spdPart) {
		this.spdPart = spdPart;
	}

	public String getSpdCust() {
		return this.spdCust;
	}

	public void setSpdCust(String spdCust) {
		this.spdCust = spdCust;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSpdDetId))
			return false;
		AbstractSpdDetId castOther = (AbstractSpdDetId) other;

		return ((this.getSpdDomain() == castOther.getSpdDomain()) || (this
				.getSpdDomain() != null
				&& castOther.getSpdDomain() != null && this.getSpdDomain()
				.equals(castOther.getSpdDomain())))
				&& ((this.getSpdAddr() == castOther.getSpdAddr()) || (this
						.getSpdAddr() != null
						&& castOther.getSpdAddr() != null && this.getSpdAddr()
						.equals(castOther.getSpdAddr())))
				&& ((this.getSpdProdLn() == castOther.getSpdProdLn()) || (this
						.getSpdProdLn() != null
						&& castOther.getSpdProdLn() != null && this
						.getSpdProdLn().equals(castOther.getSpdProdLn())))
				&& ((this.getSpdPart() == castOther.getSpdPart()) || (this
						.getSpdPart() != null
						&& castOther.getSpdPart() != null && this.getSpdPart()
						.equals(castOther.getSpdPart())))
				&& ((this.getSpdCust() == castOther.getSpdCust()) || (this
						.getSpdCust() != null
						&& castOther.getSpdCust() != null && this.getSpdCust()
						.equals(castOther.getSpdCust())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSpdDomain() == null ? 0 : this.getSpdDomain().hashCode());
		result = 37 * result
				+ (getSpdAddr() == null ? 0 : this.getSpdAddr().hashCode());
		result = 37 * result
				+ (getSpdProdLn() == null ? 0 : this.getSpdProdLn().hashCode());
		result = 37 * result
				+ (getSpdPart() == null ? 0 : this.getSpdPart().hashCode());
		result = 37 * result
				+ (getSpdCust() == null ? 0 : this.getSpdCust().hashCode());
		return result;
	}

}