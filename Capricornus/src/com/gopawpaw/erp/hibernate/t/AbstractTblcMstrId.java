package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTblcMstrId entity provides the base persistence definition of the
 * TblcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTblcMstrId implements java.io.Serializable {

	// Fields

	private String tblcDomain;
	private String tblcTable;

	// Constructors

	/** default constructor */
	public AbstractTblcMstrId() {
	}

	/** full constructor */
	public AbstractTblcMstrId(String tblcDomain, String tblcTable) {
		this.tblcDomain = tblcDomain;
		this.tblcTable = tblcTable;
	}

	// Property accessors

	public String getTblcDomain() {
		return this.tblcDomain;
	}

	public void setTblcDomain(String tblcDomain) {
		this.tblcDomain = tblcDomain;
	}

	public String getTblcTable() {
		return this.tblcTable;
	}

	public void setTblcTable(String tblcTable) {
		this.tblcTable = tblcTable;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTblcMstrId))
			return false;
		AbstractTblcMstrId castOther = (AbstractTblcMstrId) other;

		return ((this.getTblcDomain() == castOther.getTblcDomain()) || (this
				.getTblcDomain() != null
				&& castOther.getTblcDomain() != null && this.getTblcDomain()
				.equals(castOther.getTblcDomain())))
				&& ((this.getTblcTable() == castOther.getTblcTable()) || (this
						.getTblcTable() != null
						&& castOther.getTblcTable() != null && this
						.getTblcTable().equals(castOther.getTblcTable())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTblcDomain() == null ? 0 : this.getTblcDomain()
						.hashCode());
		result = 37 * result
				+ (getTblcTable() == null ? 0 : this.getTblcTable().hashCode());
		return result;
	}

}