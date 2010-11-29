package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GlrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GlrdDet
 * @author MyEclipse Persistence Tools
 */

public class GlrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GlrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GlrdDet transientInstance) {
		log.debug("saving GlrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GlrdDet persistentInstance) {
		log.debug("deleting GlrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GlrdDet findById(com.gopawpaw.erp.hibernate.g.GlrdDetId id) {
		log.debug("getting GlrdDet instance with id: " + id);
		try {
			GlrdDet instance = (GlrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GlrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GlrdDet instance) {
		log.debug("finding GlrdDet instance by example");
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
		log.debug("finding GlrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GlrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GlrdDet instances");
		try {
			String queryString = "from GlrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GlrdDet merge(GlrdDet detachedInstance) {
		log.debug("merging GlrdDet instance");
		try {
			GlrdDet result = (GlrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GlrdDet instance) {
		log.debug("attaching dirty GlrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GlrdDet instance) {
		log.debug("attaching clean GlrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GlrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GlrdDetDAO) ctx.getBean("GlrdDetDAO");
	}
}