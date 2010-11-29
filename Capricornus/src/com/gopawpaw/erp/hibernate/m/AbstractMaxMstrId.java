package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMaxMstrId entity provides the base persistence definition of the
 * MaxMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMaxMstrId implements java.io.Serializable {

	// Fields

	private String maxField;
	private String maxBook;
	private String maxQad01;
	private String maxClass;

	// Constructors

	/** default constructor */
	public AbstractMaxMstrId() {
	}

	/** full constructor */
	public AbstractMaxMstrId(String maxField, String maxBook, String maxQad01,
			String maxClass) {
		this.maxField = maxField;
		this.maxBook = maxBook;
		this.maxQad01 = maxQad01;
		this.maxClass = maxClass;
	}

	// Property accessors

	public String getMaxField() {
		return this.maxField;
	}

	public void setMaxField(String maxField) {
		this.maxField = maxField;
	}

	public String getMaxBook() {
		return this.maxBook;
	}

	public void setMaxBook(String maxBook) {
		this.maxBook = maxBook;
	}

	public String getMaxQad01() {
		return this.maxQad01;
	}

	public void setMaxQad01(String maxQad01) {
		this.maxQad01 = maxQad01;
	}

	public String getMaxClass() {
		return this.maxClass;
	}

	public void setMaxClass(String maxClass) {
		this.maxClass = maxClass;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMaxMstrId))
			return false;
		AbstractMaxMstrId castOther = (AbstractMaxMstrId) other;

		return ((this.getMaxField() == castOther.getMaxField()) || (this
				.getMaxField() != null
				&& castOther.getMaxField() != null && this.getMaxField()
				.equals(castOther.getMaxField())))
				&& ((this.getMaxBook() == castOther.getMaxBook()) || (this
						.getMaxBook() != null
						&& castOther.getMaxBook() != null && this.getMaxBook()
						.equals(castOther.getMaxBook())))
				&& ((this.getMaxQad01() == castOther.getMaxQad01()) || (this
						.getMaxQad01() != null
						&& castOther.getMaxQad01() != null && this
						.getMaxQad01().equals(castOther.getMaxQad01())))
				&& ((this.getMaxClass() == castOther.getMaxClass()) || (this
						.getMaxClass() != null
						&& castOther.getMaxClass() != null && this
						.getMaxClass().equals(castOther.getMaxClass())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMaxField() == null ? 0 : this.getMaxField().hashCode());
		result = 37 * result
				+ (getMaxBook() == null ? 0 : this.getMaxBook().hashCode());
		result = 37 * result
				+ (getMaxQad01() == null ? 0 : this.getMaxQad01().hashCode());
		result = 37 * result
				+ (getMaxClass() == null ? 0 : this.getMaxClass().hashCode());
		return result;
	}

}