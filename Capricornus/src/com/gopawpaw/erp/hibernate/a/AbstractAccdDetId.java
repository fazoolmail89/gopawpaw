package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAccdDetId entity provides the base persistence definition of the
 * AccdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAccdDetId implements java.io.Serializable {

	// Fields

	private String accdAsset;
	private String accdBook;
	private Integer accdLine;

	// Constructors

	/** default constructor */
	public AbstractAccdDetId() {
	}

	/** full constructor */
	public AbstractAccdDetId(String accdAsset, String accdBook, Integer accdLine) {
		this.accdAsset = accdAsset;
		this.accdBook = accdBook;
		this.accdLine = accdLine;
	}

	// Property accessors

	public String getAccdAsset() {
		return this.accdAsset;
	}

	public void setAccdAsset(String accdAsset) {
		this.accdAsset = accdAsset;
	}

	public String getAccdBook() {
		return this.accdBook;
	}

	public void setAccdBook(String accdBook) {
		this.accdBook = accdBook;
	}

	public Integer getAccdLine() {
		return this.accdLine;
	}

	public void setAccdLine(Integer accdLine) {
		this.accdLine = accdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAccdDetId))
			return false;
		AbstractAccdDetId castOther = (AbstractAccdDetId) other;

		return ((this.getAccdAsset() == castOther.getAccdAsset()) || (this
				.getAccdAsset() != null
				&& castOther.getAccdAsset() != null && this.getAccdAsset()
				.equals(castOther.getAccdAsset())))
				&& ((this.getAccdBook() == castOther.getAccdBook()) || (this
						.getAccdBook() != null
						&& castOther.getAccdBook() != null && this
						.getAccdBook().equals(castOther.getAccdBook())))
				&& ((this.getAccdLine() == castOther.getAccdLine()) || (this
						.getAccdLine() != null
						&& castOther.getAccdLine() != null && this
						.getAccdLine().equals(castOther.getAccdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAccdAsset() == null ? 0 : this.getAccdAsset().hashCode());
		result = 37 * result
				+ (getAccdBook() == null ? 0 : this.getAccdBook().hashCode());
		result = 37 * result
				+ (getAccdLine() == null ? 0 : this.getAccdLine().hashCode());
		return result;
	}

}