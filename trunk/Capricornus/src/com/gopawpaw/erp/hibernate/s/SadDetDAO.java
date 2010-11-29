package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SadDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SadDet
 * @author MyEclipse Persistence Tools
 */

public class SadDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SadDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SadDet transientInstance) {
		log.debug("saving SadDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SadDet persistentInstance) {
		log.debug("deleting SadDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SadDet findById(com.gopawpaw.erp.hibernate.s.SadDetId id) {
		log.debug("getting SadDet instance with id: " + id);
		try {
			SadDet instance = (SadDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SadDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SadDet instance) {
		log.debug("finding SadDet instance by example");
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
		log.debug("finding SadDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SadDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SadDet instances");
		try {
			String queryString = "from SadDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SadDet merge(SadDet detachedInstance) {
		log.debug("merging SadDet instance");
		try {
			SadDet result = (SadDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SadDet instance) {
		log.debug("attaching dirty SadDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SadDet instance) {
		log.debug("attaching clean SadDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SadDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SadDetDAO) ctx.getBean("SadDetDAO");
	}
}