package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IccCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IccCtrl
 * @author MyEclipse Persistence Tools
 */

public class IccCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IccCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IccCtrl transientInstance) {
		log.debug("saving IccCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IccCtrl persistentInstance) {
		log.debug("deleting IccCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IccCtrl findById(java.lang.String id) {
		log.debug("getting IccCtrl instance with id: " + id);
		try {
			IccCtrl instance = (IccCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IccCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IccCtrl instance) {
		log.debug("finding IccCtrl instance by example");
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
		log.debug("finding IccCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IccCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IccCtrl instances");
		try {
			String queryString = "from IccCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IccCtrl merge(IccCtrl detachedInstance) {
		log.debug("merging IccCtrl instance");
		try {
			IccCtrl result = (IccCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IccCtrl instance) {
		log.debug("attaching dirty IccCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IccCtrl instance) {
		log.debug("attaching clean IccCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IccCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IccCtrlDAO) ctx.getBean("IccCtrlDAO");
	}
}