package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CtdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CtdDet
 * @author MyEclipse Persistence Tools
 */

public class CtdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CtdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CtdDet transientInstance) {
		log.debug("saving CtdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CtdDet persistentInstance) {
		log.debug("deleting CtdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CtdDet findById(com.gopawpaw.erp.hibernate.c.CtdDetId id) {
		log.debug("getting CtdDet instance with id: " + id);
		try {
			CtdDet instance = (CtdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CtdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CtdDet instance) {
		log.debug("finding CtdDet instance by example");
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
		log.debug("finding CtdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CtdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CtdDet instances");
		try {
			String queryString = "from CtdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CtdDet merge(CtdDet detachedInstance) {
		log.debug("merging CtdDet instance");
		try {
			CtdDet result = (CtdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CtdDet instance) {
		log.debug("attaching dirty CtdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CtdDet instance) {
		log.debug("attaching clean CtdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CtdDetDAO) ctx.getBean("CtdDetDAO");
	}
}