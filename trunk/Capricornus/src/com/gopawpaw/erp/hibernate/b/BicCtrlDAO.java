package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BicCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BicCtrl
 * @author MyEclipse Persistence Tools
 */

public class BicCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BicCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BicCtrl transientInstance) {
		log.debug("saving BicCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BicCtrl persistentInstance) {
		log.debug("deleting BicCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BicCtrl findById(java.lang.String id) {
		log.debug("getting BicCtrl instance with id: " + id);
		try {
			BicCtrl instance = (BicCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BicCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BicCtrl instance) {
		log.debug("finding BicCtrl instance by example");
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
		log.debug("finding BicCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BicCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BicCtrl instances");
		try {
			String queryString = "from BicCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BicCtrl merge(BicCtrl detachedInstance) {
		log.debug("merging BicCtrl instance");
		try {
			BicCtrl result = (BicCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BicCtrl instance) {
		log.debug("attaching dirty BicCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BicCtrl instance) {
		log.debug("attaching clean BicCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BicCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BicCtrlDAO) ctx.getBean("BicCtrlDAO");
	}
}