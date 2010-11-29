package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSobDetId entity provides the base persistence definition of the
 * SobDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSobDetId implements java.io.Serializable {

	// Fields

	private String sobDomain;
	private String sobNbr;
	private Integer sobLine;
	private String sobParent;
	private String sobFeature;
	private String sobPart;

	// Constructors

	/** default constructor */
	public AbstractSobDetId() {
	}

	/** minimal constructor */
	public AbstractSobDetId(String sobDomain, String sobParent) {
		this.sobDomain = sobDomain;
		this.sobParent = sobParent;
	}

	/** full constructor */
	public AbstractSobDetId(String sobDomain, String sobNbr, Integer sobLine,
			String sobParent, String sobFeature, String sobPart) {
		this.sobDomain = sobDomain;
		this.sobNbr = sobNbr;
		this.sobLine = sobLine;
		this.sobParent = sobParent;
		this.sobFeature = sobFeature;
		this.sobPart = sobPart;
	}

	// Property accessors

	public String getSobDomain() {
		return this.sobDomain;
	}

	public void setSobDomain(String sobDomain) {
		this.sobDomain = sobDomain;
	}

	public String getSobNbr() {
		return this.sobNbr;
	}

	public void setSobNbr(String sobNbr) {
		this.sobNbr = sobNbr;
	}

	public Integer getSobLine() {
		return this.sobLine;
	}

	public void setSobLine(Integer sobLine) {
		this.sobLine = sobLine;
	}

	public String getSobParent() {
		return this.sobParent;
	}

	public void setSobParent(String sobParent) {
		this.sobParent = sobParent;
	}

	public String getSobFeature() {
		return this.sobFeature;
	}

	public void setSobFeature(String sobFeature) {
		this.sobFeature = sobFeature;
	}

	public String getSobPart() {
		return this.sobPart;
	}

	public void setSobPart(String sobPart) {
		this.sobPart = sobPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSobDetId))
			return false;
		AbstractSobDetId castOther = (AbstractSobDetId) other;

		return ((this.getSobDomain() == castOther.getSobDomain()) || (this
				.getSobDomain() != null
				&& castOther.getSobDomain() != null && this.getSobDomain()
				.equals(castOther.getSobDomain())))
				&& ((this.getSobNbr() == castOther.getSobNbr()) || (this
						.getSobNbr() != null
						&& castOther.getSobNbr() != null && this.getSobNbr()
						.equals(castOther.getSobNbr())))
				&& ((this.getSobLine() == castOther.getSobLine()) || (this
						.getSobLine() != null
						&& castOther.getSobLine() != null && this.getSobLine()
						.equals(castOther.getSobLine())))
				&& ((this.getSobParent() == castOther.getSobParent()) || (this
						.getSobParent() != null
						&& castOther.getSobParent() != null && this
						.getSobParent().equals(castOther.getSobParent())))
				&& ((this.getSobFeature() == castOther.getSobFeature()) || (this
						.getSobFeature() != null
						&& castOther.getSobFeature() != null && this
						.getSobFeature().equals(castOther.getSobFeature())))
				&& ((this.getSobPart() == castOther.getSobPart()) || (this
						.getSobPart() != null
						&& castOther.getSobPart() != null && this.getSobPart()
						.equals(castOther.getSobPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSobDomain() == null ? 0 : this.getSobDomain().hashCode());
		result = 37 * result
				+ (getSobNbr() == null ? 0 : this.getSobNbr().hashCode());
		result = 37 * result
				+ (getSobLine() == null ? 0 : this.getSobLine().hashCode());
		result = 37 * result
				+ (getSobParent() == null ? 0 : this.getSobParent().hashCode());
		result = 37
				* result
				+ (getSobFeature() == null ? 0 : this.getSobFeature()
						.hashCode());
		result = 37 * result
				+ (getSobPart() == null ? 0 : this.getSobPart().hashCode());
		return result;
	}

}