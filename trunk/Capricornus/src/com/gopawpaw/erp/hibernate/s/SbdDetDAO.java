package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SbdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SbdDet
 * @author MyEclipse Persistence Tools
 */

public class SbdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SbdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SbdDet transientInstance) {
		log.debug("saving SbdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SbdDet persistentInstance) {
		log.debug("deleting SbdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SbdDet findById(com.gopawpaw.erp.hibernate.s.SbdDetId id) {
		log.debug("getting SbdDet instance with id: " + id);
		try {
			SbdDet instance = (SbdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SbdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SbdDet instance) {
		log.debug("finding SbdDet instance by example");
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
		log.debug("finding SbdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SbdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SbdDet instances");
		try {
			String queryString = "from SbdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SbdDet merge(SbdDet detachedInstance) {
		log.debug("merging SbdDet instance");
		try {
			SbdDet result = (SbdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SbdDet instance) {
		log.debug("attaching dirty SbdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SbdDet instance) {
		log.debug("attaching clean SbdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SbdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SbdDetDAO) ctx.getBean("SbdDetDAO");
	}
}