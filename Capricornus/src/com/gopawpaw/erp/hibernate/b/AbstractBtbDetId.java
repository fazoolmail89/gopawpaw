package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBtbDetId entity provides the base persistence definition of the
 * BtbDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBtbDetId implements java.io.Serializable {

	// Fields

	private String btbDomain;
	private String btbSo;
	private Integer btbSodLine;

	// Constructors

	/** default constructor */
	public AbstractBtbDetId() {
	}

	/** full constructor */
	public AbstractBtbDetId(String btbDomain, String btbSo, Integer btbSodLine) {
		this.btbDomain = btbDomain;
		this.btbSo = btbSo;
		this.btbSodLine = btbSodLine;
	}

	// Property accessors

	public String getBtbDomain() {
		return this.btbDomain;
	}

	public void setBtbDomain(String btbDomain) {
		this.btbDomain = btbDomain;
	}

	public String getBtbSo() {
		return this.btbSo;
	}

	public void setBtbSo(String btbSo) {
		this.btbSo = btbSo;
	}

	public Integer getBtbSodLine() {
		return this.btbSodLine;
	}

	public void setBtbSodLine(Integer btbSodLine) {
		this.btbSodLine = btbSodLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBtbDetId))
			return false;
		AbstractBtbDetId castOther = (AbstractBtbDetId) other;

		return ((this.getBtbDomain() == castOther.getBtbDomain()) || (this
				.getBtbDomain() != null
				&& castOther.getBtbDomain() != null && this.getBtbDomain()
				.equals(castOther.getBtbDomain())))
				&& ((this.getBtbSo() == castOther.getBtbSo()) || (this
						.getBtbSo() != null
						&& castOther.getBtbSo() != null && this.getBtbSo()
						.equals(castOther.getBtbSo())))
				&& ((this.getBtbSodLine() == castOther.getBtbSodLine()) || (this
						.getBtbSodLine() != null
						&& castOther.getBtbSodLine() != null && this
						.getBtbSodLine().equals(castOther.getBtbSodLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBtbDomain() == null ? 0 : this.getBtbDomain().hashCode());
		result = 37 * result
				+ (getBtbSo() == null ? 0 : this.getBtbSo().hashCode());
		result = 37
				* result
				+ (getBtbSodLine() == null ? 0 : this.getBtbSodLine()
						.hashCode());
		return result;
	}

}