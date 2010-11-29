package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGltmdDetId entity provides the base persistence definition of the
 * GltmdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltmdDetId implements java.io.Serializable {

	// Fields

	private String gltmdDomain;
	private String gltmdEntity;
	private String gltmdAcct;
	private Integer gltmdMatchNbr;
	private String gltmdRef;
	private Boolean gltmdRflag;
	private Integer gltmdLine;

	// Constructors

	/** default constructor */
	public AbstractGltmdDetId() {
	}

	/** full constructor */
	public AbstractGltmdDetId(String gltmdDomain, String gltmdEntity,
			String gltmdAcct, Integer gltmdMatchNbr, String gltmdRef,
			Boolean gltmdRflag, Integer gltmdLine) {
		this.gltmdDomain = gltmdDomain;
		this.gltmdEntity = gltmdEntity;
		this.gltmdAcct = gltmdAcct;
		this.gltmdMatchNbr = gltmdMatchNbr;
		this.gltmdRef = gltmdRef;
		this.gltmdRflag = gltmdRflag;
		this.gltmdLine = gltmdLine;
	}

	// Property accessors

	public String getGltmdDomain() {
		return this.gltmdDomain;
	}

	public void setGltmdDomain(String gltmdDomain) {
		this.gltmdDomain = gltmdDomain;
	}

	public String getGltmdEntity() {
		return this.gltmdEntity;
	}

	public void setGltmdEntity(String gltmdEntity) {
		this.gltmdEntity = gltmdEntity;
	}

	public String getGltmdAcct() {
		return this.gltmdAcct;
	}

	public void setGltmdAcct(String gltmdAcct) {
		this.gltmdAcct = gltmdAcct;
	}

	public Integer getGltmdMatchNbr() {
		return this.gltmdMatchNbr;
	}

	public void setGltmdMatchNbr(Integer gltmdMatchNbr) {
		this.gltmdMatchNbr = gltmdMatchNbr;
	}

	public String getGltmdRef() {
		return this.gltmdRef;
	}

	public void setGltmdRef(String gltmdRef) {
		this.gltmdRef = gltmdRef;
	}

	public Boolean getGltmdRflag() {
		return this.gltmdRflag;
	}

	public void setGltmdRflag(Boolean gltmdRflag) {
		this.gltmdRflag = gltmdRflag;
	}

	public Integer getGltmdLine() {
		return this.gltmdLine;
	}

	public void setGltmdLine(Integer gltmdLine) {
		this.gltmdLine = gltmdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGltmdDetId))
			return false;
		AbstractGltmdDetId castOther = (AbstractGltmdDetId) other;

		return ((this.getGltmdDomain() == castOther.getGltmdDomain()) || (this
				.getGltmdDomain() != null
				&& castOther.getGltmdDomain() != null && this.getGltmdDomain()
				.equals(castOther.getGltmdDomain())))
				&& ((this.getGltmdEntity() == castOther.getGltmdEntity()) || (this
						.getGltmdEntity() != null
						&& castOther.getGltmdEntity() != null && this
						.getGltmdEntity().equals(castOther.getGltmdEntity())))
				&& ((this.getGltmdAcct() == castOther.getGltmdAcct()) || (this
						.getGltmdAcct() != null
						&& castOther.getGltmdAcct() != null && this
						.getGltmdAcct().equals(castOther.getGltmdAcct())))
				&& ((this.getGltmdMatchNbr() == castOther.getGltmdMatchNbr()) || (this
						.getGltmdMatchNbr() != null
						&& castOther.getGltmdMatchNbr() != null && this
						.getGltmdMatchNbr()
						.equals(castOther.getGltmdMatchNbr())))
				&& ((this.getGltmdRef() == castOther.getGltmdRef()) || (this
						.getGltmdRef() != null
						&& castOther.getGltmdRef() != null && this
						.getGltmdRef().equals(castOther.getGltmdRef())))
				&& ((this.getGltmdRflag() == castOther.getGltmdRflag()) || (this
						.getGltmdRflag() != null
						&& castOther.getGltmdRflag() != null && this
						.getGltmdRflag().equals(castOther.getGltmdRflag())))
				&& ((this.getGltmdLine() == castOther.getGltmdLine()) || (this
						.getGltmdLine() != null
						&& castOther.getGltmdLine() != null && this
						.getGltmdLine().equals(castOther.getGltmdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGltmdDomain() == null ? 0 : this.getGltmdDomain()
						.hashCode());
		result = 37
				* result
				+ (getGltmdEntity() == null ? 0 : this.getGltmdEntity()
						.hashCode());
		result = 37 * result
				+ (getGltmdAcct() == null ? 0 : this.getGltmdAcct().hashCode());
		result = 37
				* result
				+ (getGltmdMatchNbr() == null ? 0 : this.getGltmdMatchNbr()
						.hashCode());
		result = 37 * result
				+ (getGltmdRef() == null ? 0 : this.getGltmdRef().hashCode());
		result = 37
				* result
				+ (getGltmdRflag() == null ? 0 : this.getGltmdRflag()
						.hashCode());
		result = 37 * result
				+ (getGltmdLine() == null ? 0 : this.getGltmdLine().hashCode());
		return result;
	}

}