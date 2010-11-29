package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPaldDetId entity provides the base persistence definition of the
 * PaldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPaldDetId implements java.io.Serializable {

	// Fields

	private String paldDomain;
	private String paldPallet;
	private String paldPart;

	// Constructors

	/** default constructor */
	public AbstractPaldDetId() {
	}

	/** minimal constructor */
	public AbstractPaldDetId(String paldDomain) {
		this.paldDomain = paldDomain;
	}

	/** full constructor */
	public AbstractPaldDetId(String paldDomain, String paldPallet,
			String paldPart) {
		this.paldDomain = paldDomain;
		this.paldPallet = paldPallet;
		this.paldPart = paldPart;
	}

	// Property accessors

	public String getPaldDomain() {
		return this.paldDomain;
	}

	public void setPaldDomain(String paldDomain) {
		this.paldDomain = paldDomain;
	}

	public String getPaldPallet() {
		return this.paldPallet;
	}

	public void setPaldPallet(String paldPallet) {
		this.paldPallet = paldPallet;
	}

	public String getPaldPart() {
		return this.paldPart;
	}

	public void setPaldPart(String paldPart) {
		this.paldPart = paldPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPaldDetId))
			return false;
		AbstractPaldDetId castOther = (AbstractPaldDetId) other;

		return ((this.getPaldDomain() == castOther.getPaldDomain()) || (this
				.getPaldDomain() != null
				&& castOther.getPaldDomain() != null && this.getPaldDomain()
				.equals(castOther.getPaldDomain())))
				&& ((this.getPaldPallet() == castOther.getPaldPallet()) || (this
						.getPaldPallet() != null
						&& castOther.getPaldPallet() != null && this
						.getPaldPallet().equals(castOther.getPaldPallet())))
				&& ((this.getPaldPart() == castOther.getPaldPart()) || (this
						.getPaldPart() != null
						&& castOther.getPaldPart() != null && this
						.getPaldPart().equals(castOther.getPaldPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPaldDomain() == null ? 0 : this.getPaldDomain()
						.hashCode());
		result = 37
				* result
				+ (getPaldPallet() == null ? 0 : this.getPaldPallet()
						.hashCode());
		result = 37 * result
				+ (getPaldPart() == null ? 0 : this.getPaldPart().hashCode());
		return result;
	}

}