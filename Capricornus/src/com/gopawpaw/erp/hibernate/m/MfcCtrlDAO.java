package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MfcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MfcCtrl
 * @author MyEclipse Persistence Tools
 */

public class MfcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MfcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MfcCtrl transientInstance) {
		log.debug("saving MfcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MfcCtrl persistentInstance) {
		log.debug("deleting MfcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MfcCtrl findById(com.gopawpaw.erp.hibernate.m.MfcCtrlId id) {
		log.debug("getting MfcCtrl instance with id: " + id);
		try {
			MfcCtrl instance = (MfcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MfcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MfcCtrl instance) {
		log.debug("finding MfcCtrl instance by example");
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
		log.debug("finding MfcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MfcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MfcCtrl instances");
		try {
			String queryString = "from MfcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MfcCtrl merge(MfcCtrl detachedInstance) {
		log.debug("merging MfcCtrl instance");
		try {
			MfcCtrl result = (MfcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MfcCtrl instance) {
		log.debug("attaching dirty MfcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MfcCtrl instance) {
		log.debug("attaching clean MfcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MfcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MfcCtrlDAO) ctx.getBean("MfcCtrlDAO");
	}
}