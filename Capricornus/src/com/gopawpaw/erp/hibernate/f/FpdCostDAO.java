package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FpdCost entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FpdCost
 * @author MyEclipse Persistence Tools
 */

public class FpdCostDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FpdCostDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FpdCost transientInstance) {
		log.debug("saving FpdCost instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FpdCost persistentInstance) {
		log.debug("deleting FpdCost instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FpdCost findById(com.gopawpaw.erp.hibernate.f.FpdCostId id) {
		log.debug("getting FpdCost instance with id: " + id);
		try {
			FpdCost instance = (FpdCost) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FpdCost", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FpdCost instance) {
		log.debug("finding FpdCost instance by example");
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
		log.debug("finding FpdCost instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FpdCost as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FpdCost instances");
		try {
			String queryString = "from FpdCost";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FpdCost merge(FpdCost detachedInstance) {
		log.debug("merging FpdCost instance");
		try {
			FpdCost result = (FpdCost) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FpdCost instance) {
		log.debug("attaching dirty FpdCost instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FpdCost instance) {
		log.debug("attaching clean FpdCost instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FpdCostDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FpdCostDAO) ctx.getBean("FpdCostDAO");
	}
}