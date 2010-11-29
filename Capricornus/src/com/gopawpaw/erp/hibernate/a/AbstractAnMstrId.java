package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnMstrId entity provides the base persistence definition of the
 * AnMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnMstrId implements java.io.Serializable {

	// Fields

	private String anDomain;
	private String anType;
	private String anCode;

	// Constructors

	/** default constructor */
	public AbstractAnMstrId() {
	}

	/** minimal constructor */
	public AbstractAnMstrId(String anDomain, String anCode) {
		this.anDomain = anDomain;
		this.anCode = anCode;
	}

	/** full constructor */
	public AbstractAnMstrId(String anDomain, String anType, String anCode) {
		this.anDomain = anDomain;
		this.anType = anType;
		this.anCode = anCode;
	}

	// Property accessors

	public String getAnDomain() {
		return this.anDomain;
	}

	public void setAnDomain(String anDomain) {
		this.anDomain = anDomain;
	}

	public String getAnType() {
		return this.anType;
	}

	public void setAnType(String anType) {
		this.anType = anType;
	}

	public String getAnCode() {
		return this.anCode;
	}

	public void setAnCode(String anCode) {
		this.anCode = anCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAnMstrId))
			return false;
		AbstractAnMstrId castOther = (AbstractAnMstrId) other;

		return ((this.getAnDomain() == castOther.getAnDomain()) || (this
				.getAnDomain() != null
				&& castOther.getAnDomain() != null && this.getAnDomain()
				.equals(castOther.getAnDomain())))
				&& ((this.getAnType() == castOther.getAnType()) || (this
						.getAnType() != null
						&& castOther.getAnType() != null && this.getAnType()
						.equals(castOther.getAnType())))
				&& ((this.getAnCode() == castOther.getAnCode()) || (this
						.getAnCode() != null
						&& castOther.getAnCode() != null && this.getAnCode()
						.equals(castOther.getAnCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAnDomain() == null ? 0 : this.getAnDomain().hashCode());
		result = 37 * result
				+ (getAnType() == null ? 0 : this.getAnType().hashCode());
		result = 37 * result
				+ (getAnCode() == null ? 0 : this.getAnCode().hashCode());
		return result;
	}

}