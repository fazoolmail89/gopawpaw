package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GlcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GlcdDet
 * @author MyEclipse Persistence Tools
 */

public class GlcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GlcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GlcdDet transientInstance) {
		log.debug("saving GlcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GlcdDet persistentInstance) {
		log.debug("deleting GlcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GlcdDet findById(com.gopawpaw.erp.hibernate.g.GlcdDetId id) {
		log.debug("getting GlcdDet instance with id: " + id);
		try {
			GlcdDet instance = (GlcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GlcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GlcdDet instance) {
		log.debug("finding GlcdDet instance by example");
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
		log.debug("finding GlcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GlcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GlcdDet instances");
		try {
			String queryString = "from GlcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GlcdDet merge(GlcdDet detachedInstance) {
		log.debug("merging GlcdDet instance");
		try {
			GlcdDet result = (GlcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GlcdDet instance) {
		log.debug("attaching dirty GlcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GlcdDet instance) {
		log.debug("attaching clean GlcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GlcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GlcdDetDAO) ctx.getBean("GlcdDetDAO");
	}
}