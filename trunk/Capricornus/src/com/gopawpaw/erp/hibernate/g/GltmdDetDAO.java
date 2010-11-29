package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GltmdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GltmdDet
 * @author MyEclipse Persistence Tools
 */

public class GltmdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GltmdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GltmdDet transientInstance) {
		log.debug("saving GltmdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GltmdDet persistentInstance) {
		log.debug("deleting GltmdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GltmdDet findById(com.gopawpaw.erp.hibernate.g.GltmdDetId id) {
		log.debug("getting GltmdDet instance with id: " + id);
		try {
			GltmdDet instance = (GltmdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GltmdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GltmdDet instance) {
		log.debug("finding GltmdDet instance by example");
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
		log.debug("finding GltmdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GltmdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GltmdDet instances");
		try {
			String queryString = "from GltmdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GltmdDet merge(GltmdDet detachedInstance) {
		log.debug("merging GltmdDet instance");
		try {
			GltmdDet result = (GltmdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GltmdDet instance) {
		log.debug("attaching dirty GltmdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GltmdDet instance) {
		log.debug("attaching clean GltmdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GltmdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GltmdDetDAO) ctx.getBean("GltmdDetDAO");
	}
}