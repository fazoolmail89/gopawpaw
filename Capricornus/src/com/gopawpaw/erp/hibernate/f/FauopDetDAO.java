package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FauopDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FauopDet
 * @author MyEclipse Persistence Tools
 */

public class FauopDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FauopDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FauopDet transientInstance) {
		log.debug("saving FauopDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FauopDet persistentInstance) {
		log.debug("deleting FauopDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FauopDet findById(com.gopawpaw.erp.hibernate.f.FauopDetId id) {
		log.debug("getting FauopDet instance with id: " + id);
		try {
			FauopDet instance = (FauopDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FauopDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FauopDet instance) {
		log.debug("finding FauopDet instance by example");
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
		log.debug("finding FauopDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FauopDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FauopDet instances");
		try {
			String queryString = "from FauopDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FauopDet merge(FauopDet detachedInstance) {
		log.debug("merging FauopDet instance");
		try {
			FauopDet result = (FauopDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FauopDet instance) {
		log.debug("attaching dirty FauopDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FauopDet instance) {
		log.debug("attaching clean FauopDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FauopDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FauopDetDAO) ctx.getBean("FauopDetDAO");
	}
}