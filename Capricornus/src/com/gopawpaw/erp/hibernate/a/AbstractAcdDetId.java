package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcdDetId entity provides the base persistence definition of the
 * AcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcdDetId implements java.io.Serializable {

	// Fields

	private String acdDomain;
	private String acdAcc;
	private String acdSub;
	private String acdCc;
	private String acdProject;
	private String acdEntity;
	private Integer acdYear;
	private Integer acdPer;

	// Constructors

	/** default constructor */
	public AbstractAcdDetId() {
	}

	/** minimal constructor */
	public AbstractAcdDetId(String acdDomain) {
		this.acdDomain = acdDomain;
	}

	/** full constructor */
	public AbstractAcdDetId(String acdDomain, String acdAcc, String acdSub,
			String acdCc, String acdProject, String acdEntity, Integer acdYear,
			Integer acdPer) {
		this.acdDomain = acdDomain;
		this.acdAcc = acdAcc;
		this.acdSub = acdSub;
		this.acdCc = acdCc;
		this.acdProject = acdProject;
		this.acdEntity = acdEntity;
		this.acdYear = acdYear;
		this.acdPer = acdPer;
	}

	// Property accessors

	public String getAcdDomain() {
		return this.acdDomain;
	}

	public void setAcdDomain(String acdDomain) {
		this.acdDomain = acdDomain;
	}

	public String getAcdAcc() {
		return this.acdAcc;
	}

	public void setAcdAcc(String acdAcc) {
		this.acdAcc = acdAcc;
	}

	public String getAcdSub() {
		return this.acdSub;
	}

	public void setAcdSub(String acdSub) {
		this.acdSub = acdSub;
	}

	public String getAcdCc() {
		return this.acdCc;
	}

	public void setAcdCc(String acdCc) {
		this.acdCc = acdCc;
	}

	public String getAcdProject() {
		return this.acdProject;
	}

	public void setAcdProject(String acdProject) {
		this.acdProject = acdProject;
	}

	public String getAcdEntity() {
		return this.acdEntity;
	}

	public void setAcdEntity(String acdEntity) {
		this.acdEntity = acdEntity;
	}

	public Integer getAcdYear() {
		return this.acdYear;
	}

	public void setAcdYear(Integer acdYear) {
		this.acdYear = acdYear;
	}

	public Integer getAcdPer() {
		return this.acdPer;
	}

	public void setAcdPer(Integer acdPer) {
		this.acdPer = acdPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAcdDetId))
			return false;
		AbstractAcdDetId castOther = (AbstractAcdDetId) other;

		return ((this.getAcdDomain() == castOther.getAcdDomain()) || (this
				.getAcdDomain() != null
				&& castOther.getAcdDomain() != null && this.getAcdDomain()
				.equals(castOther.getAcdDomain())))
				&& ((this.getAcdAcc() == castOther.getAcdAcc()) || (this
						.getAcdAcc() != null
						&& castOther.getAcdAcc() != null && this.getAcdAcc()
						.equals(castOther.getAcdAcc())))
				&& ((this.getAcdSub() == castOther.getAcdSub()) || (this
						.getAcdSub() != null
						&& castOther.getAcdSub() != null && this.getAcdSub()
						.equals(castOther.getAcdSub())))
				&& ((this.getAcdCc() == castOther.getAcdCc()) || (this
						.getAcdCc() != null
						&& castOther.getAcdCc() != null && this.getAcdCc()
						.equals(castOther.getAcdCc())))
				&& ((this.getAcdProject() == castOther.getAcdProject()) || (this
						.getAcdProject() != null
						&& castOther.getAcdProject() != null && this
						.getAcdProject().equals(castOther.getAcdProject())))
				&& ((this.getAcdEntity() == castOther.getAcdEntity()) || (this
						.getAcdEntity() != null
						&& castOther.getAcdEntity() != null && this
						.getAcdEntity().equals(castOther.getAcdEntity())))
				&& ((this.getAcdYear() == castOther.getAcdYear()) || (this
						.getAcdYear() != null
						&& castOther.getAcdYear() != null && this.getAcdYear()
						.equals(castOther.getAcdYear())))
				&& ((this.getAcdPer() == castOther.getAcdPer()) || (this
						.getAcdPer() != null
						&& castOther.getAcdPer() != null && this.getAcdPer()
						.equals(castOther.getAcdPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAcdDomain() == null ? 0 : this.getAcdDomain().hashCode());
		result = 37 * result
				+ (getAcdAcc() == null ? 0 : this.getAcdAcc().hashCode());
		result = 37 * result
				+ (getAcdSub() == null ? 0 : this.getAcdSub().hashCode());
		result = 37 * result
				+ (getAcdCc() == null ? 0 : this.getAcdCc().hashCode());
		result = 37
				* result
				+ (getAcdProject() == null ? 0 : this.getAcdProject()
						.hashCode());
		result = 37 * result
				+ (getAcdEntity() == null ? 0 : this.getAcdEntity().hashCode());
		result = 37 * result
				+ (getAcdYear() == null ? 0 : this.getAcdYear().hashCode());
		result = 37 * result
				+ (getAcdPer() == null ? 0 : this.getAcdPer().hashCode());
		return result;
	}

}