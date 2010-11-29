package com.gopawpaw.erp.hibernate.s;

/**
 * SypjDetId entity. @author MyEclipse Persistence Tools
 */
public class SypjDetId extends AbstractSypjDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SypjDetId() {
	}

	/** full constructor */
	public SypjDetId(String sypjProflId, String sypjJoinProfl,
			String sypjRelation) {
		super(sypjProflId, sypjJoinProfl, sypjRelation);
	}

}
