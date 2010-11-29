package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FacldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FacldDet
 * @author MyEclipse Persistence Tools
 */

public class FacldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FacldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FacldDet transientInstance) {
		log.debug("saving FacldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FacldDet persistentInstance) {
		log.debug("deleting FacldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FacldDet findById(com.gopawpaw.erp.hibernate.f.FacldDetId id) {
		log.debug("getting FacldDet instance with id: " + id);
		try {
			FacldDet instance = (FacldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FacldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FacldDet instance) {
		log.debug("finding FacldDet instance by example");
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
		log.debug("finding FacldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FacldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FacldDet instances");
		try {
			String queryString = "from FacldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FacldDet merge(FacldDet detachedInstance) {
		log.debug("merging FacldDet instance");
		try {
			FacldDet result = (FacldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FacldDet instance) {
		log.debug("attaching dirty FacldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FacldDet instance) {
		log.debug("attaching clean FacldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FacldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FacldDetDAO) ctx.getBean("FacldDetDAO");
	}
}