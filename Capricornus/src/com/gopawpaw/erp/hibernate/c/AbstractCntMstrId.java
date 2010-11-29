package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCntMstrId entity provides the base persistence definition of the
 * CntMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCntMstrId implements java.io.Serializable {

	// Fields

	private String cntApplication;
	private String cntUserid;
	private String cntSid;

	// Constructors

	/** default constructor */
	public AbstractCntMstrId() {
	}

	/** minimal constructor */
	public AbstractCntMstrId(String cntUserid, String cntSid) {
		this.cntUserid = cntUserid;
		this.cntSid = cntSid;
	}

	/** full constructor */
	public AbstractCntMstrId(String cntApplication, String cntUserid,
			String cntSid) {
		this.cntApplication = cntApplication;
		this.cntUserid = cntUserid;
		this.cntSid = cntSid;
	}

	// Property accessors

	public String getCntApplication() {
		return this.cntApplication;
	}

	public void setCntApplication(String cntApplication) {
		this.cntApplication = cntApplication;
	}

	public String getCntUserid() {
		return this.cntUserid;
	}

	public void setCntUserid(String cntUserid) {
		this.cntUserid = cntUserid;
	}

	public String getCntSid() {
		return this.cntSid;
	}

	public void setCntSid(String cntSid) {
		this.cntSid = cntSid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCntMstrId))
			return false;
		AbstractCntMstrId castOther = (AbstractCntMstrId) other;

		return ((this.getCntApplication() == castOther.getCntApplication()) || (this
				.getCntApplication() != null
				&& castOther.getCntApplication() != null && this
				.getCntApplication().equals(castOther.getCntApplication())))
				&& ((this.getCntUserid() == castOther.getCntUserid()) || (this
						.getCntUserid() != null
						&& castOther.getCntUserid() != null && this
						.getCntUserid().equals(castOther.getCntUserid())))
				&& ((this.getCntSid() == castOther.getCntSid()) || (this
						.getCntSid() != null
						&& castOther.getCntSid() != null && this.getCntSid()
						.equals(castOther.getCntSid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCntApplication() == null ? 0 : this.getCntApplication()
						.hashCode());
		result = 37 * result
				+ (getCntUserid() == null ? 0 : this.getCntUserid().hashCode());
		result = 37 * result
				+ (getCntSid() == null ? 0 : this.getCntSid().hashCode());
		return result;
	}

}