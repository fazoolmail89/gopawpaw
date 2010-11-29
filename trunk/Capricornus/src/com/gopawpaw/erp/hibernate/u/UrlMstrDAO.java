package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UrlMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UrlMstr
 * @author MyEclipse Persistence Tools
 */

public class UrlMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UrlMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UrlMstr transientInstance) {
		log.debug("saving UrlMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UrlMstr persistentInstance) {
		log.debug("deleting UrlMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UrlMstr findById(com.gopawpaw.erp.hibernate.u.UrlMstrId id) {
		log.debug("getting UrlMstr instance with id: " + id);
		try {
			UrlMstr instance = (UrlMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UrlMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UrlMstr instance) {
		log.debug("finding UrlMstr instance by example");
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
		log.debug("finding UrlMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UrlMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UrlMstr instances");
		try {
			String queryString = "from UrlMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UrlMstr merge(UrlMstr detachedInstance) {
		log.debug("merging UrlMstr instance");
		try {
			UrlMstr result = (UrlMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UrlMstr instance) {
		log.debug("attaching dirty UrlMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UrlMstr instance) {
		log.debug("attaching clean UrlMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UrlMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UrlMstrDAO) ctx.getBean("UrlMstrDAO");
	}
}