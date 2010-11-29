package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFldfMstrId entity provides the base persistence definition of the
 * FldfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFldfMstrId implements java.io.Serializable {

	// Fields

	private String fldfField;
	private String fldfCallPg;
	private String fldfUserid;

	// Constructors

	/** default constructor */
	public AbstractFldfMstrId() {
	}

	/** full constructor */
	public AbstractFldfMstrId(String fldfField, String fldfCallPg,
			String fldfUserid) {
		this.fldfField = fldfField;
		this.fldfCallPg = fldfCallPg;
		this.fldfUserid = fldfUserid;
	}

	// Property accessors

	public String getFldfField() {
		return this.fldfField;
	}

	public void setFldfField(String fldfField) {
		this.fldfField = fldfField;
	}

	public String getFldfCallPg() {
		return this.fldfCallPg;
	}

	public void setFldfCallPg(String fldfCallPg) {
		this.fldfCallPg = fldfCallPg;
	}

	public String getFldfUserid() {
		return this.fldfUserid;
	}

	public void setFldfUserid(String fldfUserid) {
		this.fldfUserid = fldfUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFldfMstrId))
			return false;
		AbstractFldfMstrId castOther = (AbstractFldfMstrId) other;

		return ((this.getFldfField() == castOther.getFldfField()) || (this
				.getFldfField() != null
				&& castOther.getFldfField() != null && this.getFldfField()
				.equals(castOther.getFldfField())))
				&& ((this.getFldfCallPg() == castOther.getFldfCallPg()) || (this
						.getFldfCallPg() != null
						&& castOther.getFldfCallPg() != null && this
						.getFldfCallPg().equals(castOther.getFldfCallPg())))
				&& ((this.getFldfUserid() == castOther.getFldfUserid()) || (this
						.getFldfUserid() != null
						&& castOther.getFldfUserid() != null && this
						.getFldfUserid().equals(castOther.getFldfUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFldfField() == null ? 0 : this.getFldfField().hashCode());
		result = 37
				* result
				+ (getFldfCallPg() == null ? 0 : this.getFldfCallPg()
						.hashCode());
		result = 37
				* result
				+ (getFldfUserid() == null ? 0 : this.getFldfUserid()
						.hashCode());
		return result;
	}

}