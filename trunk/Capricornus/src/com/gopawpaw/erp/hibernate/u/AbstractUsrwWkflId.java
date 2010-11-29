package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUsrwWkflId entity provides the base persistence definition of the
 * UsrwWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrwWkflId implements java.io.Serializable {

	// Fields

	private String usrwDomain;
	private String usrwKey1;
	private String usrwKey2;

	// Constructors

	/** default constructor */
	public AbstractUsrwWkflId() {
	}

	/** minimal constructor */
	public AbstractUsrwWkflId(String usrwDomain) {
		this.usrwDomain = usrwDomain;
	}

	/** full constructor */
	public AbstractUsrwWkflId(String usrwDomain, String usrwKey1,
			String usrwKey2) {
		this.usrwDomain = usrwDomain;
		this.usrwKey1 = usrwKey1;
		this.usrwKey2 = usrwKey2;
	}

	// Property accessors

	public String getUsrwDomain() {
		return this.usrwDomain;
	}

	public void setUsrwDomain(String usrwDomain) {
		this.usrwDomain = usrwDomain;
	}

	public String getUsrwKey1() {
		return this.usrwKey1;
	}

	public void setUsrwKey1(String usrwKey1) {
		this.usrwKey1 = usrwKey1;
	}

	public String getUsrwKey2() {
		return this.usrwKey2;
	}

	public void setUsrwKey2(String usrwKey2) {
		this.usrwKey2 = usrwKey2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUsrwWkflId))
			return false;
		AbstractUsrwWkflId castOther = (AbstractUsrwWkflId) other;

		return ((this.getUsrwDomain() == castOther.getUsrwDomain()) || (this
				.getUsrwDomain() != null
				&& castOther.getUsrwDomain() != null && this.getUsrwDomain()
				.equals(castOther.getUsrwDomain())))
				&& ((this.getUsrwKey1() == castOther.getUsrwKey1()) || (this
						.getUsrwKey1() != null
						&& castOther.getUsrwKey1() != null && this
						.getUsrwKey1().equals(castOther.getUsrwKey1())))
				&& ((this.getUsrwKey2() == castOther.getUsrwKey2()) || (this
						.getUsrwKey2() != null
						&& castOther.getUsrwKey2() != null && this
						.getUsrwKey2().equals(castOther.getUsrwKey2())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUsrwDomain() == null ? 0 : this.getUsrwDomain()
						.hashCode());
		result = 37 * result
				+ (getUsrwKey1() == null ? 0 : this.getUsrwKey1().hashCode());
		result = 37 * result
				+ (getUsrwKey2() == null ? 0 : this.getUsrwKey2().hashCode());
		return result;
	}

}