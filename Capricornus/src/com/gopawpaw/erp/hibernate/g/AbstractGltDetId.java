package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGltDetId entity provides the base persistence definition of the
 * GltDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltDetId implements java.io.Serializable {

	// Fields

	private String gltDomain;
	private String gltRef;
	private Boolean gltRflag;
	private Integer gltLine;

	// Constructors

	/** default constructor */
	public AbstractGltDetId() {
	}

	/** minimal constructor */
	public AbstractGltDetId(String gltDomain) {
		this.gltDomain = gltDomain;
	}

	/** full constructor */
	public AbstractGltDetId(String gltDomain, String gltRef, Boolean gltRflag,
			Integer gltLine) {
		this.gltDomain = gltDomain;
		this.gltRef = gltRef;
		this.gltRflag = gltRflag;
		this.gltLine = gltLine;
	}

	// Property accessors

	public String getGltDomain() {
		return this.gltDomain;
	}

	public void setGltDomain(String gltDomain) {
		this.gltDomain = gltDomain;
	}

	public String getGltRef() {
		return this.gltRef;
	}

	public void setGltRef(String gltRef) {
		this.gltRef = gltRef;
	}

	public Boolean getGltRflag() {
		return this.gltRflag;
	}

	public void setGltRflag(Boolean gltRflag) {
		this.gltRflag = gltRflag;
	}

	public Integer getGltLine() {
		return this.gltLine;
	}

	public void setGltLine(Integer gltLine) {
		this.gltLine = gltLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGltDetId))
			return false;
		AbstractGltDetId castOther = (AbstractGltDetId) other;

		return ((this.getGltDomain() == castOther.getGltDomain()) || (this
				.getGltDomain() != null
				&& castOther.getGltDomain() != null && this.getGltDomain()
				.equals(castOther.getGltDomain())))
				&& ((this.getGltRef() == castOther.getGltRef()) || (this
						.getGltRef() != null
						&& castOther.getGltRef() != null && this.getGltRef()
						.equals(castOther.getGltRef())))
				&& ((this.getGltRflag() == castOther.getGltRflag()) || (this
						.getGltRflag() != null
						&& castOther.getGltRflag() != null && this
						.getGltRflag().equals(castOther.getGltRflag())))
				&& ((this.getGltLine() == castOther.getGltLine()) || (this
						.getGltLine() != null
						&& castOther.getGltLine() != null && this.getGltLine()
						.equals(castOther.getGltLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGltDomain() == null ? 0 : this.getGltDomain().hashCode());
		result = 37 * result
				+ (getGltRef() == null ? 0 : this.getGltRef().hashCode());
		result = 37 * result
				+ (getGltRflag() == null ? 0 : this.getGltRflag().hashCode());
		result = 37 * result
				+ (getGltLine() == null ? 0 : this.getGltLine().hashCode());
		return result;
	}

}