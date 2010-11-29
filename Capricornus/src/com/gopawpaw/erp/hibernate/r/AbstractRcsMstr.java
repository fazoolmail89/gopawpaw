package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRcsMstr entity provides the base persistence definition of the
 * RcsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcsMstr implements java.io.Serializable {

	// Fields

	private RcsMstrId id;
	private Date rcsCrDate;
	private String rcsCrTime;
	private Boolean rcsCumulative;
	private Boolean rcsDateType;
	private Date rcsActiveStart;
	private Date rcsActiveEnd;
	private Boolean rcsActive;
	private Date rcsActiveDate;
	private Boolean rcsPackingOrder;
	private Integer rcsSeqPerContainer;
	private Boolean rcsCheckSeqTol;
	private Integer rcsMaxTol;
	private String rcsModUserid;
	private Date rcsModDate;
	private String rcsModPgm;
	private String rcsUser1;
	private String rcsUser2;
	private String rcsQadc01;
	private String rcsQadc02;
	private Double rcsQadd01;
	private Double rcsQadd02;
	private Integer rcsQadi01;
	private Integer rcsQadi02;
	private Boolean rcsQadl01;
	private Boolean rcsQadl02;
	private Date rcsQadt01;
	private Date rcsQadt02;
	private Double oidRcsMstr;

	// Constructors

	/** default constructor */
	public AbstractRcsMstr() {
	}

	/** minimal constructor */
	public AbstractRcsMstr(RcsMstrId id, Double oidRcsMstr) {
		this.id = id;
		this.oidRcsMstr = oidRcsMstr;
	}

	/** full constructor */
	public AbstractRcsMstr(RcsMstrId id, Date rcsCrDate, String rcsCrTime,
			Boolean rcsCumulative, Boolean rcsDateType, Date rcsActiveStart,
			Date rcsActiveEnd, Boolean rcsActive, Date rcsActiveDate,
			Boolean rcsPackingOrder, Integer rcsSeqPerContainer,
			Boolean rcsCheckSeqTol, Integer rcsMaxTol, String rcsModUserid,
			Date rcsModDate, String rcsModPgm, String rcsUser1,
			String rcsUser2, String rcsQadc01, String rcsQadc02,
			Double rcsQadd01, Double rcsQadd02, Integer rcsQadi01,
			Integer rcsQadi02, Boolean rcsQadl01, Boolean rcsQadl02,
			Date rcsQadt01, Date rcsQadt02, Double oidRcsMstr) {
		this.id = id;
		this.rcsCrDate = rcsCrDate;
		this.rcsCrTime = rcsCrTime;
		this.rcsCumulative = rcsCumulative;
		this.rcsDateType = rcsDateType;
		this.rcsActiveStart = rcsActiveStart;
		this.rcsActiveEnd = rcsActiveEnd;
		this.rcsActive = rcsActive;
		this.rcsActiveDate = rcsActiveDate;
		this.rcsPackingOrder = rcsPackingOrder;
		this.rcsSeqPerContainer = rcsSeqPerContainer;
		this.rcsCheckSeqTol = rcsCheckSeqTol;
		this.rcsMaxTol = rcsMaxTol;
		this.rcsModUserid = rcsModUserid;
		this.rcsModDate = rcsModDate;
		this.rcsModPgm = rcsModPgm;
		this.rcsUser1 = rcsUser1;
		this.rcsUser2 = rcsUser2;
		this.rcsQadc01 = rcsQadc01;
		this.rcsQadc02 = rcsQadc02;
		this.rcsQadd01 = rcsQadd01;
		this.rcsQadd02 = rcsQadd02;
		this.rcsQadi01 = rcsQadi01;
		this.rcsQadi02 = rcsQadi02;
		this.rcsQadl01 = rcsQadl01;
		this.rcsQadl02 = rcsQadl02;
		this.rcsQadt01 = rcsQadt01;
		this.rcsQadt02 = rcsQadt02;
		this.oidRcsMstr = oidRcsMstr;
	}

	// Property accessors

	public RcsMstrId getId() {
		return this.id;
	}

	public void setId(RcsMstrId id) {
		this.id = id;
	}

	public Date getRcsCrDate() {
		return this.rcsCrDate;
	}

	public void setRcsCrDate(Date rcsCrDate) {
		this.rcsCrDate = rcsCrDate;
	}

	public String getRcsCrTime() {
		return this.rcsCrTime;
	}

	public void setRcsCrTime(String rcsCrTime) {
		this.rcsCrTime = rcsCrTime;
	}

	public Boolean getRcsCumulative() {
		return this.rcsCumulative;
	}

	public void setRcsCumulative(Boolean rcsCumulative) {
		this.rcsCumulative = rcsCumulative;
	}

	public Boolean getRcsDateType() {
		return this.rcsDateType;
	}

	public void setRcsDateType(Boolean rcsDateType) {
		this.rcsDateType = rcsDateType;
	}

	public Date getRcsActiveStart() {
		return this.rcsActiveStart;
	}

	public void setRcsActiveStart(Date rcsActiveStart) {
		this.rcsActiveStart = rcsActiveStart;
	}

	public Date getRcsActiveEnd() {
		return this.rcsActiveEnd;
	}

	public void setRcsActiveEnd(Date rcsActiveEnd) {
		this.rcsActiveEnd = rcsActiveEnd;
	}

	public Boolean getRcsActive() {
		return this.rcsActive;
	}

	public void setRcsActive(Boolean rcsActive) {
		this.rcsActive = rcsActive;
	}

	public Date getRcsActiveDate() {
		return this.rcsActiveDate;
	}

	public void setRcsActiveDate(Date rcsActiveDate) {
		this.rcsActiveDate = rcsActiveDate;
	}

	public Boolean getRcsPackingOrder() {
		return this.rcsPackingOrder;
	}

	public void setRcsPackingOrder(Boolean rcsPackingOrder) {
		this.rcsPackingOrder = rcsPackingOrder;
	}

	public Integer getRcsSeqPerContainer() {
		return this.rcsSeqPerContainer;
	}

	public void setRcsSeqPerContainer(Integer rcsSeqPerContainer) {
		this.rcsSeqPerContainer = rcsSeqPerContainer;
	}

	public Boolean getRcsCheckSeqTol() {
		return this.rcsCheckSeqTol;
	}

	public void setRcsCheckSeqTol(Boolean rcsCheckSeqTol) {
		this.rcsCheckSeqTol = rcsCheckSeqTol;
	}

	public Integer getRcsMaxTol() {
		return this.rcsMaxTol;
	}

	public void setRcsMaxTol(Integer rcsMaxTol) {
		this.rcsMaxTol = rcsMaxTol;
	}

	public String getRcsModUserid() {
		return this.rcsModUserid;
	}

	public void setRcsModUserid(String rcsModUserid) {
		this.rcsModUserid = rcsModUserid;
	}

	public Date getRcsModDate() {
		return this.rcsModDate;
	}

	public void setRcsModDate(Date rcsModDate) {
		this.rcsModDate = rcsModDate;
	}

	public String getRcsModPgm() {
		return this.rcsModPgm;
	}

	public void setRcsModPgm(String rcsModPgm) {
		this.rcsModPgm = rcsModPgm;
	}

	public String getRcsUser1() {
		return this.rcsUser1;
	}

	public void setRcsUser1(String rcsUser1) {
		this.rcsUser1 = rcsUser1;
	}

	public String getRcsUser2() {
		return this.rcsUser2;
	}

	public void setRcsUser2(String rcsUser2) {
		this.rcsUser2 = rcsUser2;
	}

	public String getRcsQadc01() {
		return this.rcsQadc01;
	}

	public void setRcsQadc01(String rcsQadc01) {
		this.rcsQadc01 = rcsQadc01;
	}

	public String getRcsQadc02() {
		return this.rcsQadc02;
	}

	public void setRcsQadc02(String rcsQadc02) {
		this.rcsQadc02 = rcsQadc02;
	}

	public Double getRcsQadd01() {
		return this.rcsQadd01;
	}

	public void setRcsQadd01(Double rcsQadd01) {
		this.rcsQadd01 = rcsQadd01;
	}

	public Double getRcsQadd02() {
		return this.rcsQadd02;
	}

	public void setRcsQadd02(Double rcsQadd02) {
		this.rcsQadd02 = rcsQadd02;
	}

	public Integer getRcsQadi01() {
		return this.rcsQadi01;
	}

	public void setRcsQadi01(Integer rcsQadi01) {
		this.rcsQadi01 = rcsQadi01;
	}

	public Integer getRcsQadi02() {
		return this.rcsQadi02;
	}

	public void setRcsQadi02(Integer rcsQadi02) {
		this.rcsQadi02 = rcsQadi02;
	}

	public Boolean getRcsQadl01() {
		return this.rcsQadl01;
	}

	public void setRcsQadl01(Boolean rcsQadl01) {
		this.rcsQadl01 = rcsQadl01;
	}

	public Boolean getRcsQadl02() {
		return this.rcsQadl02;
	}

	public void setRcsQadl02(Boolean rcsQadl02) {
		this.rcsQadl02 = rcsQadl02;
	}

	public Date getRcsQadt01() {
		return this.rcsQadt01;
	}

	public void setRcsQadt01(Date rcsQadt01) {
		this.rcsQadt01 = rcsQadt01;
	}

	public Date getRcsQadt02() {
		return this.rcsQadt02;
	}

	public void setRcsQadt02(Date rcsQadt02) {
		this.rcsQadt02 = rcsQadt02;
	}

	public Double getOidRcsMstr() {
		return this.oidRcsMstr;
	}

	public void setOidRcsMstr(Double oidRcsMstr) {
		this.oidRcsMstr = oidRcsMstr;
	}

}