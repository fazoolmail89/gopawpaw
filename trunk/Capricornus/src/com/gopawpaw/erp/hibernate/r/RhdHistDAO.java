package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RhdHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RhdHist
 * @author MyEclipse Persistence Tools
 */

public class RhdHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RhdHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RhdHist transientInstance) {
		log.debug("saving RhdHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RhdHist persistentInstance) {
		log.debug("deleting RhdHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RhdHist findById(com.gopawpaw.erp.hibernate.r.RhdHistId id) {
		log.debug("getting RhdHist instance with id: " + id);
		try {
			RhdHist instance = (RhdHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RhdHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RhdHist instance) {
		log.debug("finding RhdHist instance by example");
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
		log.debug("finding RhdHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RhdHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RhdHist instances");
		try {
			String queryString = "from RhdHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RhdHist merge(RhdHist detachedInstance) {
		log.debug("merging RhdHist instance");
		try {
			RhdHist result = (RhdHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RhdHist instance) {
		log.debug("attaching dirty RhdHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RhdHist instance) {
		log.debug("attaching clean RhdHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RhdHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RhdHistDAO) ctx.getBean("RhdHistDAO");
	}
}