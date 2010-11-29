package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPlMstrId entity provides the base persistence definition of the
 * PlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlMstrId implements java.io.Serializable {

	// Fields

	private String plDomain;
	private String plProdLine;

	// Constructors

	/** default constructor */
	public AbstractPlMstrId() {
	}

	/** full constructor */
	public AbstractPlMstrId(String plDomain, String plProdLine) {
		this.plDomain = plDomain;
		this.plProdLine = plProdLine;
	}

	// Property accessors

	public String getPlDomain() {
		return this.plDomain;
	}

	public void setPlDomain(String plDomain) {
		this.plDomain = plDomain;
	}

	public String getPlProdLine() {
		return this.plProdLine;
	}

	public void setPlProdLine(String plProdLine) {
		this.plProdLine = plProdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPlMstrId))
			return false;
		AbstractPlMstrId castOther = (AbstractPlMstrId) other;

		return ((this.getPlDomain() == castOther.getPlDomain()) || (this
				.getPlDomain() != null
				&& castOther.getPlDomain() != null && this.getPlDomain()
				.equals(castOther.getPlDomain())))
				&& ((this.getPlProdLine() == castOther.getPlProdLine()) || (this
						.getPlProdLine() != null
						&& castOther.getPlProdLine() != null && this
						.getPlProdLine().equals(castOther.getPlProdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPlDomain() == null ? 0 : this.getPlDomain().hashCode());
		result = 37
				* result
				+ (getPlProdLine() == null ? 0 : this.getPlProdLine()
						.hashCode());
		return result;
	}

}