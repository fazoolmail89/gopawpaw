package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SrcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SrcCtrl
 * @author MyEclipse Persistence Tools
 */

public class SrcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SrcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SrcCtrl transientInstance) {
		log.debug("saving SrcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SrcCtrl persistentInstance) {
		log.debug("deleting SrcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SrcCtrl findById(java.lang.String id) {
		log.debug("getting SrcCtrl instance with id: " + id);
		try {
			SrcCtrl instance = (SrcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SrcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SrcCtrl instance) {
		log.debug("finding SrcCtrl instance by example");
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
		log.debug("finding SrcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SrcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SrcCtrl instances");
		try {
			String queryString = "from SrcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SrcCtrl merge(SrcCtrl detachedInstance) {
		log.debug("merging SrcCtrl instance");
		try {
			SrcCtrl result = (SrcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SrcCtrl instance) {
		log.debug("attaching dirty SrcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SrcCtrl instance) {
		log.debug("attaching clean SrcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SrcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SrcCtrlDAO) ctx.getBean("SrcCtrlDAO");
	}
}