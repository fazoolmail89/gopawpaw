package com.gopawpaw.erp.hibernate.m;

/**
 * MaMstrId entity. @author MyEclipse Persistence Tools
 */
public class MaMstrId extends AbstractMaMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MaMstrId() {
	}

	/** minimal constructor */
	public MaMstrId(String maDomain) {
		super(maDomain);
	}

	/** full constructor */
	public MaMstrId(String maDomain, String maEntity, String maTrType,
			String maAcct1, String maAcct2, String maSub1, String maSub2,
			String maCc1, String maCc2, Boolean maAllSub, Boolean maAllCc) {
		super(maDomain, maEntity, maTrType, maAcct1, maAcct2, maSub1, maSub2,
				maCc1, maCc2, maAllSub, maAllCc);
	}

}
