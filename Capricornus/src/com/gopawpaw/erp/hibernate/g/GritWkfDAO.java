package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GritWkf entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GritWkf
 * @author MyEclipse Persistence Tools
 */

public class GritWkfDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GritWkfDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GritWkf transientInstance) {
		log.debug("saving GritWkf instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GritWkf persistentInstance) {
		log.debug("deleting GritWkf instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GritWkf findById(com.gopawpaw.erp.hibernate.g.GritWkfId id) {
		log.debug("getting GritWkf instance with id: " + id);
		try {
			GritWkf instance = (GritWkf) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GritWkf", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GritWkf instance) {
		log.debug("finding GritWkf instance by example");
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
		log.debug("finding GritWkf instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GritWkf as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GritWkf instances");
		try {
			String queryString = "from GritWkf";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GritWkf merge(GritWkf detachedInstance) {
		log.debug("merging GritWkf instance");
		try {
			GritWkf result = (GritWkf) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GritWkf instance) {
		log.debug("attaching dirty GritWkf instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GritWkf instance) {
		log.debug("attaching clean GritWkf instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GritWkfDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GritWkfDAO) ctx.getBean("GritWkfDAO");
	}
}