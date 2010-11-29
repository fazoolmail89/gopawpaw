package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWldDetId entity provides the base persistence definition of the
 * WldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWldDetId implements java.io.Serializable {

	// Fields

	private String wldDomain;
	private String wldProdbyId;
	private Integer wldProdbyOp;
	private String wldLotser;
	private String wldRef;
	private String wldSite;
	private String wldWkctr;
	private String wldMch;
	private String wldAllocId;
	private Integer wldAllocOp;
	private String wldAllocQue;

	// Constructors

	/** default constructor */
	public AbstractWldDetId() {
	}

	/** minimal constructor */
	public AbstractWldDetId(String wldDomain, Integer wldProdbyOp,
			String wldWkctr, Integer wldAllocOp) {
		this.wldDomain = wldDomain;
		this.wldProdbyOp = wldProdbyOp;
		this.wldWkctr = wldWkctr;
		this.wldAllocOp = wldAllocOp;
	}

	/** full constructor */
	public AbstractWldDetId(String wldDomain, String wldProdbyId,
			Integer wldProdbyOp, String wldLotser, String wldRef,
			String wldSite, String wldWkctr, String wldMch, String wldAllocId,
			Integer wldAllocOp, String wldAllocQue) {
		this.wldDomain = wldDomain;
		this.wldProdbyId = wldProdbyId;
		this.wldProdbyOp = wldProdbyOp;
		this.wldLotser = wldLotser;
		this.wldRef = wldRef;
		this.wldSite = wldSite;
		this.wldWkctr = wldWkctr;
		this.wldMch = wldMch;
		this.wldAllocId = wldAllocId;
		this.wldAllocOp = wldAllocOp;
		this.wldAllocQue = wldAllocQue;
	}

	// Property accessors

	public String getWldDomain() {
		return this.wldDomain;
	}

	public void setWldDomain(String wldDomain) {
		this.wldDomain = wldDomain;
	}

	public String getWldProdbyId() {
		return this.wldProdbyId;
	}

	public void setWldProdbyId(String wldProdbyId) {
		this.wldProdbyId = wldProdbyId;
	}

	public Integer getWldProdbyOp() {
		return this.wldProdbyOp;
	}

	public void setWldProdbyOp(Integer wldProdbyOp) {
		this.wldProdbyOp = wldProdbyOp;
	}

	public String getWldLotser() {
		return this.wldLotser;
	}

	public void setWldLotser(String wldLotser) {
		this.wldLotser = wldLotser;
	}

	public String getWldRef() {
		return this.wldRef;
	}

	public void setWldRef(String wldRef) {
		this.wldRef = wldRef;
	}

	public String getWldSite() {
		return this.wldSite;
	}

	public void setWldSite(String wldSite) {
		this.wldSite = wldSite;
	}

	public String getWldWkctr() {
		return this.wldWkctr;
	}

	public void setWldWkctr(String wldWkctr) {
		this.wldWkctr = wldWkctr;
	}

	public String getWldMch() {
		return this.wldMch;
	}

	public void setWldMch(String wldMch) {
		this.wldMch = wldMch;
	}

	public String getWldAllocId() {
		return this.wldAllocId;
	}

	public void setWldAllocId(String wldAllocId) {
		this.wldAllocId = wldAllocId;
	}

	public Integer getWldAllocOp() {
		return this.wldAllocOp;
	}

	public void setWldAllocOp(Integer wldAllocOp) {
		this.wldAllocOp = wldAllocOp;
	}

	public String getWldAllocQue() {
		return this.wldAllocQue;
	}

	public void setWldAllocQue(String wldAllocQue) {
		this.wldAllocQue = wldAllocQue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWldDetId))
			return false;
		AbstractWldDetId castOther = (AbstractWldDetId) other;

		return ((this.getWldDomain() == castOther.getWldDomain()) || (this
				.getWldDomain() != null
				&& castOther.getWldDomain() != null && this.getWldDomain()
				.equals(castOther.getWldDomain())))
				&& ((this.getWldProdbyId() == castOther.getWldProdbyId()) || (this
						.getWldProdbyId() != null
						&& castOther.getWldProdbyId() != null && this
						.getWldProdbyId().equals(castOther.getWldProdbyId())))
				&& ((this.getWldProdbyOp() == castOther.getWldProdbyOp()) || (this
						.getWldProdbyOp() != null
						&& castOther.getWldProdbyOp() != null && this
						.getWldProdbyOp().equals(castOther.getWldProdbyOp())))
				&& ((this.getWldLotser() == castOther.getWldLotser()) || (this
						.getWldLotser() != null
						&& castOther.getWldLotser() != null && this
						.getWldLotser().equals(castOther.getWldLotser())))
				&& ((this.getWldRef() == castOther.getWldRef()) || (this
						.getWldRef() != null
						&& castOther.getWldRef() != null && this.getWldRef()
						.equals(castOther.getWldRef())))
				&& ((this.getWldSite() == castOther.getWldSite()) || (this
						.getWldSite() != null
						&& castOther.getWldSite() != null && this.getWldSite()
						.equals(castOther.getWldSite())))
				&& ((this.getWldWkctr() == castOther.getWldWkctr()) || (this
						.getWldWkctr() != null
						&& castOther.getWldWkctr() != null && this
						.getWldWkctr().equals(castOther.getWldWkctr())))
				&& ((this.getWldMch() == castOther.getWldMch()) || (this
						.getWldMch() != null
						&& castOther.getWldMch() != null && this.getWldMch()
						.equals(castOther.getWldMch())))
				&& ((this.getWldAllocId() == castOther.getWldAllocId()) || (this
						.getWldAllocId() != null
						&& castOther.getWldAllocId() != null && this
						.getWldAllocId().equals(castOther.getWldAllocId())))
				&& ((this.getWldAllocOp() == castOther.getWldAllocOp()) || (this
						.getWldAllocOp() != null
						&& castOther.getWldAllocOp() != null && this
						.getWldAllocOp().equals(castOther.getWldAllocOp())))
				&& ((this.getWldAllocQue() == castOther.getWldAllocQue()) || (this
						.getWldAllocQue() != null
						&& castOther.getWldAllocQue() != null && this
						.getWldAllocQue().equals(castOther.getWldAllocQue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWldDomain() == null ? 0 : this.getWldDomain().hashCode());
		result = 37
				* result
				+ (getWldProdbyId() == null ? 0 : this.getWldProdbyId()
						.hashCode());
		result = 37
				* result
				+ (getWldProdbyOp() == null ? 0 : this.getWldProdbyOp()
						.hashCode());
		result = 37 * result
				+ (getWldLotser() == null ? 0 : this.getWldLotser().hashCode());
		result = 37 * result
				+ (getWldRef() == null ? 0 : this.getWldRef().hashCode());
		result = 37 * result
				+ (getWldSite() == null ? 0 : this.getWldSite().hashCode());
		result = 37 * result
				+ (getWldWkctr() == null ? 0 : this.getWldWkctr().hashCode());
		result = 37 * result
				+ (getWldMch() == null ? 0 : this.getWldMch().hashCode());
		result = 37
				* result
				+ (getWldAllocId() == null ? 0 : this.getWldAllocId()
						.hashCode());
		result = 37
				* result
				+ (getWldAllocOp() == null ? 0 : this.getWldAllocOp()
						.hashCode());
		result = 37
				* result
				+ (getWldAllocQue() == null ? 0 : this.getWldAllocQue()
						.hashCode());
		return result;
	}

}