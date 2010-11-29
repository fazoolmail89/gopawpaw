package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLdDetId entity provides the base persistence definition of the
 * LdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLdDetId implements java.io.Serializable {

	// Fields

	private String ldDomain;
	private String ldSite;
	private String ldLoc;
	private String ldPart;
	private String ldLot;
	private String ldRef;

	// Constructors

	/** default constructor */
	public AbstractLdDetId() {
	}

	/** minimal constructor */
	public AbstractLdDetId(String ldDomain, String ldPart) {
		this.ldDomain = ldDomain;
		this.ldPart = ldPart;
	}

	/** full constructor */
	public AbstractLdDetId(String ldDomain, String ldSite, String ldLoc,
			String ldPart, String ldLot, String ldRef) {
		this.ldDomain = ldDomain;
		this.ldSite = ldSite;
		this.ldLoc = ldLoc;
		this.ldPart = ldPart;
		this.ldLot = ldLot;
		this.ldRef = ldRef;
	}

	// Property accessors

	public String getLdDomain() {
		return this.ldDomain;
	}

	public void setLdDomain(String ldDomain) {
		this.ldDomain = ldDomain;
	}

	public String getLdSite() {
		return this.ldSite;
	}

	public void setLdSite(String ldSite) {
		this.ldSite = ldSite;
	}

	public String getLdLoc() {
		return this.ldLoc;
	}

	public void setLdLoc(String ldLoc) {
		this.ldLoc = ldLoc;
	}

	public String getLdPart() {
		return this.ldPart;
	}

	public void setLdPart(String ldPart) {
		this.ldPart = ldPart;
	}

	public String getLdLot() {
		return this.ldLot;
	}

	public void setLdLot(String ldLot) {
		this.ldLot = ldLot;
	}

	public String getLdRef() {
		return this.ldRef;
	}

	public void setLdRef(String ldRef) {
		this.ldRef = ldRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLdDetId))
			return false;
		AbstractLdDetId castOther = (AbstractLdDetId) other;

		return ((this.getLdDomain() == castOther.getLdDomain()) || (this
				.getLdDomain() != null
				&& castOther.getLdDomain() != null && this.getLdDomain()
				.equals(castOther.getLdDomain())))
				&& ((this.getLdSite() == castOther.getLdSite()) || (this
						.getLdSite() != null
						&& castOther.getLdSite() != null && this.getLdSite()
						.equals(castOther.getLdSite())))
				&& ((this.getLdLoc() == castOther.getLdLoc()) || (this
						.getLdLoc() != null
						&& castOther.getLdLoc() != null && this.getLdLoc()
						.equals(castOther.getLdLoc())))
				&& ((this.getLdPart() == castOther.getLdPart()) || (this
						.getLdPart() != null
						&& castOther.getLdPart() != null && this.getLdPart()
						.equals(castOther.getLdPart())))
				&& ((this.getLdLot() == castOther.getLdLot()) || (this
						.getLdLot() != null
						&& castOther.getLdLot() != null && this.getLdLot()
						.equals(castOther.getLdLot())))
				&& ((this.getLdRef() == castOther.getLdRef()) || (this
						.getLdRef() != null
						&& castOther.getLdRef() != null && this.getLdRef()
						.equals(castOther.getLdRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLdDomain() == null ? 0 : this.getLdDomain().hashCode());
		result = 37 * result
				+ (getLdSite() == null ? 0 : this.getLdSite().hashCode());
		result = 37 * result
				+ (getLdLoc() == null ? 0 : this.getLdLoc().hashCode());
		result = 37 * result
				+ (getLdPart() == null ? 0 : this.getLdPart().hashCode());
		result = 37 * result
				+ (getLdLot() == null ? 0 : this.getLdLot().hashCode());
		result = 37 * result
				+ (getLdRef() == null ? 0 : this.getLdRef().hashCode());
		return result;
	}

}