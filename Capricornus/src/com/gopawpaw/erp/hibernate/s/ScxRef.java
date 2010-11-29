package com.gopawpaw.erp.hibernate.s;

/**
 * ScxRef entity. @author MyEclipse Persistence Tools
 */
public class ScxRef extends AbstractScxRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScxRef() {
	}

	/** minimal constructor */
	public ScxRef(ScxRefId id, String scxOrder, String scxQkey, Double oidScxRef) {
		super(id, scxOrder, scxQkey, oidScxRef);
	}

	/** full constructor */
	public ScxRef(ScxRefId id, String scxOrder, Integer scxLine,
			String scxQkey, String scxUser1, String scxUser2, String scxQadc01,
			Double oidScxRef) {
		super(id, scxOrder, scxLine, scxQkey, scxUser1, scxUser2, scxQadc01,
				oidScxRef);
	}

}
