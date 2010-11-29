package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQtblExtId entity provides the base persistence definition of the
 * QtblExtId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQtblExtId implements java.io.Serializable {

	// Fields

	private String qtblOwner;
	private String qtblTable;
	private String qtblReference;
	private String qtblKey1;
	private String qtblKey2;
	private String qtblKey3;
	private String qtblKey4;
	private String qtblKey5;
	private String qtblKey6;

	// Constructors

	/** default constructor */
	public AbstractQtblExtId() {
	}

	/** full constructor */
	public AbstractQtblExtId(String qtblOwner, String qtblTable,
			String qtblReference, String qtblKey1, String qtblKey2,
			String qtblKey3, String qtblKey4, String qtblKey5, String qtblKey6) {
		this.qtblOwner = qtblOwner;
		this.qtblTable = qtblTable;
		this.qtblReference = qtblReference;
		this.qtblKey1 = qtblKey1;
		this.qtblKey2 = qtblKey2;
		this.qtblKey3 = qtblKey3;
		this.qtblKey4 = qtblKey4;
		this.qtblKey5 = qtblKey5;
		this.qtblKey6 = qtblKey6;
	}

	// Property accessors

	public String getQtblOwner() {
		return this.qtblOwner;
	}

	public void setQtblOwner(String qtblOwner) {
		this.qtblOwner = qtblOwner;
	}

	public String getQtblTable() {
		return this.qtblTable;
	}

	public void setQtblTable(String qtblTable) {
		this.qtblTable = qtblTable;
	}

	public String getQtblReference() {
		return this.qtblReference;
	}

	public void setQtblReference(String qtblReference) {
		this.qtblReference = qtblReference;
	}

	public String getQtblKey1() {
		return this.qtblKey1;
	}

	public void setQtblKey1(String qtblKey1) {
		this.qtblKey1 = qtblKey1;
	}

	public String getQtblKey2() {
		return this.qtblKey2;
	}

	public void setQtblKey2(String qtblKey2) {
		this.qtblKey2 = qtblKey2;
	}

	public String getQtblKey3() {
		return this.qtblKey3;
	}

	public void setQtblKey3(String qtblKey3) {
		this.qtblKey3 = qtblKey3;
	}

	public String getQtblKey4() {
		return this.qtblKey4;
	}

	public void setQtblKey4(String qtblKey4) {
		this.qtblKey4 = qtblKey4;
	}

	public String getQtblKey5() {
		return this.qtblKey5;
	}

	public void setQtblKey5(String qtblKey5) {
		this.qtblKey5 = qtblKey5;
	}

	public String getQtblKey6() {
		return this.qtblKey6;
	}

	public void setQtblKey6(String qtblKey6) {
		this.qtblKey6 = qtblKey6;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQtblExtId))
			return false;
		AbstractQtblExtId castOther = (AbstractQtblExtId) other;

		return ((this.getQtblOwner() == castOther.getQtblOwner()) || (this
				.getQtblOwner() != null
				&& castOther.getQtblOwner() != null && this.getQtblOwner()
				.equals(castOther.getQtblOwner())))
				&& ((this.getQtblTable() == castOther.getQtblTable()) || (this
						.getQtblTable() != null
						&& castOther.getQtblTable() != null && this
						.getQtblTable().equals(castOther.getQtblTable())))
				&& ((this.getQtblReference() == castOther.getQtblReference()) || (this
						.getQtblReference() != null
						&& castOther.getQtblReference() != null && this
						.getQtblReference()
						.equals(castOther.getQtblReference())))
				&& ((this.getQtblKey1() == castOther.getQtblKey1()) || (this
						.getQtblKey1() != null
						&& castOther.getQtblKey1() != null && this
						.getQtblKey1().equals(castOther.getQtblKey1())))
				&& ((this.getQtblKey2() == castOther.getQtblKey2()) || (this
						.getQtblKey2() != null
						&& castOther.getQtblKey2() != null && this
						.getQtblKey2().equals(castOther.getQtblKey2())))
				&& ((this.getQtblKey3() == castOther.getQtblKey3()) || (this
						.getQtblKey3() != null
						&& castOther.getQtblKey3() != null && this
						.getQtblKey3().equals(castOther.getQtblKey3())))
				&& ((this.getQtblKey4() == castOther.getQtblKey4()) || (this
						.getQtblKey4() != null
						&& castOther.getQtblKey4() != null && this
						.getQtblKey4().equals(castOther.getQtblKey4())))
				&& ((this.getQtblKey5() == castOther.getQtblKey5()) || (this
						.getQtblKey5() != null
						&& castOther.getQtblKey5() != null && this
						.getQtblKey5().equals(castOther.getQtblKey5())))
				&& ((this.getQtblKey6() == castOther.getQtblKey6()) || (this
						.getQtblKey6() != null
						&& castOther.getQtblKey6() != null && this
						.getQtblKey6().equals(castOther.getQtblKey6())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQtblOwner() == null ? 0 : this.getQtblOwner().hashCode());
		result = 37 * result
				+ (getQtblTable() == null ? 0 : this.getQtblTable().hashCode());
		result = 37
				* result
				+ (getQtblReference() == null ? 0 : this.getQtblReference()
						.hashCode());
		result = 37 * result
				+ (getQtblKey1() == null ? 0 : this.getQtblKey1().hashCode());
		result = 37 * result
				+ (getQtblKey2() == null ? 0 : this.getQtblKey2().hashCode());
		result = 37 * result
				+ (getQtblKey3() == null ? 0 : this.getQtblKey3().hashCode());
		result = 37 * result
				+ (getQtblKey4() == null ? 0 : this.getQtblKey4().hashCode());
		result = 37 * result
				+ (getQtblKey5() == null ? 0 : this.getQtblKey5().hashCode());
		result = 37 * result
				+ (getQtblKey6() == null ? 0 : this.getQtblKey6().hashCode());
		return result;
	}

}