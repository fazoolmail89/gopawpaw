package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractExcMstrId entity provides the base persistence definition of the
 * ExcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExcMstrId implements java.io.Serializable {

	// Fields

	private String excDomain;
	private String excCurr;
	private String excCurr2;
	private String excAcc;

	// Constructors

	/** default constructor */
	public AbstractExcMstrId() {
	}

	/** minimal constructor */
	public AbstractExcMstrId(String excDomain) {
		this.excDomain = excDomain;
	}

	/** full constructor */
	public AbstractExcMstrId(String excDomain, String excCurr, String excCurr2,
			String excAcc) {
		this.excDomain = excDomain;
		this.excCurr = excCurr;
		this.excCurr2 = excCurr2;
		this.excAcc = excAcc;
	}

	// Property accessors

	public String getExcDomain() {
		return this.excDomain;
	}

	public void setExcDomain(String excDomain) {
		this.excDomain = excDomain;
	}

	public String getExcCurr() {
		return this.excCurr;
	}

	public void setExcCurr(String excCurr) {
		this.excCurr = excCurr;
	}

	public String getExcCurr2() {
		return this.excCurr2;
	}

	public void setExcCurr2(String excCurr2) {
		this.excCurr2 = excCurr2;
	}

	public String getExcAcc() {
		return this.excAcc;
	}

	public void setExcAcc(String excAcc) {
		this.excAcc = excAcc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractExcMstrId))
			return false;
		AbstractExcMstrId castOther = (AbstractExcMstrId) other;

		return ((this.getExcDomain() == castOther.getExcDomain()) || (this
				.getExcDomain() != null
				&& castOther.getExcDomain() != null && this.getExcDomain()
				.equals(castOther.getExcDomain())))
				&& ((this.getExcCurr() == castOther.getExcCurr()) || (this
						.getExcCurr() != null
						&& castOther.getExcCurr() != null && this.getExcCurr()
						.equals(castOther.getExcCurr())))
				&& ((this.getExcCurr2() == castOther.getExcCurr2()) || (this
						.getExcCurr2() != null
						&& castOther.getExcCurr2() != null && this
						.getExcCurr2().equals(castOther.getExcCurr2())))
				&& ((this.getExcAcc() == castOther.getExcAcc()) || (this
						.getExcAcc() != null
						&& castOther.getExcAcc() != null && this.getExcAcc()
						.equals(castOther.getExcAcc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getExcDomain() == null ? 0 : this.getExcDomain().hashCode());
		result = 37 * result
				+ (getExcCurr() == null ? 0 : this.getExcCurr().hashCode());
		result = 37 * result
				+ (getExcCurr2() == null ? 0 : this.getExcCurr2().hashCode());
		result = 37 * result
				+ (getExcAcc() == null ? 0 : this.getExcAcc().hashCode());
		return result;
	}

}