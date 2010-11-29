package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CostCal entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CostCal
 * @author MyEclipse Persistence Tools
 */

public class CostCalDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CostCalDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CostCal transientInstance) {
		log.debug("saving CostCal instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CostCal persistentInstance) {
		log.debug("deleting CostCal instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CostCal findById(com.gopawpaw.erp.hibernate.c.CostCalId id) {
		log.debug("getting CostCal instance with id: " + id);
		try {
			CostCal instance = (CostCal) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CostCal", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CostCal instance) {
		log.debug("finding CostCal instance by example");
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
		log.debug("finding CostCal instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CostCal as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CostCal instances");
		try {
			String queryString = "from CostCal";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CostCal merge(CostCal detachedInstance) {
		log.debug("merging CostCal instance");
		try {
			CostCal result = (CostCal) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CostCal instance) {
		log.debug("attaching dirty CostCal instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CostCal instance) {
		log.debug("attaching clean CostCal instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CostCalDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CostCalDAO) ctx.getBean("CostCalDAO");
	}
}