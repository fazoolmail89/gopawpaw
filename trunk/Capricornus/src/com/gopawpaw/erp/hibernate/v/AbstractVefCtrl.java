package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVefCtrl entity provides the base persistence definition of the
 * VefCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVefCtrl implements java.io.Serializable {

	// Fields

	private String vefDomain;
	private Integer vefQadi03;
	private String vefAsnLeadtime;
	private Integer vefDaysEarly;
	private Integer vefDaysLate;
	private Boolean vefUseShippct;
	private Double vefOvershipPct;
	private Double vefUndershipPct;
	private Boolean vefUseShipqty;
	private Integer vefOvershipQty;
	private Integer vefUndershipQty;
	private Boolean vefUseShippctCost;
	private Double vefOvershipPctCost;
	private Boolean vefUseShipqtyCost;
	private Double vefOvershipQtyCost;
	private Double vefPoints;
	private Integer vefPpFactor;
	private Boolean vefPpCounter;
	private String vefFirstLevelTitle;
	private String vefSecondLevelTitle;
	private String vefThirdLevelTitle;
	private String vefFourthLevelTitle;
	private String vefFifthLevelTitle;
	private Integer vefFirstLevelMax;
	private Integer vefSecondLevelMax;
	private Integer vefThirdLevelMax;
	private Integer vefFourthLevelMax;
	private Integer vefFifthLevelMax;
	private String vefEarlyRcpt;
	private String vefLateRcpt;
	private String vefOverShip;
	private String vefUnderShip;
	private String vefMissedShip;
	private String vefDupAsn;
	private String vefLateAsn;
	private String vefAsnData;
	private String vefPoReceipts;
	private String vefDoReceipts;
	private String vefRtsReceipts;
	private String vefMatlQuality;
	private Boolean vefUsingSupPerf;
	private Boolean vefEnablePoRtn;
	private Boolean vefEnableInvXfer;
	private Boolean vefSameDayReceipts;
	private Date vefMissShipAsOfDate;
	private Date vefMissShipRunDate;
	private Boolean vefPoOnlyFlag;
	private Boolean vefDoOnlyFlag;
	private String vefModUserid;
	private Date vefModDate;
	private String vefUser1;
	private String vefUser2;
	private String vefUser3;
	private String vefUser4;
	private String vefQadc01;
	private String vefQadc02;
	private String vefQadc03;
	private String vefQadc04;
	private Double vefQadd01;
	private Double vefQadd02;
	private Boolean vefQadl01;
	private Boolean vefQadl02;
	private Date vefQadt01;
	private Date vefQadt02;
	private Integer vefQadi01;
	private Integer vefQadi02;
	private Double oidVefCtrl;

	// Constructors

	/** default constructor */
	public AbstractVefCtrl() {
	}

	/** minimal constructor */
	public AbstractVefCtrl(Integer vefQadi03, Double oidVefCtrl) {
		this.vefQadi03 = vefQadi03;
		this.oidVefCtrl = oidVefCtrl;
	}

	/** full constructor */
	public AbstractVefCtrl(Integer vefQadi03, String vefAsnLeadtime,
			Integer vefDaysEarly, Integer vefDaysLate, Boolean vefUseShippct,
			Double vefOvershipPct, Double vefUndershipPct,
			Boolean vefUseShipqty, Integer vefOvershipQty,
			Integer vefUndershipQty, Boolean vefUseShippctCost,
			Double vefOvershipPctCost, Boolean vefUseShipqtyCost,
			Double vefOvershipQtyCost, Double vefPoints, Integer vefPpFactor,
			Boolean vefPpCounter, String vefFirstLevelTitle,
			String vefSecondLevelTitle, String vefThirdLevelTitle,
			String vefFourthLevelTitle, String vefFifthLevelTitle,
			Integer vefFirstLevelMax, Integer vefSecondLevelMax,
			Integer vefThirdLevelMax, Integer vefFourthLevelMax,
			Integer vefFifthLevelMax, String vefEarlyRcpt, String vefLateRcpt,
			String vefOverShip, String vefUnderShip, String vefMissedShip,
			String vefDupAsn, String vefLateAsn, String vefAsnData,
			String vefPoReceipts, String vefDoReceipts, String vefRtsReceipts,
			String vefMatlQuality, Boolean vefUsingSupPerf,
			Boolean vefEnablePoRtn, Boolean vefEnableInvXfer,
			Boolean vefSameDayReceipts, Date vefMissShipAsOfDate,
			Date vefMissShipRunDate, Boolean vefPoOnlyFlag,
			Boolean vefDoOnlyFlag, String vefModUserid, Date vefModDate,
			String vefUser1, String vefUser2, String vefUser3, String vefUser4,
			String vefQadc01, String vefQadc02, String vefQadc03,
			String vefQadc04, Double vefQadd01, Double vefQadd02,
			Boolean vefQadl01, Boolean vefQadl02, Date vefQadt01,
			Date vefQadt02, Integer vefQadi01, Integer vefQadi02,
			Double oidVefCtrl) {
		this.vefQadi03 = vefQadi03;
		this.vefAsnLeadtime = vefAsnLeadtime;
		this.vefDaysEarly = vefDaysEarly;
		this.vefDaysLate = vefDaysLate;
		this.vefUseShippct = vefUseShippct;
		this.vefOvershipPct = vefOvershipPct;
		this.vefUndershipPct = vefUndershipPct;
		this.vefUseShipqty = vefUseShipqty;
		this.vefOvershipQty = vefOvershipQty;
		this.vefUndershipQty = vefUndershipQty;
		this.vefUseShippctCost = vefUseShippctCost;
		this.vefOvershipPctCost = vefOvershipPctCost;
		this.vefUseShipqtyCost = vefUseShipqtyCost;
		this.vefOvershipQtyCost = vefOvershipQtyCost;
		this.vefPoints = vefPoints;
		this.vefPpFactor = vefPpFactor;
		this.vefPpCounter = vefPpCounter;
		this.vefFirstLevelTitle = vefFirstLevelTitle;
		this.vefSecondLevelTitle = vefSecondLevelTitle;
		this.vefThirdLevelTitle = vefThirdLevelTitle;
		this.vefFourthLevelTitle = vefFourthLevelTitle;
		this.vefFifthLevelTitle = vefFifthLevelTitle;
		this.vefFirstLevelMax = vefFirstLevelMax;
		this.vefSecondLevelMax = vefSecondLevelMax;
		this.vefThirdLevelMax = vefThirdLevelMax;
		this.vefFourthLevelMax = vefFourthLevelMax;
		this.vefFifthLevelMax = vefFifthLevelMax;
		this.vefEarlyRcpt = vefEarlyRcpt;
		this.vefLateRcpt = vefLateRcpt;
		this.vefOverShip = vefOverShip;
		this.vefUnderShip = vefUnderShip;
		this.vefMissedShip = vefMissedShip;
		this.vefDupAsn = vefDupAsn;
		this.vefLateAsn = vefLateAsn;
		this.vefAsnData = vefAsnData;
		this.vefPoReceipts = vefPoReceipts;
		this.vefDoReceipts = vefDoReceipts;
		this.vefRtsReceipts = vefRtsReceipts;
		this.vefMatlQuality = vefMatlQuality;
		this.vefUsingSupPerf = vefUsingSupPerf;
		this.vefEnablePoRtn = vefEnablePoRtn;
		this.vefEnableInvXfer = vefEnableInvXfer;
		this.vefSameDayReceipts = vefSameDayReceipts;
		this.vefMissShipAsOfDate = vefMissShipAsOfDate;
		this.vefMissShipRunDate = vefMissShipRunDate;
		this.vefPoOnlyFlag = vefPoOnlyFlag;
		this.vefDoOnlyFlag = vefDoOnlyFlag;
		this.vefModUserid = vefModUserid;
		this.vefModDate = vefModDate;
		this.vefUser1 = vefUser1;
		this.vefUser2 = vefUser2;
		this.vefUser3 = vefUser3;
		this.vefUser4 = vefUser4;
		this.vefQadc01 = vefQadc01;
		this.vefQadc02 = vefQadc02;
		this.vefQadc03 = vefQadc03;
		this.vefQadc04 = vefQadc04;
		this.vefQadd01 = vefQadd01;
		this.vefQadd02 = vefQadd02;
		this.vefQadl01 = vefQadl01;
		this.vefQadl02 = vefQadl02;
		this.vefQadt01 = vefQadt01;
		this.vefQadt02 = vefQadt02;
		this.vefQadi01 = vefQadi01;
		this.vefQadi02 = vefQadi02;
		this.oidVefCtrl = oidVefCtrl;
	}

	// Property accessors

	public String getVefDomain() {
		return this.vefDomain;
	}

	public void setVefDomain(String vefDomain) {
		this.vefDomain = vefDomain;
	}

	public Integer getVefQadi03() {
		return this.vefQadi03;
	}

	public void setVefQadi03(Integer vefQadi03) {
		this.vefQadi03 = vefQadi03;
	}

	public String getVefAsnLeadtime() {
		return this.vefAsnLeadtime;
	}

	public void setVefAsnLeadtime(String vefAsnLeadtime) {
		this.vefAsnLeadtime = vefAsnLeadtime;
	}

	public Integer getVefDaysEarly() {
		return this.vefDaysEarly;
	}

	public void setVefDaysEarly(Integer vefDaysEarly) {
		this.vefDaysEarly = vefDaysEarly;
	}

	public Integer getVefDaysLate() {
		return this.vefDaysLate;
	}

	public void setVefDaysLate(Integer vefDaysLate) {
		this.vefDaysLate = vefDaysLate;
	}

	public Boolean getVefUseShippct() {
		return this.vefUseShippct;
	}

	public void setVefUseShippct(Boolean vefUseShippct) {
		this.vefUseShippct = vefUseShippct;
	}

	public Double getVefOvershipPct() {
		return this.vefOvershipPct;
	}

	public void setVefOvershipPct(Double vefOvershipPct) {
		this.vefOvershipPct = vefOvershipPct;
	}

	public Double getVefUndershipPct() {
		return this.vefUndershipPct;
	}

	public void setVefUndershipPct(Double vefUndershipPct) {
		this.vefUndershipPct = vefUndershipPct;
	}

	public Boolean getVefUseShipqty() {
		return this.vefUseShipqty;
	}

	public void setVefUseShipqty(Boolean vefUseShipqty) {
		this.vefUseShipqty = vefUseShipqty;
	}

	public Integer getVefOvershipQty() {
		return this.vefOvershipQty;
	}

	public void setVefOvershipQty(Integer vefOvershipQty) {
		this.vefOvershipQty = vefOvershipQty;
	}

	public Integer getVefUndershipQty() {
		return this.vefUndershipQty;
	}

	public void setVefUndershipQty(Integer vefUndershipQty) {
		this.vefUndershipQty = vefUndershipQty;
	}

	public Boolean getVefUseShippctCost() {
		return this.vefUseShippctCost;
	}

	public void setVefUseShippctCost(Boolean vefUseShippctCost) {
		this.vefUseShippctCost = vefUseShippctCost;
	}

	public Double getVefOvershipPctCost() {
		return this.vefOvershipPctCost;
	}

	public void setVefOvershipPctCost(Double vefOvershipPctCost) {
		this.vefOvershipPctCost = vefOvershipPctCost;
	}

	public Boolean getVefUseShipqtyCost() {
		return this.vefUseShipqtyCost;
	}

	public void setVefUseShipqtyCost(Boolean vefUseShipqtyCost) {
		this.vefUseShipqtyCost = vefUseShipqtyCost;
	}

	public Double getVefOvershipQtyCost() {
		return this.vefOvershipQtyCost;
	}

	public void setVefOvershipQtyCost(Double vefOvershipQtyCost) {
		this.vefOvershipQtyCost = vefOvershipQtyCost;
	}

	public Double getVefPoints() {
		return this.vefPoints;
	}

	public void setVefPoints(Double vefPoints) {
		this.vefPoints = vefPoints;
	}

	public Integer getVefPpFactor() {
		return this.vefPpFactor;
	}

	public void setVefPpFactor(Integer vefPpFactor) {
		this.vefPpFactor = vefPpFactor;
	}

	public Boolean getVefPpCounter() {
		return this.vefPpCounter;
	}

	public void setVefPpCounter(Boolean vefPpCounter) {
		this.vefPpCounter = vefPpCounter;
	}

	public String getVefFirstLevelTitle() {
		return this.vefFirstLevelTitle;
	}

	public void setVefFirstLevelTitle(String vefFirstLevelTitle) {
		this.vefFirstLevelTitle = vefFirstLevelTitle;
	}

	public String getVefSecondLevelTitle() {
		return this.vefSecondLevelTitle;
	}

	public void setVefSecondLevelTitle(String vefSecondLevelTitle) {
		this.vefSecondLevelTitle = vefSecondLevelTitle;
	}

	public String getVefThirdLevelTitle() {
		return this.vefThirdLevelTitle;
	}

	public void setVefThirdLevelTitle(String vefThirdLevelTitle) {
		this.vefThirdLevelTitle = vefThirdLevelTitle;
	}

	public String getVefFourthLevelTitle() {
		return this.vefFourthLevelTitle;
	}

	public void setVefFourthLevelTitle(String vefFourthLevelTitle) {
		this.vefFourthLevelTitle = vefFourthLevelTitle;
	}

	public String getVefFifthLevelTitle() {
		return this.vefFifthLevelTitle;
	}

	public void setVefFifthLevelTitle(String vefFifthLevelTitle) {
		this.vefFifthLevelTitle = vefFifthLevelTitle;
	}

	public Integer getVefFirstLevelMax() {
		return this.vefFirstLevelMax;
	}

	public void setVefFirstLevelMax(Integer vefFirstLevelMax) {
		this.vefFirstLevelMax = vefFirstLevelMax;
	}

	public Integer getVefSecondLevelMax() {
		return this.vefSecondLevelMax;
	}

	public void setVefSecondLevelMax(Integer vefSecondLevelMax) {
		this.vefSecondLevelMax = vefSecondLevelMax;
	}

	public Integer getVefThirdLevelMax() {
		return this.vefThirdLevelMax;
	}

	public void setVefThirdLevelMax(Integer vefThirdLevelMax) {
		this.vefThirdLevelMax = vefThirdLevelMax;
	}

	public Integer getVefFourthLevelMax() {
		return this.vefFourthLevelMax;
	}

	public void setVefFourthLevelMax(Integer vefFourthLevelMax) {
		this.vefFourthLevelMax = vefFourthLevelMax;
	}

	public Integer getVefFifthLevelMax() {
		return this.vefFifthLevelMax;
	}

	public void setVefFifthLevelMax(Integer vefFifthLevelMax) {
		this.vefFifthLevelMax = vefFifthLevelMax;
	}

	public String getVefEarlyRcpt() {
		return this.vefEarlyRcpt;
	}

	public void setVefEarlyRcpt(String vefEarlyRcpt) {
		this.vefEarlyRcpt = vefEarlyRcpt;
	}

	public String getVefLateRcpt() {
		return this.vefLateRcpt;
	}

	public void setVefLateRcpt(String vefLateRcpt) {
		this.vefLateRcpt = vefLateRcpt;
	}

	public String getVefOverShip() {
		return this.vefOverShip;
	}

	public void setVefOverShip(String vefOverShip) {
		this.vefOverShip = vefOverShip;
	}

	public String getVefUnderShip() {
		return this.vefUnderShip;
	}

	public void setVefUnderShip(String vefUnderShip) {
		this.vefUnderShip = vefUnderShip;
	}

	public String getVefMissedShip() {
		return this.vefMissedShip;
	}

	public void setVefMissedShip(String vefMissedShip) {
		this.vefMissedShip = vefMissedShip;
	}

	public String getVefDupAsn() {
		return this.vefDupAsn;
	}

	public void setVefDupAsn(String vefDupAsn) {
		this.vefDupAsn = vefDupAsn;
	}

	public String getVefLateAsn() {
		return this.vefLateAsn;
	}

	public void setVefLateAsn(String vefLateAsn) {
		this.vefLateAsn = vefLateAsn;
	}

	public String getVefAsnData() {
		return this.vefAsnData;
	}

	public void setVefAsnData(String vefAsnData) {
		this.vefAsnData = vefAsnData;
	}

	public String getVefPoReceipts() {
		return this.vefPoReceipts;
	}

	public void setVefPoReceipts(String vefPoReceipts) {
		this.vefPoReceipts = vefPoReceipts;
	}

	public String getVefDoReceipts() {
		return this.vefDoReceipts;
	}

	public void setVefDoReceipts(String vefDoReceipts) {
		this.vefDoReceipts = vefDoReceipts;
	}

	public String getVefRtsReceipts() {
		return this.vefRtsReceipts;
	}

	public void setVefRtsReceipts(String vefRtsReceipts) {
		this.vefRtsReceipts = vefRtsReceipts;
	}

	public String getVefMatlQuality() {
		return this.vefMatlQuality;
	}

	public void setVefMatlQuality(String vefMatlQuality) {
		this.vefMatlQuality = vefMatlQuality;
	}

	public Boolean getVefUsingSupPerf() {
		return this.vefUsingSupPerf;
	}

	public void setVefUsingSupPerf(Boolean vefUsingSupPerf) {
		this.vefUsingSupPerf = vefUsingSupPerf;
	}

	public Boolean getVefEnablePoRtn() {
		return this.vefEnablePoRtn;
	}

	public void setVefEnablePoRtn(Boolean vefEnablePoRtn) {
		this.vefEnablePoRtn = vefEnablePoRtn;
	}

	public Boolean getVefEnableInvXfer() {
		return this.vefEnableInvXfer;
	}

	public void setVefEnableInvXfer(Boolean vefEnableInvXfer) {
		this.vefEnableInvXfer = vefEnableInvXfer;
	}

	public Boolean getVefSameDayReceipts() {
		return this.vefSameDayReceipts;
	}

	public void setVefSameDayReceipts(Boolean vefSameDayReceipts) {
		this.vefSameDayReceipts = vefSameDayReceipts;
	}

	public Date getVefMissShipAsOfDate() {
		return this.vefMissShipAsOfDate;
	}

	public void setVefMissShipAsOfDate(Date vefMissShipAsOfDate) {
		this.vefMissShipAsOfDate = vefMissShipAsOfDate;
	}

	public Date getVefMissShipRunDate() {
		return this.vefMissShipRunDate;
	}

	public void setVefMissShipRunDate(Date vefMissShipRunDate) {
		this.vefMissShipRunDate = vefMissShipRunDate;
	}

	public Boolean getVefPoOnlyFlag() {
		return this.vefPoOnlyFlag;
	}

	public void setVefPoOnlyFlag(Boolean vefPoOnlyFlag) {
		this.vefPoOnlyFlag = vefPoOnlyFlag;
	}

	public Boolean getVefDoOnlyFlag() {
		return this.vefDoOnlyFlag;
	}

	public void setVefDoOnlyFlag(Boolean vefDoOnlyFlag) {
		this.vefDoOnlyFlag = vefDoOnlyFlag;
	}

	public String getVefModUserid() {
		return this.vefModUserid;
	}

	public void setVefModUserid(String vefModUserid) {
		this.vefModUserid = vefModUserid;
	}

	public Date getVefModDate() {
		return this.vefModDate;
	}

	public void setVefModDate(Date vefModDate) {
		this.vefModDate = vefModDate;
	}

	public String getVefUser1() {
		return this.vefUser1;
	}

	public void setVefUser1(String vefUser1) {
		this.vefUser1 = vefUser1;
	}

	public String getVefUser2() {
		return this.vefUser2;
	}

	public void setVefUser2(String vefUser2) {
		this.vefUser2 = vefUser2;
	}

	public String getVefUser3() {
		return this.vefUser3;
	}

	public void setVefUser3(String vefUser3) {
		this.vefUser3 = vefUser3;
	}

	public String getVefUser4() {
		return this.vefUser4;
	}

	public void setVefUser4(String vefUser4) {
		this.vefUser4 = vefUser4;
	}

	public String getVefQadc01() {
		return this.vefQadc01;
	}

	public void setVefQadc01(String vefQadc01) {
		this.vefQadc01 = vefQadc01;
	}

	public String getVefQadc02() {
		return this.vefQadc02;
	}

	public void setVefQadc02(String vefQadc02) {
		this.vefQadc02 = vefQadc02;
	}

	public String getVefQadc03() {
		return this.vefQadc03;
	}

	public void setVefQadc03(String vefQadc03) {
		this.vefQadc03 = vefQadc03;
	}

	public String getVefQadc04() {
		return this.vefQadc04;
	}

	public void setVefQadc04(String vefQadc04) {
		this.vefQadc04 = vefQadc04;
	}

	public Double getVefQadd01() {
		return this.vefQadd01;
	}

	public void setVefQadd01(Double vefQadd01) {
		this.vefQadd01 = vefQadd01;
	}

	public Double getVefQadd02() {
		return this.vefQadd02;
	}

	public void setVefQadd02(Double vefQadd02) {
		this.vefQadd02 = vefQadd02;
	}

	public Boolean getVefQadl01() {
		return this.vefQadl01;
	}

	public void setVefQadl01(Boolean vefQadl01) {
		this.vefQadl01 = vefQadl01;
	}

	public Boolean getVefQadl02() {
		return this.vefQadl02;
	}

	public void setVefQadl02(Boolean vefQadl02) {
		this.vefQadl02 = vefQadl02;
	}

	public Date getVefQadt01() {
		return this.vefQadt01;
	}

	public void setVefQadt01(Date vefQadt01) {
		this.vefQadt01 = vefQadt01;
	}

	public Date getVefQadt02() {
		return this.vefQadt02;
	}

	public void setVefQadt02(Date vefQadt02) {
		this.vefQadt02 = vefQadt02;
	}

	public Integer getVefQadi01() {
		return this.vefQadi01;
	}

	public void setVefQadi01(Integer vefQadi01) {
		this.vefQadi01 = vefQadi01;
	}

	public Integer getVefQadi02() {
		return this.vefQadi02;
	}

	public void setVefQadi02(Integer vefQadi02) {
		this.vefQadi02 = vefQadi02;
	}

	public Double getOidVefCtrl() {
		return this.oidVefCtrl;
	}

	public void setOidVefCtrl(Double oidVefCtrl) {
		this.oidVefCtrl = oidVefCtrl;
	}

}