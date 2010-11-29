package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEspMstrId entity provides the base persistence definition of the
 * EspMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEspMstrId implements java.io.Serializable {

	// Fields

	private String espDomain;
	private String espAppId;
	private String espDocStd;
	private String espDocTyp;
	private String espDocRev;
	private String espTradptrId;

	// Constructors

	/** default constructor */
	public AbstractEspMstrId() {
	}

	/** minimal constructor */
	public AbstractEspMstrId(String espDomain) {
		this.espDomain = espDomain;
	}

	/** full constructor */
	public AbstractEspMstrId(String espDomain, String espAppId,
			String espDocStd, String espDocTyp, String espDocRev,
			String espTradptrId) {
		this.espDomain = espDomain;
		this.espAppId = espAppId;
		this.espDocStd = espDocStd;
		this.espDocTyp = espDocTyp;
		this.espDocRev = espDocRev;
		this.espTradptrId = espTradptrId;
	}

	// Property accessors

	public String getEspDomain() {
		return this.espDomain;
	}

	public void setEspDomain(String espDomain) {
		this.espDomain = espDomain;
	}

	public String getEspAppId() {
		return this.espAppId;
	}

	public void setEspAppId(String espAppId) {
		this.espAppId = espAppId;
	}

	public String getEspDocStd() {
		return this.espDocStd;
	}

	public void setEspDocStd(String espDocStd) {
		this.espDocStd = espDocStd;
	}

	public String getEspDocTyp() {
		return this.espDocTyp;
	}

	public void setEspDocTyp(String espDocTyp) {
		this.espDocTyp = espDocTyp;
	}

	public String getEspDocRev() {
		return this.espDocRev;
	}

	public void setEspDocRev(String espDocRev) {
		this.espDocRev = espDocRev;
	}

	public String getEspTradptrId() {
		return this.espTradptrId;
	}

	public void setEspTradptrId(String espTradptrId) {
		this.espTradptrId = espTradptrId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEspMstrId))
			return false;
		AbstractEspMstrId castOther = (AbstractEspMstrId) other;

		return ((this.getEspDomain() == castOther.getEspDomain()) || (this
				.getEspDomain() != null
				&& castOther.getEspDomain() != null && this.getEspDomain()
				.equals(castOther.getEspDomain())))
				&& ((this.getEspAppId() == castOther.getEspAppId()) || (this
						.getEspAppId() != null
						&& castOther.getEspAppId() != null && this
						.getEspAppId().equals(castOther.getEspAppId())))
				&& ((this.getEspDocStd() == castOther.getEspDocStd()) || (this
						.getEspDocStd() != null
						&& castOther.getEspDocStd() != null && this
						.getEspDocStd().equals(castOther.getEspDocStd())))
				&& ((this.getEspDocTyp() == castOther.getEspDocTyp()) || (this
						.getEspDocTyp() != null
						&& castOther.getEspDocTyp() != null && this
						.getEspDocTyp().equals(castOther.getEspDocTyp())))
				&& ((this.getEspDocRev() == castOther.getEspDocRev()) || (this
						.getEspDocRev() != null
						&& castOther.getEspDocRev() != null && this
						.getEspDocRev().equals(castOther.getEspDocRev())))
				&& ((this.getEspTradptrId() == castOther.getEspTradptrId()) || (this
						.getEspTradptrId() != null
						&& castOther.getEspTradptrId() != null && this
						.getEspTradptrId().equals(castOther.getEspTradptrId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEspDomain() == null ? 0 : this.getEspDomain().hashCode());
		result = 37 * result
				+ (getEspAppId() == null ? 0 : this.getEspAppId().hashCode());
		result = 37 * result
				+ (getEspDocStd() == null ? 0 : this.getEspDocStd().hashCode());
		result = 37 * result
				+ (getEspDocTyp() == null ? 0 : this.getEspDocTyp().hashCode());
		result = 37 * result
				+ (getEspDocRev() == null ? 0 : this.getEspDocRev().hashCode());
		result = 37
				* result
				+ (getEspTradptrId() == null ? 0 : this.getEspTradptrId()
						.hashCode());
		return result;
	}

}