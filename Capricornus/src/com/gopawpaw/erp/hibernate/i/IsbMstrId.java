package com.gopawpaw.erp.hibernate.i;

/**
 * IsbMstrId entity. @author MyEclipse Persistence Tools
 */
public class IsbMstrId extends AbstractIsbMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsbMstrId() {
	}

	/** minimal constructor */
	public IsbMstrId(String isbDomain) {
		super(isbDomain);
	}

	/** full constructor */
	public IsbMstrId(String isbDomain, String isbEuNbr, String isbPart,
			String isbSerial, Integer isbRef) {
		super(isbDomain, isbEuNbr, isbPart, isbSerial, isbRef);
	}

}
