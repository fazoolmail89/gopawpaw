package com.gopawpaw.erp.hibernate.c;

/**
 * CasMstrId entity. @author MyEclipse Persistence Tools
 */
public class CasMstrId extends AbstractCasMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CasMstrId() {
	}

	/** minimal constructor */
	public CasMstrId(String casDomain) {
		super(casDomain);
	}

	/** full constructor */
	public CasMstrId(String casDomain, String casStatus, String casFileType) {
		super(casDomain, casStatus, casFileType);
	}

}
