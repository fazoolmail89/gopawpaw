package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBgMstrId entity provides the base persistence definition of the
 * BgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBgMstrId implements java.io.Serializable {

	// Fields

	private String bgDomain;
	private String bgCode;
	private String bgEntity;
	private String bgAcc;
	private String bgSub;
	private String bgCc;
	private Integer bgFpos;
	private String bgProject;

	// Constructors

	/** default constructor */
	public AbstractBgMstrId() {
	}

	/** minimal constructor */
	public AbstractBgMstrId(String bgDomain) {
		this.bgDomain = bgDomain;
	}

	/** full constructor */
	public AbstractBgMstrId(String bgDomain, String bgCode, String bgEntity,
			String bgAcc, String bgSub, String bgCc, Integer bgFpos,
			String bgProject) {
		this.bgDomain = bgDomain;
		this.bgCode = bgCode;
		this.bgEntity = bgEntity;
		this.bgAcc = bgAcc;
		this.bgSub = bgSub;
		this.bgCc = bgCc;
		this.bgFpos = bgFpos;
		this.bgProject = bgProject;
	}

	// Property accessors

	public String getBgDomain() {
		return this.bgDomain;
	}

	public void setBgDomain(String bgDomain) {
		this.bgDomain = bgDomain;
	}

	public String getBgCode() {
		return this.bgCode;
	}

	public void setBgCode(String bgCode) {
		this.bgCode = bgCode;
	}

	public String getBgEntity() {
		return this.bgEntity;
	}

	public void setBgEntity(String bgEntity) {
		this.bgEntity = bgEntity;
	}

	public String getBgAcc() {
		return this.bgAcc;
	}

	public void setBgAcc(String bgAcc) {
		this.bgAcc = bgAcc;
	}

	public String getBgSub() {
		return this.bgSub;
	}

	public void setBgSub(String bgSub) {
		this.bgSub = bgSub;
	}

	public String getBgCc() {
		return this.bgCc;
	}

	public void setBgCc(String bgCc) {
		this.bgCc = bgCc;
	}

	public Integer getBgFpos() {
		return this.bgFpos;
	}

	public void setBgFpos(Integer bgFpos) {
		this.bgFpos = bgFpos;
	}

	public String getBgProject() {
		return this.bgProject;
	}

	public void setBgProject(String bgProject) {
		this.bgProject = bgProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBgMstrId))
			return false;
		AbstractBgMstrId castOther = (AbstractBgMstrId) other;

		return ((this.getBgDomain() == castOther.getBgDomain()) || (this
				.getBgDomain() != null
				&& castOther.getBgDomain() != null && this.getBgDomain()
				.equals(castOther.getBgDomain())))
				&& ((this.getBgCode() == castOther.getBgCode()) || (this
						.getBgCode() != null
						&& castOther.getBgCode() != null && this.getBgCode()
						.equals(castOther.getBgCode())))
				&& ((this.getBgEntity() == castOther.getBgEntity()) || (this
						.getBgEntity() != null
						&& castOther.getBgEntity() != null && this
						.getBgEntity().equals(castOther.getBgEntity())))
				&& ((this.getBgAcc() == castOther.getBgAcc()) || (this
						.getBgAcc() != null
						&& castOther.getBgAcc() != null && this.getBgAcc()
						.equals(castOther.getBgAcc())))
				&& ((this.getBgSub() == castOther.getBgSub()) || (this
						.getBgSub() != null
						&& castOther.getBgSub() != null && this.getBgSub()
						.equals(castOther.getBgSub())))
				&& ((this.getBgCc() == castOther.getBgCc()) || (this.getBgCc() != null
						&& castOther.getBgCc() != null && this.getBgCc()
						.equals(castOther.getBgCc())))
				&& ((this.getBgFpos() == castOther.getBgFpos()) || (this
						.getBgFpos() != null
						&& castOther.getBgFpos() != null && this.getBgFpos()
						.equals(castOther.getBgFpos())))
				&& ((this.getBgProject() == castOther.getBgProject()) || (this
						.getBgProject() != null
						&& castOther.getBgProject() != null && this
						.getBgProject().equals(castOther.getBgProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBgDomain() == null ? 0 : this.getBgDomain().hashCode());
		result = 37 * result
				+ (getBgCode() == null ? 0 : this.getBgCode().hashCode());
		result = 37 * result
				+ (getBgEntity() == null ? 0 : this.getBgEntity().hashCode());
		result = 37 * result
				+ (getBgAcc() == null ? 0 : this.getBgAcc().hashCode());
		result = 37 * result
				+ (getBgSub() == null ? 0 : this.getBgSub().hashCode());
		result = 37 * result
				+ (getBgCc() == null ? 0 : this.getBgCc().hashCode());
		result = 37 * result
				+ (getBgFpos() == null ? 0 : this.getBgFpos().hashCode());
		result = 37 * result
				+ (getBgProject() == null ? 0 : this.getBgProject().hashCode());
		return result;
	}

}