package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractSdMstrId entity provides the base persistence definition of the
 * SdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSdMstrId implements java.io.Serializable {

	// Fields

	private String sdDomain;
	private String sdType;
	private BigDecimal sdAmt;
	private Date sdStart;

	// Constructors

	/** default constructor */
	public AbstractSdMstrId() {
	}

	/** minimal constructor */
	public AbstractSdMstrId(String sdDomain, BigDecimal sdAmt) {
		this.sdDomain = sdDomain;
		this.sdAmt = sdAmt;
	}

	/** full constructor */
	public AbstractSdMstrId(String sdDomain, String sdType, BigDecimal sdAmt,
			Date sdStart) {
		this.sdDomain = sdDomain;
		this.sdType = sdType;
		this.sdAmt = sdAmt;
		this.sdStart = sdStart;
	}

	// Property accessors

	public String getSdDomain() {
		return this.sdDomain;
	}

	public void setSdDomain(String sdDomain) {
		this.sdDomain = sdDomain;
	}

	public String getSdType() {
		return this.sdType;
	}

	public void setSdType(String sdType) {
		this.sdType = sdType;
	}

	public BigDecimal getSdAmt() {
		return this.sdAmt;
	}

	public void setSdAmt(BigDecimal sdAmt) {
		this.sdAmt = sdAmt;
	}

	public Date getSdStart() {
		return this.sdStart;
	}

	public void setSdStart(Date sdStart) {
		this.sdStart = sdStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSdMstrId))
			return false;
		AbstractSdMstrId castOther = (AbstractSdMstrId) other;

		return ((this.getSdDomain() == castOther.getSdDomain()) || (this
				.getSdDomain() != null
				&& castOther.getSdDomain() != null && this.getSdDomain()
				.equals(castOther.getSdDomain())))
				&& ((this.getSdType() == castOther.getSdType()) || (this
						.getSdType() != null
						&& castOther.getSdType() != null && this.getSdType()
						.equals(castOther.getSdType())))
				&& ((this.getSdAmt() == castOther.getSdAmt()) || (this
						.getSdAmt() != null
						&& castOther.getSdAmt() != null && this.getSdAmt()
						.equals(castOther.getSdAmt())))
				&& ((this.getSdStart() == castOther.getSdStart()) || (this
						.getSdStart() != null
						&& castOther.getSdStart() != null && this.getSdStart()
						.equals(castOther.getSdStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSdDomain() == null ? 0 : this.getSdDomain().hashCode());
		result = 37 * result
				+ (getSdType() == null ? 0 : this.getSdType().hashCode());
		result = 37 * result
				+ (getSdAmt() == null ? 0 : this.getSdAmt().hashCode());
		result = 37 * result
				+ (getSdStart() == null ? 0 : this.getSdStart().hashCode());
		return result;
	}

}