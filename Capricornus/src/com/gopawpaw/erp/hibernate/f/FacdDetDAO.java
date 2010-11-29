package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FacdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FacdDet
 * @author MyEclipse Persistence Tools
 */

public class FacdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FacdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FacdDet transientInstance) {
		log.debug("saving FacdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FacdDet persistentInstance) {
		log.debug("deleting FacdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FacdDet findById(com.gopawpaw.erp.hibernate.f.FacdDetId id) {
		log.debug("getting FacdDet instance with id: " + id);
		try {
			FacdDet instance = (FacdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FacdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FacdDet instance) {
		log.debug("finding FacdDet instance by example");
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
		log.debug("finding FacdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FacdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FacdDet instances");
		try {
			String queryString = "from FacdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FacdDet merge(FacdDet detachedInstance) {
		log.debug("merging FacdDet instance");
		try {
			FacdDet result = (FacdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FacdDet instance) {
		log.debug("attaching dirty FacdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FacdDet instance) {
		log.debug("attaching clean FacdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FacdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FacdDetDAO) ctx.getBean("FacdDetDAO");
	}
}