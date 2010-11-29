package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrx1WkflId entity provides the base persistence definition of the
 * Grx1WkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrx1WkflId implements java.io.Serializable {

	// Fields

	private Integer grx1RunId;
	private String grx1AnCode;
	private String grx1LinkType;
	private String grx1LinkCode;
	private String grx1User1;
	private String grx1User2;
	private String grx1Qadc01;
	private String grx1Domain;
	private Double oidGrx1Wkfl;

	// Constructors

	/** default constructor */
	public AbstractGrx1WkflId() {
	}

	/** minimal constructor */
	public AbstractGrx1WkflId(String grx1Domain, Double oidGrx1Wkfl) {
		this.grx1Domain = grx1Domain;
		this.oidGrx1Wkfl = oidGrx1Wkfl;
	}

	/** full constructor */
	public AbstractGrx1WkflId(Integer grx1RunId, String grx1AnCode,
			String grx1LinkType, String grx1LinkCode, String grx1User1,
			String grx1User2, String grx1Qadc01, String grx1Domain,
			Double oidGrx1Wkfl) {
		this.grx1RunId = grx1RunId;
		this.grx1AnCode = grx1AnCode;
		this.grx1LinkType = grx1LinkType;
		this.grx1LinkCode = grx1LinkCode;
		this.grx1User1 = grx1User1;
		this.grx1User2 = grx1User2;
		this.grx1Qadc01 = grx1Qadc01;
		this.grx1Domain = grx1Domain;
		this.oidGrx1Wkfl = oidGrx1Wkfl;
	}

	// Property accessors

	public Integer getGrx1RunId() {
		return this.grx1RunId;
	}

	public void setGrx1RunId(Integer grx1RunId) {
		this.grx1RunId = grx1RunId;
	}

	public String getGrx1AnCode() {
		return this.grx1AnCode;
	}

	public void setGrx1AnCode(String grx1AnCode) {
		this.grx1AnCode = grx1AnCode;
	}

	public String getGrx1LinkType() {
		return this.grx1LinkType;
	}

	public void setGrx1LinkType(String grx1LinkType) {
		this.grx1LinkType = grx1LinkType;
	}

	public String getGrx1LinkCode() {
		return this.grx1LinkCode;
	}

	public void setGrx1LinkCode(String grx1LinkCode) {
		this.grx1LinkCode = grx1LinkCode;
	}

	public String getGrx1User1() {
		return this.grx1User1;
	}

	public void setGrx1User1(String grx1User1) {
		this.grx1User1 = grx1User1;
	}

	public String getGrx1User2() {
		return this.grx1User2;
	}

	public void setGrx1User2(String grx1User2) {
		this.grx1User2 = grx1User2;
	}

	public String getGrx1Qadc01() {
		return this.grx1Qadc01;
	}

	public void setGrx1Qadc01(String grx1Qadc01) {
		this.grx1Qadc01 = grx1Qadc01;
	}

	public String getGrx1Domain() {
		return this.grx1Domain;
	}

	public void setGrx1Domain(String grx1Domain) {
		this.grx1Domain = grx1Domain;
	}

	public Double getOidGrx1Wkfl() {
		return this.oidGrx1Wkfl;
	}

	public void setOidGrx1Wkfl(Double oidGrx1Wkfl) {
		this.oidGrx1Wkfl = oidGrx1Wkfl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrx1WkflId))
			return false;
		AbstractGrx1WkflId castOther = (AbstractGrx1WkflId) other;

		return ((this.getGrx1RunId() == castOther.getGrx1RunId()) || (this
				.getGrx1RunId() != null
				&& castOther.getGrx1RunId() != null && this.getGrx1RunId()
				.equals(castOther.getGrx1RunId())))
				&& ((this.getGrx1AnCode() == castOther.getGrx1AnCode()) || (this
						.getGrx1AnCode() != null
						&& castOther.getGrx1AnCode() != null && this
						.getGrx1AnCode().equals(castOther.getGrx1AnCode())))
				&& ((this.getGrx1LinkType() == castOther.getGrx1LinkType()) || (this
						.getGrx1LinkType() != null
						&& castOther.getGrx1LinkType() != null && this
						.getGrx1LinkType().equals(castOther.getGrx1LinkType())))
				&& ((this.getGrx1LinkCode() == castOther.getGrx1LinkCode()) || (this
						.getGrx1LinkCode() != null
						&& castOther.getGrx1LinkCode() != null && this
						.getGrx1LinkCode().equals(castOther.getGrx1LinkCode())))
				&& ((this.getGrx1User1() == castOther.getGrx1User1()) || (this
						.getGrx1User1() != null
						&& castOther.getGrx1User1() != null && this
						.getGrx1User1().equals(castOther.getGrx1User1())))
				&& ((this.getGrx1User2() == castOther.getGrx1User2()) || (this
						.getGrx1User2() != null
						&& castOther.getGrx1User2() != null && this
						.getGrx1User2().equals(castOther.getGrx1User2())))
				&& ((this.getGrx1Qadc01() == castOther.getGrx1Qadc01()) || (this
						.getGrx1Qadc01() != null
						&& castOther.getGrx1Qadc01() != null && this
						.getGrx1Qadc01().equals(castOther.getGrx1Qadc01())))
				&& ((this.getGrx1Domain() == castOther.getGrx1Domain()) || (this
						.getGrx1Domain() != null
						&& castOther.getGrx1Domain() != null && this
						.getGrx1Domain().equals(castOther.getGrx1Domain())))
				&& ((this.getOidGrx1Wkfl() == castOther.getOidGrx1Wkfl()) || (this
						.getOidGrx1Wkfl() != null
						&& castOther.getOidGrx1Wkfl() != null && this
						.getOidGrx1Wkfl().equals(castOther.getOidGrx1Wkfl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrx1RunId() == null ? 0 : this.getGrx1RunId().hashCode());
		result = 37
				* result
				+ (getGrx1AnCode() == null ? 0 : this.getGrx1AnCode()
						.hashCode());
		result = 37
				* result
				+ (getGrx1LinkType() == null ? 0 : this.getGrx1LinkType()
						.hashCode());
		result = 37
				* result
				+ (getGrx1LinkCode() == null ? 0 : this.getGrx1LinkCode()
						.hashCode());
		result = 37 * result
				+ (getGrx1User1() == null ? 0 : this.getGrx1User1().hashCode());
		result = 37 * result
				+ (getGrx1User2() == null ? 0 : this.getGrx1User2().hashCode());
		result = 37
				* result
				+ (getGrx1Qadc01() == null ? 0 : this.getGrx1Qadc01()
						.hashCode());
		result = 37
				* result
				+ (getGrx1Domain() == null ? 0 : this.getGrx1Domain()
						.hashCode());
		result = 37
				* result
				+ (getOidGrx1Wkfl() == null ? 0 : this.getOidGrx1Wkfl()
						.hashCode());
		return result;
	}

}