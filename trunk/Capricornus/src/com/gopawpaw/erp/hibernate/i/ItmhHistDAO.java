package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ItmhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.ItmhHist
 * @author MyEclipse Persistence Tools
 */

public class ItmhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ItmhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ItmhHist transientInstance) {
		log.debug("saving ItmhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ItmhHist persistentInstance) {
		log.debug("deleting ItmhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ItmhHist findById(com.gopawpaw.erp.hibernate.i.ItmhHistId id) {
		log.debug("getting ItmhHist instance with id: " + id);
		try {
			ItmhHist instance = (ItmhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.ItmhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ItmhHist instance) {
		log.debug("finding ItmhHist instance by example");
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
		log.debug("finding ItmhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ItmhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ItmhHist instances");
		try {
			String queryString = "from ItmhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ItmhHist merge(ItmhHist detachedInstance) {
		log.debug("merging ItmhHist instance");
		try {
			ItmhHist result = (ItmhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ItmhHist instance) {
		log.debug("attaching dirty ItmhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ItmhHist instance) {
		log.debug("attaching clean ItmhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ItmhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ItmhHistDAO) ctx.getBean("ItmhHistDAO");
	}
}