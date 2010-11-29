package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQodrDetId entity provides the base persistence definition of the
 * QodrDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQodrDetId implements java.io.Serializable {

	// Fields

	private String qodrDomain;
	private String qodrNbr;
	private Integer qodrLine;
	private Integer qodrSeq;

	// Constructors

	/** default constructor */
	public AbstractQodrDetId() {
	}

	/** minimal constructor */
	public AbstractQodrDetId(String qodrDomain) {
		this.qodrDomain = qodrDomain;
	}

	/** full constructor */
	public AbstractQodrDetId(String qodrDomain, String qodrNbr,
			Integer qodrLine, Integer qodrSeq) {
		this.qodrDomain = qodrDomain;
		this.qodrNbr = qodrNbr;
		this.qodrLine = qodrLine;
		this.qodrSeq = qodrSeq;
	}

	// Property accessors

	public String getQodrDomain() {
		return this.qodrDomain;
	}

	public void setQodrDomain(String qodrDomain) {
		this.qodrDomain = qodrDomain;
	}

	public String getQodrNbr() {
		return this.qodrNbr;
	}

	public void setQodrNbr(String qodrNbr) {
		this.qodrNbr = qodrNbr;
	}

	public Integer getQodrLine() {
		return this.qodrLine;
	}

	public void setQodrLine(Integer qodrLine) {
		this.qodrLine = qodrLine;
	}

	public Integer getQodrSeq() {
		return this.qodrSeq;
	}

	public void setQodrSeq(Integer qodrSeq) {
		this.qodrSeq = qodrSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQodrDetId))
			return false;
		AbstractQodrDetId castOther = (AbstractQodrDetId) other;

		return ((this.getQodrDomain() == castOther.getQodrDomain()) || (this
				.getQodrDomain() != null
				&& castOther.getQodrDomain() != null && this.getQodrDomain()
				.equals(castOther.getQodrDomain())))
				&& ((this.getQodrNbr() == castOther.getQodrNbr()) || (this
						.getQodrNbr() != null
						&& castOther.getQodrNbr() != null && this.getQodrNbr()
						.equals(castOther.getQodrNbr())))
				&& ((this.getQodrLine() == castOther.getQodrLine()) || (this
						.getQodrLine() != null
						&& castOther.getQodrLine() != null && this
						.getQodrLine().equals(castOther.getQodrLine())))
				&& ((this.getQodrSeq() == castOther.getQodrSeq()) || (this
						.getQodrSeq() != null
						&& castOther.getQodrSeq() != null && this.getQodrSeq()
						.equals(castOther.getQodrSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getQodrDomain() == null ? 0 : this.getQodrDomain()
						.hashCode());
		result = 37 * result
				+ (getQodrNbr() == null ? 0 : this.getQodrNbr().hashCode());
		result = 37 * result
				+ (getQodrLine() == null ? 0 : this.getQodrLine().hashCode());
		result = 37 * result
				+ (getQodrSeq() == null ? 0 : this.getQodrSeq().hashCode());
		return result;
	}

}