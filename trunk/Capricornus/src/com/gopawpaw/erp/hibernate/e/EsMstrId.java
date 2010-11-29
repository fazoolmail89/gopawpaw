package com.gopawpaw.erp.hibernate.e;

/**
 * EsMstrId entity. @author MyEclipse Persistence Tools
 */
public class EsMstrId extends AbstractEsMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsMstrId() {
	}

	/** minimal constructor */
	public EsMstrId(String esDomain) {
		super(esDomain);
	}

	/** full constructor */
	public EsMstrId(String esDomain, String esNbr, String esPrefix,
			Integer esItmLine, String esCaStatus, String esCaIntType,
			String esCaType, String esCaSeverity, String esCaProblem,
			Integer esSeq) {
		super(esDomain, esNbr, esPrefix, esItmLine, esCaStatus, esCaIntType,
				esCaType, esCaSeverity, esCaProblem, esSeq);
	}

}
