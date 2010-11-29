package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIspMstrId entity provides the base persistence definition of the
 * IspMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIspMstrId implements java.io.Serializable {

	// Fields

	private String ispDomain;
	private String ispAppId;
	private String ispDocStd;
	private String ispDocTyp;
	private String ispDocRev;
	private String ispTradptrId;

	// Constructors

	/** default constructor */
	public AbstractIspMstrId() {
	}

	/** minimal constructor */
	public AbstractIspMstrId(String ispDomain) {
		this.ispDomain = ispDomain;
	}

	/** full constructor */
	public AbstractIspMstrId(String ispDomain, String ispAppId,
			String ispDocStd, String ispDocTyp, String ispDocRev,
			String ispTradptrId) {
		this.ispDomain = ispDomain;
		this.ispAppId = ispAppId;
		this.ispDocStd = ispDocStd;
		this.ispDocTyp = ispDocTyp;
		this.ispDocRev = ispDocRev;
		this.ispTradptrId = ispTradptrId;
	}

	// Property accessors

	public String getIspDomain() {
		return this.ispDomain;
	}

	public void setIspDomain(String ispDomain) {
		this.ispDomain = ispDomain;
	}

	public String getIspAppId() {
		return this.ispAppId;
	}

	public void setIspAppId(String ispAppId) {
		this.ispAppId = ispAppId;
	}

	public String getIspDocStd() {
		return this.ispDocStd;
	}

	public void setIspDocStd(String ispDocStd) {
		this.ispDocStd = ispDocStd;
	}

	public String getIspDocTyp() {
		return this.ispDocTyp;
	}

	public void setIspDocTyp(String ispDocTyp) {
		this.ispDocTyp = ispDocTyp;
	}

	public String getIspDocRev() {
		return this.ispDocRev;
	}

	public void setIspDocRev(String ispDocRev) {
		this.ispDocRev = ispDocRev;
	}

	public String getIspTradptrId() {
		return this.ispTradptrId;
	}

	public void setIspTradptrId(String ispTradptrId) {
		this.ispTradptrId = ispTradptrId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIspMstrId))
			return false;
		AbstractIspMstrId castOther = (AbstractIspMstrId) other;

		return ((this.getIspDomain() == castOther.getIspDomain()) || (this
				.getIspDomain() != null
				&& castOther.getIspDomain() != null && this.getIspDomain()
				.equals(castOther.getIspDomain())))
				&& ((this.getIspAppId() == castOther.getIspAppId()) || (this
						.getIspAppId() != null
						&& castOther.getIspAppId() != null && this
						.getIspAppId().equals(castOther.getIspAppId())))
				&& ((this.getIspDocStd() == castOther.getIspDocStd()) || (this
						.getIspDocStd() != null
						&& castOther.getIspDocStd() != null && this
						.getIspDocStd().equals(castOther.getIspDocStd())))
				&& ((this.getIspDocTyp() == castOther.getIspDocTyp()) || (this
						.getIspDocTyp() != null
						&& castOther.getIspDocTyp() != null && this
						.getIspDocTyp().equals(castOther.getIspDocTyp())))
				&& ((this.getIspDocRev() == castOther.getIspDocRev()) || (this
						.getIspDocRev() != null
						&& castOther.getIspDocRev() != null && this
						.getIspDocRev().equals(castOther.getIspDocRev())))
				&& ((this.getIspTradptrId() == castOther.getIspTradptrId()) || (this
						.getIspTradptrId() != null
						&& castOther.getIspTradptrId() != null && this
						.getIspTradptrId().equals(castOther.getIspTradptrId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIspDomain() == null ? 0 : this.getIspDomain().hashCode());
		result = 37 * result
				+ (getIspAppId() == null ? 0 : this.getIspAppId().hashCode());
		result = 37 * result
				+ (getIspDocStd() == null ? 0 : this.getIspDocStd().hashCode());
		result = 37 * result
				+ (getIspDocTyp() == null ? 0 : this.getIspDocTyp().hashCode());
		result = 37 * result
				+ (getIspDocRev() == null ? 0 : this.getIspDocRev().hashCode());
		result = 37
				* result
				+ (getIspTradptrId() == null ? 0 : this.getIspTradptrId()
						.hashCode());
		return result;
	}

}