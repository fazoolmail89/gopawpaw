package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqcMstr
 * @author MyEclipse Persistence Tools
 */

public class RqcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqcMstr transientInstance) {
		log.debug("saving RqcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqcMstr persistentInstance) {
		log.debug("deleting RqcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqcMstr findById(com.gopawpaw.erp.hibernate.r.RqcMstrId id) {
		log.debug("getting RqcMstr instance with id: " + id);
		try {
			RqcMstr instance = (RqcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqcMstr instance) {
		log.debug("finding RqcMstr instance by example");
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
		log.debug("finding RqcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqcMstr instances");
		try {
			String queryString = "from RqcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqcMstr merge(RqcMstr detachedInstance) {
		log.debug("merging RqcMstr instance");
		try {
			RqcMstr result = (RqcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqcMstr instance) {
		log.debug("attaching dirty RqcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqcMstr instance) {
		log.debug("attaching clean RqcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqcMstrDAO) ctx.getBean("RqcMstrDAO");
	}
}