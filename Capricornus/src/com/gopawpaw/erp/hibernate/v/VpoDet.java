package com.gopawpaw.erp.hibernate.v;

/**
 * VpoDet entity. @author MyEclipse Persistence Tools
 */
public class VpoDet extends AbstractVpoDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VpoDet() {
	}

	/** minimal constructor */
	public VpoDet(VpoDetId id, Double oidVpoDet) {
		super(id, oidVpoDet);
	}

	/** full constructor */
	public VpoDet(VpoDetId id, String vpoUser1, String vpoUser2,
			String vpoQadc01, Double oidVpoDet) {
		super(id, vpoUser1, vpoUser2, vpoQadc01, oidVpoDet);
	}

}
