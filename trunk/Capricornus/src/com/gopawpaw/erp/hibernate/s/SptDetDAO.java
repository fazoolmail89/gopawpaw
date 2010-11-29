package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SptDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SptDet
 * @author MyEclipse Persistence Tools
 */

public class SptDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SptDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SptDet transientInstance) {
		log.debug("saving SptDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SptDet persistentInstance) {
		log.debug("deleting SptDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SptDet findById(com.gopawpaw.erp.hibernate.s.SptDetId id) {
		log.debug("getting SptDet instance with id: " + id);
		try {
			SptDet instance = (SptDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SptDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SptDet instance) {
		log.debug("finding SptDet instance by example");
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
		log.debug("finding SptDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SptDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SptDet instances");
		try {
			String queryString = "from SptDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SptDet merge(SptDet detachedInstance) {
		log.debug("merging SptDet instance");
		try {
			SptDet result = (SptDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SptDet instance) {
		log.debug("attaching dirty SptDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SptDet instance) {
		log.debug("attaching clean SptDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SptDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SptDetDAO) ctx.getBean("SptDetDAO");
	}
}