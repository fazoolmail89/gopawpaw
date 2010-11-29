package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrcdDet
 * @author MyEclipse Persistence Tools
 */

public class GrcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrcdDet transientInstance) {
		log.debug("saving GrcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrcdDet persistentInstance) {
		log.debug("deleting GrcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrcdDet findById(com.gopawpaw.erp.hibernate.g.GrcdDetId id) {
		log.debug("getting GrcdDet instance with id: " + id);
		try {
			GrcdDet instance = (GrcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrcdDet instance) {
		log.debug("finding GrcdDet instance by example");
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
		log.debug("finding GrcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrcdDet instances");
		try {
			String queryString = "from GrcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrcdDet merge(GrcdDet detachedInstance) {
		log.debug("merging GrcdDet instance");
		try {
			GrcdDet result = (GrcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrcdDet instance) {
		log.debug("attaching dirty GrcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrcdDet instance) {
		log.debug("attaching clean GrcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrcdDetDAO) ctx.getBean("GrcdDetDAO");
	}
}