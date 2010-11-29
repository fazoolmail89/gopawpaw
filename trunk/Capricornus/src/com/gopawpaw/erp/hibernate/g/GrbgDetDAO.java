package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrbgDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrbgDet
 * @author MyEclipse Persistence Tools
 */

public class GrbgDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrbgDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrbgDet transientInstance) {
		log.debug("saving GrbgDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrbgDet persistentInstance) {
		log.debug("deleting GrbgDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrbgDet findById(com.gopawpaw.erp.hibernate.g.GrbgDetId id) {
		log.debug("getting GrbgDet instance with id: " + id);
		try {
			GrbgDet instance = (GrbgDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrbgDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrbgDet instance) {
		log.debug("finding GrbgDet instance by example");
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
		log.debug("finding GrbgDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrbgDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrbgDet instances");
		try {
			String queryString = "from GrbgDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrbgDet merge(GrbgDet detachedInstance) {
		log.debug("merging GrbgDet instance");
		try {
			GrbgDet result = (GrbgDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrbgDet instance) {
		log.debug("attaching dirty GrbgDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrbgDet instance) {
		log.debug("attaching clean GrbgDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrbgDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrbgDetDAO) ctx.getBean("GrbgDetDAO");
	}
}