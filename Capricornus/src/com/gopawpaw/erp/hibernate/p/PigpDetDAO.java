package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PigpDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PigpDet
 * @author MyEclipse Persistence Tools
 */

public class PigpDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PigpDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PigpDet transientInstance) {
		log.debug("saving PigpDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PigpDet persistentInstance) {
		log.debug("deleting PigpDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PigpDet findById(com.gopawpaw.erp.hibernate.p.PigpDetId id) {
		log.debug("getting PigpDet instance with id: " + id);
		try {
			PigpDet instance = (PigpDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PigpDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PigpDet instance) {
		log.debug("finding PigpDet instance by example");
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
		log.debug("finding PigpDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PigpDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PigpDet instances");
		try {
			String queryString = "from PigpDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PigpDet merge(PigpDet detachedInstance) {
		log.debug("merging PigpDet instance");
		try {
			PigpDet result = (PigpDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PigpDet instance) {
		log.debug("attaching dirty PigpDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PigpDet instance) {
		log.debug("attaching clean PigpDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PigpDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PigpDetDAO) ctx.getBean("PigpDetDAO");
	}
}