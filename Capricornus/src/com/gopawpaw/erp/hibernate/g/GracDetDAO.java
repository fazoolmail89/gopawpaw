package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GracDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GracDet
 * @author MyEclipse Persistence Tools
 */

public class GracDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GracDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GracDet transientInstance) {
		log.debug("saving GracDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GracDet persistentInstance) {
		log.debug("deleting GracDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GracDet findById(com.gopawpaw.erp.hibernate.g.GracDetId id) {
		log.debug("getting GracDet instance with id: " + id);
		try {
			GracDet instance = (GracDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GracDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GracDet instance) {
		log.debug("finding GracDet instance by example");
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
		log.debug("finding GracDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GracDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GracDet instances");
		try {
			String queryString = "from GracDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GracDet merge(GracDet detachedInstance) {
		log.debug("merging GracDet instance");
		try {
			GracDet result = (GracDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GracDet instance) {
		log.debug("attaching dirty GracDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GracDet instance) {
		log.debug("attaching clean GracDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GracDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GracDetDAO) ctx.getBean("GracDetDAO");
	}
}