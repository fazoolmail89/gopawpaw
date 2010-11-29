package com.gopawpaw.erp.hibernate.i;

/**
 * IbDetId entity. @author MyEclipse Persistence Tools
 */
public class IbDetId extends AbstractIbDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IbDetId() {
	}

	/** minimal constructor */
	public IbDetId(String ibDomain) {
		super(ibDomain);
	}

	/** full constructor */
	public IbDetId(String ibDomain, String ibEuNbr, String ibConfig,
			String ibSysPart, String ibSysSerial, Integer ibSysRef,
			Integer ibSysSeq, String ibComp) {
		super(ibDomain, ibEuNbr, ibConfig, ibSysPart, ibSysSerial, ibSysRef,
				ibSysSeq, ibComp);
	}

}
