package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SgadDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SgadDet
 * @author MyEclipse Persistence Tools
 */

public class SgadDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SgadDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SgadDet transientInstance) {
		log.debug("saving SgadDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SgadDet persistentInstance) {
		log.debug("deleting SgadDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SgadDet findById(com.gopawpaw.erp.hibernate.s.SgadDetId id) {
		log.debug("getting SgadDet instance with id: " + id);
		try {
			SgadDet instance = (SgadDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SgadDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SgadDet instance) {
		log.debug("finding SgadDet instance by example");
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
		log.debug("finding SgadDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SgadDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SgadDet instances");
		try {
			String queryString = "from SgadDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SgadDet merge(SgadDet detachedInstance) {
		log.debug("merging SgadDet instance");
		try {
			SgadDet result = (SgadDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SgadDet instance) {
		log.debug("attaching dirty SgadDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SgadDet instance) {
		log.debug("attaching clean SgadDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SgadDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SgadDetDAO) ctx.getBean("SgadDetDAO");
	}
}