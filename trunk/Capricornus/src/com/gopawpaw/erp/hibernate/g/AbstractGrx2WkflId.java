package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrx2WkflId entity provides the base persistence definition of the
 * Grx2WkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrx2WkflId implements java.io.Serializable {

	// Fields

	private Integer grx2RunId;
	private Boolean grx2Type;
	private Integer grx2Nbr;
	private String grx2Acct;
	private String grx2Cc;
	private String grx2Entity;
	private String grx2Project;
	private String grx2Sub;
	private Boolean grx2Actual;
	private String grx2BgCode;
	private Integer grx2Level;
	private String grx2User1;
	private String grx2User2;
	private String grx2Qadc01;
	private String grx2Domain;
	private Double oidGrx2Wkfl;

	// Constructors

	/** default constructor */
	public AbstractGrx2WkflId() {
	}

	/** minimal constructor */
	public AbstractGrx2WkflId(String grx2Domain, Double oidGrx2Wkfl) {
		this.grx2Domain = grx2Domain;
		this.oidGrx2Wkfl = oidGrx2Wkfl;
	}

	/** full constructor */
	public AbstractGrx2WkflId(Integer grx2RunId, Boolean grx2Type,
			Integer grx2Nbr, String grx2Acct, String grx2Cc, String grx2Entity,
			String grx2Project, String grx2Sub, Boolean grx2Actual,
			String grx2BgCode, Integer grx2Level, String grx2User1,
			String grx2User2, String grx2Qadc01, String grx2Domain,
			Double oidGrx2Wkfl) {
		this.grx2RunId = grx2RunId;
		this.grx2Type = grx2Type;
		this.grx2Nbr = grx2Nbr;
		this.grx2Acct = grx2Acct;
		this.grx2Cc = grx2Cc;
		this.grx2Entity = grx2Entity;
		this.grx2Project = grx2Project;
		this.grx2Sub = grx2Sub;
		this.grx2Actual = grx2Actual;
		this.grx2BgCode = grx2BgCode;
		this.grx2Level = grx2Level;
		this.grx2User1 = grx2User1;
		this.grx2User2 = grx2User2;
		this.grx2Qadc01 = grx2Qadc01;
		this.grx2Domain = grx2Domain;
		this.oidGrx2Wkfl = oidGrx2Wkfl;
	}

	// Property accessors

	public Integer getGrx2RunId() {
		return this.grx2RunId;
	}

	public void setGrx2RunId(Integer grx2RunId) {
		this.grx2RunId = grx2RunId;
	}

	public Boolean getGrx2Type() {
		return this.grx2Type;
	}

	public void setGrx2Type(Boolean grx2Type) {
		this.grx2Type = grx2Type;
	}

	public Integer getGrx2Nbr() {
		return this.grx2Nbr;
	}

	public void setGrx2Nbr(Integer grx2Nbr) {
		this.grx2Nbr = grx2Nbr;
	}

	public String getGrx2Acct() {
		return this.grx2Acct;
	}

	public void setGrx2Acct(String grx2Acct) {
		this.grx2Acct = grx2Acct;
	}

	public String getGrx2Cc() {
		return this.grx2Cc;
	}

	public void setGrx2Cc(String grx2Cc) {
		this.grx2Cc = grx2Cc;
	}

	public String getGrx2Entity() {
		return this.grx2Entity;
	}

	public void setGrx2Entity(String grx2Entity) {
		this.grx2Entity = grx2Entity;
	}

	public String getGrx2Project() {
		return this.grx2Project;
	}

	public void setGrx2Project(String grx2Project) {
		this.grx2Project = grx2Project;
	}

	public String getGrx2Sub() {
		return this.grx2Sub;
	}

	public void setGrx2Sub(String grx2Sub) {
		this.grx2Sub = grx2Sub;
	}

	public Boolean getGrx2Actual() {
		return this.grx2Actual;
	}

	public void setGrx2Actual(Boolean grx2Actual) {
		this.grx2Actual = grx2Actual;
	}

	public String getGrx2BgCode() {
		return this.grx2BgCode;
	}

	public void setGrx2BgCode(String grx2BgCode) {
		this.grx2BgCode = grx2BgCode;
	}

	public Integer getGrx2Level() {
		return this.grx2Level;
	}

	public void setGrx2Level(Integer grx2Level) {
		this.grx2Level = grx2Level;
	}

	public String getGrx2User1() {
		return this.grx2User1;
	}

	public void setGrx2User1(String grx2User1) {
		this.grx2User1 = grx2User1;
	}

	public String getGrx2User2() {
		return this.grx2User2;
	}

	public void setGrx2User2(String grx2User2) {
		this.grx2User2 = grx2User2;
	}

	public String getGrx2Qadc01() {
		return this.grx2Qadc01;
	}

	public void setGrx2Qadc01(String grx2Qadc01) {
		this.grx2Qadc01 = grx2Qadc01;
	}

	public String getGrx2Domain() {
		return this.grx2Domain;
	}

	public void setGrx2Domain(String grx2Domain) {
		this.grx2Domain = grx2Domain;
	}

	public Double getOidGrx2Wkfl() {
		return this.oidGrx2Wkfl;
	}

	public void setOidGrx2Wkfl(Double oidGrx2Wkfl) {
		this.oidGrx2Wkfl = oidGrx2Wkfl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrx2WkflId))
			return false;
		AbstractGrx2WkflId castOther = (AbstractGrx2WkflId) other;

		return ((this.getGrx2RunId() == castOther.getGrx2RunId()) || (this
				.getGrx2RunId() != null
				&& castOther.getGrx2RunId() != null && this.getGrx2RunId()
				.equals(castOther.getGrx2RunId())))
				&& ((this.getGrx2Type() == castOther.getGrx2Type()) || (this
						.getGrx2Type() != null
						&& castOther.getGrx2Type() != null && this
						.getGrx2Type().equals(castOther.getGrx2Type())))
				&& ((this.getGrx2Nbr() == castOther.getGrx2Nbr()) || (this
						.getGrx2Nbr() != null
						&& castOther.getGrx2Nbr() != null && this.getGrx2Nbr()
						.equals(castOther.getGrx2Nbr())))
				&& ((this.getGrx2Acct() == castOther.getGrx2Acct()) || (this
						.getGrx2Acct() != null
						&& castOther.getGrx2Acct() != null && this
						.getGrx2Acct().equals(castOther.getGrx2Acct())))
				&& ((this.getGrx2Cc() == castOther.getGrx2Cc()) || (this
						.getGrx2Cc() != null
						&& castOther.getGrx2Cc() != null && this.getGrx2Cc()
						.equals(castOther.getGrx2Cc())))
				&& ((this.getGrx2Entity() == castOther.getGrx2Entity()) || (this
						.getGrx2Entity() != null
						&& castOther.getGrx2Entity() != null && this
						.getGrx2Entity().equals(castOther.getGrx2Entity())))
				&& ((this.getGrx2Project() == castOther.getGrx2Project()) || (this
						.getGrx2Project() != null
						&& castOther.getGrx2Project() != null && this
						.getGrx2Project().equals(castOther.getGrx2Project())))
				&& ((this.getGrx2Sub() == castOther.getGrx2Sub()) || (this
						.getGrx2Sub() != null
						&& castOther.getGrx2Sub() != null && this.getGrx2Sub()
						.equals(castOther.getGrx2Sub())))
				&& ((this.getGrx2Actual() == castOther.getGrx2Actual()) || (this
						.getGrx2Actual() != null
						&& castOther.getGrx2Actual() != null && this
						.getGrx2Actual().equals(castOther.getGrx2Actual())))
				&& ((this.getGrx2BgCode() == castOther.getGrx2BgCode()) || (this
						.getGrx2BgCode() != null
						&& castOther.getGrx2BgCode() != null && this
						.getGrx2BgCode().equals(castOther.getGrx2BgCode())))
				&& ((this.getGrx2Level() == castOther.getGrx2Level()) || (this
						.getGrx2Level() != null
						&& castOther.getGrx2Level() != null && this
						.getGrx2Level().equals(castOther.getGrx2Level())))
				&& ((this.getGrx2User1() == castOther.getGrx2User1()) || (this
						.getGrx2User1() != null
						&& castOther.getGrx2User1() != null && this
						.getGrx2User1().equals(castOther.getGrx2User1())))
				&& ((this.getGrx2User2() == castOther.getGrx2User2()) || (this
						.getGrx2User2() != null
						&& castOther.getGrx2User2() != null && this
						.getGrx2User2().equals(castOther.getGrx2User2())))
				&& ((this.getGrx2Qadc01() == castOther.getGrx2Qadc01()) || (this
						.getGrx2Qadc01() != null
						&& castOther.getGrx2Qadc01() != null && this
						.getGrx2Qadc01().equals(castOther.getGrx2Qadc01())))
				&& ((this.getGrx2Domain() == castOther.getGrx2Domain()) || (this
						.getGrx2Domain() != null
						&& castOther.getGrx2Domain() != null && this
						.getGrx2Domain().equals(castOther.getGrx2Domain())))
				&& ((this.getOidGrx2Wkfl() == castOther.getOidGrx2Wkfl()) || (this
						.getOidGrx2Wkfl() != null
						&& castOther.getOidGrx2Wkfl() != null && this
						.getOidGrx2Wkfl().equals(castOther.getOidGrx2Wkfl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrx2RunId() == null ? 0 : this.getGrx2RunId().hashCode());
		result = 37 * result
				+ (getGrx2Type() == null ? 0 : this.getGrx2Type().hashCode());
		result = 37 * result
				+ (getGrx2Nbr() == null ? 0 : this.getGrx2Nbr().hashCode());
		result = 37 * result
				+ (getGrx2Acct() == null ? 0 : this.getGrx2Acct().hashCode());
		result = 37 * result
				+ (getGrx2Cc() == null ? 0 : this.getGrx2Cc().hashCode());
		result = 37
				* result
				+ (getGrx2Entity() == null ? 0 : this.getGrx2Entity()
						.hashCode());
		result = 37
				* result
				+ (getGrx2Project() == null ? 0 : this.getGrx2Project()
						.hashCode());
		result = 37 * result
				+ (getGrx2Sub() == null ? 0 : this.getGrx2Sub().hashCode());
		result = 37
				* result
				+ (getGrx2Actual() == null ? 0 : this.getGrx2Actual()
						.hashCode());
		result = 37
				* result
				+ (getGrx2BgCode() == null ? 0 : this.getGrx2BgCode()
						.hashCode());
		result = 37 * result
				+ (getGrx2Level() == null ? 0 : this.getGrx2Level().hashCode());
		result = 37 * result
				+ (getGrx2User1() == null ? 0 : this.getGrx2User1().hashCode());
		result = 37 * result
				+ (getGrx2User2() == null ? 0 : this.getGrx2User2().hashCode());
		result = 37
				* result
				+ (getGrx2Qadc01() == null ? 0 : this.getGrx2Qadc01()
						.hashCode());
		result = 37
				* result
				+ (getGrx2Domain() == null ? 0 : this.getGrx2Domain()
						.hashCode());
		result = 37
				* result
				+ (getOidGrx2Wkfl() == null ? 0 : this.getOidGrx2Wkfl()
						.hashCode());
		return result;
	}

}