package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FcsSum entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FcsSum
 * @author MyEclipse Persistence Tools
 */

public class FcsSumDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FcsSumDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FcsSum transientInstance) {
		log.debug("saving FcsSum instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FcsSum persistentInstance) {
		log.debug("deleting FcsSum instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FcsSum findById(com.gopawpaw.erp.hibernate.f.FcsSumId id) {
		log.debug("getting FcsSum instance with id: " + id);
		try {
			FcsSum instance = (FcsSum) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FcsSum", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FcsSum instance) {
		log.debug("finding FcsSum instance by example");
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
		log.debug("finding FcsSum instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FcsSum as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FcsSum instances");
		try {
			String queryString = "from FcsSum";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FcsSum merge(FcsSum detachedInstance) {
		log.debug("merging FcsSum instance");
		try {
			FcsSum result = (FcsSum) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FcsSum instance) {
		log.debug("attaching dirty FcsSum instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FcsSum instance) {
		log.debug("attaching clean FcsSum instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FcsSumDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FcsSumDAO) ctx.getBean("FcsSumDAO");
	}
}