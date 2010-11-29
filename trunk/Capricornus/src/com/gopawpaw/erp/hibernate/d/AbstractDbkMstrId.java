package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDbkMstrId entity provides the base persistence definition of the
 * DbkMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDbkMstrId implements java.io.Serializable {

	// Fields

	private String dbkBook;
	private String dbkEntity;

	// Constructors

	/** default constructor */
	public AbstractDbkMstrId() {
	}

	/** full constructor */
	public AbstractDbkMstrId(String dbkBook, String dbkEntity) {
		this.dbkBook = dbkBook;
		this.dbkEntity = dbkEntity;
	}

	// Property accessors

	public String getDbkBook() {
		return this.dbkBook;
	}

	public void setDbkBook(String dbkBook) {
		this.dbkBook = dbkBook;
	}

	public String getDbkEntity() {
		return this.dbkEntity;
	}

	public void setDbkEntity(String dbkEntity) {
		this.dbkEntity = dbkEntity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDbkMstrId))
			return false;
		AbstractDbkMstrId castOther = (AbstractDbkMstrId) other;

		return ((this.getDbkBook() == castOther.getDbkBook()) || (this
				.getDbkBook() != null
				&& castOther.getDbkBook() != null && this.getDbkBook().equals(
				castOther.getDbkBook())))
				&& ((this.getDbkEntity() == castOther.getDbkEntity()) || (this
						.getDbkEntity() != null
						&& castOther.getDbkEntity() != null && this
						.getDbkEntity().equals(castOther.getDbkEntity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDbkBook() == null ? 0 : this.getDbkBook().hashCode());
		result = 37 * result
				+ (getDbkEntity() == null ? 0 : this.getDbkEntity().hashCode());
		return result;
	}

}