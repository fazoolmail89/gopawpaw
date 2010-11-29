package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LblcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LblcCtrl
 * @author MyEclipse Persistence Tools
 */

public class LblcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LblcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LblcCtrl transientInstance) {
		log.debug("saving LblcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LblcCtrl persistentInstance) {
		log.debug("deleting LblcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LblcCtrl findById(java.lang.Integer id) {
		log.debug("getting LblcCtrl instance with id: " + id);
		try {
			LblcCtrl instance = (LblcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LblcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LblcCtrl instance) {
		log.debug("finding LblcCtrl instance by example");
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
		log.debug("finding LblcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LblcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LblcCtrl instances");
		try {
			String queryString = "from LblcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LblcCtrl merge(LblcCtrl detachedInstance) {
		log.debug("merging LblcCtrl instance");
		try {
			LblcCtrl result = (LblcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LblcCtrl instance) {
		log.debug("attaching dirty LblcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LblcCtrl instance) {
		log.debug("attaching clean LblcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LblcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LblcCtrlDAO) ctx.getBean("LblcCtrlDAO");
	}
}