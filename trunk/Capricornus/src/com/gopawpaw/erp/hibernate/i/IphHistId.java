package com.gopawpaw.erp.hibernate.i;

/**
 * IphHistId entity. @author MyEclipse Persistence Tools
 */
public class IphHistId extends AbstractIphHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IphHistId() {
	}

	/** minimal constructor */
	public IphHistId(String iphDomain) {
		super(iphDomain);
	}

	/** full constructor */
	public IphHistId(String iphDomain, String iphInvNbr, String iphNbr,
			Integer iphLine, Boolean iphConfgDisc, String iphSource,
			String iphListId, String iphAmtType, String iphParent,
			String iphFeature, String iphOption) {
		super(iphDomain, iphInvNbr, iphNbr, iphLine, iphConfgDisc, iphSource,
				iphListId, iphAmtType, iphParent, iphFeature, iphOption);
	}

}
