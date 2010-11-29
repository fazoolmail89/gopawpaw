package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMaMstrId entity provides the base persistence definition of the
 * MaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMaMstrId implements java.io.Serializable {

	// Fields

	private String maDomain;
	private String maEntity;
	private String maTrType;
	private String maAcct1;
	private String maAcct2;
	private String maSub1;
	private String maSub2;
	private String maCc1;
	private String maCc2;
	private Boolean maAllSub;
	private Boolean maAllCc;

	// Constructors

	/** default constructor */
	public AbstractMaMstrId() {
	}

	/** minimal constructor */
	public AbstractMaMstrId(String maDomain) {
		this.maDomain = maDomain;
	}

	/** full constructor */
	public AbstractMaMstrId(String maDomain, String maEntity, String maTrType,
			String maAcct1, String maAcct2, String maSub1, String maSub2,
			String maCc1, String maCc2, Boolean maAllSub, Boolean maAllCc) {
		this.maDomain = maDomain;
		this.maEntity = maEntity;
		this.maTrType = maTrType;
		this.maAcct1 = maAcct1;
		this.maAcct2 = maAcct2;
		this.maSub1 = maSub1;
		this.maSub2 = maSub2;
		this.maCc1 = maCc1;
		this.maCc2 = maCc2;
		this.maAllSub = maAllSub;
		this.maAllCc = maAllCc;
	}

	// Property accessors

	public String getMaDomain() {
		return this.maDomain;
	}

	public void setMaDomain(String maDomain) {
		this.maDomain = maDomain;
	}

	public String getMaEntity() {
		return this.maEntity;
	}

	public void setMaEntity(String maEntity) {
		this.maEntity = maEntity;
	}

	public String getMaTrType() {
		return this.maTrType;
	}

	public void setMaTrType(String maTrType) {
		this.maTrType = maTrType;
	}

	public String getMaAcct1() {
		return this.maAcct1;
	}

	public void setMaAcct1(String maAcct1) {
		this.maAcct1 = maAcct1;
	}

	public String getMaAcct2() {
		return this.maAcct2;
	}

	public void setMaAcct2(String maAcct2) {
		this.maAcct2 = maAcct2;
	}

	public String getMaSub1() {
		return this.maSub1;
	}

	public void setMaSub1(String maSub1) {
		this.maSub1 = maSub1;
	}

	public String getMaSub2() {
		return this.maSub2;
	}

	public void setMaSub2(String maSub2) {
		this.maSub2 = maSub2;
	}

	public String getMaCc1() {
		return this.maCc1;
	}

	public void setMaCc1(String maCc1) {
		this.maCc1 = maCc1;
	}

	public String getMaCc2() {
		return this.maCc2;
	}

	public void setMaCc2(String maCc2) {
		this.maCc2 = maCc2;
	}

	public Boolean getMaAllSub() {
		return this.maAllSub;
	}

	public void setMaAllSub(Boolean maAllSub) {
		this.maAllSub = maAllSub;
	}

	public Boolean getMaAllCc() {
		return this.maAllCc;
	}

	public void setMaAllCc(Boolean maAllCc) {
		this.maAllCc = maAllCc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMaMstrId))
			return false;
		AbstractMaMstrId castOther = (AbstractMaMstrId) other;

		return ((this.getMaDomain() == castOther.getMaDomain()) || (this
				.getMaDomain() != null
				&& castOther.getMaDomain() != null && this.getMaDomain()
				.equals(castOther.getMaDomain())))
				&& ((this.getMaEntity() == castOther.getMaEntity()) || (this
						.getMaEntity() != null
						&& castOther.getMaEntity() != null && this
						.getMaEntity().equals(castOther.getMaEntity())))
				&& ((this.getMaTrType() == castOther.getMaTrType()) || (this
						.getMaTrType() != null
						&& castOther.getMaTrType() != null && this
						.getMaTrType().equals(castOther.getMaTrType())))
				&& ((this.getMaAcct1() == castOther.getMaAcct1()) || (this
						.getMaAcct1() != null
						&& castOther.getMaAcct1() != null && this.getMaAcct1()
						.equals(castOther.getMaAcct1())))
				&& ((this.getMaAcct2() == castOther.getMaAcct2()) || (this
						.getMaAcct2() != null
						&& castOther.getMaAcct2() != null && this.getMaAcct2()
						.equals(castOther.getMaAcct2())))
				&& ((this.getMaSub1() == castOther.getMaSub1()) || (this
						.getMaSub1() != null
						&& castOther.getMaSub1() != null && this.getMaSub1()
						.equals(castOther.getMaSub1())))
				&& ((this.getMaSub2() == castOther.getMaSub2()) || (this
						.getMaSub2() != null
						&& castOther.getMaSub2() != null && this.getMaSub2()
						.equals(castOther.getMaSub2())))
				&& ((this.getMaCc1() == castOther.getMaCc1()) || (this
						.getMaCc1() != null
						&& castOther.getMaCc1() != null && this.getMaCc1()
						.equals(castOther.getMaCc1())))
				&& ((this.getMaCc2() == castOther.getMaCc2()) || (this
						.getMaCc2() != null
						&& castOther.getMaCc2() != null && this.getMaCc2()
						.equals(castOther.getMaCc2())))
				&& ((this.getMaAllSub() == castOther.getMaAllSub()) || (this
						.getMaAllSub() != null
						&& castOther.getMaAllSub() != null && this
						.getMaAllSub().equals(castOther.getMaAllSub())))
				&& ((this.getMaAllCc() == castOther.getMaAllCc()) || (this
						.getMaAllCc() != null
						&& castOther.getMaAllCc() != null && this.getMaAllCc()
						.equals(castOther.getMaAllCc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMaDomain() == null ? 0 : this.getMaDomain().hashCode());
		result = 37 * result
				+ (getMaEntity() == null ? 0 : this.getMaEntity().hashCode());
		result = 37 * result
				+ (getMaTrType() == null ? 0 : this.getMaTrType().hashCode());
		result = 37 * result
				+ (getMaAcct1() == null ? 0 : this.getMaAcct1().hashCode());
		result = 37 * result
				+ (getMaAcct2() == null ? 0 : this.getMaAcct2().hashCode());
		result = 37 * result
				+ (getMaSub1() == null ? 0 : this.getMaSub1().hashCode());
		result = 37 * result
				+ (getMaSub2() == null ? 0 : this.getMaSub2().hashCode());
		result = 37 * result
				+ (getMaCc1() == null ? 0 : this.getMaCc1().hashCode());
		result = 37 * result
				+ (getMaCc2() == null ? 0 : this.getMaCc2().hashCode());
		result = 37 * result
				+ (getMaAllSub() == null ? 0 : this.getMaAllSub().hashCode());
		result = 37 * result
				+ (getMaAllCc() == null ? 0 : this.getMaAllCc().hashCode());
		return result;
	}

}