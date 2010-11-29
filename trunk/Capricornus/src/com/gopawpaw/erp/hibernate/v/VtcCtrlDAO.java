package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VtcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VtcCtrl
 * @author MyEclipse Persistence Tools
 */

public class VtcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VtcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VtcCtrl transientInstance) {
		log.debug("saving VtcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VtcCtrl persistentInstance) {
		log.debug("deleting VtcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VtcCtrl findById(java.lang.Integer id) {
		log.debug("getting VtcCtrl instance with id: " + id);
		try {
			VtcCtrl instance = (VtcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VtcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VtcCtrl instance) {
		log.debug("finding VtcCtrl instance by example");
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
		log.debug("finding VtcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VtcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VtcCtrl instances");
		try {
			String queryString = "from VtcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VtcCtrl merge(VtcCtrl detachedInstance) {
		log.debug("merging VtcCtrl instance");
		try {
			VtcCtrl result = (VtcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VtcCtrl instance) {
		log.debug("attaching dirty VtcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VtcCtrl instance) {
		log.debug("attaching clean VtcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VtcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VtcCtrlDAO) ctx.getBean("VtcCtrlDAO");
	}
}