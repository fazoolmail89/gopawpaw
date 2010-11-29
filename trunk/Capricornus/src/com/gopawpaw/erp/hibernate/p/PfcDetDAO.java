package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PfcDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PfcDet
 * @author MyEclipse Persistence Tools
 */

public class PfcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PfcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PfcDet transientInstance) {
		log.debug("saving PfcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PfcDet persistentInstance) {
		log.debug("deleting PfcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PfcDet findById(com.gopawpaw.erp.hibernate.p.PfcDetId id) {
		log.debug("getting PfcDet instance with id: " + id);
		try {
			PfcDet instance = (PfcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PfcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PfcDet instance) {
		log.debug("finding PfcDet instance by example");
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
		log.debug("finding PfcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PfcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PfcDet instances");
		try {
			String queryString = "from PfcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PfcDet merge(PfcDet detachedInstance) {
		log.debug("merging PfcDet instance");
		try {
			PfcDet result = (PfcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PfcDet instance) {
		log.debug("attaching dirty PfcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PfcDet instance) {
		log.debug("attaching clean PfcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PfcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PfcDetDAO) ctx.getBean("PfcDetDAO");
	}
}