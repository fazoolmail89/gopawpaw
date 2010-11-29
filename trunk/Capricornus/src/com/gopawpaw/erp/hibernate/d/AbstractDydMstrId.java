package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDydMstrId entity provides the base persistence definition of the
 * DydMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDydMstrId implements java.io.Serializable {

	// Fields

	private String dydDomain;
	private String dydTrType;
	private String dydDocType;
	private String dydEntityFr;
	private String dydEntityTo;

	// Constructors

	/** default constructor */
	public AbstractDydMstrId() {
	}

	/** full constructor */
	public AbstractDydMstrId(String dydDomain, String dydTrType,
			String dydDocType, String dydEntityFr, String dydEntityTo) {
		this.dydDomain = dydDomain;
		this.dydTrType = dydTrType;
		this.dydDocType = dydDocType;
		this.dydEntityFr = dydEntityFr;
		this.dydEntityTo = dydEntityTo;
	}

	// Property accessors

	public String getDydDomain() {
		return this.dydDomain;
	}

	public void setDydDomain(String dydDomain) {
		this.dydDomain = dydDomain;
	}

	public String getDydTrType() {
		return this.dydTrType;
	}

	public void setDydTrType(String dydTrType) {
		this.dydTrType = dydTrType;
	}

	public String getDydDocType() {
		return this.dydDocType;
	}

	public void setDydDocType(String dydDocType) {
		this.dydDocType = dydDocType;
	}

	public String getDydEntityFr() {
		return this.dydEntityFr;
	}

	public void setDydEntityFr(String dydEntityFr) {
		this.dydEntityFr = dydEntityFr;
	}

	public String getDydEntityTo() {
		return this.dydEntityTo;
	}

	public void setDydEntityTo(String dydEntityTo) {
		this.dydEntityTo = dydEntityTo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDydMstrId))
			return false;
		AbstractDydMstrId castOther = (AbstractDydMstrId) other;

		return ((this.getDydDomain() == castOther.getDydDomain()) || (this
				.getDydDomain() != null
				&& castOther.getDydDomain() != null && this.getDydDomain()
				.equals(castOther.getDydDomain())))
				&& ((this.getDydTrType() == castOther.getDydTrType()) || (this
						.getDydTrType() != null
						&& castOther.getDydTrType() != null && this
						.getDydTrType().equals(castOther.getDydTrType())))
				&& ((this.getDydDocType() == castOther.getDydDocType()) || (this
						.getDydDocType() != null
						&& castOther.getDydDocType() != null && this
						.getDydDocType().equals(castOther.getDydDocType())))
				&& ((this.getDydEntityFr() == castOther.getDydEntityFr()) || (this
						.getDydEntityFr() != null
						&& castOther.getDydEntityFr() != null && this
						.getDydEntityFr().equals(castOther.getDydEntityFr())))
				&& ((this.getDydEntityTo() == castOther.getDydEntityTo()) || (this
						.getDydEntityTo() != null
						&& castOther.getDydEntityTo() != null && this
						.getDydEntityTo().equals(castOther.getDydEntityTo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDydDomain() == null ? 0 : this.getDydDomain().hashCode());
		result = 37 * result
				+ (getDydTrType() == null ? 0 : this.getDydTrType().hashCode());
		result = 37
				* result
				+ (getDydDocType() == null ? 0 : this.getDydDocType()
						.hashCode());
		result = 37
				* result
				+ (getDydEntityFr() == null ? 0 : this.getDydEntityFr()
						.hashCode());
		result = 37
				* result
				+ (getDydEntityTo() == null ? 0 : this.getDydEntityTo()
						.hashCode());
		return result;
	}

}