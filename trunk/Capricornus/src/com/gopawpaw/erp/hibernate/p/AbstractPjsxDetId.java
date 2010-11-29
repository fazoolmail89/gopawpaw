package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPjsxDetId entity provides the base persistence definition of the
 * PjsxDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjsxDetId implements java.io.Serializable {

	// Fields

	private String pjsxDomain;
	private String pjsxNbr;
	private Integer pjsxLine;

	// Constructors

	/** default constructor */
	public AbstractPjsxDetId() {
	}

	/** full constructor */
	public AbstractPjsxDetId(String pjsxDomain, String pjsxNbr, Integer pjsxLine) {
		this.pjsxDomain = pjsxDomain;
		this.pjsxNbr = pjsxNbr;
		this.pjsxLine = pjsxLine;
	}

	// Property accessors

	public String getPjsxDomain() {
		return this.pjsxDomain;
	}

	public void setPjsxDomain(String pjsxDomain) {
		this.pjsxDomain = pjsxDomain;
	}

	public String getPjsxNbr() {
		return this.pjsxNbr;
	}

	public void setPjsxNbr(String pjsxNbr) {
		this.pjsxNbr = pjsxNbr;
	}

	public Integer getPjsxLine() {
		return this.pjsxLine;
	}

	public void setPjsxLine(Integer pjsxLine) {
		this.pjsxLine = pjsxLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPjsxDetId))
			return false;
		AbstractPjsxDetId castOther = (AbstractPjsxDetId) other;

		return ((this.getPjsxDomain() == castOther.getPjsxDomain()) || (this
				.getPjsxDomain() != null
				&& castOther.getPjsxDomain() != null && this.getPjsxDomain()
				.equals(castOther.getPjsxDomain())))
				&& ((this.getPjsxNbr() == castOther.getPjsxNbr()) || (this
						.getPjsxNbr() != null
						&& castOther.getPjsxNbr() != null && this.getPjsxNbr()
						.equals(castOther.getPjsxNbr())))
				&& ((this.getPjsxLine() == castOther.getPjsxLine()) || (this
						.getPjsxLine() != null
						&& castOther.getPjsxLine() != null && this
						.getPjsxLine().equals(castOther.getPjsxLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPjsxDomain() == null ? 0 : this.getPjsxDomain()
						.hashCode());
		result = 37 * result
				+ (getPjsxNbr() == null ? 0 : this.getPjsxNbr().hashCode());
		result = 37 * result
				+ (getPjsxLine() == null ? 0 : this.getPjsxLine().hashCode());
		return result;
	}

}