package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqrMstr
 * @author MyEclipse Persistence Tools
 */

public class RqrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqrMstr transientInstance) {
		log.debug("saving RqrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqrMstr persistentInstance) {
		log.debug("deleting RqrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqrMstr findById(com.gopawpaw.erp.hibernate.r.RqrMstrId id) {
		log.debug("getting RqrMstr instance with id: " + id);
		try {
			RqrMstr instance = (RqrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqrMstr instance) {
		log.debug("finding RqrMstr instance by example");
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
		log.debug("finding RqrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqrMstr instances");
		try {
			String queryString = "from RqrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqrMstr merge(RqrMstr detachedInstance) {
		log.debug("merging RqrMstr instance");
		try {
			RqrMstr result = (RqrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqrMstr instance) {
		log.debug("attaching dirty RqrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqrMstr instance) {
		log.debug("attaching clean RqrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqrMstrDAO) ctx.getBean("RqrMstrDAO");
	}
}