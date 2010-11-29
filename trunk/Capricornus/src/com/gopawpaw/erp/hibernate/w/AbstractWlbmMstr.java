package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlbmMstr entity provides the base persistence definition of the
 * WlbmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlbmMstr implements java.io.Serializable {

	// Fields

	private WlbmMstrId id;
	private Boolean wlbmTrcComps;
	private Boolean wlbmTrcRef;
	private Boolean wlbmCompCmbOk;
	private Date wlbmEnd;
	private Date wlbmModDate;
	private String wlbmModUserid;
	private String wlbmQadc01;
	private String wlbmQadc02;
	private String wlbmQadc03;
	private String wlbmQadc04;
	private Double wlbmQadd01;
	private Double wlbmQadd02;
	private Integer wlbmQadi01;
	private Integer wlbmQadi02;
	private Boolean wlbmQadl01;
	private Boolean wlbmQadl02;
	private Date wlbmQadt01;
	private Date wlbmQadt02;
	private String wlbmChr01;
	private String wlbmChr02;
	private String wlbmChr03;
	private String wlbmChr04;
	private Double wlbmDec01;
	private Double wlbmDec02;
	private Integer wlbmInt01;
	private Integer wlbmInt02;
	private Boolean wlbmLog01;
	private Boolean wlbmLog02;
	private Date wlbmDte01;
	private Date wlbmDte02;
	private String wlbmUser1;
	private String wlbmUser2;
	private Double oidWlbmMstr;

	// Constructors

	/** default constructor */
	public AbstractWlbmMstr() {
	}

	/** minimal constructor */
	public AbstractWlbmMstr(WlbmMstrId id, Double oidWlbmMstr) {
		this.id = id;
		this.oidWlbmMstr = oidWlbmMstr;
	}

	/** full constructor */
	public AbstractWlbmMstr(WlbmMstrId id, Boolean wlbmTrcComps,
			Boolean wlbmTrcRef, Boolean wlbmCompCmbOk, Date wlbmEnd,
			Date wlbmModDate, String wlbmModUserid, String wlbmQadc01,
			String wlbmQadc02, String wlbmQadc03, String wlbmQadc04,
			Double wlbmQadd01, Double wlbmQadd02, Integer wlbmQadi01,
			Integer wlbmQadi02, Boolean wlbmQadl01, Boolean wlbmQadl02,
			Date wlbmQadt01, Date wlbmQadt02, String wlbmChr01,
			String wlbmChr02, String wlbmChr03, String wlbmChr04,
			Double wlbmDec01, Double wlbmDec02, Integer wlbmInt01,
			Integer wlbmInt02, Boolean wlbmLog01, Boolean wlbmLog02,
			Date wlbmDte01, Date wlbmDte02, String wlbmUser1, String wlbmUser2,
			Double oidWlbmMstr) {
		this.id = id;
		this.wlbmTrcComps = wlbmTrcComps;
		this.wlbmTrcRef = wlbmTrcRef;
		this.wlbmCompCmbOk = wlbmCompCmbOk;
		this.wlbmEnd = wlbmEnd;
		this.wlbmModDate = wlbmModDate;
		this.wlbmModUserid = wlbmModUserid;
		this.wlbmQadc01 = wlbmQadc01;
		this.wlbmQadc02 = wlbmQadc02;
		this.wlbmQadc03 = wlbmQadc03;
		this.wlbmQadc04 = wlbmQadc04;
		this.wlbmQadd01 = wlbmQadd01;
		this.wlbmQadd02 = wlbmQadd02;
		this.wlbmQadi01 = wlbmQadi01;
		this.wlbmQadi02 = wlbmQadi02;
		this.wlbmQadl01 = wlbmQadl01;
		this.wlbmQadl02 = wlbmQadl02;
		this.wlbmQadt01 = wlbmQadt01;
		this.wlbmQadt02 = wlbmQadt02;
		this.wlbmChr01 = wlbmChr01;
		this.wlbmChr02 = wlbmChr02;
		this.wlbmChr03 = wlbmChr03;
		this.wlbmChr04 = wlbmChr04;
		this.wlbmDec01 = wlbmDec01;
		this.wlbmDec02 = wlbmDec02;
		this.wlbmInt01 = wlbmInt01;
		this.wlbmInt02 = wlbmInt02;
		this.wlbmLog01 = wlbmLog01;
		this.wlbmLog02 = wlbmLog02;
		this.wlbmDte01 = wlbmDte01;
		this.wlbmDte02 = wlbmDte02;
		this.wlbmUser1 = wlbmUser1;
		this.wlbmUser2 = wlbmUser2;
		this.oidWlbmMstr = oidWlbmMstr;
	}

	// Property accessors

	public WlbmMstrId getId() {
		return this.id;
	}

	public void setId(WlbmMstrId id) {
		this.id = id;
	}

	public Boolean getWlbmTrcComps() {
		return this.wlbmTrcComps;
	}

	public void setWlbmTrcComps(Boolean wlbmTrcComps) {
		this.wlbmTrcComps = wlbmTrcComps;
	}

	public Boolean getWlbmTrcRef() {
		return this.wlbmTrcRef;
	}

	public void setWlbmTrcRef(Boolean wlbmTrcRef) {
		this.wlbmTrcRef = wlbmTrcRef;
	}

	public Boolean getWlbmCompCmbOk() {
		return this.wlbmCompCmbOk;
	}

	public void setWlbmCompCmbOk(Boolean wlbmCompCmbOk) {
		this.wlbmCompCmbOk = wlbmCompCmbOk;
	}

	public Date getWlbmEnd() {
		return this.wlbmEnd;
	}

	public void setWlbmEnd(Date wlbmEnd) {
		this.wlbmEnd = wlbmEnd;
	}

	public Date getWlbmModDate() {
		return this.wlbmModDate;
	}

	public void setWlbmModDate(Date wlbmModDate) {
		this.wlbmModDate = wlbmModDate;
	}

	public String getWlbmModUserid() {
		return this.wlbmModUserid;
	}

	public void setWlbmModUserid(String wlbmModUserid) {
		this.wlbmModUserid = wlbmModUserid;
	}

	public String getWlbmQadc01() {
		return this.wlbmQadc01;
	}

	public void setWlbmQadc01(String wlbmQadc01) {
		this.wlbmQadc01 = wlbmQadc01;
	}

	public String getWlbmQadc02() {
		return this.wlbmQadc02;
	}

	public void setWlbmQadc02(String wlbmQadc02) {
		this.wlbmQadc02 = wlbmQadc02;
	}

	public String getWlbmQadc03() {
		return this.wlbmQadc03;
	}

	public void setWlbmQadc03(String wlbmQadc03) {
		this.wlbmQadc03 = wlbmQadc03;
	}

	public String getWlbmQadc04() {
		return this.wlbmQadc04;
	}

	public void setWlbmQadc04(String wlbmQadc04) {
		this.wlbmQadc04 = wlbmQadc04;
	}

	public Double getWlbmQadd01() {
		return this.wlbmQadd01;
	}

	public void setWlbmQadd01(Double wlbmQadd01) {
		this.wlbmQadd01 = wlbmQadd01;
	}

	public Double getWlbmQadd02() {
		return this.wlbmQadd02;
	}

	public void setWlbmQadd02(Double wlbmQadd02) {
		this.wlbmQadd02 = wlbmQadd02;
	}

	public Integer getWlbmQadi01() {
		return this.wlbmQadi01;
	}

	public void setWlbmQadi01(Integer wlbmQadi01) {
		this.wlbmQadi01 = wlbmQadi01;
	}

	public Integer getWlbmQadi02() {
		return this.wlbmQadi02;
	}

	public void setWlbmQadi02(Integer wlbmQadi02) {
		this.wlbmQadi02 = wlbmQadi02;
	}

	public Boolean getWlbmQadl01() {
		return this.wlbmQadl01;
	}

	public void setWlbmQadl01(Boolean wlbmQadl01) {
		this.wlbmQadl01 = wlbmQadl01;
	}

	public Boolean getWlbmQadl02() {
		return this.wlbmQadl02;
	}

	public void setWlbmQadl02(Boolean wlbmQadl02) {
		this.wlbmQadl02 = wlbmQadl02;
	}

	public Date getWlbmQadt01() {
		return this.wlbmQadt01;
	}

	public void setWlbmQadt01(Date wlbmQadt01) {
		this.wlbmQadt01 = wlbmQadt01;
	}

	public Date getWlbmQadt02() {
		return this.wlbmQadt02;
	}

	public void setWlbmQadt02(Date wlbmQadt02) {
		this.wlbmQadt02 = wlbmQadt02;
	}

	public String getWlbmChr01() {
		return this.wlbmChr01;
	}

	public void setWlbmChr01(String wlbmChr01) {
		this.wlbmChr01 = wlbmChr01;
	}

	public String getWlbmChr02() {
		return this.wlbmChr02;
	}

	public void setWlbmChr02(String wlbmChr02) {
		this.wlbmChr02 = wlbmChr02;
	}

	public String getWlbmChr03() {
		return this.wlbmChr03;
	}

	public void setWlbmChr03(String wlbmChr03) {
		this.wlbmChr03 = wlbmChr03;
	}

	public String getWlbmChr04() {
		return this.wlbmChr04;
	}

	public void setWlbmChr04(String wlbmChr04) {
		this.wlbmChr04 = wlbmChr04;
	}

	public Double getWlbmDec01() {
		return this.wlbmDec01;
	}

	public void setWlbmDec01(Double wlbmDec01) {
		this.wlbmDec01 = wlbmDec01;
	}

	public Double getWlbmDec02() {
		return this.wlbmDec02;
	}

	public void setWlbmDec02(Double wlbmDec02) {
		this.wlbmDec02 = wlbmDec02;
	}

	public Integer getWlbmInt01() {
		return this.wlbmInt01;
	}

	public void setWlbmInt01(Integer wlbmInt01) {
		this.wlbmInt01 = wlbmInt01;
	}

	public Integer getWlbmInt02() {
		return this.wlbmInt02;
	}

	public void setWlbmInt02(Integer wlbmInt02) {
		this.wlbmInt02 = wlbmInt02;
	}

	public Boolean getWlbmLog01() {
		return this.wlbmLog01;
	}

	public void setWlbmLog01(Boolean wlbmLog01) {
		this.wlbmLog01 = wlbmLog01;
	}

	public Boolean getWlbmLog02() {
		return this.wlbmLog02;
	}

	public void setWlbmLog02(Boolean wlbmLog02) {
		this.wlbmLog02 = wlbmLog02;
	}

	public Date getWlbmDte01() {
		return this.wlbmDte01;
	}

	public void setWlbmDte01(Date wlbmDte01) {
		this.wlbmDte01 = wlbmDte01;
	}

	public Date getWlbmDte02() {
		return this.wlbmDte02;
	}

	public void setWlbmDte02(Date wlbmDte02) {
		this.wlbmDte02 = wlbmDte02;
	}

	public String getWlbmUser1() {
		return this.wlbmUser1;
	}

	public void setWlbmUser1(String wlbmUser1) {
		this.wlbmUser1 = wlbmUser1;
	}

	public String getWlbmUser2() {
		return this.wlbmUser2;
	}

	public void setWlbmUser2(String wlbmUser2) {
		this.wlbmUser2 = wlbmUser2;
	}

	public Double getOidWlbmMstr() {
		return this.oidWlbmMstr;
	}

	public void setOidWlbmMstr(Double oidWlbmMstr) {
		this.oidWlbmMstr = oidWlbmMstr;
	}

}