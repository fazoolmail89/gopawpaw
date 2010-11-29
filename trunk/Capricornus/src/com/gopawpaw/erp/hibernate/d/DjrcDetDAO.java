package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DjrcDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DjrcDet
 * @author MyEclipse Persistence Tools
 */

public class DjrcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DjrcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DjrcDet transientInstance) {
		log.debug("saving DjrcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DjrcDet persistentInstance) {
		log.debug("deleting DjrcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DjrcDet findById(com.gopawpaw.erp.hibernate.d.DjrcDetId id) {
		log.debug("getting DjrcDet instance with id: " + id);
		try {
			DjrcDet instance = (DjrcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DjrcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DjrcDet instance) {
		log.debug("finding DjrcDet instance by example");
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
		log.debug("finding DjrcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DjrcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DjrcDet instances");
		try {
			String queryString = "from DjrcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DjrcDet merge(DjrcDet detachedInstance) {
		log.debug("merging DjrcDet instance");
		try {
			DjrcDet result = (DjrcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DjrcDet instance) {
		log.debug("attaching dirty DjrcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DjrcDet instance) {
		log.debug("attaching clean DjrcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DjrcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DjrcDetDAO) ctx.getBean("DjrcDetDAO");
	}
}