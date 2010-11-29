package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGribDetId entity provides the base persistence definition of the
 * GribDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGribDetId implements java.io.Serializable {

	// Fields

	private Integer gribRunId;
	private String gribAnCode;
	private String gribLinkCode;
	private String gribLinkType;
	private String gribDesc;
	private Integer gribLevel;
	private Boolean gribSelect;
	private Integer gribBasepage;
	private Integer gribPages;
	private String gribUser1;
	private String gribUser2;
	private String gribQadc01;
	private String gribDomain;
	private Double oidGribDet;

	// Constructors

	/** default constructor */
	public AbstractGribDetId() {
	}

	/** minimal constructor */
	public AbstractGribDetId(String gribDomain, Double oidGribDet) {
		this.gribDomain = gribDomain;
		this.oidGribDet = oidGribDet;
	}

	/** full constructor */
	public AbstractGribDetId(Integer gribRunId, String gribAnCode,
			String gribLinkCode, String gribLinkType, String gribDesc,
			Integer gribLevel, Boolean gribSelect, Integer gribBasepage,
			Integer gribPages, String gribUser1, String gribUser2,
			String gribQadc01, String gribDomain, Double oidGribDet) {
		this.gribRunId = gribRunId;
		this.gribAnCode = gribAnCode;
		this.gribLinkCode = gribLinkCode;
		this.gribLinkType = gribLinkType;
		this.gribDesc = gribDesc;
		this.gribLevel = gribLevel;
		this.gribSelect = gribSelect;
		this.gribBasepage = gribBasepage;
		this.gribPages = gribPages;
		this.gribUser1 = gribUser1;
		this.gribUser2 = gribUser2;
		this.gribQadc01 = gribQadc01;
		this.gribDomain = gribDomain;
		this.oidGribDet = oidGribDet;
	}

	// Property accessors

	public Integer getGribRunId() {
		return this.gribRunId;
	}

	public void setGribRunId(Integer gribRunId) {
		this.gribRunId = gribRunId;
	}

	public String getGribAnCode() {
		return this.gribAnCode;
	}

	public void setGribAnCode(String gribAnCode) {
		this.gribAnCode = gribAnCode;
	}

	public String getGribLinkCode() {
		return this.gribLinkCode;
	}

	public void setGribLinkCode(String gribLinkCode) {
		this.gribLinkCode = gribLinkCode;
	}

	public String getGribLinkType() {
		return this.gribLinkType;
	}

	public void setGribLinkType(String gribLinkType) {
		this.gribLinkType = gribLinkType;
	}

	public String getGribDesc() {
		return this.gribDesc;
	}

	public void setGribDesc(String gribDesc) {
		this.gribDesc = gribDesc;
	}

	public Integer getGribLevel() {
		return this.gribLevel;
	}

	public void setGribLevel(Integer gribLevel) {
		this.gribLevel = gribLevel;
	}

	public Boolean getGribSelect() {
		return this.gribSelect;
	}

	public void setGribSelect(Boolean gribSelect) {
		this.gribSelect = gribSelect;
	}

	public Integer getGribBasepage() {
		return this.gribBasepage;
	}

	public void setGribBasepage(Integer gribBasepage) {
		this.gribBasepage = gribBasepage;
	}

	public Integer getGribPages() {
		return this.gribPages;
	}

	public void setGribPages(Integer gribPages) {
		this.gribPages = gribPages;
	}

	public String getGribUser1() {
		return this.gribUser1;
	}

	public void setGribUser1(String gribUser1) {
		this.gribUser1 = gribUser1;
	}

	public String getGribUser2() {
		return this.gribUser2;
	}

	public void setGribUser2(String gribUser2) {
		this.gribUser2 = gribUser2;
	}

	public String getGribQadc01() {
		return this.gribQadc01;
	}

	public void setGribQadc01(String gribQadc01) {
		this.gribQadc01 = gribQadc01;
	}

	public String getGribDomain() {
		return this.gribDomain;
	}

	public void setGribDomain(String gribDomain) {
		this.gribDomain = gribDomain;
	}

	public Double getOidGribDet() {
		return this.oidGribDet;
	}

	public void setOidGribDet(Double oidGribDet) {
		this.oidGribDet = oidGribDet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGribDetId))
			return false;
		AbstractGribDetId castOther = (AbstractGribDetId) other;

		return ((this.getGribRunId() == castOther.getGribRunId()) || (this
				.getGribRunId() != null
				&& castOther.getGribRunId() != null && this.getGribRunId()
				.equals(castOther.getGribRunId())))
				&& ((this.getGribAnCode() == castOther.getGribAnCode()) || (this
						.getGribAnCode() != null
						&& castOther.getGribAnCode() != null && this
						.getGribAnCode().equals(castOther.getGribAnCode())))
				&& ((this.getGribLinkCode() == castOther.getGribLinkCode()) || (this
						.getGribLinkCode() != null
						&& castOther.getGribLinkCode() != null && this
						.getGribLinkCode().equals(castOther.getGribLinkCode())))
				&& ((this.getGribLinkType() == castOther.getGribLinkType()) || (this
						.getGribLinkType() != null
						&& castOther.getGribLinkType() != null && this
						.getGribLinkType().equals(castOther.getGribLinkType())))
				&& ((this.getGribDesc() == castOther.getGribDesc()) || (this
						.getGribDesc() != null
						&& castOther.getGribDesc() != null && this
						.getGribDesc().equals(castOther.getGribDesc())))
				&& ((this.getGribLevel() == castOther.getGribLevel()) || (this
						.getGribLevel() != null
						&& castOther.getGribLevel() != null && this
						.getGribLevel().equals(castOther.getGribLevel())))
				&& ((this.getGribSelect() == castOther.getGribSelect()) || (this
						.getGribSelect() != null
						&& castOther.getGribSelect() != null && this
						.getGribSelect().equals(castOther.getGribSelect())))
				&& ((this.getGribBasepage() == castOther.getGribBasepage()) || (this
						.getGribBasepage() != null
						&& castOther.getGribBasepage() != null && this
						.getGribBasepage().equals(castOther.getGribBasepage())))
				&& ((this.getGribPages() == castOther.getGribPages()) || (this
						.getGribPages() != null
						&& castOther.getGribPages() != null && this
						.getGribPages().equals(castOther.getGribPages())))
				&& ((this.getGribUser1() == castOther.getGribUser1()) || (this
						.getGribUser1() != null
						&& castOther.getGribUser1() != null && this
						.getGribUser1().equals(castOther.getGribUser1())))
				&& ((this.getGribUser2() == castOther.getGribUser2()) || (this
						.getGribUser2() != null
						&& castOther.getGribUser2() != null && this
						.getGribUser2().equals(castOther.getGribUser2())))
				&& ((this.getGribQadc01() == castOther.getGribQadc01()) || (this
						.getGribQadc01() != null
						&& castOther.getGribQadc01() != null && this
						.getGribQadc01().equals(castOther.getGribQadc01())))
				&& ((this.getGribDomain() == castOther.getGribDomain()) || (this
						.getGribDomain() != null
						&& castOther.getGribDomain() != null && this
						.getGribDomain().equals(castOther.getGribDomain())))
				&& ((this.getOidGribDet() == castOther.getOidGribDet()) || (this
						.getOidGribDet() != null
						&& castOther.getOidGribDet() != null && this
						.getOidGribDet().equals(castOther.getOidGribDet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGribRunId() == null ? 0 : this.getGribRunId().hashCode());
		result = 37
				* result
				+ (getGribAnCode() == null ? 0 : this.getGribAnCode()
						.hashCode());
		result = 37
				* result
				+ (getGribLinkCode() == null ? 0 : this.getGribLinkCode()
						.hashCode());
		result = 37
				* result
				+ (getGribLinkType() == null ? 0 : this.getGribLinkType()
						.hashCode());
		result = 37 * result
				+ (getGribDesc() == null ? 0 : this.getGribDesc().hashCode());
		result = 37 * result
				+ (getGribLevel() == null ? 0 : this.getGribLevel().hashCode());
		result = 37
				* result
				+ (getGribSelect() == null ? 0 : this.getGribSelect()
						.hashCode());
		result = 37
				* result
				+ (getGribBasepage() == null ? 0 : this.getGribBasepage()
						.hashCode());
		result = 37 * result
				+ (getGribPages() == null ? 0 : this.getGribPages().hashCode());
		result = 37 * result
				+ (getGribUser1() == null ? 0 : this.getGribUser1().hashCode());
		result = 37 * result
				+ (getGribUser2() == null ? 0 : this.getGribUser2().hashCode());
		result = 37
				* result
				+ (getGribQadc01() == null ? 0 : this.getGribQadc01()
						.hashCode());
		result = 37
				* result
				+ (getGribDomain() == null ? 0 : this.getGribDomain()
						.hashCode());
		result = 37
				* result
				+ (getOidGribDet() == null ? 0 : this.getOidGribDet()
						.hashCode());
		return result;
	}

}