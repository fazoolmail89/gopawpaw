package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtpDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtpDet
 * @author MyEclipse Persistence Tools
 */

public class AtpDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtpDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtpDet transientInstance) {
		log.debug("saving AtpDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtpDet persistentInstance) {
		log.debug("deleting AtpDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtpDet findById(com.gopawpaw.erp.hibernate.a.AtpDetId id) {
		log.debug("getting AtpDet instance with id: " + id);
		try {
			AtpDet instance = (AtpDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtpDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtpDet instance) {
		log.debug("finding AtpDet instance by example");
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
		log.debug("finding AtpDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtpDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtpDet instances");
		try {
			String queryString = "from AtpDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtpDet merge(AtpDet detachedInstance) {
		log.debug("merging AtpDet instance");
		try {
			AtpDet result = (AtpDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtpDet instance) {
		log.debug("attaching dirty AtpDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtpDet instance) {
		log.debug("attaching clean AtpDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtpDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtpDetDAO) ctx.getBean("AtpDetDAO");
	}
}