package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TaxdDet
 * @author MyEclipse Persistence Tools
 */

public class TaxdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TaxdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TaxdDet transientInstance) {
		log.debug("saving TaxdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TaxdDet persistentInstance) {
		log.debug("deleting TaxdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TaxdDet findById(com.gopawpaw.erp.hibernate.t.TaxdDetId id) {
		log.debug("getting TaxdDet instance with id: " + id);
		try {
			TaxdDet instance = (TaxdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TaxdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TaxdDet instance) {
		log.debug("finding TaxdDet instance by example");
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
		log.debug("finding TaxdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TaxdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TaxdDet instances");
		try {
			String queryString = "from TaxdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TaxdDet merge(TaxdDet detachedInstance) {
		log.debug("merging TaxdDet instance");
		try {
			TaxdDet result = (TaxdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TaxdDet instance) {
		log.debug("attaching dirty TaxdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TaxdDet instance) {
		log.debug("attaching clean TaxdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TaxdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TaxdDetDAO) ctx.getBean("TaxdDetDAO");
	}
}