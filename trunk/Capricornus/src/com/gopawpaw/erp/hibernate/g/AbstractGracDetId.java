package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGracDetId entity provides the base persistence definition of the
 * GracDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGracDetId implements java.io.Serializable {

	// Fields

	private String gracDomain;
	private Integer gracYear;
	private Integer gracPer;
	private String gracAcc;
	private String gracSub;
	private String gracCc;
	private String gracEntity;
	private String gracProject;

	// Constructors

	/** default constructor */
	public AbstractGracDetId() {
	}

	/** minimal constructor */
	public AbstractGracDetId(String gracDomain) {
		this.gracDomain = gracDomain;
	}

	/** full constructor */
	public AbstractGracDetId(String gracDomain, Integer gracYear,
			Integer gracPer, String gracAcc, String gracSub, String gracCc,
			String gracEntity, String gracProject) {
		this.gracDomain = gracDomain;
		this.gracYear = gracYear;
		this.gracPer = gracPer;
		this.gracAcc = gracAcc;
		this.gracSub = gracSub;
		this.gracCc = gracCc;
		this.gracEntity = gracEntity;
		this.gracProject = gracProject;
	}

	// Property accessors

	public String getGracDomain() {
		return this.gracDomain;
	}

	public void setGracDomain(String gracDomain) {
		this.gracDomain = gracDomain;
	}

	public Integer getGracYear() {
		return this.gracYear;
	}

	public void setGracYear(Integer gracYear) {
		this.gracYear = gracYear;
	}

	public Integer getGracPer() {
		return this.gracPer;
	}

	public void setGracPer(Integer gracPer) {
		this.gracPer = gracPer;
	}

	public String getGracAcc() {
		return this.gracAcc;
	}

	public void setGracAcc(String gracAcc) {
		this.gracAcc = gracAcc;
	}

	public String getGracSub() {
		return this.gracSub;
	}

	public void setGracSub(String gracSub) {
		this.gracSub = gracSub;
	}

	public String getGracCc() {
		return this.gracCc;
	}

	public void setGracCc(String gracCc) {
		this.gracCc = gracCc;
	}

	public String getGracEntity() {
		return this.gracEntity;
	}

	public void setGracEntity(String gracEntity) {
		this.gracEntity = gracEntity;
	}

	public String getGracProject() {
		return this.gracProject;
	}

	public void setGracProject(String gracProject) {
		this.gracProject = gracProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGracDetId))
			return false;
		AbstractGracDetId castOther = (AbstractGracDetId) other;

		return ((this.getGracDomain() == castOther.getGracDomain()) || (this
				.getGracDomain() != null
				&& castOther.getGracDomain() != null && this.getGracDomain()
				.equals(castOther.getGracDomain())))
				&& ((this.getGracYear() == castOther.getGracYear()) || (this
						.getGracYear() != null
						&& castOther.getGracYear() != null && this
						.getGracYear().equals(castOther.getGracYear())))
				&& ((this.getGracPer() == castOther.getGracPer()) || (this
						.getGracPer() != null
						&& castOther.getGracPer() != null && this.getGracPer()
						.equals(castOther.getGracPer())))
				&& ((this.getGracAcc() == castOther.getGracAcc()) || (this
						.getGracAcc() != null
						&& castOther.getGracAcc() != null && this.getGracAcc()
						.equals(castOther.getGracAcc())))
				&& ((this.getGracSub() == castOther.getGracSub()) || (this
						.getGracSub() != null
						&& castOther.getGracSub() != null && this.getGracSub()
						.equals(castOther.getGracSub())))
				&& ((this.getGracCc() == castOther.getGracCc()) || (this
						.getGracCc() != null
						&& castOther.getGracCc() != null && this.getGracCc()
						.equals(castOther.getGracCc())))
				&& ((this.getGracEntity() == castOther.getGracEntity()) || (this
						.getGracEntity() != null
						&& castOther.getGracEntity() != null && this
						.getGracEntity().equals(castOther.getGracEntity())))
				&& ((this.getGracProject() == castOther.getGracProject()) || (this
						.getGracProject() != null
						&& castOther.getGracProject() != null && this
						.getGracProject().equals(castOther.getGracProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGracDomain() == null ? 0 : this.getGracDomain()
						.hashCode());
		result = 37 * result
				+ (getGracYear() == null ? 0 : this.getGracYear().hashCode());
		result = 37 * result
				+ (getGracPer() == null ? 0 : this.getGracPer().hashCode());
		result = 37 * result
				+ (getGracAcc() == null ? 0 : this.getGracAcc().hashCode());
		result = 37 * result
				+ (getGracSub() == null ? 0 : this.getGracSub().hashCode());
		result = 37 * result
				+ (getGracCc() == null ? 0 : this.getGracCc().hashCode());
		result = 37
				* result
				+ (getGracEntity() == null ? 0 : this.getGracEntity()
						.hashCode());
		result = 37
				* result
				+ (getGracProject() == null ? 0 : this.getGracProject()
						.hashCode());
		return result;
	}

}