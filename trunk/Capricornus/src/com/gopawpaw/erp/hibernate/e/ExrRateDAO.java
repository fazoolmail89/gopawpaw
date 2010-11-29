package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ExrRate entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.ExrRate
 * @author MyEclipse Persistence Tools
 */

public class ExrRateDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ExrRateDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ExrRate transientInstance) {
		log.debug("saving ExrRate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ExrRate persistentInstance) {
		log.debug("deleting ExrRate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExrRate findById(com.gopawpaw.erp.hibernate.e.ExrRateId id) {
		log.debug("getting ExrRate instance with id: " + id);
		try {
			ExrRate instance = (ExrRate) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.ExrRate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ExrRate instance) {
		log.debug("finding ExrRate instance by example");
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
		log.debug("finding ExrRate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ExrRate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ExrRate instances");
		try {
			String queryString = "from ExrRate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ExrRate merge(ExrRate detachedInstance) {
		log.debug("merging ExrRate instance");
		try {
			ExrRate result = (ExrRate) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ExrRate instance) {
		log.debug("attaching dirty ExrRate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExrRate instance) {
		log.debug("attaching clean ExrRate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ExrRateDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ExrRateDAO) ctx.getBean("ExrRateDAO");
	}
}