package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSytfMstrId entity provides the base persistence definition of the
 * SytfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSytfMstrId implements java.io.Serializable {

	// Fields

	private String sytfTblname;
	private String sytfFldname;

	// Constructors

	/** default constructor */
	public AbstractSytfMstrId() {
	}

	/** full constructor */
	public AbstractSytfMstrId(String sytfTblname, String sytfFldname) {
		this.sytfTblname = sytfTblname;
		this.sytfFldname = sytfFldname;
	}

	// Property accessors

	public String getSytfTblname() {
		return this.sytfTblname;
	}

	public void setSytfTblname(String sytfTblname) {
		this.sytfTblname = sytfTblname;
	}

	public String getSytfFldname() {
		return this.sytfFldname;
	}

	public void setSytfFldname(String sytfFldname) {
		this.sytfFldname = sytfFldname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSytfMstrId))
			return false;
		AbstractSytfMstrId castOther = (AbstractSytfMstrId) other;

		return ((this.getSytfTblname() == castOther.getSytfTblname()) || (this
				.getSytfTblname() != null
				&& castOther.getSytfTblname() != null && this.getSytfTblname()
				.equals(castOther.getSytfTblname())))
				&& ((this.getSytfFldname() == castOther.getSytfFldname()) || (this
						.getSytfFldname() != null
						&& castOther.getSytfFldname() != null && this
						.getSytfFldname().equals(castOther.getSytfFldname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSytfTblname() == null ? 0 : this.getSytfTblname()
						.hashCode());
		result = 37
				* result
				+ (getSytfFldname() == null ? 0 : this.getSytfFldname()
						.hashCode());
		return result;
	}

}