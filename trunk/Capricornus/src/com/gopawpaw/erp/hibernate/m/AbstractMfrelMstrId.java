package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMfrelMstrId entity provides the base persistence definition of the
 * MfrelMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMfrelMstrId implements java.io.Serializable {

	// Fields

	private String mfrelType;
	private String mfrelSourceKey1;
	private String mfrelSourceKey2;
	private String mfrelSourceKey3;
	private String mfrelTargetKey1;
	private String mfrelTargetKey2;
	private String mfrelTargetKey3;

	// Constructors

	/** default constructor */
	public AbstractMfrelMstrId() {
	}

	/** full constructor */
	public AbstractMfrelMstrId(String mfrelType, String mfrelSourceKey1,
			String mfrelSourceKey2, String mfrelSourceKey3,
			String mfrelTargetKey1, String mfrelTargetKey2,
			String mfrelTargetKey3) {
		this.mfrelType = mfrelType;
		this.mfrelSourceKey1 = mfrelSourceKey1;
		this.mfrelSourceKey2 = mfrelSourceKey2;
		this.mfrelSourceKey3 = mfrelSourceKey3;
		this.mfrelTargetKey1 = mfrelTargetKey1;
		this.mfrelTargetKey2 = mfrelTargetKey2;
		this.mfrelTargetKey3 = mfrelTargetKey3;
	}

	// Property accessors

	public String getMfrelType() {
		return this.mfrelType;
	}

	public void setMfrelType(String mfrelType) {
		this.mfrelType = mfrelType;
	}

	public String getMfrelSourceKey1() {
		return this.mfrelSourceKey1;
	}

	public void setMfrelSourceKey1(String mfrelSourceKey1) {
		this.mfrelSourceKey1 = mfrelSourceKey1;
	}

	public String getMfrelSourceKey2() {
		return this.mfrelSourceKey2;
	}

	public void setMfrelSourceKey2(String mfrelSourceKey2) {
		this.mfrelSourceKey2 = mfrelSourceKey2;
	}

	public String getMfrelSourceKey3() {
		return this.mfrelSourceKey3;
	}

	public void setMfrelSourceKey3(String mfrelSourceKey3) {
		this.mfrelSourceKey3 = mfrelSourceKey3;
	}

	public String getMfrelTargetKey1() {
		return this.mfrelTargetKey1;
	}

	public void setMfrelTargetKey1(String mfrelTargetKey1) {
		this.mfrelTargetKey1 = mfrelTargetKey1;
	}

	public String getMfrelTargetKey2() {
		return this.mfrelTargetKey2;
	}

	public void setMfrelTargetKey2(String mfrelTargetKey2) {
		this.mfrelTargetKey2 = mfrelTargetKey2;
	}

	public String getMfrelTargetKey3() {
		return this.mfrelTargetKey3;
	}

	public void setMfrelTargetKey3(String mfrelTargetKey3) {
		this.mfrelTargetKey3 = mfrelTargetKey3;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMfrelMstrId))
			return false;
		AbstractMfrelMstrId castOther = (AbstractMfrelMstrId) other;

		return ((this.getMfrelType() == castOther.getMfrelType()) || (this
				.getMfrelType() != null
				&& castOther.getMfrelType() != null && this.getMfrelType()
				.equals(castOther.getMfrelType())))
				&& ((this.getMfrelSourceKey1() == castOther
						.getMfrelSourceKey1()) || (this.getMfrelSourceKey1() != null
						&& castOther.getMfrelSourceKey1() != null && this
						.getMfrelSourceKey1().equals(
								castOther.getMfrelSourceKey1())))
				&& ((this.getMfrelSourceKey2() == castOther
						.getMfrelSourceKey2()) || (this.getMfrelSourceKey2() != null
						&& castOther.getMfrelSourceKey2() != null && this
						.getMfrelSourceKey2().equals(
								castOther.getMfrelSourceKey2())))
				&& ((this.getMfrelSourceKey3() == castOther
						.getMfrelSourceKey3()) || (this.getMfrelSourceKey3() != null
						&& castOther.getMfrelSourceKey3() != null && this
						.getMfrelSourceKey3().equals(
								castOther.getMfrelSourceKey3())))
				&& ((this.getMfrelTargetKey1() == castOther
						.getMfrelTargetKey1()) || (this.getMfrelTargetKey1() != null
						&& castOther.getMfrelTargetKey1() != null && this
						.getMfrelTargetKey1().equals(
								castOther.getMfrelTargetKey1())))
				&& ((this.getMfrelTargetKey2() == castOther
						.getMfrelTargetKey2()) || (this.getMfrelTargetKey2() != null
						&& castOther.getMfrelTargetKey2() != null && this
						.getMfrelTargetKey2().equals(
								castOther.getMfrelTargetKey2())))
				&& ((this.getMfrelTargetKey3() == castOther
						.getMfrelTargetKey3()) || (this.getMfrelTargetKey3() != null
						&& castOther.getMfrelTargetKey3() != null && this
						.getMfrelTargetKey3().equals(
								castOther.getMfrelTargetKey3())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMfrelType() == null ? 0 : this.getMfrelType().hashCode());
		result = 37
				* result
				+ (getMfrelSourceKey1() == null ? 0 : this.getMfrelSourceKey1()
						.hashCode());
		result = 37
				* result
				+ (getMfrelSourceKey2() == null ? 0 : this.getMfrelSourceKey2()
						.hashCode());
		result = 37
				* result
				+ (getMfrelSourceKey3() == null ? 0 : this.getMfrelSourceKey3()
						.hashCode());
		result = 37
				* result
				+ (getMfrelTargetKey1() == null ? 0 : this.getMfrelTargetKey1()
						.hashCode());
		result = 37
				* result
				+ (getMfrelTargetKey2() == null ? 0 : this.getMfrelTargetKey2()
						.hashCode());
		result = 37
				* result
				+ (getMfrelTargetKey3() == null ? 0 : this.getMfrelTargetKey3()
						.hashCode());
		return result;
	}

}