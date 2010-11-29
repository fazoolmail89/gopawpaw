package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbdDetId entity provides the base persistence definition of the
 * AbdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbdDetId implements java.io.Serializable {

	// Fields

	private String abdAsset;
	private String abdBook;

	// Constructors

	/** default constructor */
	public AbstractAbdDetId() {
	}

	/** full constructor */
	public AbstractAbdDetId(String abdAsset, String abdBook) {
		this.abdAsset = abdAsset;
		this.abdBook = abdBook;
	}

	// Property accessors

	public String getAbdAsset() {
		return this.abdAsset;
	}

	public void setAbdAsset(String abdAsset) {
		this.abdAsset = abdAsset;
	}

	public String getAbdBook() {
		return this.abdBook;
	}

	public void setAbdBook(String abdBook) {
		this.abdBook = abdBook;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbdDetId))
			return false;
		AbstractAbdDetId castOther = (AbstractAbdDetId) other;

		return ((this.getAbdAsset() == castOther.getAbdAsset()) || (this
				.getAbdAsset() != null
				&& castOther.getAbdAsset() != null && this.getAbdAsset()
				.equals(castOther.getAbdAsset())))
				&& ((this.getAbdBook() == castOther.getAbdBook()) || (this
						.getAbdBook() != null
						&& castOther.getAbdBook() != null && this.getAbdBook()
						.equals(castOther.getAbdBook())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAbdAsset() == null ? 0 : this.getAbdAsset().hashCode());
		result = 37 * result
				+ (getAbdBook() == null ? 0 : this.getAbdBook().hashCode());
		return result;
	}

}