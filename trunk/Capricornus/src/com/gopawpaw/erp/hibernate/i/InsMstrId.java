package com.gopawpaw.erp.hibernate.i;

/**
 * InsMstrId entity. @author MyEclipse Persistence Tools
 */
public class InsMstrId extends AbstractInsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public InsMstrId() {
	}

	/** full constructor */
	public InsMstrId(String insDomain, String insPrjNbr, Integer insSubNbr,
			String insSchedNbr) {
		super(insDomain, insPrjNbr, insSubNbr, insSchedNbr);
	}

}
