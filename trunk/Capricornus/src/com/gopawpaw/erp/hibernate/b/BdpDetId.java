package com.gopawpaw.erp.hibernate.b;

/**
 * BdpDetId entity. @author MyEclipse Persistence Tools
 */
public class BdpDetId extends AbstractBdpDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BdpDetId() {
	}

	/** full constructor */
	public BdpDetId(String bdpDomain, String bdpProgram, String bdpAddr,
			String bdpBank, String bdpPayMethod, String bdpRef, Integer bdpSeq) {
		super(bdpDomain, bdpProgram, bdpAddr, bdpBank, bdpPayMethod, bdpRef,
				bdpSeq);
	}

}
