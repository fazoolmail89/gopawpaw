package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SodDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SodDet
 * @author MyEclipse Persistence Tools
 */

public class SodDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SodDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SodDet transientInstance) {
		log.debug("saving SodDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SodDet persistentInstance) {
		log.debug("deleting SodDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SodDet findById(com.gopawpaw.erp.hibernate.s.SodDetId id) {
		log.debug("getting SodDet instance with id: " + id);
		try {
			SodDet instance = (SodDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SodDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SodDet instance) {
		log.debug("finding SodDet instance by example");
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
		log.debug("finding SodDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SodDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SodDet instances");
		try {
			String queryString = "from SodDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SodDet merge(SodDet detachedInstance) {
		log.debug("merging SodDet instance");
		try {
			SodDet result = (SodDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SodDet instance) {
		log.debug("attaching dirty SodDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SodDet instance) {
		log.debug("attaching clean SodDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SodDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SodDetDAO) ctx.getBean("SodDetDAO");
	}
}