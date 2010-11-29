package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SbidDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SbidDet
 * @author MyEclipse Persistence Tools
 */

public class SbidDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SbidDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SbidDet transientInstance) {
		log.debug("saving SbidDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SbidDet persistentInstance) {
		log.debug("deleting SbidDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SbidDet findById(com.gopawpaw.erp.hibernate.s.SbidDetId id) {
		log.debug("getting SbidDet instance with id: " + id);
		try {
			SbidDet instance = (SbidDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SbidDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SbidDet instance) {
		log.debug("finding SbidDet instance by example");
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
		log.debug("finding SbidDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SbidDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SbidDet instances");
		try {
			String queryString = "from SbidDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SbidDet merge(SbidDet detachedInstance) {
		log.debug("merging SbidDet instance");
		try {
			SbidDet result = (SbidDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SbidDet instance) {
		log.debug("attaching dirty SbidDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SbidDet instance) {
		log.debug("attaching clean SbidDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SbidDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SbidDetDAO) ctx.getBean("SbidDetDAO");
	}
}