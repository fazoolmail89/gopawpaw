package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGriMstr entity provides the base persistence definition of the
 * GriMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGriMstr implements java.io.Serializable {

	// Fields

	private GriMstrId id;
	private Date griDate;
	private String griUserid;
	private String griDefprt;
	private Integer griMrgBot;
	private Integer griMrgLeft;
	private String griTime;
	private Integer griLabBc;
	private String griFormat;
	private String griRound;
	private Boolean griStatus;
	private Boolean griPrtWrk;
	private Integer griPer;
	private Integer griYear;
	private Integer griMrgRight;
	private Integer griMrgTop;
	private String griTextIx;
	private String griOvrCode;
	private String griOvrType;
	private Integer griLabWidth;
	private String griZeroSuppress;
	private Boolean griContPg;
	private Boolean griFiltered;
	private Boolean griPaginated;
	private String griDesc;
	private String griUser1;
	private String griUser2;
	private String griQadc01;
	private Double oidGriMstr;

	// Constructors

	/** default constructor */
	public AbstractGriMstr() {
	}

	/** minimal constructor */
	public AbstractGriMstr(GriMstrId id, Double oidGriMstr) {
		this.id = id;
		this.oidGriMstr = oidGriMstr;
	}

	/** full constructor */
	public AbstractGriMstr(GriMstrId id, Date griDate, String griUserid,
			String griDefprt, Integer griMrgBot, Integer griMrgLeft,
			String griTime, Integer griLabBc, String griFormat,
			String griRound, Boolean griStatus, Boolean griPrtWrk,
			Integer griPer, Integer griYear, Integer griMrgRight,
			Integer griMrgTop, String griTextIx, String griOvrCode,
			String griOvrType, Integer griLabWidth, String griZeroSuppress,
			Boolean griContPg, Boolean griFiltered, Boolean griPaginated,
			String griDesc, String griUser1, String griUser2, String griQadc01,
			Double oidGriMstr) {
		this.id = id;
		this.griDate = griDate;
		this.griUserid = griUserid;
		this.griDefprt = griDefprt;
		this.griMrgBot = griMrgBot;
		this.griMrgLeft = griMrgLeft;
		this.griTime = griTime;
		this.griLabBc = griLabBc;
		this.griFormat = griFormat;
		this.griRound = griRound;
		this.griStatus = griStatus;
		this.griPrtWrk = griPrtWrk;
		this.griPer = griPer;
		this.griYear = griYear;
		this.griMrgRight = griMrgRight;
		this.griMrgTop = griMrgTop;
		this.griTextIx = griTextIx;
		this.griOvrCode = griOvrCode;
		this.griOvrType = griOvrType;
		this.griLabWidth = griLabWidth;
		this.griZeroSuppress = griZeroSuppress;
		this.griContPg = griContPg;
		this.griFiltered = griFiltered;
		this.griPaginated = griPaginated;
		this.griDesc = griDesc;
		this.griUser1 = griUser1;
		this.griUser2 = griUser2;
		this.griQadc01 = griQadc01;
		this.oidGriMstr = oidGriMstr;
	}

	// Property accessors

	public GriMstrId getId() {
		return this.id;
	}

	public void setId(GriMstrId id) {
		this.id = id;
	}

	public Date getGriDate() {
		return this.griDate;
	}

	public void setGriDate(Date griDate) {
		this.griDate = griDate;
	}

	public String getGriUserid() {
		return this.griUserid;
	}

	public void setGriUserid(String griUserid) {
		this.griUserid = griUserid;
	}

	public String getGriDefprt() {
		return this.griDefprt;
	}

	public void setGriDefprt(String griDefprt) {
		this.griDefprt = griDefprt;
	}

	public Integer getGriMrgBot() {
		return this.griMrgBot;
	}

	public void setGriMrgBot(Integer griMrgBot) {
		this.griMrgBot = griMrgBot;
	}

	public Integer getGriMrgLeft() {
		return this.griMrgLeft;
	}

	public void setGriMrgLeft(Integer griMrgLeft) {
		this.griMrgLeft = griMrgLeft;
	}

	public String getGriTime() {
		return this.griTime;
	}

	public void setGriTime(String griTime) {
		this.griTime = griTime;
	}

	public Integer getGriLabBc() {
		return this.griLabBc;
	}

	public void setGriLabBc(Integer griLabBc) {
		this.griLabBc = griLabBc;
	}

	public String getGriFormat() {
		return this.griFormat;
	}

	public void setGriFormat(String griFormat) {
		this.griFormat = griFormat;
	}

	public String getGriRound() {
		return this.griRound;
	}

	public void setGriRound(String griRound) {
		this.griRound = griRound;
	}

	public Boolean getGriStatus() {
		return this.griStatus;
	}

	public void setGriStatus(Boolean griStatus) {
		this.griStatus = griStatus;
	}

	public Boolean getGriPrtWrk() {
		return this.griPrtWrk;
	}

	public void setGriPrtWrk(Boolean griPrtWrk) {
		this.griPrtWrk = griPrtWrk;
	}

	public Integer getGriPer() {
		return this.griPer;
	}

	public void setGriPer(Integer griPer) {
		this.griPer = griPer;
	}

	public Integer getGriYear() {
		return this.griYear;
	}

	public void setGriYear(Integer griYear) {
		this.griYear = griYear;
	}

	public Integer getGriMrgRight() {
		return this.griMrgRight;
	}

	public void setGriMrgRight(Integer griMrgRight) {
		this.griMrgRight = griMrgRight;
	}

	public Integer getGriMrgTop() {
		return this.griMrgTop;
	}

	public void setGriMrgTop(Integer griMrgTop) {
		this.griMrgTop = griMrgTop;
	}

	public String getGriTextIx() {
		return this.griTextIx;
	}

	public void setGriTextIx(String griTextIx) {
		this.griTextIx = griTextIx;
	}

	public String getGriOvrCode() {
		return this.griOvrCode;
	}

	public void setGriOvrCode(String griOvrCode) {
		this.griOvrCode = griOvrCode;
	}

	public String getGriOvrType() {
		return this.griOvrType;
	}

	public void setGriOvrType(String griOvrType) {
		this.griOvrType = griOvrType;
	}

	public Integer getGriLabWidth() {
		return this.griLabWidth;
	}

	public void setGriLabWidth(Integer griLabWidth) {
		this.griLabWidth = griLabWidth;
	}

	public String getGriZeroSuppress() {
		return this.griZeroSuppress;
	}

	public void setGriZeroSuppress(String griZeroSuppress) {
		this.griZeroSuppress = griZeroSuppress;
	}

	public Boolean getGriContPg() {
		return this.griContPg;
	}

	public void setGriContPg(Boolean griContPg) {
		this.griContPg = griContPg;
	}

	public Boolean getGriFiltered() {
		return this.griFiltered;
	}

	public void setGriFiltered(Boolean griFiltered) {
		this.griFiltered = griFiltered;
	}

	public Boolean getGriPaginated() {
		return this.griPaginated;
	}

	public void setGriPaginated(Boolean griPaginated) {
		this.griPaginated = griPaginated;
	}

	public String getGriDesc() {
		return this.griDesc;
	}

	public void setGriDesc(String griDesc) {
		this.griDesc = griDesc;
	}

	public String getGriUser1() {
		return this.griUser1;
	}

	public void setGriUser1(String griUser1) {
		this.griUser1 = griUser1;
	}

	public String getGriUser2() {
		return this.griUser2;
	}

	public void setGriUser2(String griUser2) {
		this.griUser2 = griUser2;
	}

	public String getGriQadc01() {
		return this.griQadc01;
	}

	public void setGriQadc01(String griQadc01) {
		this.griQadc01 = griQadc01;
	}

	public Double getOidGriMstr() {
		return this.oidGriMstr;
	}

	public void setOidGriMstr(Double oidGriMstr) {
		this.oidGriMstr = oidGriMstr;
	}

}