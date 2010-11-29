package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShpcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ShpcCtrl
 * @author MyEclipse Persistence Tools
 */

public class ShpcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ShpcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShpcCtrl transientInstance) {
		log.debug("saving ShpcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShpcCtrl persistentInstance) {
		log.debug("deleting ShpcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShpcCtrl findById(java.lang.String id) {
		log.debug("getting ShpcCtrl instance with id: " + id);
		try {
			ShpcCtrl instance = (ShpcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ShpcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShpcCtrl instance) {
		log.debug("finding ShpcCtrl instance by example");
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
		log.debug("finding ShpcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShpcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShpcCtrl instances");
		try {
			String queryString = "from ShpcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShpcCtrl merge(ShpcCtrl detachedInstance) {
		log.debug("merging ShpcCtrl instance");
		try {
			ShpcCtrl result = (ShpcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShpcCtrl instance) {
		log.debug("attaching dirty ShpcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShpcCtrl instance) {
		log.debug("attaching clean ShpcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShpcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShpcCtrlDAO) ctx.getBean("ShpcCtrlDAO");
	}
}