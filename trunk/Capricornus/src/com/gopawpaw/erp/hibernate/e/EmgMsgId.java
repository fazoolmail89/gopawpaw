package com.gopawpaw.erp.hibernate.e;

/**
 * EmgMsgId entity. @author MyEclipse Persistence Tools
 */
public class EmgMsgId extends AbstractEmgMsgId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmgMsgId() {
	}

	/** minimal constructor */
	public EmgMsgId(String emgDomain) {
		super(emgDomain);
	}

	/** full constructor */
	public EmgMsgId(String emgDomain, Integer emgDocId, Integer emgDocSufx,
			String emgPrcgStage, String emgReturnCode) {
		super(emgDomain, emgDocId, emgDocSufx, emgPrcgStage, emgReturnCode);
	}

}
