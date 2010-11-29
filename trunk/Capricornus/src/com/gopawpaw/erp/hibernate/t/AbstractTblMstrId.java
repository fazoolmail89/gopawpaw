package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTblMstrId entity provides the base persistence definition of the
 * TblMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTblMstrId implements java.io.Serializable {

	// Fields

	private String tblDomain;
	private String tblPartype;
	private String tblParcode;
	private String tblComptype;
	private String tblCompcode;

	// Constructors

	/** default constructor */
	public AbstractTblMstrId() {
	}

	/** minimal constructor */
	public AbstractTblMstrId(String tblDomain, String tblComptype,
			String tblCompcode) {
		this.tblDomain = tblDomain;
		this.tblComptype = tblComptype;
		this.tblCompcode = tblCompcode;
	}

	/** full constructor */
	public AbstractTblMstrId(String tblDomain, String tblPartype,
			String tblParcode, String tblComptype, String tblCompcode) {
		this.tblDomain = tblDomain;
		this.tblPartype = tblPartype;
		this.tblParcode = tblParcode;
		this.tblComptype = tblComptype;
		this.tblCompcode = tblCompcode;
	}

	// Property accessors

	public String getTblDomain() {
		return this.tblDomain;
	}

	public void setTblDomain(String tblDomain) {
		this.tblDomain = tblDomain;
	}

	public String getTblPartype() {
		return this.tblPartype;
	}

	public void setTblPartype(String tblPartype) {
		this.tblPartype = tblPartype;
	}

	public String getTblParcode() {
		return this.tblParcode;
	}

	public void setTblParcode(String tblParcode) {
		this.tblParcode = tblParcode;
	}

	public String getTblComptype() {
		return this.tblComptype;
	}

	public void setTblComptype(String tblComptype) {
		this.tblComptype = tblComptype;
	}

	public String getTblCompcode() {
		return this.tblCompcode;
	}

	public void setTblCompcode(String tblCompcode) {
		this.tblCompcode = tblCompcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTblMstrId))
			return false;
		AbstractTblMstrId castOther = (AbstractTblMstrId) other;

		return ((this.getTblDomain() == castOther.getTblDomain()) || (this
				.getTblDomain() != null
				&& castOther.getTblDomain() != null && this.getTblDomain()
				.equals(castOther.getTblDomain())))
				&& ((this.getTblPartype() == castOther.getTblPartype()) || (this
						.getTblPartype() != null
						&& castOther.getTblPartype() != null && this
						.getTblPartype().equals(castOther.getTblPartype())))
				&& ((this.getTblParcode() == castOther.getTblParcode()) || (this
						.getTblParcode() != null
						&& castOther.getTblParcode() != null && this
						.getTblParcode().equals(castOther.getTblParcode())))
				&& ((this.getTblComptype() == castOther.getTblComptype()) || (this
						.getTblComptype() != null
						&& castOther.getTblComptype() != null && this
						.getTblComptype().equals(castOther.getTblComptype())))
				&& ((this.getTblCompcode() == castOther.getTblCompcode()) || (this
						.getTblCompcode() != null
						&& castOther.getTblCompcode() != null && this
						.getTblCompcode().equals(castOther.getTblCompcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTblDomain() == null ? 0 : this.getTblDomain().hashCode());
		result = 37
				* result
				+ (getTblPartype() == null ? 0 : this.getTblPartype()
						.hashCode());
		result = 37
				* result
				+ (getTblParcode() == null ? 0 : this.getTblParcode()
						.hashCode());
		result = 37
				* result
				+ (getTblComptype() == null ? 0 : this.getTblComptype()
						.hashCode());
		result = 37
				* result
				+ (getTblCompcode() == null ? 0 : this.getTblCompcode()
						.hashCode());
		return result;
	}

}