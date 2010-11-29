package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxcCtrl
 * @author MyEclipse Persistence Tools
 */

public class TxcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxcCtrl transientInstance) {
		log.debug("saving TxcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxcCtrl persistentInstance) {
		log.debug("deleting TxcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxcCtrl findById(java.lang.String id) {
		log.debug("getting TxcCtrl instance with id: " + id);
		try {
			TxcCtrl instance = (TxcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxcCtrl instance) {
		log.debug("finding TxcCtrl instance by example");
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
		log.debug("finding TxcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxcCtrl instances");
		try {
			String queryString = "from TxcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxcCtrl merge(TxcCtrl detachedInstance) {
		log.debug("merging TxcCtrl instance");
		try {
			TxcCtrl result = (TxcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxcCtrl instance) {
		log.debug("attaching dirty TxcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxcCtrl instance) {
		log.debug("attaching clean TxcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxcCtrlDAO) ctx.getBean("TxcCtrlDAO");
	}
}