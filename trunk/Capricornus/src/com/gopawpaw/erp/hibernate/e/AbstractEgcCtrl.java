package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgcCtrl entity provides the base persistence definition of the
 * EgcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgcCtrl implements java.io.Serializable {

	// Fields

	private EgcCtrlId id;
	private String egcQadc05;
	private String egcCallList;
	private String egcEngLhr;
	private Integer egcAreaPoints;
	private Integer egcProbPoints;
	private Integer egcAvailPoints;
	private Integer egcPrimPoints;
	private Boolean egcByCalls;
	private String egcQadc06;
	private String egcUser1;
	private String egcUser2;
	private Boolean egcHoursDisplay;
	private Boolean egcTzLimit;
	private Boolean egcAreaLimit;
	private String egcTzEngHours;
	private String egcAvailLimit;
	private Integer egcQadi01;
	private Integer egcTzPoints;
	private String egcChr01;
	private String egcChr02;
	private Integer egcInt02;
	private Integer egcInt01;
	private Boolean egcLog01;
	private Boolean egcLog02;
	private String egcModUserid;
	private Date egcModDate;
	private Boolean egcProbLimit;
	private Boolean egcOverrideOpt;
	private String egcQadc03;
	private String egcQadc04;
	private Integer egcNbr;
	private String egcQadc07;
	private Boolean egcQadl05;
	private Boolean egcQadl06;
	private Boolean egcQadl07;
	private Integer egcQadi04;
	private Integer egcQadi05;
	private Double egcQadd01;
	private Double egcQadd02;
	private Double egcQadd03;
	private Date egcQadt01;
	private Date egcQadt02;
	private Date egcQadt03;
	private Double oidEgcCtrl;

	// Constructors

	/** default constructor */
	public AbstractEgcCtrl() {
	}

	/** minimal constructor */
	public AbstractEgcCtrl(EgcCtrlId id, Boolean egcTzLimit,
			Boolean egcAreaLimit, String egcTzEngHours, String egcAvailLimit,
			Integer egcTzPoints, Boolean egcProbLimit, Boolean egcOverrideOpt,
			Double oidEgcCtrl) {
		this.id = id;
		this.egcTzLimit = egcTzLimit;
		this.egcAreaLimit = egcAreaLimit;
		this.egcTzEngHours = egcTzEngHours;
		this.egcAvailLimit = egcAvailLimit;
		this.egcTzPoints = egcTzPoints;
		this.egcProbLimit = egcProbLimit;
		this.egcOverrideOpt = egcOverrideOpt;
		this.oidEgcCtrl = oidEgcCtrl;
	}

	/** full constructor */
	public AbstractEgcCtrl(EgcCtrlId id, String egcQadc05, String egcCallList,
			String egcEngLhr, Integer egcAreaPoints, Integer egcProbPoints,
			Integer egcAvailPoints, Integer egcPrimPoints, Boolean egcByCalls,
			String egcQadc06, String egcUser1, String egcUser2,
			Boolean egcHoursDisplay, Boolean egcTzLimit, Boolean egcAreaLimit,
			String egcTzEngHours, String egcAvailLimit, Integer egcQadi01,
			Integer egcTzPoints, String egcChr01, String egcChr02,
			Integer egcInt02, Integer egcInt01, Boolean egcLog01,
			Boolean egcLog02, String egcModUserid, Date egcModDate,
			Boolean egcProbLimit, Boolean egcOverrideOpt, String egcQadc03,
			String egcQadc04, Integer egcNbr, String egcQadc07,
			Boolean egcQadl05, Boolean egcQadl06, Boolean egcQadl07,
			Integer egcQadi04, Integer egcQadi05, Double egcQadd01,
			Double egcQadd02, Double egcQadd03, Date egcQadt01, Date egcQadt02,
			Date egcQadt03, Double oidEgcCtrl) {
		this.id = id;
		this.egcQadc05 = egcQadc05;
		this.egcCallList = egcCallList;
		this.egcEngLhr = egcEngLhr;
		this.egcAreaPoints = egcAreaPoints;
		this.egcProbPoints = egcProbPoints;
		this.egcAvailPoints = egcAvailPoints;
		this.egcPrimPoints = egcPrimPoints;
		this.egcByCalls = egcByCalls;
		this.egcQadc06 = egcQadc06;
		this.egcUser1 = egcUser1;
		this.egcUser2 = egcUser2;
		this.egcHoursDisplay = egcHoursDisplay;
		this.egcTzLimit = egcTzLimit;
		this.egcAreaLimit = egcAreaLimit;
		this.egcTzEngHours = egcTzEngHours;
		this.egcAvailLimit = egcAvailLimit;
		this.egcQadi01 = egcQadi01;
		this.egcTzPoints = egcTzPoints;
		this.egcChr01 = egcChr01;
		this.egcChr02 = egcChr02;
		this.egcInt02 = egcInt02;
		this.egcInt01 = egcInt01;
		this.egcLog01 = egcLog01;
		this.egcLog02 = egcLog02;
		this.egcModUserid = egcModUserid;
		this.egcModDate = egcModDate;
		this.egcProbLimit = egcProbLimit;
		this.egcOverrideOpt = egcOverrideOpt;
		this.egcQadc03 = egcQadc03;
		this.egcQadc04 = egcQadc04;
		this.egcNbr = egcNbr;
		this.egcQadc07 = egcQadc07;
		this.egcQadl05 = egcQadl05;
		this.egcQadl06 = egcQadl06;
		this.egcQadl07 = egcQadl07;
		this.egcQadi04 = egcQadi04;
		this.egcQadi05 = egcQadi05;
		this.egcQadd01 = egcQadd01;
		this.egcQadd02 = egcQadd02;
		this.egcQadd03 = egcQadd03;
		this.egcQadt01 = egcQadt01;
		this.egcQadt02 = egcQadt02;
		this.egcQadt03 = egcQadt03;
		this.oidEgcCtrl = oidEgcCtrl;
	}

	// Property accessors

	public EgcCtrlId getId() {
		return this.id;
	}

	public void setId(EgcCtrlId id) {
		this.id = id;
	}

	public String getEgcQadc05() {
		return this.egcQadc05;
	}

	public void setEgcQadc05(String egcQadc05) {
		this.egcQadc05 = egcQadc05;
	}

	public String getEgcCallList() {
		return this.egcCallList;
	}

	public void setEgcCallList(String egcCallList) {
		this.egcCallList = egcCallList;
	}

	public String getEgcEngLhr() {
		return this.egcEngLhr;
	}

	public void setEgcEngLhr(String egcEngLhr) {
		this.egcEngLhr = egcEngLhr;
	}

	public Integer getEgcAreaPoints() {
		return this.egcAreaPoints;
	}

	public void setEgcAreaPoints(Integer egcAreaPoints) {
		this.egcAreaPoints = egcAreaPoints;
	}

	public Integer getEgcProbPoints() {
		return this.egcProbPoints;
	}

	public void setEgcProbPoints(Integer egcProbPoints) {
		this.egcProbPoints = egcProbPoints;
	}

	public Integer getEgcAvailPoints() {
		return this.egcAvailPoints;
	}

	public void setEgcAvailPoints(Integer egcAvailPoints) {
		this.egcAvailPoints = egcAvailPoints;
	}

	public Integer getEgcPrimPoints() {
		return this.egcPrimPoints;
	}

	public void setEgcPrimPoints(Integer egcPrimPoints) {
		this.egcPrimPoints = egcPrimPoints;
	}

	public Boolean getEgcByCalls() {
		return this.egcByCalls;
	}

	public void setEgcByCalls(Boolean egcByCalls) {
		this.egcByCalls = egcByCalls;
	}

	public String getEgcQadc06() {
		return this.egcQadc06;
	}

	public void setEgcQadc06(String egcQadc06) {
		this.egcQadc06 = egcQadc06;
	}

	public String getEgcUser1() {
		return this.egcUser1;
	}

	public void setEgcUser1(String egcUser1) {
		this.egcUser1 = egcUser1;
	}

	public String getEgcUser2() {
		return this.egcUser2;
	}

	public void setEgcUser2(String egcUser2) {
		this.egcUser2 = egcUser2;
	}

	public Boolean getEgcHoursDisplay() {
		return this.egcHoursDisplay;
	}

	public void setEgcHoursDisplay(Boolean egcHoursDisplay) {
		this.egcHoursDisplay = egcHoursDisplay;
	}

	public Boolean getEgcTzLimit() {
		return this.egcTzLimit;
	}

	public void setEgcTzLimit(Boolean egcTzLimit) {
		this.egcTzLimit = egcTzLimit;
	}

	public Boolean getEgcAreaLimit() {
		return this.egcAreaLimit;
	}

	public void setEgcAreaLimit(Boolean egcAreaLimit) {
		this.egcAreaLimit = egcAreaLimit;
	}

	public String getEgcTzEngHours() {
		return this.egcTzEngHours;
	}

	public void setEgcTzEngHours(String egcTzEngHours) {
		this.egcTzEngHours = egcTzEngHours;
	}

	public String getEgcAvailLimit() {
		return this.egcAvailLimit;
	}

	public void setEgcAvailLimit(String egcAvailLimit) {
		this.egcAvailLimit = egcAvailLimit;
	}

	public Integer getEgcQadi01() {
		return this.egcQadi01;
	}

	public void setEgcQadi01(Integer egcQadi01) {
		this.egcQadi01 = egcQadi01;
	}

	public Integer getEgcTzPoints() {
		return this.egcTzPoints;
	}

	public void setEgcTzPoints(Integer egcTzPoints) {
		this.egcTzPoints = egcTzPoints;
	}

	public String getEgcChr01() {
		return this.egcChr01;
	}

	public void setEgcChr01(String egcChr01) {
		this.egcChr01 = egcChr01;
	}

	public String getEgcChr02() {
		return this.egcChr02;
	}

	public void setEgcChr02(String egcChr02) {
		this.egcChr02 = egcChr02;
	}

	public Integer getEgcInt02() {
		return this.egcInt02;
	}

	public void setEgcInt02(Integer egcInt02) {
		this.egcInt02 = egcInt02;
	}

	public Integer getEgcInt01() {
		return this.egcInt01;
	}

	public void setEgcInt01(Integer egcInt01) {
		this.egcInt01 = egcInt01;
	}

	public Boolean getEgcLog01() {
		return this.egcLog01;
	}

	public void setEgcLog01(Boolean egcLog01) {
		this.egcLog01 = egcLog01;
	}

	public Boolean getEgcLog02() {
		return this.egcLog02;
	}

	public void setEgcLog02(Boolean egcLog02) {
		this.egcLog02 = egcLog02;
	}

	public String getEgcModUserid() {
		return this.egcModUserid;
	}

	public void setEgcModUserid(String egcModUserid) {
		this.egcModUserid = egcModUserid;
	}

	public Date getEgcModDate() {
		return this.egcModDate;
	}

	public void setEgcModDate(Date egcModDate) {
		this.egcModDate = egcModDate;
	}

	public Boolean getEgcProbLimit() {
		return this.egcProbLimit;
	}

	public void setEgcProbLimit(Boolean egcProbLimit) {
		this.egcProbLimit = egcProbLimit;
	}

	public Boolean getEgcOverrideOpt() {
		return this.egcOverrideOpt;
	}

	public void setEgcOverrideOpt(Boolean egcOverrideOpt) {
		this.egcOverrideOpt = egcOverrideOpt;
	}

	public String getEgcQadc03() {
		return this.egcQadc03;
	}

	public void setEgcQadc03(String egcQadc03) {
		this.egcQadc03 = egcQadc03;
	}

	public String getEgcQadc04() {
		return this.egcQadc04;
	}

	public void setEgcQadc04(String egcQadc04) {
		this.egcQadc04 = egcQadc04;
	}

	public Integer getEgcNbr() {
		return this.egcNbr;
	}

	public void setEgcNbr(Integer egcNbr) {
		this.egcNbr = egcNbr;
	}

	public String getEgcQadc07() {
		return this.egcQadc07;
	}

	public void setEgcQadc07(String egcQadc07) {
		this.egcQadc07 = egcQadc07;
	}

	public Boolean getEgcQadl05() {
		return this.egcQadl05;
	}

	public void setEgcQadl05(Boolean egcQadl05) {
		this.egcQadl05 = egcQadl05;
	}

	public Boolean getEgcQadl06() {
		return this.egcQadl06;
	}

	public void setEgcQadl06(Boolean egcQadl06) {
		this.egcQadl06 = egcQadl06;
	}

	public Boolean getEgcQadl07() {
		return this.egcQadl07;
	}

	public void setEgcQadl07(Boolean egcQadl07) {
		this.egcQadl07 = egcQadl07;
	}

	public Integer getEgcQadi04() {
		return this.egcQadi04;
	}

	public void setEgcQadi04(Integer egcQadi04) {
		this.egcQadi04 = egcQadi04;
	}

	public Integer getEgcQadi05() {
		return this.egcQadi05;
	}

	public void setEgcQadi05(Integer egcQadi05) {
		this.egcQadi05 = egcQadi05;
	}

	public Double getEgcQadd01() {
		return this.egcQadd01;
	}

	public void setEgcQadd01(Double egcQadd01) {
		this.egcQadd01 = egcQadd01;
	}

	public Double getEgcQadd02() {
		return this.egcQadd02;
	}

	public void setEgcQadd02(Double egcQadd02) {
		this.egcQadd02 = egcQadd02;
	}

	public Double getEgcQadd03() {
		return this.egcQadd03;
	}

	public void setEgcQadd03(Double egcQadd03) {
		this.egcQadd03 = egcQadd03;
	}

	public Date getEgcQadt01() {
		return this.egcQadt01;
	}

	public void setEgcQadt01(Date egcQadt01) {
		this.egcQadt01 = egcQadt01;
	}

	public Date getEgcQadt02() {
		return this.egcQadt02;
	}

	public void setEgcQadt02(Date egcQadt02) {
		this.egcQadt02 = egcQadt02;
	}

	public Date getEgcQadt03() {
		return this.egcQadt03;
	}

	public void setEgcQadt03(Date egcQadt03) {
		this.egcQadt03 = egcQadt03;
	}

	public Double getOidEgcCtrl() {
		return this.oidEgcCtrl;
	}

	public void setOidEgcCtrl(Double oidEgcCtrl) {
		this.oidEgcCtrl = oidEgcCtrl;
	}

}