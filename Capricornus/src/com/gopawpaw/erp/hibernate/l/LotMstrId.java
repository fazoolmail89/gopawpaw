package com.gopawpaw.erp.hibernate.l;

/**
 * LotMstrId entity. @author MyEclipse Persistence Tools
 */
public class LotMstrId extends AbstractLotMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LotMstrId() {
	}

	/** full constructor */
	public LotMstrId(String lotDomain, String lotPart, String lotSerial) {
		super(lotDomain, lotPart, lotSerial);
	}

}
