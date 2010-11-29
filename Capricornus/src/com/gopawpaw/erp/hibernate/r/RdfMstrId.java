package com.gopawpaw.erp.hibernate.r;

/**
 * RdfMstrId entity. @author MyEclipse Persistence Tools
 */
public class RdfMstrId extends AbstractRdfMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RdfMstrId() {
	}

	/** minimal constructor */
	public RdfMstrId(String rdfDomain) {
		super(rdfDomain);
	}

	/** full constructor */
	public RdfMstrId(String rdfDomain, String rdfProdLine, String rdfSvcGroup,
			String rdfCaIntType, String rdfPart, String rdfArea) {
		super(rdfDomain, rdfProdLine, rdfSvcGroup, rdfCaIntType, rdfPart,
				rdfArea);
	}

}
