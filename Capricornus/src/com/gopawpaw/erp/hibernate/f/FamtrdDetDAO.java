package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FamtrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FamtrdDet
 * @author MyEclipse Persistence Tools
 */

public class FamtrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FamtrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FamtrdDet transientInstance) {
		log.debug("saving FamtrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FamtrdDet persistentInstance) {
		log.debug("deleting FamtrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FamtrdDet findById(com.gopawpaw.erp.hibernate.f.FamtrdDetId id) {
		log.debug("getting FamtrdDet instance with id: " + id);
		try {
			FamtrdDet instance = (FamtrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FamtrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FamtrdDet instance) {
		log.debug("finding FamtrdDet instance by example");
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
		log.debug("finding FamtrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FamtrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FamtrdDet instances");
		try {
			String queryString = "from FamtrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FamtrdDet merge(FamtrdDet detachedInstance) {
		log.debug("merging FamtrdDet instance");
		try {
			FamtrdDet result = (FamtrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FamtrdDet instance) {
		log.debug("attaching dirty FamtrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FamtrdDet instance) {
		log.debug("attaching clean FamtrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FamtrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FamtrdDetDAO) ctx.getBean("FamtrdDetDAO");
	}
}