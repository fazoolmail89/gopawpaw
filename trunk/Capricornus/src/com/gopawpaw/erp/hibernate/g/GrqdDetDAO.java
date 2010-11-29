package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrqdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrqdDet
 * @author MyEclipse Persistence Tools
 */

public class GrqdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrqdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrqdDet transientInstance) {
		log.debug("saving GrqdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrqdDet persistentInstance) {
		log.debug("deleting GrqdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrqdDet findById(com.gopawpaw.erp.hibernate.g.GrqdDetId id) {
		log.debug("getting GrqdDet instance with id: " + id);
		try {
			GrqdDet instance = (GrqdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrqdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrqdDet instance) {
		log.debug("finding GrqdDet instance by example");
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
		log.debug("finding GrqdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrqdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrqdDet instances");
		try {
			String queryString = "from GrqdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrqdDet merge(GrqdDet detachedInstance) {
		log.debug("merging GrqdDet instance");
		try {
			GrqdDet result = (GrqdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrqdDet instance) {
		log.debug("attaching dirty GrqdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrqdDet instance) {
		log.debug("attaching clean GrqdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrqdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrqdDetDAO) ctx.getBean("GrqdDetDAO");
	}
}