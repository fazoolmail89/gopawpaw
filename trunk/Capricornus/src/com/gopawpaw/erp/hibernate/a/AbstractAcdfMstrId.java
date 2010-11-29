package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcdfMstrId entity provides the base persistence definition of the
 * AcdfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcdfMstrId implements java.io.Serializable {

	// Fields

	private String acdfDomain;
	private String acdfModule;
	private String acdfType;
	private String acdfKey1;
	private String acdfKey2;
	private String acdfKey3;
	private String acdfKey4;
	private String acdfKey5;
	private String acdfKey6;

	// Constructors

	/** default constructor */
	public AbstractAcdfMstrId() {
	}

	/** full constructor */
	public AbstractAcdfMstrId(String acdfDomain, String acdfModule,
			String acdfType, String acdfKey1, String acdfKey2, String acdfKey3,
			String acdfKey4, String acdfKey5, String acdfKey6) {
		this.acdfDomain = acdfDomain;
		this.acdfModule = acdfModule;
		this.acdfType = acdfType;
		this.acdfKey1 = acdfKey1;
		this.acdfKey2 = acdfKey2;
		this.acdfKey3 = acdfKey3;
		this.acdfKey4 = acdfKey4;
		this.acdfKey5 = acdfKey5;
		this.acdfKey6 = acdfKey6;
	}

	// Property accessors

	public String getAcdfDomain() {
		return this.acdfDomain;
	}

	public void setAcdfDomain(String acdfDomain) {
		this.acdfDomain = acdfDomain;
	}

	public String getAcdfModule() {
		return this.acdfModule;
	}

	public void setAcdfModule(String acdfModule) {
		this.acdfModule = acdfModule;
	}

	public String getAcdfType() {
		return this.acdfType;
	}

	public void setAcdfType(String acdfType) {
		this.acdfType = acdfType;
	}

	public String getAcdfKey1() {
		return this.acdfKey1;
	}

	public void setAcdfKey1(String acdfKey1) {
		this.acdfKey1 = acdfKey1;
	}

	public String getAcdfKey2() {
		return this.acdfKey2;
	}

	public void setAcdfKey2(String acdfKey2) {
		this.acdfKey2 = acdfKey2;
	}

	public String getAcdfKey3() {
		return this.acdfKey3;
	}

	public void setAcdfKey3(String acdfKey3) {
		this.acdfKey3 = acdfKey3;
	}

	public String getAcdfKey4() {
		return this.acdfKey4;
	}

	public void setAcdfKey4(String acdfKey4) {
		this.acdfKey4 = acdfKey4;
	}

	public String getAcdfKey5() {
		return this.acdfKey5;
	}

	public void setAcdfKey5(String acdfKey5) {
		this.acdfKey5 = acdfKey5;
	}

	public String getAcdfKey6() {
		return this.acdfKey6;
	}

	public void setAcdfKey6(String acdfKey6) {
		this.acdfKey6 = acdfKey6;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAcdfMstrId))
			return false;
		AbstractAcdfMstrId castOther = (AbstractAcdfMstrId) other;

		return ((this.getAcdfDomain() == castOther.getAcdfDomain()) || (this
				.getAcdfDomain() != null
				&& castOther.getAcdfDomain() != null && this.getAcdfDomain()
				.equals(castOther.getAcdfDomain())))
				&& ((this.getAcdfModule() == castOther.getAcdfModule()) || (this
						.getAcdfModule() != null
						&& castOther.getAcdfModule() != null && this
						.getAcdfModule().equals(castOther.getAcdfModule())))
				&& ((this.getAcdfType() == castOther.getAcdfType()) || (this
						.getAcdfType() != null
						&& castOther.getAcdfType() != null && this
						.getAcdfType().equals(castOther.getAcdfType())))
				&& ((this.getAcdfKey1() == castOther.getAcdfKey1()) || (this
						.getAcdfKey1() != null
						&& castOther.getAcdfKey1() != null && this
						.getAcdfKey1().equals(castOther.getAcdfKey1())))
				&& ((this.getAcdfKey2() == castOther.getAcdfKey2()) || (this
						.getAcdfKey2() != null
						&& castOther.getAcdfKey2() != null && this
						.getAcdfKey2().equals(castOther.getAcdfKey2())))
				&& ((this.getAcdfKey3() == castOther.getAcdfKey3()) || (this
						.getAcdfKey3() != null
						&& castOther.getAcdfKey3() != null && this
						.getAcdfKey3().equals(castOther.getAcdfKey3())))
				&& ((this.getAcdfKey4() == castOther.getAcdfKey4()) || (this
						.getAcdfKey4() != null
						&& castOther.getAcdfKey4() != null && this
						.getAcdfKey4().equals(castOther.getAcdfKey4())))
				&& ((this.getAcdfKey5() == castOther.getAcdfKey5()) || (this
						.getAcdfKey5() != null
						&& castOther.getAcdfKey5() != null && this
						.getAcdfKey5().equals(castOther.getAcdfKey5())))
				&& ((this.getAcdfKey6() == castOther.getAcdfKey6()) || (this
						.getAcdfKey6() != null
						&& castOther.getAcdfKey6() != null && this
						.getAcdfKey6().equals(castOther.getAcdfKey6())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAcdfDomain() == null ? 0 : this.getAcdfDomain()
						.hashCode());
		result = 37
				* result
				+ (getAcdfModule() == null ? 0 : this.getAcdfModule()
						.hashCode());
		result = 37 * result
				+ (getAcdfType() == null ? 0 : this.getAcdfType().hashCode());
		result = 37 * result
				+ (getAcdfKey1() == null ? 0 : this.getAcdfKey1().hashCode());
		result = 37 * result
				+ (getAcdfKey2() == null ? 0 : this.getAcdfKey2().hashCode());
		result = 37 * result
				+ (getAcdfKey3() == null ? 0 : this.getAcdfKey3().hashCode());
		result = 37 * result
				+ (getAcdfKey4() == null ? 0 : this.getAcdfKey4().hashCode());
		result = 37 * result
				+ (getAcdfKey5() == null ? 0 : this.getAcdfKey5().hashCode());
		result = 37 * result
				+ (getAcdfKey6() == null ? 0 : this.getAcdfKey6().hashCode());
		return result;
	}

}