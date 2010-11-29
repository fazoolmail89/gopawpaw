package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ArcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.ArcCtrl
 * @author MyEclipse Persistence Tools
 */

public class ArcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ArcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ArcCtrl transientInstance) {
		log.debug("saving ArcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ArcCtrl persistentInstance) {
		log.debug("deleting ArcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArcCtrl findById(java.lang.String id) {
		log.debug("getting ArcCtrl instance with id: " + id);
		try {
			ArcCtrl instance = (ArcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.ArcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ArcCtrl instance) {
		log.debug("finding ArcCtrl instance by example");
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
		log.debug("finding ArcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ArcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ArcCtrl instances");
		try {
			String queryString = "from ArcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ArcCtrl merge(ArcCtrl detachedInstance) {
		log.debug("merging ArcCtrl instance");
		try {
			ArcCtrl result = (ArcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ArcCtrl instance) {
		log.debug("attaching dirty ArcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArcCtrl instance) {
		log.debug("attaching clean ArcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ArcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ArcCtrlDAO) ctx.getBean("ArcCtrlDAO");
	}
}