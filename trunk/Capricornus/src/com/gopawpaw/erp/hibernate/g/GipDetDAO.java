package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GipDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GipDet
 * @author MyEclipse Persistence Tools
 */

public class GipDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GipDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GipDet transientInstance) {
		log.debug("saving GipDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GipDet persistentInstance) {
		log.debug("deleting GipDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GipDet findById(com.gopawpaw.erp.hibernate.g.GipDetId id) {
		log.debug("getting GipDet instance with id: " + id);
		try {
			GipDet instance = (GipDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GipDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GipDet instance) {
		log.debug("finding GipDet instance by example");
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
		log.debug("finding GipDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GipDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GipDet instances");
		try {
			String queryString = "from GipDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GipDet merge(GipDet detachedInstance) {
		log.debug("merging GipDet instance");
		try {
			GipDet result = (GipDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GipDet instance) {
		log.debug("attaching dirty GipDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GipDet instance) {
		log.debug("attaching clean GipDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GipDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GipDetDAO) ctx.getBean("GipDetDAO");
	}
}