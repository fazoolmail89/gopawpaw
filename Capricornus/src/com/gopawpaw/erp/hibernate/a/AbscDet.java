package com.gopawpaw.erp.hibernate.a;

/**
 * AbscDet entity. @author MyEclipse Persistence Tools
 */
public class AbscDet extends AbstractAbscDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbscDet() {
	}

	/** minimal constructor */
	public AbscDet(AbscDetId id, String abscCarrier, Double oidAbscDet) {
		super(id, abscCarrier, oidAbscDet);
	}

	/** full constructor */
	public AbscDet(AbscDetId id, String abscCarrier, String abscUser1,
			String abscUser2, String abscQadc01, Double oidAbscDet) {
		super(id, abscCarrier, abscUser1, abscUser2, abscQadc01, oidAbscDet);
	}

}
