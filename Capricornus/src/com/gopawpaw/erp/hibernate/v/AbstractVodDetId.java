package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVodDetId entity provides the base persistence definition of the
 * VodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVodDetId implements java.io.Serializable {

	// Fields

	private String vodDomain;
	private String vodRef;
	private Integer vodLn;

	// Constructors

	/** default constructor */
	public AbstractVodDetId() {
	}

	/** minimal constructor */
	public AbstractVodDetId(String vodDomain) {
		this.vodDomain = vodDomain;
	}

	/** full constructor */
	public AbstractVodDetId(String vodDomain, String vodRef, Integer vodLn) {
		this.vodDomain = vodDomain;
		this.vodRef = vodRef;
		this.vodLn = vodLn;
	}

	// Property accessors

	public String getVodDomain() {
		return this.vodDomain;
	}

	public void setVodDomain(String vodDomain) {
		this.vodDomain = vodDomain;
	}

	public String getVodRef() {
		return this.vodRef;
	}

	public void setVodRef(String vodRef) {
		this.vodRef = vodRef;
	}

	public Integer getVodLn() {
		return this.vodLn;
	}

	public void setVodLn(Integer vodLn) {
		this.vodLn = vodLn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVodDetId))
			return false;
		AbstractVodDetId castOther = (AbstractVodDetId) other;

		return ((this.getVodDomain() == castOther.getVodDomain()) || (this
				.getVodDomain() != null
				&& castOther.getVodDomain() != null && this.getVodDomain()
				.equals(castOther.getVodDomain())))
				&& ((this.getVodRef() == castOther.getVodRef()) || (this
						.getVodRef() != null
						&& castOther.getVodRef() != null && this.getVodRef()
						.equals(castOther.getVodRef())))
				&& ((this.getVodLn() == castOther.getVodLn()) || (this
						.getVodLn() != null
						&& castOther.getVodLn() != null && this.getVodLn()
						.equals(castOther.getVodLn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVodDomain() == null ? 0 : this.getVodDomain().hashCode());
		result = 37 * result
				+ (getVodRef() == null ? 0 : this.getVodRef().hashCode());
		result = 37 * result
				+ (getVodLn() == null ? 0 : this.getVodLn().hashCode());
		return result;
	}

}