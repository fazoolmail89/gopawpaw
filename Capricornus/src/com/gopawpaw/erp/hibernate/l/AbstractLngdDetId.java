package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLngdDetId entity provides the base persistence definition of the
 * LngdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLngdDetId implements java.io.Serializable {

	// Fields

	private String lngdDataset;
	private String lngdKey1;
	private String lngdKey2;
	private String lngdKey3;
	private String lngdKey4;
	private String lngdField;
	private String lngdLang;

	// Constructors

	/** default constructor */
	public AbstractLngdDetId() {
	}

	/** full constructor */
	public AbstractLngdDetId(String lngdDataset, String lngdKey1,
			String lngdKey2, String lngdKey3, String lngdKey4,
			String lngdField, String lngdLang) {
		this.lngdDataset = lngdDataset;
		this.lngdKey1 = lngdKey1;
		this.lngdKey2 = lngdKey2;
		this.lngdKey3 = lngdKey3;
		this.lngdKey4 = lngdKey4;
		this.lngdField = lngdField;
		this.lngdLang = lngdLang;
	}

	// Property accessors

	public String getLngdDataset() {
		return this.lngdDataset;
	}

	public void setLngdDataset(String lngdDataset) {
		this.lngdDataset = lngdDataset;
	}

	public String getLngdKey1() {
		return this.lngdKey1;
	}

	public void setLngdKey1(String lngdKey1) {
		this.lngdKey1 = lngdKey1;
	}

	public String getLngdKey2() {
		return this.lngdKey2;
	}

	public void setLngdKey2(String lngdKey2) {
		this.lngdKey2 = lngdKey2;
	}

	public String getLngdKey3() {
		return this.lngdKey3;
	}

	public void setLngdKey3(String lngdKey3) {
		this.lngdKey3 = lngdKey3;
	}

	public String getLngdKey4() {
		return this.lngdKey4;
	}

	public void setLngdKey4(String lngdKey4) {
		this.lngdKey4 = lngdKey4;
	}

	public String getLngdField() {
		return this.lngdField;
	}

	public void setLngdField(String lngdField) {
		this.lngdField = lngdField;
	}

	public String getLngdLang() {
		return this.lngdLang;
	}

	public void setLngdLang(String lngdLang) {
		this.lngdLang = lngdLang;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLngdDetId))
			return false;
		AbstractLngdDetId castOther = (AbstractLngdDetId) other;

		return ((this.getLngdDataset() == castOther.getLngdDataset()) || (this
				.getLngdDataset() != null
				&& castOther.getLngdDataset() != null && this.getLngdDataset()
				.equals(castOther.getLngdDataset())))
				&& ((this.getLngdKey1() == castOther.getLngdKey1()) || (this
						.getLngdKey1() != null
						&& castOther.getLngdKey1() != null && this
						.getLngdKey1().equals(castOther.getLngdKey1())))
				&& ((this.getLngdKey2() == castOther.getLngdKey2()) || (this
						.getLngdKey2() != null
						&& castOther.getLngdKey2() != null && this
						.getLngdKey2().equals(castOther.getLngdKey2())))
				&& ((this.getLngdKey3() == castOther.getLngdKey3()) || (this
						.getLngdKey3() != null
						&& castOther.getLngdKey3() != null && this
						.getLngdKey3().equals(castOther.getLngdKey3())))
				&& ((this.getLngdKey4() == castOther.getLngdKey4()) || (this
						.getLngdKey4() != null
						&& castOther.getLngdKey4() != null && this
						.getLngdKey4().equals(castOther.getLngdKey4())))
				&& ((this.getLngdField() == castOther.getLngdField()) || (this
						.getLngdField() != null
						&& castOther.getLngdField() != null && this
						.getLngdField().equals(castOther.getLngdField())))
				&& ((this.getLngdLang() == castOther.getLngdLang()) || (this
						.getLngdLang() != null
						&& castOther.getLngdLang() != null && this
						.getLngdLang().equals(castOther.getLngdLang())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLngdDataset() == null ? 0 : this.getLngdDataset()
						.hashCode());
		result = 37 * result
				+ (getLngdKey1() == null ? 0 : this.getLngdKey1().hashCode());
		result = 37 * result
				+ (getLngdKey2() == null ? 0 : this.getLngdKey2().hashCode());
		result = 37 * result
				+ (getLngdKey3() == null ? 0 : this.getLngdKey3().hashCode());
		result = 37 * result
				+ (getLngdKey4() == null ? 0 : this.getLngdKey4().hashCode());
		result = 37 * result
				+ (getLngdField() == null ? 0 : this.getLngdField().hashCode());
		result = 37 * result
				+ (getLngdLang() == null ? 0 : this.getLngdLang().hashCode());
		return result;
	}

}