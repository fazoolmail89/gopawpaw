package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrbgDetId entity provides the base persistence definition of the
 * GrbgDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrbgDetId implements java.io.Serializable {

	// Fields

	private String grbgDomain;
	private String grbgCode;
	private Integer grbgYear;
	private Integer grbgPer;
	private String grbgAcc;
	private String grbgSub;
	private String grbgCc;
	private String grbgEntity;
	private String grbgProject;

	// Constructors

	/** default constructor */
	public AbstractGrbgDetId() {
	}

	/** minimal constructor */
	public AbstractGrbgDetId(String grbgDomain) {
		this.grbgDomain = grbgDomain;
	}

	/** full constructor */
	public AbstractGrbgDetId(String grbgDomain, String grbgCode,
			Integer grbgYear, Integer grbgPer, String grbgAcc, String grbgSub,
			String grbgCc, String grbgEntity, String grbgProject) {
		this.grbgDomain = grbgDomain;
		this.grbgCode = grbgCode;
		this.grbgYear = grbgYear;
		this.grbgPer = grbgPer;
		this.grbgAcc = grbgAcc;
		this.grbgSub = grbgSub;
		this.grbgCc = grbgCc;
		this.grbgEntity = grbgEntity;
		this.grbgProject = grbgProject;
	}

	// Property accessors

	public String getGrbgDomain() {
		return this.grbgDomain;
	}

	public void setGrbgDomain(String grbgDomain) {
		this.grbgDomain = grbgDomain;
	}

	public String getGrbgCode() {
		return this.grbgCode;
	}

	public void setGrbgCode(String grbgCode) {
		this.grbgCode = grbgCode;
	}

	public Integer getGrbgYear() {
		return this.grbgYear;
	}

	public void setGrbgYear(Integer grbgYear) {
		this.grbgYear = grbgYear;
	}

	public Integer getGrbgPer() {
		return this.grbgPer;
	}

	public void setGrbgPer(Integer grbgPer) {
		this.grbgPer = grbgPer;
	}

	public String getGrbgAcc() {
		return this.grbgAcc;
	}

	public void setGrbgAcc(String grbgAcc) {
		this.grbgAcc = grbgAcc;
	}

	public String getGrbgSub() {
		return this.grbgSub;
	}

	public void setGrbgSub(String grbgSub) {
		this.grbgSub = grbgSub;
	}

	public String getGrbgCc() {
		return this.grbgCc;
	}

	public void setGrbgCc(String grbgCc) {
		this.grbgCc = grbgCc;
	}

	public String getGrbgEntity() {
		return this.grbgEntity;
	}

	public void setGrbgEntity(String grbgEntity) {
		this.grbgEntity = grbgEntity;
	}

	public String getGrbgProject() {
		return this.grbgProject;
	}

	public void setGrbgProject(String grbgProject) {
		this.grbgProject = grbgProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrbgDetId))
			return false;
		AbstractGrbgDetId castOther = (AbstractGrbgDetId) other;

		return ((this.getGrbgDomain() == castOther.getGrbgDomain()) || (this
				.getGrbgDomain() != null
				&& castOther.getGrbgDomain() != null && this.getGrbgDomain()
				.equals(castOther.getGrbgDomain())))
				&& ((this.getGrbgCode() == castOther.getGrbgCode()) || (this
						.getGrbgCode() != null
						&& castOther.getGrbgCode() != null && this
						.getGrbgCode().equals(castOther.getGrbgCode())))
				&& ((this.getGrbgYear() == castOther.getGrbgYear()) || (this
						.getGrbgYear() != null
						&& castOther.getGrbgYear() != null && this
						.getGrbgYear().equals(castOther.getGrbgYear())))
				&& ((this.getGrbgPer() == castOther.getGrbgPer()) || (this
						.getGrbgPer() != null
						&& castOther.getGrbgPer() != null && this.getGrbgPer()
						.equals(castOther.getGrbgPer())))
				&& ((this.getGrbgAcc() == castOther.getGrbgAcc()) || (this
						.getGrbgAcc() != null
						&& castOther.getGrbgAcc() != null && this.getGrbgAcc()
						.equals(castOther.getGrbgAcc())))
				&& ((this.getGrbgSub() == castOther.getGrbgSub()) || (this
						.getGrbgSub() != null
						&& castOther.getGrbgSub() != null && this.getGrbgSub()
						.equals(castOther.getGrbgSub())))
				&& ((this.getGrbgCc() == castOther.getGrbgCc()) || (this
						.getGrbgCc() != null
						&& castOther.getGrbgCc() != null && this.getGrbgCc()
						.equals(castOther.getGrbgCc())))
				&& ((this.getGrbgEntity() == castOther.getGrbgEntity()) || (this
						.getGrbgEntity() != null
						&& castOther.getGrbgEntity() != null && this
						.getGrbgEntity().equals(castOther.getGrbgEntity())))
				&& ((this.getGrbgProject() == castOther.getGrbgProject()) || (this
						.getGrbgProject() != null
						&& castOther.getGrbgProject() != null && this
						.getGrbgProject().equals(castOther.getGrbgProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrbgDomain() == null ? 0 : this.getGrbgDomain()
						.hashCode());
		result = 37 * result
				+ (getGrbgCode() == null ? 0 : this.getGrbgCode().hashCode());
		result = 37 * result
				+ (getGrbgYear() == null ? 0 : this.getGrbgYear().hashCode());
		result = 37 * result
				+ (getGrbgPer() == null ? 0 : this.getGrbgPer().hashCode());
		result = 37 * result
				+ (getGrbgAcc() == null ? 0 : this.getGrbgAcc().hashCode());
		result = 37 * result
				+ (getGrbgSub() == null ? 0 : this.getGrbgSub().hashCode());
		result = 37 * result
				+ (getGrbgCc() == null ? 0 : this.getGrbgCc().hashCode());
		result = 37
				* result
				+ (getGrbgEntity() == null ? 0 : this.getGrbgEntity()
						.hashCode());
		result = 37
				* result
				+ (getGrbgProject() == null ? 0 : this.getGrbgProject()
						.hashCode());
		return result;
	}

}