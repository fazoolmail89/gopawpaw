package com.gopawpaw.erp.hibernate.i;

/**
 * IspMstrId entity. @author MyEclipse Persistence Tools
 */
public class IspMstrId extends AbstractIspMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IspMstrId() {
	}

	/** minimal constructor */
	public IspMstrId(String ispDomain) {
		super(ispDomain);
	}

	/** full constructor */
	public IspMstrId(String ispDomain, String ispAppId, String ispDocStd,
			String ispDocTyp, String ispDocRev, String ispTradptrId) {
		super(ispDomain, ispAppId, ispDocStd, ispDocTyp, ispDocRev,
				ispTradptrId);
	}

}
