package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ExruUsage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.ExruUsage
 * @author MyEclipse Persistence Tools
 */

public class ExruUsageDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ExruUsageDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ExruUsage transientInstance) {
		log.debug("saving ExruUsage instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ExruUsage persistentInstance) {
		log.debug("deleting ExruUsage instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExruUsage findById(com.gopawpaw.erp.hibernate.e.ExruUsageId id) {
		log.debug("getting ExruUsage instance with id: " + id);
		try {
			ExruUsage instance = (ExruUsage) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.ExruUsage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ExruUsage instance) {
		log.debug("finding ExruUsage instance by example");
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
		log.debug("finding ExruUsage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ExruUsage as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ExruUsage instances");
		try {
			String queryString = "from ExruUsage";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ExruUsage merge(ExruUsage detachedInstance) {
		log.debug("merging ExruUsage instance");
		try {
			ExruUsage result = (ExruUsage) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ExruUsage instance) {
		log.debug("attaching dirty ExruUsage instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExruUsage instance) {
		log.debug("attaching clean ExruUsage instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ExruUsageDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ExruUsageDAO) ctx.getBean("ExruUsageDAO");
	}
}