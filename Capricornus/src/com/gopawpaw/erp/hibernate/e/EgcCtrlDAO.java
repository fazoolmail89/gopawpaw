package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EgcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EgcCtrl
 * @author MyEclipse Persistence Tools
 */

public class EgcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EgcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EgcCtrl transientInstance) {
		log.debug("saving EgcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EgcCtrl persistentInstance) {
		log.debug("deleting EgcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EgcCtrl findById(com.gopawpaw.erp.hibernate.e.EgcCtrlId id) {
		log.debug("getting EgcCtrl instance with id: " + id);
		try {
			EgcCtrl instance = (EgcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EgcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EgcCtrl instance) {
		log.debug("finding EgcCtrl instance by example");
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
		log.debug("finding EgcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EgcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EgcCtrl instances");
		try {
			String queryString = "from EgcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EgcCtrl merge(EgcCtrl detachedInstance) {
		log.debug("merging EgcCtrl instance");
		try {
			EgcCtrl result = (EgcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EgcCtrl instance) {
		log.debug("attaching dirty EgcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EgcCtrl instance) {
		log.debug("attaching clean EgcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EgcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EgcCtrlDAO) ctx.getBean("EgcCtrlDAO");
	}
}