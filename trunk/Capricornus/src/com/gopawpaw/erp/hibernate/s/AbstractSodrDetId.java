package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSodrDetId entity provides the base persistence definition of the
 * SodrDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSodrDetId implements java.io.Serializable {

	// Fields

	private String sodrDomain;
	private String sodrNbr;
	private Integer sodrLine;
	private Integer sodrSeq;

	// Constructors

	/** default constructor */
	public AbstractSodrDetId() {
	}

	/** minimal constructor */
	public AbstractSodrDetId(String sodrDomain) {
		this.sodrDomain = sodrDomain;
	}

	/** full constructor */
	public AbstractSodrDetId(String sodrDomain, String sodrNbr,
			Integer sodrLine, Integer sodrSeq) {
		this.sodrDomain = sodrDomain;
		this.sodrNbr = sodrNbr;
		this.sodrLine = sodrLine;
		this.sodrSeq = sodrSeq;
	}

	// Property accessors

	public String getSodrDomain() {
		return this.sodrDomain;
	}

	public void setSodrDomain(String sodrDomain) {
		this.sodrDomain = sodrDomain;
	}

	public String getSodrNbr() {
		return this.sodrNbr;
	}

	public void setSodrNbr(String sodrNbr) {
		this.sodrNbr = sodrNbr;
	}

	public Integer getSodrLine() {
		return this.sodrLine;
	}

	public void setSodrLine(Integer sodrLine) {
		this.sodrLine = sodrLine;
	}

	public Integer getSodrSeq() {
		return this.sodrSeq;
	}

	public void setSodrSeq(Integer sodrSeq) {
		this.sodrSeq = sodrSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSodrDetId))
			return false;
		AbstractSodrDetId castOther = (AbstractSodrDetId) other;

		return ((this.getSodrDomain() == castOther.getSodrDomain()) || (this
				.getSodrDomain() != null
				&& castOther.getSodrDomain() != null && this.getSodrDomain()
				.equals(castOther.getSodrDomain())))
				&& ((this.getSodrNbr() == castOther.getSodrNbr()) || (this
						.getSodrNbr() != null
						&& castOther.getSodrNbr() != null && this.getSodrNbr()
						.equals(castOther.getSodrNbr())))
				&& ((this.getSodrLine() == castOther.getSodrLine()) || (this
						.getSodrLine() != null
						&& castOther.getSodrLine() != null && this
						.getSodrLine().equals(castOther.getSodrLine())))
				&& ((this.getSodrSeq() == castOther.getSodrSeq()) || (this
						.getSodrSeq() != null
						&& castOther.getSodrSeq() != null && this.getSodrSeq()
						.equals(castOther.getSodrSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSodrDomain() == null ? 0 : this.getSodrDomain()
						.hashCode());
		result = 37 * result
				+ (getSodrNbr() == null ? 0 : this.getSodrNbr().hashCode());
		result = 37 * result
				+ (getSodrLine() == null ? 0 : this.getSodrLine().hashCode());
		result = 37 * result
				+ (getSodrSeq() == null ? 0 : this.getSodrSeq().hashCode());
		return result;
	}

}