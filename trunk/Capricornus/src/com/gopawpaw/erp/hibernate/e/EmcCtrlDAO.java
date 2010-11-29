package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EmcCtrl
 * @author MyEclipse Persistence Tools
 */

public class EmcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EmcCtrl transientInstance) {
		log.debug("saving EmcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmcCtrl persistentInstance) {
		log.debug("deleting EmcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmcCtrl findById(java.lang.String id) {
		log.debug("getting EmcCtrl instance with id: " + id);
		try {
			EmcCtrl instance = (EmcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EmcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmcCtrl instance) {
		log.debug("finding EmcCtrl instance by example");
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
		log.debug("finding EmcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmcCtrl instances");
		try {
			String queryString = "from EmcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmcCtrl merge(EmcCtrl detachedInstance) {
		log.debug("merging EmcCtrl instance");
		try {
			EmcCtrl result = (EmcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmcCtrl instance) {
		log.debug("attaching dirty EmcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmcCtrl instance) {
		log.debug("attaching clean EmcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmcCtrlDAO) ctx.getBean("EmcCtrlDAO");
	}
}