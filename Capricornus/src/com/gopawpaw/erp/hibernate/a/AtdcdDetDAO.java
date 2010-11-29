package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtdcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtdcdDet
 * @author MyEclipse Persistence Tools
 */

public class AtdcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtdcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtdcdDet transientInstance) {
		log.debug("saving AtdcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtdcdDet persistentInstance) {
		log.debug("deleting AtdcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtdcdDet findById(com.gopawpaw.erp.hibernate.a.AtdcdDetId id) {
		log.debug("getting AtdcdDet instance with id: " + id);
		try {
			AtdcdDet instance = (AtdcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtdcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtdcdDet instance) {
		log.debug("finding AtdcdDet instance by example");
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
		log.debug("finding AtdcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtdcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtdcdDet instances");
		try {
			String queryString = "from AtdcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtdcdDet merge(AtdcdDet detachedInstance) {
		log.debug("merging AtdcdDet instance");
		try {
			AtdcdDet result = (AtdcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtdcdDet instance) {
		log.debug("attaching dirty AtdcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtdcdDet instance) {
		log.debug("attaching clean AtdcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtdcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtdcdDetDAO) ctx.getBean("AtdcdDetDAO");
	}
}