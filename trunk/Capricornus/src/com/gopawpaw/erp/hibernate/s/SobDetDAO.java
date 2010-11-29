package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SobDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SobDet
 * @author MyEclipse Persistence Tools
 */

public class SobDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SobDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SobDet transientInstance) {
		log.debug("saving SobDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SobDet persistentInstance) {
		log.debug("deleting SobDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SobDet findById(com.gopawpaw.erp.hibernate.s.SobDetId id) {
		log.debug("getting SobDet instance with id: " + id);
		try {
			SobDet instance = (SobDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SobDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SobDet instance) {
		log.debug("finding SobDet instance by example");
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
		log.debug("finding SobDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SobDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SobDet instances");
		try {
			String queryString = "from SobDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SobDet merge(SobDet detachedInstance) {
		log.debug("merging SobDet instance");
		try {
			SobDet result = (SobDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SobDet instance) {
		log.debug("attaching dirty SobDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SobDet instance) {
		log.debug("attaching clean SobDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SobDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SobDetDAO) ctx.getBean("SobDetDAO");
	}
}