package com.gopawpaw.erp.hibernate.c;

/**
 * CnssMstrId entity. @author MyEclipse Persistence Tools
 */
public class CnssMstrId extends AbstractCnssMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnssMstrId() {
	}

	/** full constructor */
	public CnssMstrId(String cnssDomain, String cnssSupplier, String cnssPart) {
		super(cnssDomain, cnssSupplier, cnssPart);
	}

}
