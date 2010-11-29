package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEdlgHist entity provides the base persistence definition of the
 * EdlgHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEdlgHist implements java.io.Serializable {

	// Fields

	private EdlgHistId id;
	private Date edlgDateSent;
	private String edlgTimeSent;
	private String edlgErrStat;
	private String edlgModUserid;
	private Date edlgModDate;
	private String edlgUser1;
	private String edlgUser2;
	private String edlgChr01;
	private String edlgChr02;
	private Double edlgDec01;
	private Double edlgDec02;
	private Integer edlgInt01;
	private Integer edlgInt02;
	private Boolean edlgLog01;
	private Boolean edlgLog02;
	private Date edlgDte01;
	private Date edlgDte02;
	private String edlgQadc01;
	private String edlgQadc02;
	private String edlgQadc03;
	private String edlgQadc04;
	private Double edlgQadd01;
	private Double edlgQadd02;
	private Integer edlgQadi01;
	private Integer edlgQadi02;
	private Boolean edlgQadl01;
	private Boolean edlgQadl02;
	private Date edlgQadt01;
	private Date edlgQadt02;
	private Double oidEdlgHist;

	// Constructors

	/** default constructor */
	public AbstractEdlgHist() {
	}

	/** minimal constructor */
	public AbstractEdlgHist(EdlgHistId id, Double oidEdlgHist) {
		this.id = id;
		this.oidEdlgHist = oidEdlgHist;
	}

	/** full constructor */
	public AbstractEdlgHist(EdlgHistId id, Date edlgDateSent,
			String edlgTimeSent, String edlgErrStat, String edlgModUserid,
			Date edlgModDate, String edlgUser1, String edlgUser2,
			String edlgChr01, String edlgChr02, Double edlgDec01,
			Double edlgDec02, Integer edlgInt01, Integer edlgInt02,
			Boolean edlgLog01, Boolean edlgLog02, Date edlgDte01,
			Date edlgDte02, String edlgQadc01, String edlgQadc02,
			String edlgQadc03, String edlgQadc04, Double edlgQadd01,
			Double edlgQadd02, Integer edlgQadi01, Integer edlgQadi02,
			Boolean edlgQadl01, Boolean edlgQadl02, Date edlgQadt01,
			Date edlgQadt02, Double oidEdlgHist) {
		this.id = id;
		this.edlgDateSent = edlgDateSent;
		this.edlgTimeSent = edlgTimeSent;
		this.edlgErrStat = edlgErrStat;
		this.edlgModUserid = edlgModUserid;
		this.edlgModDate = edlgModDate;
		this.edlgUser1 = edlgUser1;
		this.edlgUser2 = edlgUser2;
		this.edlgChr01 = edlgChr01;
		this.edlgChr02 = edlgChr02;
		this.edlgDec01 = edlgDec01;
		this.edlgDec02 = edlgDec02;
		this.edlgInt01 = edlgInt01;
		this.edlgInt02 = edlgInt02;
		this.edlgLog01 = edlgLog01;
		this.edlgLog02 = edlgLog02;
		this.edlgDte01 = edlgDte01;
		this.edlgDte02 = edlgDte02;
		this.edlgQadc01 = edlgQadc01;
		this.edlgQadc02 = edlgQadc02;
		this.edlgQadc03 = edlgQadc03;
		this.edlgQadc04 = edlgQadc04;
		this.edlgQadd01 = edlgQadd01;
		this.edlgQadd02 = edlgQadd02;
		this.edlgQadi01 = edlgQadi01;
		this.edlgQadi02 = edlgQadi02;
		this.edlgQadl01 = edlgQadl01;
		this.edlgQadl02 = edlgQadl02;
		this.edlgQadt01 = edlgQadt01;
		this.edlgQadt02 = edlgQadt02;
		this.oidEdlgHist = oidEdlgHist;
	}

	// Property accessors

	public EdlgHistId getId() {
		return this.id;
	}

	public void setId(EdlgHistId id) {
		this.id = id;
	}

	public Date getEdlgDateSent() {
		return this.edlgDateSent;
	}

	public void setEdlgDateSent(Date edlgDateSent) {
		this.edlgDateSent = edlgDateSent;
	}

	public String getEdlgTimeSent() {
		return this.edlgTimeSent;
	}

	public void setEdlgTimeSent(String edlgTimeSent) {
		this.edlgTimeSent = edlgTimeSent;
	}

	public String getEdlgErrStat() {
		return this.edlgErrStat;
	}

	public void setEdlgErrStat(String edlgErrStat) {
		this.edlgErrStat = edlgErrStat;
	}

	public String getEdlgModUserid() {
		return this.edlgModUserid;
	}

	public void setEdlgModUserid(String edlgModUserid) {
		this.edlgModUserid = edlgModUserid;
	}

	public Date getEdlgModDate() {
		return this.edlgModDate;
	}

	public void setEdlgModDate(Date edlgModDate) {
		this.edlgModDate = edlgModDate;
	}

	public String getEdlgUser1() {
		return this.edlgUser1;
	}

	public void setEdlgUser1(String edlgUser1) {
		this.edlgUser1 = edlgUser1;
	}

	public String getEdlgUser2() {
		return this.edlgUser2;
	}

	public void setEdlgUser2(String edlgUser2) {
		this.edlgUser2 = edlgUser2;
	}

	public String getEdlgChr01() {
		return this.edlgChr01;
	}

	public void setEdlgChr01(String edlgChr01) {
		this.edlgChr01 = edlgChr01;
	}

	public String getEdlgChr02() {
		return this.edlgChr02;
	}

	public void setEdlgChr02(String edlgChr02) {
		this.edlgChr02 = edlgChr02;
	}

	public Double getEdlgDec01() {
		return this.edlgDec01;
	}

	public void setEdlgDec01(Double edlgDec01) {
		this.edlgDec01 = edlgDec01;
	}

	public Double getEdlgDec02() {
		return this.edlgDec02;
	}

	public void setEdlgDec02(Double edlgDec02) {
		this.edlgDec02 = edlgDec02;
	}

	public Integer getEdlgInt01() {
		return this.edlgInt01;
	}

	public void setEdlgInt01(Integer edlgInt01) {
		this.edlgInt01 = edlgInt01;
	}

	public Integer getEdlgInt02() {
		return this.edlgInt02;
	}

	public void setEdlgInt02(Integer edlgInt02) {
		this.edlgInt02 = edlgInt02;
	}

	public Boolean getEdlgLog01() {
		return this.edlgLog01;
	}

	public void setEdlgLog01(Boolean edlgLog01) {
		this.edlgLog01 = edlgLog01;
	}

	public Boolean getEdlgLog02() {
		return this.edlgLog02;
	}

	public void setEdlgLog02(Boolean edlgLog02) {
		this.edlgLog02 = edlgLog02;
	}

	public Date getEdlgDte01() {
		return this.edlgDte01;
	}

	public void setEdlgDte01(Date edlgDte01) {
		this.edlgDte01 = edlgDte01;
	}

	public Date getEdlgDte02() {
		return this.edlgDte02;
	}

	public void setEdlgDte02(Date edlgDte02) {
		this.edlgDte02 = edlgDte02;
	}

	public String getEdlgQadc01() {
		return this.edlgQadc01;
	}

	public void setEdlgQadc01(String edlgQadc01) {
		this.edlgQadc01 = edlgQadc01;
	}

	public String getEdlgQadc02() {
		return this.edlgQadc02;
	}

	public void setEdlgQadc02(String edlgQadc02) {
		this.edlgQadc02 = edlgQadc02;
	}

	public String getEdlgQadc03() {
		return this.edlgQadc03;
	}

	public void setEdlgQadc03(String edlgQadc03) {
		this.edlgQadc03 = edlgQadc03;
	}

	public String getEdlgQadc04() {
		return this.edlgQadc04;
	}

	public void setEdlgQadc04(String edlgQadc04) {
		this.edlgQadc04 = edlgQadc04;
	}

	public Double getEdlgQadd01() {
		return this.edlgQadd01;
	}

	public void setEdlgQadd01(Double edlgQadd01) {
		this.edlgQadd01 = edlgQadd01;
	}

	public Double getEdlgQadd02() {
		return this.edlgQadd02;
	}

	public void setEdlgQadd02(Double edlgQadd02) {
		this.edlgQadd02 = edlgQadd02;
	}

	public Integer getEdlgQadi01() {
		return this.edlgQadi01;
	}

	public void setEdlgQadi01(Integer edlgQadi01) {
		this.edlgQadi01 = edlgQadi01;
	}

	public Integer getEdlgQadi02() {
		return this.edlgQadi02;
	}

	public void setEdlgQadi02(Integer edlgQadi02) {
		this.edlgQadi02 = edlgQadi02;
	}

	public Boolean getEdlgQadl01() {
		return this.edlgQadl01;
	}

	public void setEdlgQadl01(Boolean edlgQadl01) {
		this.edlgQadl01 = edlgQadl01;
	}

	public Boolean getEdlgQadl02() {
		return this.edlgQadl02;
	}

	public void setEdlgQadl02(Boolean edlgQadl02) {
		this.edlgQadl02 = edlgQadl02;
	}

	public Date getEdlgQadt01() {
		return this.edlgQadt01;
	}

	public void setEdlgQadt01(Date edlgQadt01) {
		this.edlgQadt01 = edlgQadt01;
	}

	public Date getEdlgQadt02() {
		return this.edlgQadt02;
	}

	public void setEdlgQadt02(Date edlgQadt02) {
		this.edlgQadt02 = edlgQadt02;
	}

	public Double getOidEdlgHist() {
		return this.oidEdlgHist;
	}

	public void setOidEdlgHist(Double oidEdlgHist) {
		this.oidEdlgHist = oidEdlgHist;
	}

}