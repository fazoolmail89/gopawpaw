package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIbDet entity provides the base persistence definition of the IbDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIbDet implements java.io.Serializable {

	// Fields

	private IbDetId id;
	private String ibLevel;
	private String ibContract;
	private Boolean ibTag;
	private String ibCompSer;
	private Integer ibCompRef;
	private String ibCover;
	private String ibDesc;
	private Integer ibIntLevel;
	private String ibUser1;
	private String ibUser2;
	private String ibQadc01;
	private Double oidIbDet;

	// Constructors

	/** default constructor */
	public AbstractIbDet() {
	}

	/** minimal constructor */
	public AbstractIbDet(IbDetId id, Double oidIbDet) {
		this.id = id;
		this.oidIbDet = oidIbDet;
	}

	/** full constructor */
	public AbstractIbDet(IbDetId id, String ibLevel, String ibContract,
			Boolean ibTag, String ibCompSer, Integer ibCompRef, String ibCover,
			String ibDesc, Integer ibIntLevel, String ibUser1, String ibUser2,
			String ibQadc01, Double oidIbDet) {
		this.id = id;
		this.ibLevel = ibLevel;
		this.ibContract = ibContract;
		this.ibTag = ibTag;
		this.ibCompSer = ibCompSer;
		this.ibCompRef = ibCompRef;
		this.ibCover = ibCover;
		this.ibDesc = ibDesc;
		this.ibIntLevel = ibIntLevel;
		this.ibUser1 = ibUser1;
		this.ibUser2 = ibUser2;
		this.ibQadc01 = ibQadc01;
		this.oidIbDet = oidIbDet;
	}

	// Property accessors

	public IbDetId getId() {
		return this.id;
	}

	public void setId(IbDetId id) {
		this.id = id;
	}

	public String getIbLevel() {
		return this.ibLevel;
	}

	public void setIbLevel(String ibLevel) {
		this.ibLevel = ibLevel;
	}

	public String getIbContract() {
		return this.ibContract;
	}

	public void setIbContract(String ibContract) {
		this.ibContract = ibContract;
	}

	public Boolean getIbTag() {
		return this.ibTag;
	}

	public void setIbTag(Boolean ibTag) {
		this.ibTag = ibTag;
	}

	public String getIbCompSer() {
		return this.ibCompSer;
	}

	public void setIbCompSer(String ibCompSer) {
		this.ibCompSer = ibCompSer;
	}

	public Integer getIbCompRef() {
		return this.ibCompRef;
	}

	public void setIbCompRef(Integer ibCompRef) {
		this.ibCompRef = ibCompRef;
	}

	public String getIbCover() {
		return this.ibCover;
	}

	public void setIbCover(String ibCover) {
		this.ibCover = ibCover;
	}

	public String getIbDesc() {
		return this.ibDesc;
	}

	public void setIbDesc(String ibDesc) {
		this.ibDesc = ibDesc;
	}

	public Integer getIbIntLevel() {
		return this.ibIntLevel;
	}

	public void setIbIntLevel(Integer ibIntLevel) {
		this.ibIntLevel = ibIntLevel;
	}

	public String getIbUser1() {
		return this.ibUser1;
	}

	public void setIbUser1(String ibUser1) {
		this.ibUser1 = ibUser1;
	}

	public String getIbUser2() {
		return this.ibUser2;
	}

	public void setIbUser2(String ibUser2) {
		this.ibUser2 = ibUser2;
	}

	public String getIbQadc01() {
		return this.ibQadc01;
	}

	public void setIbQadc01(String ibQadc01) {
		this.ibQadc01 = ibQadc01;
	}

	public Double getOidIbDet() {
		return this.oidIbDet;
	}

	public void setOidIbDet(Double oidIbDet) {
		this.oidIbDet = oidIbDet;
	}

}