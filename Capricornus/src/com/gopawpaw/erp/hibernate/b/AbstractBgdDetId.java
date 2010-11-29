package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBgdDetId entity provides the base persistence definition of the
 * BgdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBgdDetId implements java.io.Serializable {

	// Fields

	private String bgdDomain;
	private String bgdCode;
	private String bgdEntity;
	private String bgdAcc;
	private String bgdSub;
	private String bgdCc;
	private Integer bgdFpos;
	private String bgdProject;
	private Integer bgdYear;
	private Integer bgdPer;

	// Constructors

	/** default constructor */
	public AbstractBgdDetId() {
	}

	/** minimal constructor */
	public AbstractBgdDetId(String bgdDomain) {
		this.bgdDomain = bgdDomain;
	}

	/** full constructor */
	public AbstractBgdDetId(String bgdDomain, String bgdCode, String bgdEntity,
			String bgdAcc, String bgdSub, String bgdCc, Integer bgdFpos,
			String bgdProject, Integer bgdYear, Integer bgdPer) {
		this.bgdDomain = bgdDomain;
		this.bgdCode = bgdCode;
		this.bgdEntity = bgdEntity;
		this.bgdAcc = bgdAcc;
		this.bgdSub = bgdSub;
		this.bgdCc = bgdCc;
		this.bgdFpos = bgdFpos;
		this.bgdProject = bgdProject;
		this.bgdYear = bgdYear;
		this.bgdPer = bgdPer;
	}

	// Property accessors

	public String getBgdDomain() {
		return this.bgdDomain;
	}

	public void setBgdDomain(String bgdDomain) {
		this.bgdDomain = bgdDomain;
	}

	public String getBgdCode() {
		return this.bgdCode;
	}

	public void setBgdCode(String bgdCode) {
		this.bgdCode = bgdCode;
	}

	public String getBgdEntity() {
		return this.bgdEntity;
	}

	public void setBgdEntity(String bgdEntity) {
		this.bgdEntity = bgdEntity;
	}

	public String getBgdAcc() {
		return this.bgdAcc;
	}

	public void setBgdAcc(String bgdAcc) {
		this.bgdAcc = bgdAcc;
	}

	public String getBgdSub() {
		return this.bgdSub;
	}

	public void setBgdSub(String bgdSub) {
		this.bgdSub = bgdSub;
	}

	public String getBgdCc() {
		return this.bgdCc;
	}

	public void setBgdCc(String bgdCc) {
		this.bgdCc = bgdCc;
	}

	public Integer getBgdFpos() {
		return this.bgdFpos;
	}

	public void setBgdFpos(Integer bgdFpos) {
		this.bgdFpos = bgdFpos;
	}

	public String getBgdProject() {
		return this.bgdProject;
	}

	public void setBgdProject(String bgdProject) {
		this.bgdProject = bgdProject;
	}

	public Integer getBgdYear() {
		return this.bgdYear;
	}

	public void setBgdYear(Integer bgdYear) {
		this.bgdYear = bgdYear;
	}

	public Integer getBgdPer() {
		return this.bgdPer;
	}

	public void setBgdPer(Integer bgdPer) {
		this.bgdPer = bgdPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBgdDetId))
			return false;
		AbstractBgdDetId castOther = (AbstractBgdDetId) other;

		return ((this.getBgdDomain() == castOther.getBgdDomain()) || (this
				.getBgdDomain() != null
				&& castOther.getBgdDomain() != null && this.getBgdDomain()
				.equals(castOther.getBgdDomain())))
				&& ((this.getBgdCode() == castOther.getBgdCode()) || (this
						.getBgdCode() != null
						&& castOther.getBgdCode() != null && this.getBgdCode()
						.equals(castOther.getBgdCode())))
				&& ((this.getBgdEntity() == castOther.getBgdEntity()) || (this
						.getBgdEntity() != null
						&& castOther.getBgdEntity() != null && this
						.getBgdEntity().equals(castOther.getBgdEntity())))
				&& ((this.getBgdAcc() == castOther.getBgdAcc()) || (this
						.getBgdAcc() != null
						&& castOther.getBgdAcc() != null && this.getBgdAcc()
						.equals(castOther.getBgdAcc())))
				&& ((this.getBgdSub() == castOther.getBgdSub()) || (this
						.getBgdSub() != null
						&& castOther.getBgdSub() != null && this.getBgdSub()
						.equals(castOther.getBgdSub())))
				&& ((this.getBgdCc() == castOther.getBgdCc()) || (this
						.getBgdCc() != null
						&& castOther.getBgdCc() != null && this.getBgdCc()
						.equals(castOther.getBgdCc())))
				&& ((this.getBgdFpos() == castOther.getBgdFpos()) || (this
						.getBgdFpos() != null
						&& castOther.getBgdFpos() != null && this.getBgdFpos()
						.equals(castOther.getBgdFpos())))
				&& ((this.getBgdProject() == castOther.getBgdProject()) || (this
						.getBgdProject() != null
						&& castOther.getBgdProject() != null && this
						.getBgdProject().equals(castOther.getBgdProject())))
				&& ((this.getBgdYear() == castOther.getBgdYear()) || (this
						.getBgdYear() != null
						&& castOther.getBgdYear() != null && this.getBgdYear()
						.equals(castOther.getBgdYear())))
				&& ((this.getBgdPer() == castOther.getBgdPer()) || (this
						.getBgdPer() != null
						&& castOther.getBgdPer() != null && this.getBgdPer()
						.equals(castOther.getBgdPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBgdDomain() == null ? 0 : this.getBgdDomain().hashCode());
		result = 37 * result
				+ (getBgdCode() == null ? 0 : this.getBgdCode().hashCode());
		result = 37 * result
				+ (getBgdEntity() == null ? 0 : this.getBgdEntity().hashCode());
		result = 37 * result
				+ (getBgdAcc() == null ? 0 : this.getBgdAcc().hashCode());
		result = 37 * result
				+ (getBgdSub() == null ? 0 : this.getBgdSub().hashCode());
		result = 37 * result
				+ (getBgdCc() == null ? 0 : this.getBgdCc().hashCode());
		result = 37 * result
				+ (getBgdFpos() == null ? 0 : this.getBgdFpos().hashCode());
		result = 37
				* result
				+ (getBgdProject() == null ? 0 : this.getBgdProject()
						.hashCode());
		result = 37 * result
				+ (getBgdYear() == null ? 0 : this.getBgdYear().hashCode());
		result = 37 * result
				+ (getBgdPer() == null ? 0 : this.getBgdPer().hashCode());
		return result;
	}

}