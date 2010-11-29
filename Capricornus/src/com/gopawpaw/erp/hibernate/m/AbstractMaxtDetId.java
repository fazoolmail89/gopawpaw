package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMaxtDetId entity provides the base persistence definition of the
 * MaxtDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMaxtDetId implements java.io.Serializable {

	// Fields

	private String maxtField;
	private String maxtBook;
	private String maxtEntity;
	private String maxtClass;
	private Date maxtBegDate;
	private Date maxtEndDate;

	// Constructors

	/** default constructor */
	public AbstractMaxtDetId() {
	}

	/** minimal constructor */
	public AbstractMaxtDetId(String maxtEntity) {
		this.maxtEntity = maxtEntity;
	}

	/** full constructor */
	public AbstractMaxtDetId(String maxtField, String maxtBook,
			String maxtEntity, String maxtClass, Date maxtBegDate,
			Date maxtEndDate) {
		this.maxtField = maxtField;
		this.maxtBook = maxtBook;
		this.maxtEntity = maxtEntity;
		this.maxtClass = maxtClass;
		this.maxtBegDate = maxtBegDate;
		this.maxtEndDate = maxtEndDate;
	}

	// Property accessors

	public String getMaxtField() {
		return this.maxtField;
	}

	public void setMaxtField(String maxtField) {
		this.maxtField = maxtField;
	}

	public String getMaxtBook() {
		return this.maxtBook;
	}

	public void setMaxtBook(String maxtBook) {
		this.maxtBook = maxtBook;
	}

	public String getMaxtEntity() {
		return this.maxtEntity;
	}

	public void setMaxtEntity(String maxtEntity) {
		this.maxtEntity = maxtEntity;
	}

	public String getMaxtClass() {
		return this.maxtClass;
	}

	public void setMaxtClass(String maxtClass) {
		this.maxtClass = maxtClass;
	}

	public Date getMaxtBegDate() {
		return this.maxtBegDate;
	}

	public void setMaxtBegDate(Date maxtBegDate) {
		this.maxtBegDate = maxtBegDate;
	}

	public Date getMaxtEndDate() {
		return this.maxtEndDate;
	}

	public void setMaxtEndDate(Date maxtEndDate) {
		this.maxtEndDate = maxtEndDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMaxtDetId))
			return false;
		AbstractMaxtDetId castOther = (AbstractMaxtDetId) other;

		return ((this.getMaxtField() == castOther.getMaxtField()) || (this
				.getMaxtField() != null
				&& castOther.getMaxtField() != null && this.getMaxtField()
				.equals(castOther.getMaxtField())))
				&& ((this.getMaxtBook() == castOther.getMaxtBook()) || (this
						.getMaxtBook() != null
						&& castOther.getMaxtBook() != null && this
						.getMaxtBook().equals(castOther.getMaxtBook())))
				&& ((this.getMaxtEntity() == castOther.getMaxtEntity()) || (this
						.getMaxtEntity() != null
						&& castOther.getMaxtEntity() != null && this
						.getMaxtEntity().equals(castOther.getMaxtEntity())))
				&& ((this.getMaxtClass() == castOther.getMaxtClass()) || (this
						.getMaxtClass() != null
						&& castOther.getMaxtClass() != null && this
						.getMaxtClass().equals(castOther.getMaxtClass())))
				&& ((this.getMaxtBegDate() == castOther.getMaxtBegDate()) || (this
						.getMaxtBegDate() != null
						&& castOther.getMaxtBegDate() != null && this
						.getMaxtBegDate().equals(castOther.getMaxtBegDate())))
				&& ((this.getMaxtEndDate() == castOther.getMaxtEndDate()) || (this
						.getMaxtEndDate() != null
						&& castOther.getMaxtEndDate() != null && this
						.getMaxtEndDate().equals(castOther.getMaxtEndDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMaxtField() == null ? 0 : this.getMaxtField().hashCode());
		result = 37 * result
				+ (getMaxtBook() == null ? 0 : this.getMaxtBook().hashCode());
		result = 37
				* result
				+ (getMaxtEntity() == null ? 0 : this.getMaxtEntity()
						.hashCode());
		result = 37 * result
				+ (getMaxtClass() == null ? 0 : this.getMaxtClass().hashCode());
		result = 37
				* result
				+ (getMaxtBegDate() == null ? 0 : this.getMaxtBegDate()
						.hashCode());
		result = 37
				* result
				+ (getMaxtEndDate() == null ? 0 : this.getMaxtEndDate()
						.hashCode());
		return result;
	}

}