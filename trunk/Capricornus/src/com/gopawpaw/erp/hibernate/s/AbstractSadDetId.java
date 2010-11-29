package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSadDetId entity provides the base persistence definition of the
 * SadDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSadDetId implements java.io.Serializable {

	// Fields

	private String sadDomain;
	private String sadNbr;
	private String sadPrefix;
	private Integer sadLine;

	// Constructors

	/** default constructor */
	public AbstractSadDetId() {
	}

	/** minimal constructor */
	public AbstractSadDetId(String sadDomain) {
		this.sadDomain = sadDomain;
	}

	/** full constructor */
	public AbstractSadDetId(String sadDomain, String sadNbr, String sadPrefix,
			Integer sadLine) {
		this.sadDomain = sadDomain;
		this.sadNbr = sadNbr;
		this.sadPrefix = sadPrefix;
		this.sadLine = sadLine;
	}

	// Property accessors

	public String getSadDomain() {
		return this.sadDomain;
	}

	public void setSadDomain(String sadDomain) {
		this.sadDomain = sadDomain;
	}

	public String getSadNbr() {
		return this.sadNbr;
	}

	public void setSadNbr(String sadNbr) {
		this.sadNbr = sadNbr;
	}

	public String getSadPrefix() {
		return this.sadPrefix;
	}

	public void setSadPrefix(String sadPrefix) {
		this.sadPrefix = sadPrefix;
	}

	public Integer getSadLine() {
		return this.sadLine;
	}

	public void setSadLine(Integer sadLine) {
		this.sadLine = sadLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSadDetId))
			return false;
		AbstractSadDetId castOther = (AbstractSadDetId) other;

		return ((this.getSadDomain() == castOther.getSadDomain()) || (this
				.getSadDomain() != null
				&& castOther.getSadDomain() != null && this.getSadDomain()
				.equals(castOther.getSadDomain())))
				&& ((this.getSadNbr() == castOther.getSadNbr()) || (this
						.getSadNbr() != null
						&& castOther.getSadNbr() != null && this.getSadNbr()
						.equals(castOther.getSadNbr())))
				&& ((this.getSadPrefix() == castOther.getSadPrefix()) || (this
						.getSadPrefix() != null
						&& castOther.getSadPrefix() != null && this
						.getSadPrefix().equals(castOther.getSadPrefix())))
				&& ((this.getSadLine() == castOther.getSadLine()) || (this
						.getSadLine() != null
						&& castOther.getSadLine() != null && this.getSadLine()
						.equals(castOther.getSadLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSadDomain() == null ? 0 : this.getSadDomain().hashCode());
		result = 37 * result
				+ (getSadNbr() == null ? 0 : this.getSadNbr().hashCode());
		result = 37 * result
				+ (getSadPrefix() == null ? 0 : this.getSadPrefix().hashCode());
		result = 37 * result
				+ (getSadLine() == null ? 0 : this.getSadLine().hashCode());
		return result;
	}

}