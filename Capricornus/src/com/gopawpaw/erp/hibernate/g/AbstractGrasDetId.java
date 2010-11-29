package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrasDetId entity provides the base persistence definition of the
 * GrasDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrasDetId implements java.io.Serializable {

	// Fields

	private String grasDomain;
	private String grasAnCode;
	private String grasGlType;
	private Boolean grasInclude;
	private String grasSelLow;
	private String grasSelHigh;

	// Constructors

	/** default constructor */
	public AbstractGrasDetId() {
	}

	/** minimal constructor */
	public AbstractGrasDetId(String grasDomain) {
		this.grasDomain = grasDomain;
	}

	/** full constructor */
	public AbstractGrasDetId(String grasDomain, String grasAnCode,
			String grasGlType, Boolean grasInclude, String grasSelLow,
			String grasSelHigh) {
		this.grasDomain = grasDomain;
		this.grasAnCode = grasAnCode;
		this.grasGlType = grasGlType;
		this.grasInclude = grasInclude;
		this.grasSelLow = grasSelLow;
		this.grasSelHigh = grasSelHigh;
	}

	// Property accessors

	public String getGrasDomain() {
		return this.grasDomain;
	}

	public void setGrasDomain(String grasDomain) {
		this.grasDomain = grasDomain;
	}

	public String getGrasAnCode() {
		return this.grasAnCode;
	}

	public void setGrasAnCode(String grasAnCode) {
		this.grasAnCode = grasAnCode;
	}

	public String getGrasGlType() {
		return this.grasGlType;
	}

	public void setGrasGlType(String grasGlType) {
		this.grasGlType = grasGlType;
	}

	public Boolean getGrasInclude() {
		return this.grasInclude;
	}

	public void setGrasInclude(Boolean grasInclude) {
		this.grasInclude = grasInclude;
	}

	public String getGrasSelLow() {
		return this.grasSelLow;
	}

	public void setGrasSelLow(String grasSelLow) {
		this.grasSelLow = grasSelLow;
	}

	public String getGrasSelHigh() {
		return this.grasSelHigh;
	}

	public void setGrasSelHigh(String grasSelHigh) {
		this.grasSelHigh = grasSelHigh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrasDetId))
			return false;
		AbstractGrasDetId castOther = (AbstractGrasDetId) other;

		return ((this.getGrasDomain() == castOther.getGrasDomain()) || (this
				.getGrasDomain() != null
				&& castOther.getGrasDomain() != null && this.getGrasDomain()
				.equals(castOther.getGrasDomain())))
				&& ((this.getGrasAnCode() == castOther.getGrasAnCode()) || (this
						.getGrasAnCode() != null
						&& castOther.getGrasAnCode() != null && this
						.getGrasAnCode().equals(castOther.getGrasAnCode())))
				&& ((this.getGrasGlType() == castOther.getGrasGlType()) || (this
						.getGrasGlType() != null
						&& castOther.getGrasGlType() != null && this
						.getGrasGlType().equals(castOther.getGrasGlType())))
				&& ((this.getGrasInclude() == castOther.getGrasInclude()) || (this
						.getGrasInclude() != null
						&& castOther.getGrasInclude() != null && this
						.getGrasInclude().equals(castOther.getGrasInclude())))
				&& ((this.getGrasSelLow() == castOther.getGrasSelLow()) || (this
						.getGrasSelLow() != null
						&& castOther.getGrasSelLow() != null && this
						.getGrasSelLow().equals(castOther.getGrasSelLow())))
				&& ((this.getGrasSelHigh() == castOther.getGrasSelHigh()) || (this
						.getGrasSelHigh() != null
						&& castOther.getGrasSelHigh() != null && this
						.getGrasSelHigh().equals(castOther.getGrasSelHigh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrasDomain() == null ? 0 : this.getGrasDomain()
						.hashCode());
		result = 37
				* result
				+ (getGrasAnCode() == null ? 0 : this.getGrasAnCode()
						.hashCode());
		result = 37
				* result
				+ (getGrasGlType() == null ? 0 : this.getGrasGlType()
						.hashCode());
		result = 37
				* result
				+ (getGrasInclude() == null ? 0 : this.getGrasInclude()
						.hashCode());
		result = 37
				* result
				+ (getGrasSelLow() == null ? 0 : this.getGrasSelLow()
						.hashCode());
		result = 37
				* result
				+ (getGrasSelHigh() == null ? 0 : this.getGrasSelHigh()
						.hashCode());
		return result;
	}

}