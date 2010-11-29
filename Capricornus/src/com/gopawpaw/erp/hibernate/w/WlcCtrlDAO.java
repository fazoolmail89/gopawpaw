package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WlcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WlcCtrl
 * @author MyEclipse Persistence Tools
 */

public class WlcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WlcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WlcCtrl transientInstance) {
		log.debug("saving WlcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WlcCtrl persistentInstance) {
		log.debug("deleting WlcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WlcCtrl findById(java.lang.String id) {
		log.debug("getting WlcCtrl instance with id: " + id);
		try {
			WlcCtrl instance = (WlcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WlcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WlcCtrl instance) {
		log.debug("finding WlcCtrl instance by example");
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
		log.debug("finding WlcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WlcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WlcCtrl instances");
		try {
			String queryString = "from WlcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WlcCtrl merge(WlcCtrl detachedInstance) {
		log.debug("merging WlcCtrl instance");
		try {
			WlcCtrl result = (WlcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WlcCtrl instance) {
		log.debug("attaching dirty WlcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WlcCtrl instance) {
		log.debug("attaching clean WlcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WlcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WlcCtrlDAO) ctx.getBean("WlcCtrlDAO");
	}
}