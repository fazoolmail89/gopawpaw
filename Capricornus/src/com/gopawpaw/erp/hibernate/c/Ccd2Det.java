package com.gopawpaw.erp.hibernate.c;

/**
 * Ccd2Det entity. @author MyEclipse Persistence Tools
 */
public class Ccd2Det extends AbstractCcd2Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ccd2Det() {
	}

	/** minimal constructor */
	public Ccd2Det(Ccd2DetId id, Double oidCcd2Det) {
		super(id, oidCcd2Det);
	}

	/** full constructor */
	public Ccd2Det(Ccd2DetId id, String ccd2SubBeg, String ccd2SubEnd,
			String ccd2User1, String ccd2User2, String ccd2Qadc01,
			Double oidCcd2Det) {
		super(id, ccd2SubBeg, ccd2SubEnd, ccd2User1, ccd2User2, ccd2Qadc01,
				oidCcd2Det);
	}

}
