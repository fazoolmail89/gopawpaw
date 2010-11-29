package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsapfcDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsapfcDet
 * @author MyEclipse Persistence Tools
 */

public class EsapfcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsapfcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsapfcDet transientInstance) {
		log.debug("saving EsapfcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsapfcDet persistentInstance) {
		log.debug("deleting EsapfcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsapfcDet findById(com.gopawpaw.erp.hibernate.e.EsapfcDetId id) {
		log.debug("getting EsapfcDet instance with id: " + id);
		try {
			EsapfcDet instance = (EsapfcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsapfcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsapfcDet instance) {
		log.debug("finding EsapfcDet instance by example");
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
		log.debug("finding EsapfcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsapfcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsapfcDet instances");
		try {
			String queryString = "from EsapfcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsapfcDet merge(EsapfcDet detachedInstance) {
		log.debug("merging EsapfcDet instance");
		try {
			EsapfcDet result = (EsapfcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsapfcDet instance) {
		log.debug("attaching dirty EsapfcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsapfcDet instance) {
		log.debug("attaching clean EsapfcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsapfcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsapfcDetDAO) ctx.getBean("EsapfcDetDAO");
	}
}