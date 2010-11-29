package com.gopawpaw.erp.hibernate.m;

/**
 * MfrelMstrId entity. @author MyEclipse Persistence Tools
 */
public class MfrelMstrId extends AbstractMfrelMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MfrelMstrId() {
	}

	/** full constructor */
	public MfrelMstrId(String mfrelType, String mfrelSourceKey1,
			String mfrelSourceKey2, String mfrelSourceKey3,
			String mfrelTargetKey1, String mfrelTargetKey2,
			String mfrelTargetKey3) {
		super(mfrelType, mfrelSourceKey1, mfrelSourceKey2, mfrelSourceKey3,
				mfrelTargetKey1, mfrelTargetKey2, mfrelTargetKey3);
	}

}
