package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEmsgMstr entity provides the base persistence definition of the
 * EmsgMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmsgMstr implements java.io.Serializable {

	// Fields

	private EmsgMstrId id;
	private String emsgEngCode;
	private String emsgAction;
	private Date emsgActDate;
	private String emsgDesc;
	private Integer emsgCmtindx;
	private Date emsgDate;
	private String emsgTime;
	private String emsgEntered;
	private String emsgUser1;
	private String emsgUser2;
	private String emsgActTime;
	private Boolean emsgComplete;
	private Date emsgFileDate1;
	private Date emsgFileDate2;
	private String emsgFileName;
	private String emsgFileNbr1;
	private String emsgFileNbr2;
	private String emsgFileNbr3;
	private String emsgFileNbr4;
	private Integer emsgFileTrnbr;
	private String emsgMsgType;
	private String emsgNameDate1;
	private String emsgNameDate2;
	private String emsgNameNbr1;
	private String emsgNameNbr2;
	private String emsgNameNbr3;
	private String emsgNameNbr4;
	private Boolean emsgRead;
	private String emsgUserid;
	private String emsgQadc01;
	private Double oidEmsgMstr;

	// Constructors

	/** default constructor */
	public AbstractEmsgMstr() {
	}

	/** minimal constructor */
	public AbstractEmsgMstr(EmsgMstrId id, Double oidEmsgMstr) {
		this.id = id;
		this.oidEmsgMstr = oidEmsgMstr;
	}

	/** full constructor */
	public AbstractEmsgMstr(EmsgMstrId id, String emsgEngCode,
			String emsgAction, Date emsgActDate, String emsgDesc,
			Integer emsgCmtindx, Date emsgDate, String emsgTime,
			String emsgEntered, String emsgUser1, String emsgUser2,
			String emsgActTime, Boolean emsgComplete, Date emsgFileDate1,
			Date emsgFileDate2, String emsgFileName, String emsgFileNbr1,
			String emsgFileNbr2, String emsgFileNbr3, String emsgFileNbr4,
			Integer emsgFileTrnbr, String emsgMsgType, String emsgNameDate1,
			String emsgNameDate2, String emsgNameNbr1, String emsgNameNbr2,
			String emsgNameNbr3, String emsgNameNbr4, Boolean emsgRead,
			String emsgUserid, String emsgQadc01, Double oidEmsgMstr) {
		this.id = id;
		this.emsgEngCode = emsgEngCode;
		this.emsgAction = emsgAction;
		this.emsgActDate = emsgActDate;
		this.emsgDesc = emsgDesc;
		this.emsgCmtindx = emsgCmtindx;
		this.emsgDate = emsgDate;
		this.emsgTime = emsgTime;
		this.emsgEntered = emsgEntered;
		this.emsgUser1 = emsgUser1;
		this.emsgUser2 = emsgUser2;
		this.emsgActTime = emsgActTime;
		this.emsgComplete = emsgComplete;
		this.emsgFileDate1 = emsgFileDate1;
		this.emsgFileDate2 = emsgFileDate2;
		this.emsgFileName = emsgFileName;
		this.emsgFileNbr1 = emsgFileNbr1;
		this.emsgFileNbr2 = emsgFileNbr2;
		this.emsgFileNbr3 = emsgFileNbr3;
		this.emsgFileNbr4 = emsgFileNbr4;
		this.emsgFileTrnbr = emsgFileTrnbr;
		this.emsgMsgType = emsgMsgType;
		this.emsgNameDate1 = emsgNameDate1;
		this.emsgNameDate2 = emsgNameDate2;
		this.emsgNameNbr1 = emsgNameNbr1;
		this.emsgNameNbr2 = emsgNameNbr2;
		this.emsgNameNbr3 = emsgNameNbr3;
		this.emsgNameNbr4 = emsgNameNbr4;
		this.emsgRead = emsgRead;
		this.emsgUserid = emsgUserid;
		this.emsgQadc01 = emsgQadc01;
		this.oidEmsgMstr = oidEmsgMstr;
	}

	// Property accessors

	public EmsgMstrId getId() {
		return this.id;
	}

	public void setId(EmsgMstrId id) {
		this.id = id;
	}

	public String getEmsgEngCode() {
		return this.emsgEngCode;
	}

	public void setEmsgEngCode(String emsgEngCode) {
		this.emsgEngCode = emsgEngCode;
	}

	public String getEmsgAction() {
		return this.emsgAction;
	}

	public void setEmsgAction(String emsgAction) {
		this.emsgAction = emsgAction;
	}

	public Date getEmsgActDate() {
		return this.emsgActDate;
	}

	public void setEmsgActDate(Date emsgActDate) {
		this.emsgActDate = emsgActDate;
	}

	public String getEmsgDesc() {
		return this.emsgDesc;
	}

	public void setEmsgDesc(String emsgDesc) {
		this.emsgDesc = emsgDesc;
	}

	public Integer getEmsgCmtindx() {
		return this.emsgCmtindx;
	}

	public void setEmsgCmtindx(Integer emsgCmtindx) {
		this.emsgCmtindx = emsgCmtindx;
	}

	public Date getEmsgDate() {
		return this.emsgDate;
	}

	public void setEmsgDate(Date emsgDate) {
		this.emsgDate = emsgDate;
	}

	public String getEmsgTime() {
		return this.emsgTime;
	}

	public void setEmsgTime(String emsgTime) {
		this.emsgTime = emsgTime;
	}

	public String getEmsgEntered() {
		return this.emsgEntered;
	}

	public void setEmsgEntered(String emsgEntered) {
		this.emsgEntered = emsgEntered;
	}

	public String getEmsgUser1() {
		return this.emsgUser1;
	}

	public void setEmsgUser1(String emsgUser1) {
		this.emsgUser1 = emsgUser1;
	}

	public String getEmsgUser2() {
		return this.emsgUser2;
	}

	public void setEmsgUser2(String emsgUser2) {
		this.emsgUser2 = emsgUser2;
	}

	public String getEmsgActTime() {
		return this.emsgActTime;
	}

	public void setEmsgActTime(String emsgActTime) {
		this.emsgActTime = emsgActTime;
	}

	public Boolean getEmsgComplete() {
		return this.emsgComplete;
	}

	public void setEmsgComplete(Boolean emsgComplete) {
		this.emsgComplete = emsgComplete;
	}

	public Date getEmsgFileDate1() {
		return this.emsgFileDate1;
	}

	public void setEmsgFileDate1(Date emsgFileDate1) {
		this.emsgFileDate1 = emsgFileDate1;
	}

	public Date getEmsgFileDate2() {
		return this.emsgFileDate2;
	}

	public void setEmsgFileDate2(Date emsgFileDate2) {
		this.emsgFileDate2 = emsgFileDate2;
	}

	public String getEmsgFileName() {
		return this.emsgFileName;
	}

	public void setEmsgFileName(String emsgFileName) {
		this.emsgFileName = emsgFileName;
	}

	public String getEmsgFileNbr1() {
		return this.emsgFileNbr1;
	}

	public void setEmsgFileNbr1(String emsgFileNbr1) {
		this.emsgFileNbr1 = emsgFileNbr1;
	}

	public String getEmsgFileNbr2() {
		return this.emsgFileNbr2;
	}

	public void setEmsgFileNbr2(String emsgFileNbr2) {
		this.emsgFileNbr2 = emsgFileNbr2;
	}

	public String getEmsgFileNbr3() {
		return this.emsgFileNbr3;
	}

	public void setEmsgFileNbr3(String emsgFileNbr3) {
		this.emsgFileNbr3 = emsgFileNbr3;
	}

	public String getEmsgFileNbr4() {
		return this.emsgFileNbr4;
	}

	public void setEmsgFileNbr4(String emsgFileNbr4) {
		this.emsgFileNbr4 = emsgFileNbr4;
	}

	public Integer getEmsgFileTrnbr() {
		return this.emsgFileTrnbr;
	}

	public void setEmsgFileTrnbr(Integer emsgFileTrnbr) {
		this.emsgFileTrnbr = emsgFileTrnbr;
	}

	public String getEmsgMsgType() {
		return this.emsgMsgType;
	}

	public void setEmsgMsgType(String emsgMsgType) {
		this.emsgMsgType = emsgMsgType;
	}

	public String getEmsgNameDate1() {
		return this.emsgNameDate1;
	}

	public void setEmsgNameDate1(String emsgNameDate1) {
		this.emsgNameDate1 = emsgNameDate1;
	}

	public String getEmsgNameDate2() {
		return this.emsgNameDate2;
	}

	public void setEmsgNameDate2(String emsgNameDate2) {
		this.emsgNameDate2 = emsgNameDate2;
	}

	public String getEmsgNameNbr1() {
		return this.emsgNameNbr1;
	}

	public void setEmsgNameNbr1(String emsgNameNbr1) {
		this.emsgNameNbr1 = emsgNameNbr1;
	}

	public String getEmsgNameNbr2() {
		return this.emsgNameNbr2;
	}

	public void setEmsgNameNbr2(String emsgNameNbr2) {
		this.emsgNameNbr2 = emsgNameNbr2;
	}

	public String getEmsgNameNbr3() {
		return this.emsgNameNbr3;
	}

	public void setEmsgNameNbr3(String emsgNameNbr3) {
		this.emsgNameNbr3 = emsgNameNbr3;
	}

	public String getEmsgNameNbr4() {
		return this.emsgNameNbr4;
	}

	public void setEmsgNameNbr4(String emsgNameNbr4) {
		this.emsgNameNbr4 = emsgNameNbr4;
	}

	public Boolean getEmsgRead() {
		return this.emsgRead;
	}

	public void setEmsgRead(Boolean emsgRead) {
		this.emsgRead = emsgRead;
	}

	public String getEmsgUserid() {
		return this.emsgUserid;
	}

	public void setEmsgUserid(String emsgUserid) {
		this.emsgUserid = emsgUserid;
	}

	public String getEmsgQadc01() {
		return this.emsgQadc01;
	}

	public void setEmsgQadc01(String emsgQadc01) {
		this.emsgQadc01 = emsgQadc01;
	}

	public Double getOidEmsgMstr() {
		return this.oidEmsgMstr;
	}

	public void setOidEmsgMstr(Double oidEmsgMstr) {
		this.oidEmsgMstr = oidEmsgMstr;
	}

}