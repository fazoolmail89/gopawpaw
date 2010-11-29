package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WrRoute entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WrRoute
 * @author MyEclipse Persistence Tools
 */

public class WrRouteDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WrRouteDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WrRoute transientInstance) {
		log.debug("saving WrRoute instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WrRoute persistentInstance) {
		log.debug("deleting WrRoute instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WrRoute findById(com.gopawpaw.erp.hibernate.w.WrRouteId id) {
		log.debug("getting WrRoute instance with id: " + id);
		try {
			WrRoute instance = (WrRoute) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WrRoute", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WrRoute instance) {
		log.debug("finding WrRoute instance by example");
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
		log.debug("finding WrRoute instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WrRoute as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WrRoute instances");
		try {
			String queryString = "from WrRoute";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WrRoute merge(WrRoute detachedInstance) {
		log.debug("merging WrRoute instance");
		try {
			WrRoute result = (WrRoute) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WrRoute instance) {
		log.debug("attaching dirty WrRoute instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WrRoute instance) {
		log.debug("attaching clean WrRoute instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WrRouteDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WrRouteDAO) ctx.getBean("WrRouteDAO");
	}
}