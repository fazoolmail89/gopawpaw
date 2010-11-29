package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTeMstrId entity provides the base persistence definition of the
 * TeMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTeMstrId implements java.io.Serializable {

	// Fields

	private String teDomain;
	private String teSite;
	private Integer teNbr;
	private Integer teLine;

	// Constructors

	/** default constructor */
	public AbstractTeMstrId() {
	}

	/** minimal constructor */
	public AbstractTeMstrId(String teDomain) {
		this.teDomain = teDomain;
	}

	/** full constructor */
	public AbstractTeMstrId(String teDomain, String teSite, Integer teNbr,
			Integer teLine) {
		this.teDomain = teDomain;
		this.teSite = teSite;
		this.teNbr = teNbr;
		this.teLine = teLine;
	}

	// Property accessors

	public String getTeDomain() {
		return this.teDomain;
	}

	public void setTeDomain(String teDomain) {
		this.teDomain = teDomain;
	}

	public String getTeSite() {
		return this.teSite;
	}

	public void setTeSite(String teSite) {
		this.teSite = teSite;
	}

	public Integer getTeNbr() {
		return this.teNbr;
	}

	public void setTeNbr(Integer teNbr) {
		this.teNbr = teNbr;
	}

	public Integer getTeLine() {
		return this.teLine;
	}

	public void setTeLine(Integer teLine) {
		this.teLine = teLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTeMstrId))
			return false;
		AbstractTeMstrId castOther = (AbstractTeMstrId) other;

		return ((this.getTeDomain() == castOther.getTeDomain()) || (this
				.getTeDomain() != null
				&& castOther.getTeDomain() != null && this.getTeDomain()
				.equals(castOther.getTeDomain())))
				&& ((this.getTeSite() == castOther.getTeSite()) || (this
						.getTeSite() != null
						&& castOther.getTeSite() != null && this.getTeSite()
						.equals(castOther.getTeSite())))
				&& ((this.getTeNbr() == castOther.getTeNbr()) || (this
						.getTeNbr() != null
						&& castOther.getTeNbr() != null && this.getTeNbr()
						.equals(castOther.getTeNbr())))
				&& ((this.getTeLine() == castOther.getTeLine()) || (this
						.getTeLine() != null
						&& castOther.getTeLine() != null && this.getTeLine()
						.equals(castOther.getTeLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTeDomain() == null ? 0 : this.getTeDomain().hashCode());
		result = 37 * result
				+ (getTeSite() == null ? 0 : this.getTeSite().hashCode());
		result = 37 * result
				+ (getTeNbr() == null ? 0 : this.getTeNbr().hashCode());
		result = 37 * result
				+ (getTeLine() == null ? 0 : this.getTeLine().hashCode());
		return result;
	}

}