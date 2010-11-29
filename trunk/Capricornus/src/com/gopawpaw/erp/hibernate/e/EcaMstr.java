package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EcaMstr entity. @author MyEclipse Persistence Tools
 */
public class EcaMstr extends AbstractEcaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcaMstr() {
	}

	/** minimal constructor */
	public EcaMstr(EcaMstrId id, Double oidEcaMstr) {
		super(id, oidEcaMstr);
	}

	/** full constructor */
	public EcaMstr(EcaMstrId id, Integer ecaSeq, Integer ecaReroute,
			Boolean ecaQad01, Date ecaQad02, String ecaQad03, String ecaQad04,
			String ecaQad05, Date ecaModDate, String ecaUserid,
			String ecaUser1, String ecaUser2, Double oidEcaMstr) {
		super(id, ecaSeq, ecaReroute, ecaQad01, ecaQad02, ecaQad03, ecaQad04,
				ecaQad05, ecaModDate, ecaUserid, ecaUser1, ecaUser2, oidEcaMstr);
	}

}
