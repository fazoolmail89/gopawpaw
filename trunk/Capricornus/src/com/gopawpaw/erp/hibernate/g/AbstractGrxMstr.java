package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGrxMstr entity provides the base persistence definition of the
 * GrxMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrxMstr implements java.io.Serializable {

	// Fields

	private GrxMstrId id;
	private String grxDesc;
	private String grxAddId;
	private Date grxAddDate;
	private String grxModId;
	private Date grxModDate;
	private String grxRpGroup;
	private Boolean grxStatus;
	private Integer grxCmtindx;
	private String grxRowGroup;
	private String grxColGroup;
	private String grxRound;
	private String grxFormat;
	private String grxDefprt;
	private Integer grxMrgTop;
	private Integer grxMrgBot;
	private String grxUser1;
	private String grxUser2;
	private Integer grxLabBc;
	private String grxMtGroup;
	private String grxCtlGl;
	private String grxCtlAc;
	private Boolean grxContPg;
	private Integer grxMrgLeft;
	private Integer grxMrgRight;
	private String grxTextIx;
	private String grxZeroSuppress;
	private String grxQadc01;
	private Double oidGrxMstr;

	// Constructors

	/** default constructor */
	public AbstractGrxMstr() {
	}

	/** minimal constructor */
	public AbstractGrxMstr(GrxMstrId id, Double oidGrxMstr) {
		this.id = id;
		this.oidGrxMstr = oidGrxMstr;
	}

	/** full constructor */
	public AbstractGrxMstr(GrxMstrId id, String grxDesc, String grxAddId,
			Date grxAddDate, String grxModId, Date grxModDate,
			String grxRpGroup, Boolean grxStatus, Integer grxCmtindx,
			String grxRowGroup, String grxColGroup, String grxRound,
			String grxFormat, String grxDefprt, Integer grxMrgTop,
			Integer grxMrgBot, String grxUser1, String grxUser2,
			Integer grxLabBc, String grxMtGroup, String grxCtlGl,
			String grxCtlAc, Boolean grxContPg, Integer grxMrgLeft,
			Integer grxMrgRight, String grxTextIx, String grxZeroSuppress,
			String grxQadc01, Double oidGrxMstr) {
		this.id = id;
		this.grxDesc = grxDesc;
		this.grxAddId = grxAddId;
		this.grxAddDate = grxAddDate;
		this.grxModId = grxModId;
		this.grxModDate = grxModDate;
		this.grxRpGroup = grxRpGroup;
		this.grxStatus = grxStatus;
		this.grxCmtindx = grxCmtindx;
		this.grxRowGroup = grxRowGroup;
		this.grxColGroup = grxColGroup;
		this.grxRound = grxRound;
		this.grxFormat = grxFormat;
		this.grxDefprt = grxDefprt;
		this.grxMrgTop = grxMrgTop;
		this.grxMrgBot = grxMrgBot;
		this.grxUser1 = grxUser1;
		this.grxUser2 = grxUser2;
		this.grxLabBc = grxLabBc;
		this.grxMtGroup = grxMtGroup;
		this.grxCtlGl = grxCtlGl;
		this.grxCtlAc = grxCtlAc;
		this.grxContPg = grxContPg;
		this.grxMrgLeft = grxMrgLeft;
		this.grxMrgRight = grxMrgRight;
		this.grxTextIx = grxTextIx;
		this.grxZeroSuppress = grxZeroSuppress;
		this.grxQadc01 = grxQadc01;
		this.oidGrxMstr = oidGrxMstr;
	}

	// Property accessors

	public GrxMstrId getId() {
		return this.id;
	}

	public void setId(GrxMstrId id) {
		this.id = id;
	}

	public String getGrxDesc() {
		return this.grxDesc;
	}

	public void setGrxDesc(String grxDesc) {
		this.grxDesc = grxDesc;
	}

	public String getGrxAddId() {
		return this.grxAddId;
	}

	public void setGrxAddId(String grxAddId) {
		this.grxAddId = grxAddId;
	}

	public Date getGrxAddDate() {
		return this.grxAddDate;
	}

	public void setGrxAddDate(Date grxAddDate) {
		this.grxAddDate = grxAddDate;
	}

	public String getGrxModId() {
		return this.grxModId;
	}

	public void setGrxModId(String grxModId) {
		this.grxModId = grxModId;
	}

	public Date getGrxModDate() {
		return this.grxModDate;
	}

	public void setGrxModDate(Date grxModDate) {
		this.grxModDate = grxModDate;
	}

	public String getGrxRpGroup() {
		return this.grxRpGroup;
	}

	public void setGrxRpGroup(String grxRpGroup) {
		this.grxRpGroup = grxRpGroup;
	}

	public Boolean getGrxStatus() {
		return this.grxStatus;
	}

	public void setGrxStatus(Boolean grxStatus) {
		this.grxStatus = grxStatus;
	}

	public Integer getGrxCmtindx() {
		return this.grxCmtindx;
	}

	public void setGrxCmtindx(Integer grxCmtindx) {
		this.grxCmtindx = grxCmtindx;
	}

	public String getGrxRowGroup() {
		return this.grxRowGroup;
	}

	public void setGrxRowGroup(String grxRowGroup) {
		this.grxRowGroup = grxRowGroup;
	}

	public String getGrxColGroup() {
		return this.grxColGroup;
	}

	public void setGrxColGroup(String grxColGroup) {
		this.grxColGroup = grxColGroup;
	}

	public String getGrxRound() {
		return this.grxRound;
	}

	public void setGrxRound(String grxRound) {
		this.grxRound = grxRound;
	}

	public String getGrxFormat() {
		return this.grxFormat;
	}

	public void setGrxFormat(String grxFormat) {
		this.grxFormat = grxFormat;
	}

	public String getGrxDefprt() {
		return this.grxDefprt;
	}

	public void setGrxDefprt(String grxDefprt) {
		this.grxDefprt = grxDefprt;
	}

	public Integer getGrxMrgTop() {
		return this.grxMrgTop;
	}

	public void setGrxMrgTop(Integer grxMrgTop) {
		this.grxMrgTop = grxMrgTop;
	}

	public Integer getGrxMrgBot() {
		return this.grxMrgBot;
	}

	public void setGrxMrgBot(Integer grxMrgBot) {
		this.grxMrgBot = grxMrgBot;
	}

	public String getGrxUser1() {
		return this.grxUser1;
	}

	public void setGrxUser1(String grxUser1) {
		this.grxUser1 = grxUser1;
	}

	public String getGrxUser2() {
		return this.grxUser2;
	}

	public void setGrxUser2(String grxUser2) {
		this.grxUser2 = grxUser2;
	}

	public Integer getGrxLabBc() {
		return this.grxLabBc;
	}

	public void setGrxLabBc(Integer grxLabBc) {
		this.grxLabBc = grxLabBc;
	}

	public String getGrxMtGroup() {
		return this.grxMtGroup;
	}

	public void setGrxMtGroup(String grxMtGroup) {
		this.grxMtGroup = grxMtGroup;
	}

	public String getGrxCtlGl() {
		return this.grxCtlGl;
	}

	public void setGrxCtlGl(String grxCtlGl) {
		this.grxCtlGl = grxCtlGl;
	}

	public String getGrxCtlAc() {
		return this.grxCtlAc;
	}

	public void setGrxCtlAc(String grxCtlAc) {
		this.grxCtlAc = grxCtlAc;
	}

	public Boolean getGrxContPg() {
		return this.grxContPg;
	}

	public void setGrxContPg(Boolean grxContPg) {
		this.grxContPg = grxContPg;
	}

	public Integer getGrxMrgLeft() {
		return this.grxMrgLeft;
	}

	public void setGrxMrgLeft(Integer grxMrgLeft) {
		this.grxMrgLeft = grxMrgLeft;
	}

	public Integer getGrxMrgRight() {
		return this.grxMrgRight;
	}

	public void setGrxMrgRight(Integer grxMrgRight) {
		this.grxMrgRight = grxMrgRight;
	}

	public String getGrxTextIx() {
		return this.grxTextIx;
	}

	public void setGrxTextIx(String grxTextIx) {
		this.grxTextIx = grxTextIx;
	}

	public String getGrxZeroSuppress() {
		return this.grxZeroSuppress;
	}

	public void setGrxZeroSuppress(String grxZeroSuppress) {
		this.grxZeroSuppress = grxZeroSuppress;
	}

	public String getGrxQadc01() {
		return this.grxQadc01;
	}

	public void setGrxQadc01(String grxQadc01) {
		this.grxQadc01 = grxQadc01;
	}

	public Double getOidGrxMstr() {
		return this.oidGrxMstr;
	}

	public void setOidGrxMstr(Double oidGrxMstr) {
		this.oidGrxMstr = oidGrxMstr;
	}

}