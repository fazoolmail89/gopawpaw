package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPjtMstrId entity provides the base persistence definition of the
 * PjtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjtMstrId implements java.io.Serializable {

	// Fields

	private String pjtDomain;
	private String pjtCode;

	// Constructors

	/** default constructor */
	public AbstractPjtMstrId() {
	}

	/** full constructor */
	public AbstractPjtMstrId(String pjtDomain, String pjtCode) {
		this.pjtDomain = pjtDomain;
		this.pjtCode = pjtCode;
	}

	// Property accessors

	public String getPjtDomain() {
		return this.pjtDomain;
	}

	public void setPjtDomain(String pjtDomain) {
		this.pjtDomain = pjtDomain;
	}

	public String getPjtCode() {
		return this.pjtCode;
	}

	public void setPjtCode(String pjtCode) {
		this.pjtCode = pjtCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPjtMstrId))
			return false;
		AbstractPjtMstrId castOther = (AbstractPjtMstrId) other;

		return ((this.getPjtDomain() == castOther.getPjtDomain()) || (this
				.getPjtDomain() != null
				&& castOther.getPjtDomain() != null && this.getPjtDomain()
				.equals(castOther.getPjtDomain())))
				&& ((this.getPjtCode() == castOther.getPjtCode()) || (this
						.getPjtCode() != null
						&& castOther.getPjtCode() != null && this.getPjtCode()
						.equals(castOther.getPjtCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPjtDomain() == null ? 0 : this.getPjtDomain().hashCode());
		result = 37 * result
				+ (getPjtCode() == null ? 0 : this.getPjtCode().hashCode());
		return result;
	}

}