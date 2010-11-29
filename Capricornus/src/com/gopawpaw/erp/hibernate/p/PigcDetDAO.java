package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PigcDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PigcDet
 * @author MyEclipse Persistence Tools
 */

public class PigcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PigcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PigcDet transientInstance) {
		log.debug("saving PigcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PigcDet persistentInstance) {
		log.debug("deleting PigcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PigcDet findById(com.gopawpaw.erp.hibernate.p.PigcDetId id) {
		log.debug("getting PigcDet instance with id: " + id);
		try {
			PigcDet instance = (PigcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PigcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PigcDet instance) {
		log.debug("finding PigcDet instance by example");
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
		log.debug("finding PigcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PigcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PigcDet instances");
		try {
			String queryString = "from PigcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PigcDet merge(PigcDet detachedInstance) {
		log.debug("merging PigcDet instance");
		try {
			PigcDet result = (PigcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PigcDet instance) {
		log.debug("attaching dirty PigcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PigcDet instance) {
		log.debug("attaching clean PigcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PigcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PigcDetDAO) ctx.getBean("PigcDetDAO");
	}
}