package com.gopawpaw.erp.hibernate.a;

/**
 * AcodMstrId entity. @author MyEclipse Persistence Tools
 */
public class AcodMstrId extends AbstractAcodMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcodMstrId() {
	}

	/** minimal constructor */
	public AcodMstrId(String acodDomain) {
		super(acodDomain);
	}

	/** full constructor */
	public AcodMstrId(String acodDomain, String acodAppId, String acodDocStd,
			String acodDocTyp, String acodDocRev, String acodTradptrId,
			String acodFldname, String acodSrcVal) {
		super(acodDomain, acodAppId, acodDocStd, acodDocTyp, acodDocRev,
				acodTradptrId, acodFldname, acodSrcVal);
	}

}
