package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMsgMstrId entity provides the base persistence definition of the
 * MsgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMsgMstrId implements java.io.Serializable {

	// Fields

	private String msgLang;
	private Integer msgNbr;

	// Constructors

	/** default constructor */
	public AbstractMsgMstrId() {
	}

	/** minimal constructor */
	public AbstractMsgMstrId(Integer msgNbr) {
		this.msgNbr = msgNbr;
	}

	/** full constructor */
	public AbstractMsgMstrId(String msgLang, Integer msgNbr) {
		this.msgLang = msgLang;
		this.msgNbr = msgNbr;
	}

	// Property accessors

	public String getMsgLang() {
		return this.msgLang;
	}

	public void setMsgLang(String msgLang) {
		this.msgLang = msgLang;
	}

	public Integer getMsgNbr() {
		return this.msgNbr;
	}

	public void setMsgNbr(Integer msgNbr) {
		this.msgNbr = msgNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMsgMstrId))
			return false;
		AbstractMsgMstrId castOther = (AbstractMsgMstrId) other;

		return ((this.getMsgLang() == castOther.getMsgLang()) || (this
				.getMsgLang() != null
				&& castOther.getMsgLang() != null && this.getMsgLang().equals(
				castOther.getMsgLang())))
				&& ((this.getMsgNbr() == castOther.getMsgNbr()) || (this
						.getMsgNbr() != null
						&& castOther.getMsgNbr() != null && this.getMsgNbr()
						.equals(castOther.getMsgNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMsgLang() == null ? 0 : this.getMsgLang().hashCode());
		result = 37 * result
				+ (getMsgNbr() == null ? 0 : this.getMsgNbr().hashCode());
		return result;
	}

}