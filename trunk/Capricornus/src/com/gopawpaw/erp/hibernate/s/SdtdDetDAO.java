package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SdtdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SdtdDet
 * @author MyEclipse Persistence Tools
 */

public class SdtdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SdtdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SdtdDet transientInstance) {
		log.debug("saving SdtdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SdtdDet persistentInstance) {
		log.debug("deleting SdtdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SdtdDet findById(com.gopawpaw.erp.hibernate.s.SdtdDetId id) {
		log.debug("getting SdtdDet instance with id: " + id);
		try {
			SdtdDet instance = (SdtdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SdtdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SdtdDet instance) {
		log.debug("finding SdtdDet instance by example");
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
		log.debug("finding SdtdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SdtdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SdtdDet instances");
		try {
			String queryString = "from SdtdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SdtdDet merge(SdtdDet detachedInstance) {
		log.debug("merging SdtdDet instance");
		try {
			SdtdDet result = (SdtdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SdtdDet instance) {
		log.debug("attaching dirty SdtdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SdtdDet instance) {
		log.debug("attaching clean SdtdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SdtdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SdtdDetDAO) ctx.getBean("SdtdDetDAO");
	}
}