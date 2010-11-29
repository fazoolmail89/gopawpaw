package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ClsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.ClsMstr
 * @author MyEclipse Persistence Tools
 */

public class ClsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ClsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ClsMstr transientInstance) {
		log.debug("saving ClsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ClsMstr persistentInstance) {
		log.debug("deleting ClsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ClsMstr findById(java.lang.String id) {
		log.debug("getting ClsMstr instance with id: " + id);
		try {
			ClsMstr instance = (ClsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.ClsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ClsMstr instance) {
		log.debug("finding ClsMstr instance by example");
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
		log.debug("finding ClsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ClsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ClsMstr instances");
		try {
			String queryString = "from ClsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ClsMstr merge(ClsMstr detachedInstance) {
		log.debug("merging ClsMstr instance");
		try {
			ClsMstr result = (ClsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ClsMstr instance) {
		log.debug("attaching dirty ClsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ClsMstr instance) {
		log.debug("attaching clean ClsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ClsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ClsMstrDAO) ctx.getBean("ClsMstrDAO");
	}
}