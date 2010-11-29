package com.gopawpaw.erp.hibernate.d;

/**
 * DefrDetId entity. @author MyEclipse Persistence Tools
 */
public class DefrDetId extends AbstractDefrDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DefrDetId() {
	}

	/** full constructor */
	public DefrDetId(String defrDomain, String defrNbr, String defrPrefix,
			Integer defrLine, String defrInvNbr) {
		super(defrDomain, defrNbr, defrPrefix, defrLine, defrInvNbr);
	}

}
