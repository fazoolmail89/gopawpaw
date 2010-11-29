package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ApcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.ApcCtrl
 * @author MyEclipse Persistence Tools
 */

public class ApcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ApcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ApcCtrl transientInstance) {
		log.debug("saving ApcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ApcCtrl persistentInstance) {
		log.debug("deleting ApcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ApcCtrl findById(java.lang.String id) {
		log.debug("getting ApcCtrl instance with id: " + id);
		try {
			ApcCtrl instance = (ApcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.ApcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ApcCtrl instance) {
		log.debug("finding ApcCtrl instance by example");
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
		log.debug("finding ApcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ApcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ApcCtrl instances");
		try {
			String queryString = "from ApcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ApcCtrl merge(ApcCtrl detachedInstance) {
		log.debug("merging ApcCtrl instance");
		try {
			ApcCtrl result = (ApcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ApcCtrl instance) {
		log.debug("attaching dirty ApcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ApcCtrl instance) {
		log.debug("attaching clean ApcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ApcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ApcCtrlDAO) ctx.getBean("ApcCtrlDAO");
	}
}