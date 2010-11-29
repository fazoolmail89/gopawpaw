package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SodlcDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SodlcDet
 * @author MyEclipse Persistence Tools
 */

public class SodlcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SodlcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SodlcDet transientInstance) {
		log.debug("saving SodlcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SodlcDet persistentInstance) {
		log.debug("deleting SodlcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SodlcDet findById(com.gopawpaw.erp.hibernate.s.SodlcDetId id) {
		log.debug("getting SodlcDet instance with id: " + id);
		try {
			SodlcDet instance = (SodlcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SodlcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SodlcDet instance) {
		log.debug("finding SodlcDet instance by example");
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
		log.debug("finding SodlcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SodlcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SodlcDet instances");
		try {
			String queryString = "from SodlcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SodlcDet merge(SodlcDet detachedInstance) {
		log.debug("merging SodlcDet instance");
		try {
			SodlcDet result = (SodlcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SodlcDet instance) {
		log.debug("attaching dirty SodlcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SodlcDet instance) {
		log.debug("attaching clean SodlcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SodlcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SodlcDetDAO) ctx.getBean("SodlcDetDAO");
	}
}