package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SctDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SctDet
 * @author MyEclipse Persistence Tools
 */

public class SctDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SctDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SctDet transientInstance) {
		log.debug("saving SctDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SctDet persistentInstance) {
		log.debug("deleting SctDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SctDet findById(com.gopawpaw.erp.hibernate.s.SctDetId id) {
		log.debug("getting SctDet instance with id: " + id);
		try {
			SctDet instance = (SctDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SctDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SctDet instance) {
		log.debug("finding SctDet instance by example");
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
		log.debug("finding SctDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SctDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SctDet instances");
		try {
			String queryString = "from SctDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SctDet merge(SctDet detachedInstance) {
		log.debug("merging SctDet instance");
		try {
			SctDet result = (SctDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SctDet instance) {
		log.debug("attaching dirty SctDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SctDet instance) {
		log.debug("attaching clean SctDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SctDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SctDetDAO) ctx.getBean("SctDetDAO");
	}
}