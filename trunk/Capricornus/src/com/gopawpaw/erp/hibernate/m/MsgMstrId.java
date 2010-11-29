package com.gopawpaw.erp.hibernate.m;

/**
 * MsgMstrId entity. @author MyEclipse Persistence Tools
 */
public class MsgMstrId extends AbstractMsgMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MsgMstrId() {
	}

	/** minimal constructor */
	public MsgMstrId(Integer msgNbr) {
		super(msgNbr);
	}

	/** full constructor */
	public MsgMstrId(String msgLang, Integer msgNbr) {
		super(msgLang, msgNbr);
	}

}
