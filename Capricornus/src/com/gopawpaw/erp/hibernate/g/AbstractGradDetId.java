package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGradDetId entity provides the base persistence definition of the
 * GradDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGradDetId implements java.io.Serializable {

	// Fields

	private String gradGlType;
	private String gradAnCode;
	private String gradGlCode;
	private String gradUser1;
	private String gradUser2;
	private String gradQadc01;
	private String gradDomain;
	private Double oidGradDet;

	// Constructors

	/** default constructor */
	public AbstractGradDetId() {
	}

	/** minimal constructor */
	public AbstractGradDetId(String gradDomain, Double oidGradDet) {
		this.gradDomain = gradDomain;
		this.oidGradDet = oidGradDet;
	}

	/** full constructor */
	public AbstractGradDetId(String gradGlType, String gradAnCode,
			String gradGlCode, String gradUser1, String gradUser2,
			String gradQadc01, String gradDomain, Double oidGradDet) {
		this.gradGlType = gradGlType;
		this.gradAnCode = gradAnCode;
		this.gradGlCode = gradGlCode;
		this.gradUser1 = gradUser1;
		this.gradUser2 = gradUser2;
		this.gradQadc01 = gradQadc01;
		this.gradDomain = gradDomain;
		this.oidGradDet = oidGradDet;
	}

	// Property accessors

	public String getGradGlType() {
		return this.gradGlType;
	}

	public void setGradGlType(String gradGlType) {
		this.gradGlType = gradGlType;
	}

	public String getGradAnCode() {
		return this.gradAnCode;
	}

	public void setGradAnCode(String gradAnCode) {
		this.gradAnCode = gradAnCode;
	}

	public String getGradGlCode() {
		return this.gradGlCode;
	}

	public void setGradGlCode(String gradGlCode) {
		this.gradGlCode = gradGlCode;
	}

	public String getGradUser1() {
		return this.gradUser1;
	}

	public void setGradUser1(String gradUser1) {
		this.gradUser1 = gradUser1;
	}

	public String getGradUser2() {
		return this.gradUser2;
	}

	public void setGradUser2(String gradUser2) {
		this.gradUser2 = gradUser2;
	}

	public String getGradQadc01() {
		return this.gradQadc01;
	}

	public void setGradQadc01(String gradQadc01) {
		this.gradQadc01 = gradQadc01;
	}

	public String getGradDomain() {
		return this.gradDomain;
	}

	public void setGradDomain(String gradDomain) {
		this.gradDomain = gradDomain;
	}

	public Double getOidGradDet() {
		return this.oidGradDet;
	}

	public void setOidGradDet(Double oidGradDet) {
		this.oidGradDet = oidGradDet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGradDetId))
			return false;
		AbstractGradDetId castOther = (AbstractGradDetId) other;

		return ((this.getGradGlType() == castOther.getGradGlType()) || (this
				.getGradGlType() != null
				&& castOther.getGradGlType() != null && this.getGradGlType()
				.equals(castOther.getGradGlType())))
				&& ((this.getGradAnCode() == castOther.getGradAnCode()) || (this
						.getGradAnCode() != null
						&& castOther.getGradAnCode() != null && this
						.getGradAnCode().equals(castOther.getGradAnCode())))
				&& ((this.getGradGlCode() == castOther.getGradGlCode()) || (this
						.getGradGlCode() != null
						&& castOther.getGradGlCode() != null && this
						.getGradGlCode().equals(castOther.getGradGlCode())))
				&& ((this.getGradUser1() == castOther.getGradUser1()) || (this
						.getGradUser1() != null
						&& castOther.getGradUser1() != null && this
						.getGradUser1().equals(castOther.getGradUser1())))
				&& ((this.getGradUser2() == castOther.getGradUser2()) || (this
						.getGradUser2() != null
						&& castOther.getGradUser2() != null && this
						.getGradUser2().equals(castOther.getGradUser2())))
				&& ((this.getGradQadc01() == castOther.getGradQadc01()) || (this
						.getGradQadc01() != null
						&& castOther.getGradQadc01() != null && this
						.getGradQadc01().equals(castOther.getGradQadc01())))
				&& ((this.getGradDomain() == castOther.getGradDomain()) || (this
						.getGradDomain() != null
						&& castOther.getGradDomain() != null && this
						.getGradDomain().equals(castOther.getGradDomain())))
				&& ((this.getOidGradDet() == castOther.getOidGradDet()) || (this
						.getOidGradDet() != null
						&& castOther.getOidGradDet() != null && this
						.getOidGradDet().equals(castOther.getOidGradDet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGradGlType() == null ? 0 : this.getGradGlType()
						.hashCode());
		result = 37
				* result
				+ (getGradAnCode() == null ? 0 : this.getGradAnCode()
						.hashCode());
		result = 37
				* result
				+ (getGradGlCode() == null ? 0 : this.getGradGlCode()
						.hashCode());
		result = 37 * result
				+ (getGradUser1() == null ? 0 : this.getGradUser1().hashCode());
		result = 37 * result
				+ (getGradUser2() == null ? 0 : this.getGradUser2().hashCode());
		result = 37
				* result
				+ (getGradQadc01() == null ? 0 : this.getGradQadc01()
						.hashCode());
		result = 37
				* result
				+ (getGradDomain() == null ? 0 : this.getGradDomain()
						.hashCode());
		result = 37
				* result
				+ (getOidGradDet() == null ? 0 : this.getOidGradDet()
						.hashCode());
		return result;
	}

}