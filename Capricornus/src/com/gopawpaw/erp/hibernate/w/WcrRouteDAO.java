package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WcrRoute entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WcrRoute
 * @author MyEclipse Persistence Tools
 */

public class WcrRouteDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WcrRouteDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WcrRoute transientInstance) {
		log.debug("saving WcrRoute instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WcrRoute persistentInstance) {
		log.debug("deleting WcrRoute instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WcrRoute findById(com.gopawpaw.erp.hibernate.w.WcrRouteId id) {
		log.debug("getting WcrRoute instance with id: " + id);
		try {
			WcrRoute instance = (WcrRoute) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WcrRoute", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WcrRoute instance) {
		log.debug("finding WcrRoute instance by example");
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
		log.debug("finding WcrRoute instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WcrRoute as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WcrRoute instances");
		try {
			String queryString = "from WcrRoute";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WcrRoute merge(WcrRoute detachedInstance) {
		log.debug("merging WcrRoute instance");
		try {
			WcrRoute result = (WcrRoute) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WcrRoute instance) {
		log.debug("attaching dirty WcrRoute instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WcrRoute instance) {
		log.debug("attaching clean WcrRoute instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WcrRouteDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WcrRouteDAO) ctx.getBean("WcrRouteDAO");
	}
}