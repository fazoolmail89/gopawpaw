package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMsgMstr entity provides the base persistence definition of the
 * MsgMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMsgMstr implements java.io.Serializable {

	// Fields

	private MsgMstrId id;
	private String msgDesc;
	private String msgUser1;
	private String msgUser2;
	private String msgType;
	private String msgExplanation;
	private String msgQadc01;
	private Double oidMsgMstr;

	// Constructors

	/** default constructor */
	public AbstractMsgMstr() {
	}

	/** minimal constructor */
	public AbstractMsgMstr(MsgMstrId id, Double oidMsgMstr) {
		this.id = id;
		this.oidMsgMstr = oidMsgMstr;
	}

	/** full constructor */
	public AbstractMsgMstr(MsgMstrId id, String msgDesc, String msgUser1,
			String msgUser2, String msgType, String msgExplanation,
			String msgQadc01, Double oidMsgMstr) {
		this.id = id;
		this.msgDesc = msgDesc;
		this.msgUser1 = msgUser1;
		this.msgUser2 = msgUser2;
		this.msgType = msgType;
		this.msgExplanation = msgExplanation;
		this.msgQadc01 = msgQadc01;
		this.oidMsgMstr = oidMsgMstr;
	}

	// Property accessors

	public MsgMstrId getId() {
		return this.id;
	}

	public void setId(MsgMstrId id) {
		this.id = id;
	}

	public String getMsgDesc() {
		return this.msgDesc;
	}

	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}

	public String getMsgUser1() {
		return this.msgUser1;
	}

	public void setMsgUser1(String msgUser1) {
		this.msgUser1 = msgUser1;
	}

	public String getMsgUser2() {
		return this.msgUser2;
	}

	public void setMsgUser2(String msgUser2) {
		this.msgUser2 = msgUser2;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgExplanation() {
		return this.msgExplanation;
	}

	public void setMsgExplanation(String msgExplanation) {
		this.msgExplanation = msgExplanation;
	}

	public String getMsgQadc01() {
		return this.msgQadc01;
	}

	public void setMsgQadc01(String msgQadc01) {
		this.msgQadc01 = msgQadc01;
	}

	public Double getOidMsgMstr() {
		return this.oidMsgMstr;
	}

	public void setOidMsgMstr(Double oidMsgMstr) {
		this.oidMsgMstr = oidMsgMstr;
	}

}