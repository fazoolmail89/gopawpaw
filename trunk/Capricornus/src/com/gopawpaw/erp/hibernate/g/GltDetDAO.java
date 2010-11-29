package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GltDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GltDet
 * @author MyEclipse Persistence Tools
 */

public class GltDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GltDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GltDet transientInstance) {
		log.debug("saving GltDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GltDet persistentInstance) {
		log.debug("deleting GltDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GltDet findById(com.gopawpaw.erp.hibernate.g.GltDetId id) {
		log.debug("getting GltDet instance with id: " + id);
		try {
			GltDet instance = (GltDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GltDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GltDet instance) {
		log.debug("finding GltDet instance by example");
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
		log.debug("finding GltDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GltDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GltDet instances");
		try {
			String queryString = "from GltDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GltDet merge(GltDet detachedInstance) {
		log.debug("merging GltDet instance");
		try {
			GltDet result = (GltDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GltDet instance) {
		log.debug("attaching dirty GltDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GltDet instance) {
		log.debug("attaching clean GltDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GltDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GltDetDAO) ctx.getBean("GltDetDAO");
	}
}