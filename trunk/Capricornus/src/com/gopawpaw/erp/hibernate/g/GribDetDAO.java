package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GribDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GribDet
 * @author MyEclipse Persistence Tools
 */

public class GribDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GribDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GribDet transientInstance) {
		log.debug("saving GribDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GribDet persistentInstance) {
		log.debug("deleting GribDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GribDet findById(com.gopawpaw.erp.hibernate.g.GribDetId id) {
		log.debug("getting GribDet instance with id: " + id);
		try {
			GribDet instance = (GribDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GribDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GribDet instance) {
		log.debug("finding GribDet instance by example");
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
		log.debug("finding GribDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GribDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GribDet instances");
		try {
			String queryString = "from GribDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GribDet merge(GribDet detachedInstance) {
		log.debug("merging GribDet instance");
		try {
			GribDet result = (GribDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GribDet instance) {
		log.debug("attaching dirty GribDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GribDet instance) {
		log.debug("attaching clean GribDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GribDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GribDetDAO) ctx.getBean("GribDetDAO");
	}
}