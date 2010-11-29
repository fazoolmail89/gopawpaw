package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrtxDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrtxDet
 * @author MyEclipse Persistence Tools
 */

public class GrtxDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrtxDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrtxDet transientInstance) {
		log.debug("saving GrtxDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrtxDet persistentInstance) {
		log.debug("deleting GrtxDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrtxDet findById(com.gopawpaw.erp.hibernate.g.GrtxDetId id) {
		log.debug("getting GrtxDet instance with id: " + id);
		try {
			GrtxDet instance = (GrtxDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrtxDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrtxDet instance) {
		log.debug("finding GrtxDet instance by example");
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
		log.debug("finding GrtxDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrtxDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrtxDet instances");
		try {
			String queryString = "from GrtxDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrtxDet merge(GrtxDet detachedInstance) {
		log.debug("merging GrtxDet instance");
		try {
			GrtxDet result = (GrtxDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrtxDet instance) {
		log.debug("attaching dirty GrtxDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrtxDet instance) {
		log.debug("attaching clean GrtxDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrtxDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrtxDetDAO) ctx.getBean("GrtxDetDAO");
	}
}