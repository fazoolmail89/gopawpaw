package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GlctDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GlctDet
 * @author MyEclipse Persistence Tools
 */

public class GlctDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GlctDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GlctDet transientInstance) {
		log.debug("saving GlctDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GlctDet persistentInstance) {
		log.debug("deleting GlctDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GlctDet findById(com.gopawpaw.erp.hibernate.g.GlctDetId id) {
		log.debug("getting GlctDet instance with id: " + id);
		try {
			GlctDet instance = (GlctDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GlctDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GlctDet instance) {
		log.debug("finding GlctDet instance by example");
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
		log.debug("finding GlctDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GlctDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GlctDet instances");
		try {
			String queryString = "from GlctDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GlctDet merge(GlctDet detachedInstance) {
		log.debug("merging GlctDet instance");
		try {
			GlctDet result = (GlctDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GlctDet instance) {
		log.debug("attaching dirty GlctDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GlctDet instance) {
		log.debug("attaching clean GlctDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GlctDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GlctDetDAO) ctx.getBean("GlctDetDAO");
	}
}