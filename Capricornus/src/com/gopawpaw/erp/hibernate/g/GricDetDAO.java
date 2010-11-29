package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GricDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GricDet
 * @author MyEclipse Persistence Tools
 */

public class GricDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GricDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GricDet transientInstance) {
		log.debug("saving GricDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GricDet persistentInstance) {
		log.debug("deleting GricDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GricDet findById(com.gopawpaw.erp.hibernate.g.GricDetId id) {
		log.debug("getting GricDet instance with id: " + id);
		try {
			GricDet instance = (GricDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GricDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GricDet instance) {
		log.debug("finding GricDet instance by example");
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
		log.debug("finding GricDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GricDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GricDet instances");
		try {
			String queryString = "from GricDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GricDet merge(GricDet detachedInstance) {
		log.debug("merging GricDet instance");
		try {
			GricDet result = (GricDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GricDet instance) {
		log.debug("attaching dirty GricDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GricDet instance) {
		log.debug("attaching clean GricDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GricDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GricDetDAO) ctx.getBean("GricDetDAO");
	}
}