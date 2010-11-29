package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPlidDetId entity provides the base persistence definition of the
 * PlidDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlidDetId implements java.io.Serializable {

	// Fields

	private String plidDomain;
	private Integer plidPliKeyid;
	private Integer plidLine;

	// Constructors

	/** default constructor */
	public AbstractPlidDetId() {
	}

	/** full constructor */
	public AbstractPlidDetId(String plidDomain, Integer plidPliKeyid,
			Integer plidLine) {
		this.plidDomain = plidDomain;
		this.plidPliKeyid = plidPliKeyid;
		this.plidLine = plidLine;
	}

	// Property accessors

	public String getPlidDomain() {
		return this.plidDomain;
	}

	public void setPlidDomain(String plidDomain) {
		this.plidDomain = plidDomain;
	}

	public Integer getPlidPliKeyid() {
		return this.plidPliKeyid;
	}

	public void setPlidPliKeyid(Integer plidPliKeyid) {
		this.plidPliKeyid = plidPliKeyid;
	}

	public Integer getPlidLine() {
		return this.plidLine;
	}

	public void setPlidLine(Integer plidLine) {
		this.plidLine = plidLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPlidDetId))
			return false;
		AbstractPlidDetId castOther = (AbstractPlidDetId) other;

		return ((this.getPlidDomain() == castOther.getPlidDomain()) || (this
				.getPlidDomain() != null
				&& castOther.getPlidDomain() != null && this.getPlidDomain()
				.equals(castOther.getPlidDomain())))
				&& ((this.getPlidPliKeyid() == castOther.getPlidPliKeyid()) || (this
						.getPlidPliKeyid() != null
						&& castOther.getPlidPliKeyid() != null && this
						.getPlidPliKeyid().equals(castOther.getPlidPliKeyid())))
				&& ((this.getPlidLine() == castOther.getPlidLine()) || (this
						.getPlidLine() != null
						&& castOther.getPlidLine() != null && this
						.getPlidLine().equals(castOther.getPlidLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPlidDomain() == null ? 0 : this.getPlidDomain()
						.hashCode());
		result = 37
				* result
				+ (getPlidPliKeyid() == null ? 0 : this.getPlidPliKeyid()
						.hashCode());
		result = 37 * result
				+ (getPlidLine() == null ? 0 : this.getPlidLine().hashCode());
		return result;
	}

}