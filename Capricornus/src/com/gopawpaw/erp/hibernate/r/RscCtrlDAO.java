package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RscCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RscCtrl
 * @author MyEclipse Persistence Tools
 */

public class RscCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RscCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RscCtrl transientInstance) {
		log.debug("saving RscCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RscCtrl persistentInstance) {
		log.debug("deleting RscCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RscCtrl findById(java.lang.String id) {
		log.debug("getting RscCtrl instance with id: " + id);
		try {
			RscCtrl instance = (RscCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RscCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RscCtrl instance) {
		log.debug("finding RscCtrl instance by example");
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
		log.debug("finding RscCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RscCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RscCtrl instances");
		try {
			String queryString = "from RscCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RscCtrl merge(RscCtrl detachedInstance) {
		log.debug("merging RscCtrl instance");
		try {
			RscCtrl result = (RscCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RscCtrl instance) {
		log.debug("attaching dirty RscCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RscCtrl instance) {
		log.debug("attaching clean RscCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RscCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RscCtrlDAO) ctx.getBean("RscCtrlDAO");
	}
}