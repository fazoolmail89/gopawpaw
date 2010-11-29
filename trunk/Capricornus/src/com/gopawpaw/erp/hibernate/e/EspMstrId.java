package com.gopawpaw.erp.hibernate.e;

/**
 * EspMstrId entity. @author MyEclipse Persistence Tools
 */
public class EspMstrId extends AbstractEspMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EspMstrId() {
	}

	/** minimal constructor */
	public EspMstrId(String espDomain) {
		super(espDomain);
	}

	/** full constructor */
	public EspMstrId(String espDomain, String espAppId, String espDocStd,
			String espDocTyp, String espDocRev, String espTradptrId) {
		super(espDomain, espAppId, espDocStd, espDocTyp, espDocRev,
				espTradptrId);
	}

}
