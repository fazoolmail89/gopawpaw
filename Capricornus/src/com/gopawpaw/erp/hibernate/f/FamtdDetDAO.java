package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FamtdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FamtdDet
 * @author MyEclipse Persistence Tools
 */

public class FamtdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FamtdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FamtdDet transientInstance) {
		log.debug("saving FamtdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FamtdDet persistentInstance) {
		log.debug("deleting FamtdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FamtdDet findById(com.gopawpaw.erp.hibernate.f.FamtdDetId id) {
		log.debug("getting FamtdDet instance with id: " + id);
		try {
			FamtdDet instance = (FamtdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FamtdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FamtdDet instance) {
		log.debug("finding FamtdDet instance by example");
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
		log.debug("finding FamtdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FamtdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FamtdDet instances");
		try {
			String queryString = "from FamtdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FamtdDet merge(FamtdDet detachedInstance) {
		log.debug("merging FamtdDet instance");
		try {
			FamtdDet result = (FamtdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FamtdDet instance) {
		log.debug("attaching dirty FamtdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FamtdDet instance) {
		log.debug("attaching clean FamtdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FamtdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FamtdDetDAO) ctx.getBean("FamtdDetDAO");
	}
}