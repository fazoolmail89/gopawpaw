package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPjsMstrId entity provides the base persistence definition of the
 * PjsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjsMstrId implements java.io.Serializable {

	// Fields

	private String pjsDomain;
	private String pjsNbr;
	private Integer pjsLine;

	// Constructors

	/** default constructor */
	public AbstractPjsMstrId() {
	}

	/** full constructor */
	public AbstractPjsMstrId(String pjsDomain, String pjsNbr, Integer pjsLine) {
		this.pjsDomain = pjsDomain;
		this.pjsNbr = pjsNbr;
		this.pjsLine = pjsLine;
	}

	// Property accessors

	public String getPjsDomain() {
		return this.pjsDomain;
	}

	public void setPjsDomain(String pjsDomain) {
		this.pjsDomain = pjsDomain;
	}

	public String getPjsNbr() {
		return this.pjsNbr;
	}

	public void setPjsNbr(String pjsNbr) {
		this.pjsNbr = pjsNbr;
	}

	public Integer getPjsLine() {
		return this.pjsLine;
	}

	public void setPjsLine(Integer pjsLine) {
		this.pjsLine = pjsLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPjsMstrId))
			return false;
		AbstractPjsMstrId castOther = (AbstractPjsMstrId) other;

		return ((this.getPjsDomain() == castOther.getPjsDomain()) || (this
				.getPjsDomain() != null
				&& castOther.getPjsDomain() != null && this.getPjsDomain()
				.equals(castOther.getPjsDomain())))
				&& ((this.getPjsNbr() == castOther.getPjsNbr()) || (this
						.getPjsNbr() != null
						&& castOther.getPjsNbr() != null && this.getPjsNbr()
						.equals(castOther.getPjsNbr())))
				&& ((this.getPjsLine() == castOther.getPjsLine()) || (this
						.getPjsLine() != null
						&& castOther.getPjsLine() != null && this.getPjsLine()
						.equals(castOther.getPjsLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPjsDomain() == null ? 0 : this.getPjsDomain().hashCode());
		result = 37 * result
				+ (getPjsNbr() == null ? 0 : this.getPjsNbr().hashCode());
		result = 37 * result
				+ (getPjsLine() == null ? 0 : this.getPjsLine().hashCode());
		return result;
	}

}