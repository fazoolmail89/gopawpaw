package com.gopawpaw.erp.hibernate.m;

/**
 * MsgMstr entity. @author MyEclipse Persistence Tools
 */
public class MsgMstr extends AbstractMsgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MsgMstr() {
	}

	/** minimal constructor */
	public MsgMstr(MsgMstrId id, Double oidMsgMstr) {
		super(id, oidMsgMstr);
	}

	/** full constructor */
	public MsgMstr(MsgMstrId id, String msgDesc, String msgUser1,
			String msgUser2, String msgType, String msgExplanation,
			String msgQadc01, Double oidMsgMstr) {
		super(id, msgDesc, msgUser1, msgUser2, msgType, msgExplanation,
				msgQadc01, oidMsgMstr);
	}

}
