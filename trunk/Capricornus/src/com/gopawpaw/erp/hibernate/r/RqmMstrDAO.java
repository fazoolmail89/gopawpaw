package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqmMstr
 * @author MyEclipse Persistence Tools
 */

public class RqmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqmMstr transientInstance) {
		log.debug("saving RqmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqmMstr persistentInstance) {
		log.debug("deleting RqmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqmMstr findById(com.gopawpaw.erp.hibernate.r.RqmMstrId id) {
		log.debug("getting RqmMstr instance with id: " + id);
		try {
			RqmMstr instance = (RqmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqmMstr instance) {
		log.debug("finding RqmMstr instance by example");
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
		log.debug("finding RqmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqmMstr instances");
		try {
			String queryString = "from RqmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqmMstr merge(RqmMstr detachedInstance) {
		log.debug("merging RqmMstr instance");
		try {
			RqmMstr result = (RqmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqmMstr instance) {
		log.debug("attaching dirty RqmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqmMstr instance) {
		log.debug("attaching clean RqmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqmMstrDAO) ctx.getBean("RqmMstrDAO");
	}
}