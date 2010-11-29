package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapfsDet entity. @author MyEclipse Persistence Tools
 */
public class EsapfsDet extends AbstractEsapfsDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapfsDet() {
	}

	/** full constructor */
	public EsapfsDet(EsapfsDetId id, Double oidEsapfsDet, String esapfsSetDesc,
			Date esapfsModDate, String esapfsModUserid, String esapfsUser1,
			String esapfsUser2, String esapfsQadc01, String esapfsQadc02) {
		super(id, oidEsapfsDet, esapfsSetDesc, esapfsModDate, esapfsModUserid,
				esapfsUser1, esapfsUser2, esapfsQadc01, esapfsQadc02);
	}

}
