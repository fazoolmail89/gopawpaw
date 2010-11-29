package com.gopawpaw.erp.hibernate.u;

/**
 * UrlMstrId entity. @author MyEclipse Persistence Tools
 */
public class UrlMstrId extends AbstractUrlMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UrlMstrId() {
	}

	/** minimal constructor */
	public UrlMstrId(String urlExec) {
		super(urlExec);
	}

	/** full constructor */
	public UrlMstrId(String urlType, String urlField, String urlFieldValue,
			String urlAddr, String urlCallPgm, String urlExec, String urlScript) {
		super(urlType, urlField, urlFieldValue, urlAddr, urlCallPgm, urlExec,
				urlScript);
	}

}
