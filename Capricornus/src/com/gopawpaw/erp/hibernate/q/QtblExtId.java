package com.gopawpaw.erp.hibernate.q;

/**
 * QtblExtId entity. @author MyEclipse Persistence Tools
 */
public class QtblExtId extends AbstractQtblExtId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public QtblExtId() {
	}

	/** full constructor */
	public QtblExtId(String qtblOwner, String qtblTable, String qtblReference,
			String qtblKey1, String qtblKey2, String qtblKey3, String qtblKey4,
			String qtblKey5, String qtblKey6) {
		super(qtblOwner, qtblTable, qtblReference, qtblKey1, qtblKey2,
				qtblKey3, qtblKey4, qtblKey5, qtblKey6);
	}

}
