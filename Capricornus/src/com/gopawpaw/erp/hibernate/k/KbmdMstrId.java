package com.gopawpaw.erp.hibernate.k;

/**
 * KbmdMstrId entity. @author MyEclipse Persistence Tools
 */
public class KbmdMstrId extends AbstractKbmdMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbmdMstrId() {
	}

	/** full constructor */
	public KbmdMstrId(String kbmdDomain, String kbmdConsSource,
			String kbmdPattern, String kbmdPart, String kbmdConsRef,
			String kbmdSuppSource, String kbmdSuppRef, String kbmdLine) {
		super(kbmdDomain, kbmdConsSource, kbmdPattern, kbmdPart, kbmdConsRef,
				kbmdSuppSource, kbmdSuppRef, kbmdLine);
	}

}
