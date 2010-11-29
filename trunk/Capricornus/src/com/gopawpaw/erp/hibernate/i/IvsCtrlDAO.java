package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IvsCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IvsCtrl
 * @author MyEclipse Persistence Tools
 */

public class IvsCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IvsCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IvsCtrl transientInstance) {
		log.debug("saving IvsCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IvsCtrl persistentInstance) {
		log.debug("deleting IvsCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IvsCtrl findById(java.lang.String id) {
		log.debug("getting IvsCtrl instance with id: " + id);
		try {
			IvsCtrl instance = (IvsCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IvsCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IvsCtrl instance) {
		log.debug("finding IvsCtrl instance by example");
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
		log.debug("finding IvsCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IvsCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IvsCtrl instances");
		try {
			String queryString = "from IvsCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IvsCtrl merge(IvsCtrl detachedInstance) {
		log.debug("merging IvsCtrl instance");
		try {
			IvsCtrl result = (IvsCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IvsCtrl instance) {
		log.debug("attaching dirty IvsCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IvsCtrl instance) {
		log.debug("attaching clean IvsCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IvsCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IvsCtrlDAO) ctx.getBean("IvsCtrlDAO");
	}
}