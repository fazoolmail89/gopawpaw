package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ApmCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.ApmCtrl
 * @author MyEclipse Persistence Tools
 */

public class ApmCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ApmCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ApmCtrl transientInstance) {
		log.debug("saving ApmCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ApmCtrl persistentInstance) {
		log.debug("deleting ApmCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ApmCtrl findById(java.lang.String id) {
		log.debug("getting ApmCtrl instance with id: " + id);
		try {
			ApmCtrl instance = (ApmCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.ApmCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ApmCtrl instance) {
		log.debug("finding ApmCtrl instance by example");
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
		log.debug("finding ApmCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ApmCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ApmCtrl instances");
		try {
			String queryString = "from ApmCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ApmCtrl merge(ApmCtrl detachedInstance) {
		log.debug("merging ApmCtrl instance");
		try {
			ApmCtrl result = (ApmCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ApmCtrl instance) {
		log.debug("attaching dirty ApmCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ApmCtrl instance) {
		log.debug("attaching clean ApmCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ApmCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ApmCtrlDAO) ctx.getBean("ApmCtrlDAO");
	}
}