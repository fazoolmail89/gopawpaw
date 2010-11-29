package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRmdDetId entity provides the base persistence definition of the
 * RmdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRmdDetId implements java.io.Serializable {

	// Fields

	private String rmdDomain;
	private String rmdNbr;
	private String rmdPrefix;
	private Integer rmdLine;

	// Constructors

	/** default constructor */
	public AbstractRmdDetId() {
	}

	/** minimal constructor */
	public AbstractRmdDetId(String rmdDomain, String rmdNbr) {
		this.rmdDomain = rmdDomain;
		this.rmdNbr = rmdNbr;
	}

	/** full constructor */
	public AbstractRmdDetId(String rmdDomain, String rmdNbr, String rmdPrefix,
			Integer rmdLine) {
		this.rmdDomain = rmdDomain;
		this.rmdNbr = rmdNbr;
		this.rmdPrefix = rmdPrefix;
		this.rmdLine = rmdLine;
	}

	// Property accessors

	public String getRmdDomain() {
		return this.rmdDomain;
	}

	public void setRmdDomain(String rmdDomain) {
		this.rmdDomain = rmdDomain;
	}

	public String getRmdNbr() {
		return this.rmdNbr;
	}

	public void setRmdNbr(String rmdNbr) {
		this.rmdNbr = rmdNbr;
	}

	public String getRmdPrefix() {
		return this.rmdPrefix;
	}

	public void setRmdPrefix(String rmdPrefix) {
		this.rmdPrefix = rmdPrefix;
	}

	public Integer getRmdLine() {
		return this.rmdLine;
	}

	public void setRmdLine(Integer rmdLine) {
		this.rmdLine = rmdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRmdDetId))
			return false;
		AbstractRmdDetId castOther = (AbstractRmdDetId) other;

		return ((this.getRmdDomain() == castOther.getRmdDomain()) || (this
				.getRmdDomain() != null
				&& castOther.getRmdDomain() != null && this.getRmdDomain()
				.equals(castOther.getRmdDomain())))
				&& ((this.getRmdNbr() == castOther.getRmdNbr()) || (this
						.getRmdNbr() != null
						&& castOther.getRmdNbr() != null && this.getRmdNbr()
						.equals(castOther.getRmdNbr())))
				&& ((this.getRmdPrefix() == castOther.getRmdPrefix()) || (this
						.getRmdPrefix() != null
						&& castOther.getRmdPrefix() != null && this
						.getRmdPrefix().equals(castOther.getRmdPrefix())))
				&& ((this.getRmdLine() == castOther.getRmdLine()) || (this
						.getRmdLine() != null
						&& castOther.getRmdLine() != null && this.getRmdLine()
						.equals(castOther.getRmdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRmdDomain() == null ? 0 : this.getRmdDomain().hashCode());
		result = 37 * result
				+ (getRmdNbr() == null ? 0 : this.getRmdNbr().hashCode());
		result = 37 * result
				+ (getRmdPrefix() == null ? 0 : this.getRmdPrefix().hashCode());
		result = 37 * result
				+ (getRmdLine() == null ? 0 : this.getRmdLine().hashCode());
		return result;
	}

}