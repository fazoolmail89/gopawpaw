package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTblcdDetId entity provides the base persistence definition of the
 * TblcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTblcdDetId implements java.io.Serializable {

	// Fields

	private String tblcdDomain;
	private String tblcdTable;
	private String tblcdFldName;

	// Constructors

	/** default constructor */
	public AbstractTblcdDetId() {
	}

	/** full constructor */
	public AbstractTblcdDetId(String tblcdDomain, String tblcdTable,
			String tblcdFldName) {
		this.tblcdDomain = tblcdDomain;
		this.tblcdTable = tblcdTable;
		this.tblcdFldName = tblcdFldName;
	}

	// Property accessors

	public String getTblcdDomain() {
		return this.tblcdDomain;
	}

	public void setTblcdDomain(String tblcdDomain) {
		this.tblcdDomain = tblcdDomain;
	}

	public String getTblcdTable() {
		return this.tblcdTable;
	}

	public void setTblcdTable(String tblcdTable) {
		this.tblcdTable = tblcdTable;
	}

	public String getTblcdFldName() {
		return this.tblcdFldName;
	}

	public void setTblcdFldName(String tblcdFldName) {
		this.tblcdFldName = tblcdFldName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTblcdDetId))
			return false;
		AbstractTblcdDetId castOther = (AbstractTblcdDetId) other;

		return ((this.getTblcdDomain() == castOther.getTblcdDomain()) || (this
				.getTblcdDomain() != null
				&& castOther.getTblcdDomain() != null && this.getTblcdDomain()
				.equals(castOther.getTblcdDomain())))
				&& ((this.getTblcdTable() == castOther.getTblcdTable()) || (this
						.getTblcdTable() != null
						&& castOther.getTblcdTable() != null && this
						.getTblcdTable().equals(castOther.getTblcdTable())))
				&& ((this.getTblcdFldName() == castOther.getTblcdFldName()) || (this
						.getTblcdFldName() != null
						&& castOther.getTblcdFldName() != null && this
						.getTblcdFldName().equals(castOther.getTblcdFldName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTblcdDomain() == null ? 0 : this.getTblcdDomain()
						.hashCode());
		result = 37
				* result
				+ (getTblcdTable() == null ? 0 : this.getTblcdTable()
						.hashCode());
		result = 37
				* result
				+ (getTblcdFldName() == null ? 0 : this.getTblcdFldName()
						.hashCode());
		return result;
	}

}