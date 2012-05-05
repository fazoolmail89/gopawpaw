package com.gopawpaw.frame.struct.m;

/**
 * AbstractMntDetId entity provides the base persistence definition of the
 * MntDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMntDetId implements java.io.Serializable {

	// Fields

	private String mntNbr;
	private Integer mntSelect;
	private String mntLang;

	// Constructors

	/** default constructor */
	public AbstractMntDetId() {
	}

	/** full constructor */
	public AbstractMntDetId(String mntNbr, Integer mntSelect, String mntLang) {
		this.mntNbr = mntNbr;
		this.mntSelect = mntSelect;
		this.mntLang = mntLang;
	}

	// Property accessors

	public String getMntNbr() {
		return this.mntNbr;
	}

	public void setMntNbr(String mntNbr) {
		this.mntNbr = mntNbr;
	}

	public Integer getMntSelect() {
		return this.mntSelect;
	}

	public void setMntSelect(Integer mntSelect) {
		this.mntSelect = mntSelect;
	}

	public String getMntLang() {
		return this.mntLang;
	}

	public void setMntLang(String mntLang) {
		this.mntLang = mntLang;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMntDetId))
			return false;
		AbstractMntDetId castOther = (AbstractMntDetId) other;

		return ((this.getMntNbr() == castOther.getMntNbr()) || (this
				.getMntNbr() != null
				&& castOther.getMntNbr() != null && this.getMntNbr().equals(
				castOther.getMntNbr())))
				&& ((this.getMntSelect() == castOther.getMntSelect()) || (this
						.getMntSelect() != null
						&& castOther.getMntSelect() != null && this
						.getMntSelect().equals(castOther.getMntSelect())))
				&& ((this.getMntLang() == castOther.getMntLang()) || (this
						.getMntLang() != null
						&& castOther.getMntLang() != null && this.getMntLang()
						.equals(castOther.getMntLang())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMntNbr() == null ? 0 : this.getMntNbr().hashCode());
		result = 37 * result
				+ (getMntSelect() == null ? 0 : this.getMntSelect().hashCode());
		result = 37 * result
				+ (getMntLang() == null ? 0 : this.getMntLang().hashCode());
		return result;
	}

}