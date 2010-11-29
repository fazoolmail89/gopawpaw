package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrvDetId entity provides the base persistence definition of the
 * GrvDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrvDetId implements java.io.Serializable {

	// Fields

	private String grvDomain;
	private String grvAcc;
	private String grvSub;
	private String grvCc;
	private String grvEntity;
	private String grvProject;

	// Constructors

	/** default constructor */
	public AbstractGrvDetId() {
	}

	/** minimal constructor */
	public AbstractGrvDetId(String grvDomain) {
		this.grvDomain = grvDomain;
	}

	/** full constructor */
	public AbstractGrvDetId(String grvDomain, String grvAcc, String grvSub,
			String grvCc, String grvEntity, String grvProject) {
		this.grvDomain = grvDomain;
		this.grvAcc = grvAcc;
		this.grvSub = grvSub;
		this.grvCc = grvCc;
		this.grvEntity = grvEntity;
		this.grvProject = grvProject;
	}

	// Property accessors

	public String getGrvDomain() {
		return this.grvDomain;
	}

	public void setGrvDomain(String grvDomain) {
		this.grvDomain = grvDomain;
	}

	public String getGrvAcc() {
		return this.grvAcc;
	}

	public void setGrvAcc(String grvAcc) {
		this.grvAcc = grvAcc;
	}

	public String getGrvSub() {
		return this.grvSub;
	}

	public void setGrvSub(String grvSub) {
		this.grvSub = grvSub;
	}

	public String getGrvCc() {
		return this.grvCc;
	}

	public void setGrvCc(String grvCc) {
		this.grvCc = grvCc;
	}

	public String getGrvEntity() {
		return this.grvEntity;
	}

	public void setGrvEntity(String grvEntity) {
		this.grvEntity = grvEntity;
	}

	public String getGrvProject() {
		return this.grvProject;
	}

	public void setGrvProject(String grvProject) {
		this.grvProject = grvProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrvDetId))
			return false;
		AbstractGrvDetId castOther = (AbstractGrvDetId) other;

		return ((this.getGrvDomain() == castOther.getGrvDomain()) || (this
				.getGrvDomain() != null
				&& castOther.getGrvDomain() != null && this.getGrvDomain()
				.equals(castOther.getGrvDomain())))
				&& ((this.getGrvAcc() == castOther.getGrvAcc()) || (this
						.getGrvAcc() != null
						&& castOther.getGrvAcc() != null && this.getGrvAcc()
						.equals(castOther.getGrvAcc())))
				&& ((this.getGrvSub() == castOther.getGrvSub()) || (this
						.getGrvSub() != null
						&& castOther.getGrvSub() != null && this.getGrvSub()
						.equals(castOther.getGrvSub())))
				&& ((this.getGrvCc() == castOther.getGrvCc()) || (this
						.getGrvCc() != null
						&& castOther.getGrvCc() != null && this.getGrvCc()
						.equals(castOther.getGrvCc())))
				&& ((this.getGrvEntity() == castOther.getGrvEntity()) || (this
						.getGrvEntity() != null
						&& castOther.getGrvEntity() != null && this
						.getGrvEntity().equals(castOther.getGrvEntity())))
				&& ((this.getGrvProject() == castOther.getGrvProject()) || (this
						.getGrvProject() != null
						&& castOther.getGrvProject() != null && this
						.getGrvProject().equals(castOther.getGrvProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrvDomain() == null ? 0 : this.getGrvDomain().hashCode());
		result = 37 * result
				+ (getGrvAcc() == null ? 0 : this.getGrvAcc().hashCode());
		result = 37 * result
				+ (getGrvSub() == null ? 0 : this.getGrvSub().hashCode());
		result = 37 * result
				+ (getGrvCc() == null ? 0 : this.getGrvCc().hashCode());
		result = 37 * result
				+ (getGrvEntity() == null ? 0 : this.getGrvEntity().hashCode());
		result = 37
				* result
				+ (getGrvProject() == null ? 0 : this.getGrvProject()
						.hashCode());
		return result;
	}

}