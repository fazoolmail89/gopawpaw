package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DrpCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DrpCtrl
 * @author MyEclipse Persistence Tools
 */

public class DrpCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DrpCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DrpCtrl transientInstance) {
		log.debug("saving DrpCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DrpCtrl persistentInstance) {
		log.debug("deleting DrpCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DrpCtrl findById(java.lang.String id) {
		log.debug("getting DrpCtrl instance with id: " + id);
		try {
			DrpCtrl instance = (DrpCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DrpCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DrpCtrl instance) {
		log.debug("finding DrpCtrl instance by example");
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
		log.debug("finding DrpCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DrpCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DrpCtrl instances");
		try {
			String queryString = "from DrpCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DrpCtrl merge(DrpCtrl detachedInstance) {
		log.debug("merging DrpCtrl instance");
		try {
			DrpCtrl result = (DrpCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DrpCtrl instance) {
		log.debug("attaching dirty DrpCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DrpCtrl instance) {
		log.debug("attaching clean DrpCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DrpCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DrpCtrlDAO) ctx.getBean("DrpCtrlDAO");
	}
}