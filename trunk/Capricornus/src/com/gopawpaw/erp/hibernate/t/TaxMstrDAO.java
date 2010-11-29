package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TaxMstr
 * @author MyEclipse Persistence Tools
 */

public class TaxMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TaxMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TaxMstr transientInstance) {
		log.debug("saving TaxMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TaxMstr persistentInstance) {
		log.debug("deleting TaxMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TaxMstr findById(com.gopawpaw.erp.hibernate.t.TaxMstrId id) {
		log.debug("getting TaxMstr instance with id: " + id);
		try {
			TaxMstr instance = (TaxMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TaxMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TaxMstr instance) {
		log.debug("finding TaxMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TaxMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TaxMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TaxMstr instances");
		try {
			String queryString = "from TaxMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TaxMstr merge(TaxMstr detachedInstance) {
		log.debug("merging TaxMstr instance");
		try {
			TaxMstr result = (TaxMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TaxMstr instance) {
		log.debug("attaching dirty TaxMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TaxMstr instance) {
		log.debug("attaching clean TaxMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TaxMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TaxMstrDAO) ctx.getBean("TaxMstrDAO");
	}
}