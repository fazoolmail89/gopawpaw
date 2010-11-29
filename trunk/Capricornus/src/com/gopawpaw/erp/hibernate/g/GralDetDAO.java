package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GralDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GralDet
 * @author MyEclipse Persistence Tools
 */

public class GralDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GralDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GralDet transientInstance) {
		log.debug("saving GralDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GralDet persistentInstance) {
		log.debug("deleting GralDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GralDet findById(com.gopawpaw.erp.hibernate.g.GralDetId id) {
		log.debug("getting GralDet instance with id: " + id);
		try {
			GralDet instance = (GralDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GralDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GralDet instance) {
		log.debug("finding GralDet instance by example");
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
		log.debug("finding GralDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GralDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GralDet instances");
		try {
			String queryString = "from GralDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GralDet merge(GralDet detachedInstance) {
		log.debug("merging GralDet instance");
		try {
			GralDet result = (GralDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GralDet instance) {
		log.debug("attaching dirty GralDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GralDet instance) {
		log.debug("attaching clean GralDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GralDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GralDetDAO) ctx.getBean("GralDetDAO");
	}
}