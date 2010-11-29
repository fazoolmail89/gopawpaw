package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRscCtrl entity provides the base persistence definition of the
 * RscCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRscCtrl implements java.io.Serializable {

	// Fields

	private String rscDomain;
	private Boolean rscActive;
	private Boolean rscGenShip;
	private Boolean rscAutoUpdate;
	private Boolean rscZeroReq;
	private Integer rscFirmDays;
	private Integer rscShipDays;
	private Integer rscShipWeeks;
	private Integer rscShipMonths;
	private Integer rscFabDays;
	private Integer rscRawDays;
	private String rscUser1;
	private String rscUser2;
	private String rscQadc01;
	private String rscQadc02;
	private Double rscQadd01;
	private Double rscQadd02;
	private Integer rscQadi01;
	private Integer rscQadi02;
	private Boolean rscQadl01;
	private Boolean rscQadl02;
	private Boolean rscQadl03;
	private Boolean rscQadl04;
	private Date rscQadt01;
	private Integer rscQadi03;
	private Double oidRscCtrl;

	// Constructors

	/** default constructor */
	public AbstractRscCtrl() {
	}

	/** minimal constructor */
	public AbstractRscCtrl(Double oidRscCtrl) {
		this.oidRscCtrl = oidRscCtrl;
	}

	/** full constructor */
	public AbstractRscCtrl(Boolean rscActive, Boolean rscGenShip,
			Boolean rscAutoUpdate, Boolean rscZeroReq, Integer rscFirmDays,
			Integer rscShipDays, Integer rscShipWeeks, Integer rscShipMonths,
			Integer rscFabDays, Integer rscRawDays, String rscUser1,
			String rscUser2, String rscQadc01, String rscQadc02,
			Double rscQadd01, Double rscQadd02, Integer rscQadi01,
			Integer rscQadi02, Boolean rscQadl01, Boolean rscQadl02,
			Boolean rscQadl03, Boolean rscQadl04, Date rscQadt01,
			Integer rscQadi03, Double oidRscCtrl) {
		this.rscActive = rscActive;
		this.rscGenShip = rscGenShip;
		this.rscAutoUpdate = rscAutoUpdate;
		this.rscZeroReq = rscZeroReq;
		this.rscFirmDays = rscFirmDays;
		this.rscShipDays = rscShipDays;
		this.rscShipWeeks = rscShipWeeks;
		this.rscShipMonths = rscShipMonths;
		this.rscFabDays = rscFabDays;
		this.rscRawDays = rscRawDays;
		this.rscUser1 = rscUser1;
		this.rscUser2 = rscUser2;
		this.rscQadc01 = rscQadc01;
		this.rscQadc02 = rscQadc02;
		this.rscQadd01 = rscQadd01;
		this.rscQadd02 = rscQadd02;
		this.rscQadi01 = rscQadi01;
		this.rscQadi02 = rscQadi02;
		this.rscQadl01 = rscQadl01;
		this.rscQadl02 = rscQadl02;
		this.rscQadl03 = rscQadl03;
		this.rscQadl04 = rscQadl04;
		this.rscQadt01 = rscQadt01;
		this.rscQadi03 = rscQadi03;
		this.oidRscCtrl = oidRscCtrl;
	}

	// Property accessors

	public String getRscDomain() {
		return this.rscDomain;
	}

	public void setRscDomain(String rscDomain) {
		this.rscDomain = rscDomain;
	}

	public Boolean getRscActive() {
		return this.rscActive;
	}

	public void setRscActive(Boolean rscActive) {
		this.rscActive = rscActive;
	}

	public Boolean getRscGenShip() {
		return this.rscGenShip;
	}

	public void setRscGenShip(Boolean rscGenShip) {
		this.rscGenShip = rscGenShip;
	}

	public Boolean getRscAutoUpdate() {
		return this.rscAutoUpdate;
	}

	public void setRscAutoUpdate(Boolean rscAutoUpdate) {
		this.rscAutoUpdate = rscAutoUpdate;
	}

	public Boolean getRscZeroReq() {
		return this.rscZeroReq;
	}

	public void setRscZeroReq(Boolean rscZeroReq) {
		this.rscZeroReq = rscZeroReq;
	}

	public Integer getRscFirmDays() {
		return this.rscFirmDays;
	}

	public void setRscFirmDays(Integer rscFirmDays) {
		this.rscFirmDays = rscFirmDays;
	}

	public Integer getRscShipDays() {
		return this.rscShipDays;
	}

	public void setRscShipDays(Integer rscShipDays) {
		this.rscShipDays = rscShipDays;
	}

	public Integer getRscShipWeeks() {
		return this.rscShipWeeks;
	}

	public void setRscShipWeeks(Integer rscShipWeeks) {
		this.rscShipWeeks = rscShipWeeks;
	}

	public Integer getRscShipMonths() {
		return this.rscShipMonths;
	}

	public void setRscShipMonths(Integer rscShipMonths) {
		this.rscShipMonths = rscShipMonths;
	}

	public Integer getRscFabDays() {
		return this.rscFabDays;
	}

	public void setRscFabDays(Integer rscFabDays) {
		this.rscFabDays = rscFabDays;
	}

	public Integer getRscRawDays() {
		return this.rscRawDays;
	}

	public void setRscRawDays(Integer rscRawDays) {
		this.rscRawDays = rscRawDays;
	}

	public String getRscUser1() {
		return this.rscUser1;
	}

	public void setRscUser1(String rscUser1) {
		this.rscUser1 = rscUser1;
	}

	public String getRscUser2() {
		return this.rscUser2;
	}

	public void setRscUser2(String rscUser2) {
		this.rscUser2 = rscUser2;
	}

	public String getRscQadc01() {
		return this.rscQadc01;
	}

	public void setRscQadc01(String rscQadc01) {
		this.rscQadc01 = rscQadc01;
	}

	public String getRscQadc02() {
		return this.rscQadc02;
	}

	public void setRscQadc02(String rscQadc02) {
		this.rscQadc02 = rscQadc02;
	}

	public Double getRscQadd01() {
		return this.rscQadd01;
	}

	public void setRscQadd01(Double rscQadd01) {
		this.rscQadd01 = rscQadd01;
	}

	public Double getRscQadd02() {
		return this.rscQadd02;
	}

	public void setRscQadd02(Double rscQadd02) {
		this.rscQadd02 = rscQadd02;
	}

	public Integer getRscQadi01() {
		return this.rscQadi01;
	}

	public void setRscQadi01(Integer rscQadi01) {
		this.rscQadi01 = rscQadi01;
	}

	public Integer getRscQadi02() {
		return this.rscQadi02;
	}

	public void setRscQadi02(Integer rscQadi02) {
		this.rscQadi02 = rscQadi02;
	}

	public Boolean getRscQadl01() {
		return this.rscQadl01;
	}

	public void setRscQadl01(Boolean rscQadl01) {
		this.rscQadl01 = rscQadl01;
	}

	public Boolean getRscQadl02() {
		return this.rscQadl02;
	}

	public void setRscQadl02(Boolean rscQadl02) {
		this.rscQadl02 = rscQadl02;
	}

	public Boolean getRscQadl03() {
		return this.rscQadl03;
	}

	public void setRscQadl03(Boolean rscQadl03) {
		this.rscQadl03 = rscQadl03;
	}

	public Boolean getRscQadl04() {
		return this.rscQadl04;
	}

	public void setRscQadl04(Boolean rscQadl04) {
		this.rscQadl04 = rscQadl04;
	}

	public Date getRscQadt01() {
		return this.rscQadt01;
	}

	public void setRscQadt01(Date rscQadt01) {
		this.rscQadt01 = rscQadt01;
	}

	public Integer getRscQadi03() {
		return this.rscQadi03;
	}

	public void setRscQadi03(Integer rscQadi03) {
		this.rscQadi03 = rscQadi03;
	}

	public Double getOidRscCtrl() {
		return this.oidRscCtrl;
	}

	public void setOidRscCtrl(Double oidRscCtrl) {
		this.oidRscCtrl = oidRscCtrl;
	}

}