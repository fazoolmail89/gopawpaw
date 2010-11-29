package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TypMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TypMstr
 * @author MyEclipse Persistence Tools
 */

public class TypMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TypMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TypMstr transientInstance) {
		log.debug("saving TypMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TypMstr persistentInstance) {
		log.debug("deleting TypMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TypMstr findById(java.lang.String id) {
		log.debug("getting TypMstr instance with id: " + id);
		try {
			TypMstr instance = (TypMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TypMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TypMstr instance) {
		log.debug("finding TypMstr instance by example");
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
		log.debug("finding TypMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TypMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TypMstr instances");
		try {
			String queryString = "from TypMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TypMstr merge(TypMstr detachedInstance) {
		log.debug("merging TypMstr instance");
		try {
			TypMstr result = (TypMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TypMstr instance) {
		log.debug("attaching dirty TypMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TypMstr instance) {
		log.debug("attaching clean TypMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TypMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TypMstrDAO) ctx.getBean("TypMstrDAO");
	}
}