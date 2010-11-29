package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqhHist
 * @author MyEclipse Persistence Tools
 */

public class RqhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqhHist transientInstance) {
		log.debug("saving RqhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqhHist persistentInstance) {
		log.debug("deleting RqhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqhHist findById(com.gopawpaw.erp.hibernate.r.RqhHistId id) {
		log.debug("getting RqhHist instance with id: " + id);
		try {
			RqhHist instance = (RqhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqhHist instance) {
		log.debug("finding RqhHist instance by example");
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
		log.debug("finding RqhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqhHist instances");
		try {
			String queryString = "from RqhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqhHist merge(RqhHist detachedInstance) {
		log.debug("merging RqhHist instance");
		try {
			RqhHist result = (RqhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqhHist instance) {
		log.debug("attaching dirty RqhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqhHist instance) {
		log.debug("attaching clean RqhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqhHistDAO) ctx.getBean("RqhHistDAO");
	}
}