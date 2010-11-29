package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RpsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RpsMstr
 * @author MyEclipse Persistence Tools
 */

public class RpsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RpsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RpsMstr transientInstance) {
		log.debug("saving RpsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RpsMstr persistentInstance) {
		log.debug("deleting RpsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RpsMstr findById(com.gopawpaw.erp.hibernate.r.RpsMstrId id) {
		log.debug("getting RpsMstr instance with id: " + id);
		try {
			RpsMstr instance = (RpsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RpsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RpsMstr instance) {
		log.debug("finding RpsMstr instance by example");
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
		log.debug("finding RpsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RpsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RpsMstr instances");
		try {
			String queryString = "from RpsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RpsMstr merge(RpsMstr detachedInstance) {
		log.debug("merging RpsMstr instance");
		try {
			RpsMstr result = (RpsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RpsMstr instance) {
		log.debug("attaching dirty RpsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RpsMstr instance) {
		log.debug("attaching clean RpsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RpsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RpsMstrDAO) ctx.getBean("RpsMstrDAO");
	}
}