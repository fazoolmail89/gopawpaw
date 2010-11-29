package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVecMstr entity provides the base persistence definition of the
 * VecMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVecMstr implements java.io.Serializable {

	// Fields

	private VecMstrId id;
	private Boolean vecActiveFlag;
	private String vecName;
	private String vecDesc;
	private Integer vecMaxPoints;
	private Integer vecThresholdPoints;
	private String vecCompMethod;
	private Integer vecPpFactor;
	private Boolean vecPpCounter;
	private Boolean vecDiscreteType;
	private Boolean vecTableLookupFlag;
	private String vecModUserid;
	private Date vecModDate;
	private String vecUser1;
	private String vecUser2;
	private String vecUser3;
	private String vecUser4;
	private String vecQadc01;
	private String vecQadc02;
	private String vecQadc03;
	private String vecQadc04;
	private Double vecQadd01;
	private Double vecQadd02;
	private Boolean vecQadl01;
	private Boolean vecQadl02;
	private Date vecQadt01;
	private Date vecQadt02;
	private Integer vecQadi01;
	private Integer vecQadi02;
	private Double oidVecMstr;

	// Constructors

	/** default constructor */
	public AbstractVecMstr() {
	}

	/** minimal constructor */
	public AbstractVecMstr(VecMstrId id, Double oidVecMstr) {
		this.id = id;
		this.oidVecMstr = oidVecMstr;
	}

	/** full constructor */
	public AbstractVecMstr(VecMstrId id, Boolean vecActiveFlag, String vecName,
			String vecDesc, Integer vecMaxPoints, Integer vecThresholdPoints,
			String vecCompMethod, Integer vecPpFactor, Boolean vecPpCounter,
			Boolean vecDiscreteType, Boolean vecTableLookupFlag,
			String vecModUserid, Date vecModDate, String vecUser1,
			String vecUser2, String vecUser3, String vecUser4,
			String vecQadc01, String vecQadc02, String vecQadc03,
			String vecQadc04, Double vecQadd01, Double vecQadd02,
			Boolean vecQadl01, Boolean vecQadl02, Date vecQadt01,
			Date vecQadt02, Integer vecQadi01, Integer vecQadi02,
			Double oidVecMstr) {
		this.id = id;
		this.vecActiveFlag = vecActiveFlag;
		this.vecName = vecName;
		this.vecDesc = vecDesc;
		this.vecMaxPoints = vecMaxPoints;
		this.vecThresholdPoints = vecThresholdPoints;
		this.vecCompMethod = vecCompMethod;
		this.vecPpFactor = vecPpFactor;
		this.vecPpCounter = vecPpCounter;
		this.vecDiscreteType = vecDiscreteType;
		this.vecTableLookupFlag = vecTableLookupFlag;
		this.vecModUserid = vecModUserid;
		this.vecModDate = vecModDate;
		this.vecUser1 = vecUser1;
		this.vecUser2 = vecUser2;
		this.vecUser3 = vecUser3;
		this.vecUser4 = vecUser4;
		this.vecQadc01 = vecQadc01;
		this.vecQadc02 = vecQadc02;
		this.vecQadc03 = vecQadc03;
		this.vecQadc04 = vecQadc04;
		this.vecQadd01 = vecQadd01;
		this.vecQadd02 = vecQadd02;
		this.vecQadl01 = vecQadl01;
		this.vecQadl02 = vecQadl02;
		this.vecQadt01 = vecQadt01;
		this.vecQadt02 = vecQadt02;
		this.vecQadi01 = vecQadi01;
		this.vecQadi02 = vecQadi02;
		this.oidVecMstr = oidVecMstr;
	}

	// Property accessors

	public VecMstrId getId() {
		return this.id;
	}

	public void setId(VecMstrId id) {
		this.id = id;
	}

	public Boolean getVecActiveFlag() {
		return this.vecActiveFlag;
	}

	public void setVecActiveFlag(Boolean vecActiveFlag) {
		this.vecActiveFlag = vecActiveFlag;
	}

	public String getVecName() {
		return this.vecName;
	}

	public void setVecName(String vecName) {
		this.vecName = vecName;
	}

	public String getVecDesc() {
		return this.vecDesc;
	}

	public void setVecDesc(String vecDesc) {
		this.vecDesc = vecDesc;
	}

	public Integer getVecMaxPoints() {
		return this.vecMaxPoints;
	}

	public void setVecMaxPoints(Integer vecMaxPoints) {
		this.vecMaxPoints = vecMaxPoints;
	}

	public Integer getVecThresholdPoints() {
		return this.vecThresholdPoints;
	}

	public void setVecThresholdPoints(Integer vecThresholdPoints) {
		this.vecThresholdPoints = vecThresholdPoints;
	}

	public String getVecCompMethod() {
		return this.vecCompMethod;
	}

	public void setVecCompMethod(String vecCompMethod) {
		this.vecCompMethod = vecCompMethod;
	}

	public Integer getVecPpFactor() {
		return this.vecPpFactor;
	}

	public void setVecPpFactor(Integer vecPpFactor) {
		this.vecPpFactor = vecPpFactor;
	}

	public Boolean getVecPpCounter() {
		return this.vecPpCounter;
	}

	public void setVecPpCounter(Boolean vecPpCounter) {
		this.vecPpCounter = vecPpCounter;
	}

	public Boolean getVecDiscreteType() {
		return this.vecDiscreteType;
	}

	public void setVecDiscreteType(Boolean vecDiscreteType) {
		this.vecDiscreteType = vecDiscreteType;
	}

	public Boolean getVecTableLookupFlag() {
		return this.vecTableLookupFlag;
	}

	public void setVecTableLookupFlag(Boolean vecTableLookupFlag) {
		this.vecTableLookupFlag = vecTableLookupFlag;
	}

	public String getVecModUserid() {
		return this.vecModUserid;
	}

	public void setVecModUserid(String vecModUserid) {
		this.vecModUserid = vecModUserid;
	}

	public Date getVecModDate() {
		return this.vecModDate;
	}

	public void setVecModDate(Date vecModDate) {
		this.vecModDate = vecModDate;
	}

	public String getVecUser1() {
		return this.vecUser1;
	}

	public void setVecUser1(String vecUser1) {
		this.vecUser1 = vecUser1;
	}

	public String getVecUser2() {
		return this.vecUser2;
	}

	public void setVecUser2(String vecUser2) {
		this.vecUser2 = vecUser2;
	}

	public String getVecUser3() {
		return this.vecUser3;
	}

	public void setVecUser3(String vecUser3) {
		this.vecUser3 = vecUser3;
	}

	public String getVecUser4() {
		return this.vecUser4;
	}

	public void setVecUser4(String vecUser4) {
		this.vecUser4 = vecUser4;
	}

	public String getVecQadc01() {
		return this.vecQadc01;
	}

	public void setVecQadc01(String vecQadc01) {
		this.vecQadc01 = vecQadc01;
	}

	public String getVecQadc02() {
		return this.vecQadc02;
	}

	public void setVecQadc02(String vecQadc02) {
		this.vecQadc02 = vecQadc02;
	}

	public String getVecQadc03() {
		return this.vecQadc03;
	}

	public void setVecQadc03(String vecQadc03) {
		this.vecQadc03 = vecQadc03;
	}

	public String getVecQadc04() {
		return this.vecQadc04;
	}

	public void setVecQadc04(String vecQadc04) {
		this.vecQadc04 = vecQadc04;
	}

	public Double getVecQadd01() {
		return this.vecQadd01;
	}

	public void setVecQadd01(Double vecQadd01) {
		this.vecQadd01 = vecQadd01;
	}

	public Double getVecQadd02() {
		return this.vecQadd02;
	}

	public void setVecQadd02(Double vecQadd02) {
		this.vecQadd02 = vecQadd02;
	}

	public Boolean getVecQadl01() {
		return this.vecQadl01;
	}

	public void setVecQadl01(Boolean vecQadl01) {
		this.vecQadl01 = vecQadl01;
	}

	public Boolean getVecQadl02() {
		return this.vecQadl02;
	}

	public void setVecQadl02(Boolean vecQadl02) {
		this.vecQadl02 = vecQadl02;
	}

	public Date getVecQadt01() {
		return this.vecQadt01;
	}

	public void setVecQadt01(Date vecQadt01) {
		this.vecQadt01 = vecQadt01;
	}

	public Date getVecQadt02() {
		return this.vecQadt02;
	}

	public void setVecQadt02(Date vecQadt02) {
		this.vecQadt02 = vecQadt02;
	}

	public Integer getVecQadi01() {
		return this.vecQadi01;
	}

	public void setVecQadi01(Integer vecQadi01) {
		this.vecQadi01 = vecQadi01;
	}

	public Integer getVecQadi02() {
		return this.vecQadi02;
	}

	public void setVecQadi02(Integer vecQadi02) {
		this.vecQadi02 = vecQadi02;
	}

	public Double getOidVecMstr() {
		return this.oidVecMstr;
	}

	public void setOidVecMstr(Double oidVecMstr) {
		this.oidVecMstr = oidVecMstr;
	}

}