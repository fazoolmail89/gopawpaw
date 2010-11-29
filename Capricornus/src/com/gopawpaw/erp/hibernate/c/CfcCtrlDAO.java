package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CfcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CfcCtrl
 * @author MyEclipse Persistence Tools
 */

public class CfcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CfcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CfcCtrl transientInstance) {
		log.debug("saving CfcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CfcCtrl persistentInstance) {
		log.debug("deleting CfcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CfcCtrl findById(java.lang.String id) {
		log.debug("getting CfcCtrl instance with id: " + id);
		try {
			CfcCtrl instance = (CfcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CfcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CfcCtrl instance) {
		log.debug("finding CfcCtrl instance by example");
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
		log.debug("finding CfcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CfcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CfcCtrl instances");
		try {
			String queryString = "from CfcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CfcCtrl merge(CfcCtrl detachedInstance) {
		log.debug("merging CfcCtrl instance");
		try {
			CfcCtrl result = (CfcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CfcCtrl instance) {
		log.debug("attaching dirty CfcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CfcCtrl instance) {
		log.debug("attaching clean CfcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CfcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CfcCtrlDAO) ctx.getBean("CfcCtrlDAO");
	}
}