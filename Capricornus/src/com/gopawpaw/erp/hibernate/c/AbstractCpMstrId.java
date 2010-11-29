package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCpMstrId entity provides the base persistence definition of the
 * CpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCpMstrId implements java.io.Serializable {

	// Fields

	private String cpDomain;
	private String cpCust;
	private String cpCustPart;

	// Constructors

	/** default constructor */
	public AbstractCpMstrId() {
	}

	/** minimal constructor */
	public AbstractCpMstrId(String cpDomain) {
		this.cpDomain = cpDomain;
	}

	/** full constructor */
	public AbstractCpMstrId(String cpDomain, String cpCust, String cpCustPart) {
		this.cpDomain = cpDomain;
		this.cpCust = cpCust;
		this.cpCustPart = cpCustPart;
	}

	// Property accessors

	public String getCpDomain() {
		return this.cpDomain;
	}

	public void setCpDomain(String cpDomain) {
		this.cpDomain = cpDomain;
	}

	public String getCpCust() {
		return this.cpCust;
	}

	public void setCpCust(String cpCust) {
		this.cpCust = cpCust;
	}

	public String getCpCustPart() {
		return this.cpCustPart;
	}

	public void setCpCustPart(String cpCustPart) {
		this.cpCustPart = cpCustPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCpMstrId))
			return false;
		AbstractCpMstrId castOther = (AbstractCpMstrId) other;

		return ((this.getCpDomain() == castOther.getCpDomain()) || (this
				.getCpDomain() != null
				&& castOther.getCpDomain() != null && this.getCpDomain()
				.equals(castOther.getCpDomain())))
				&& ((this.getCpCust() == castOther.getCpCust()) || (this
						.getCpCust() != null
						&& castOther.getCpCust() != null && this.getCpCust()
						.equals(castOther.getCpCust())))
				&& ((this.getCpCustPart() == castOther.getCpCustPart()) || (this
						.getCpCustPart() != null
						&& castOther.getCpCustPart() != null && this
						.getCpCustPart().equals(castOther.getCpCustPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCpDomain() == null ? 0 : this.getCpDomain().hashCode());
		result = 37 * result
				+ (getCpCust() == null ? 0 : this.getCpCust().hashCode());
		result = 37
				* result
				+ (getCpCustPart() == null ? 0 : this.getCpCustPart()
						.hashCode());
		return result;
	}

}