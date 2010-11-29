package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlctDetId entity provides the base persistence definition of the
 * GlctDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlctDetId implements java.io.Serializable {

	// Fields

	private String glctDomain;
	private String glctEntity;
	private String glctSourceCurr;
	private String glctAcc;
	private String glctSub;
	private String glctCc;
	private Integer glctYear;
	private Integer glctPer;

	// Constructors

	/** default constructor */
	public AbstractGlctDetId() {
	}

	/** full constructor */
	public AbstractGlctDetId(String glctDomain, String glctEntity,
			String glctSourceCurr, String glctAcc, String glctSub,
			String glctCc, Integer glctYear, Integer glctPer) {
		this.glctDomain = glctDomain;
		this.glctEntity = glctEntity;
		this.glctSourceCurr = glctSourceCurr;
		this.glctAcc = glctAcc;
		this.glctSub = glctSub;
		this.glctCc = glctCc;
		this.glctYear = glctYear;
		this.glctPer = glctPer;
	}

	// Property accessors

	public String getGlctDomain() {
		return this.glctDomain;
	}

	public void setGlctDomain(String glctDomain) {
		this.glctDomain = glctDomain;
	}

	public String getGlctEntity() {
		return this.glctEntity;
	}

	public void setGlctEntity(String glctEntity) {
		this.glctEntity = glctEntity;
	}

	public String getGlctSourceCurr() {
		return this.glctSourceCurr;
	}

	public void setGlctSourceCurr(String glctSourceCurr) {
		this.glctSourceCurr = glctSourceCurr;
	}

	public String getGlctAcc() {
		return this.glctAcc;
	}

	public void setGlctAcc(String glctAcc) {
		this.glctAcc = glctAcc;
	}

	public String getGlctSub() {
		return this.glctSub;
	}

	public void setGlctSub(String glctSub) {
		this.glctSub = glctSub;
	}

	public String getGlctCc() {
		return this.glctCc;
	}

	public void setGlctCc(String glctCc) {
		this.glctCc = glctCc;
	}

	public Integer getGlctYear() {
		return this.glctYear;
	}

	public void setGlctYear(Integer glctYear) {
		this.glctYear = glctYear;
	}

	public Integer getGlctPer() {
		return this.glctPer;
	}

	public void setGlctPer(Integer glctPer) {
		this.glctPer = glctPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlctDetId))
			return false;
		AbstractGlctDetId castOther = (AbstractGlctDetId) other;

		return ((this.getGlctDomain() == castOther.getGlctDomain()) || (this
				.getGlctDomain() != null
				&& castOther.getGlctDomain() != null && this.getGlctDomain()
				.equals(castOther.getGlctDomain())))
				&& ((this.getGlctEntity() == castOther.getGlctEntity()) || (this
						.getGlctEntity() != null
						&& castOther.getGlctEntity() != null && this
						.getGlctEntity().equals(castOther.getGlctEntity())))
				&& ((this.getGlctSourceCurr() == castOther.getGlctSourceCurr()) || (this
						.getGlctSourceCurr() != null
						&& castOther.getGlctSourceCurr() != null && this
						.getGlctSourceCurr().equals(
								castOther.getGlctSourceCurr())))
				&& ((this.getGlctAcc() == castOther.getGlctAcc()) || (this
						.getGlctAcc() != null
						&& castOther.getGlctAcc() != null && this.getGlctAcc()
						.equals(castOther.getGlctAcc())))
				&& ((this.getGlctSub() == castOther.getGlctSub()) || (this
						.getGlctSub() != null
						&& castOther.getGlctSub() != null && this.getGlctSub()
						.equals(castOther.getGlctSub())))
				&& ((this.getGlctCc() == castOther.getGlctCc()) || (this
						.getGlctCc() != null
						&& castOther.getGlctCc() != null && this.getGlctCc()
						.equals(castOther.getGlctCc())))
				&& ((this.getGlctYear() == castOther.getGlctYear()) || (this
						.getGlctYear() != null
						&& castOther.getGlctYear() != null && this
						.getGlctYear().equals(castOther.getGlctYear())))
				&& ((this.getGlctPer() == castOther.getGlctPer()) || (this
						.getGlctPer() != null
						&& castOther.getGlctPer() != null && this.getGlctPer()
						.equals(castOther.getGlctPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlctDomain() == null ? 0 : this.getGlctDomain()
						.hashCode());
		result = 37
				* result
				+ (getGlctEntity() == null ? 0 : this.getGlctEntity()
						.hashCode());
		result = 37
				* result
				+ (getGlctSourceCurr() == null ? 0 : this.getGlctSourceCurr()
						.hashCode());
		result = 37 * result
				+ (getGlctAcc() == null ? 0 : this.getGlctAcc().hashCode());
		result = 37 * result
				+ (getGlctSub() == null ? 0 : this.getGlctSub().hashCode());
		result = 37 * result
				+ (getGlctCc() == null ? 0 : this.getGlctCc().hashCode());
		result = 37 * result
				+ (getGlctYear() == null ? 0 : this.getGlctYear().hashCode());
		result = 37 * result
				+ (getGlctPer() == null ? 0 : this.getGlctPer().hashCode());
		return result;
	}

}