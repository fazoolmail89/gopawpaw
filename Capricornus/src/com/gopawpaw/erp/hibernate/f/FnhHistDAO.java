package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FnhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FnhHist
 * @author MyEclipse Persistence Tools
 */

public class FnhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FnhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FnhHist transientInstance) {
		log.debug("saving FnhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FnhHist persistentInstance) {
		log.debug("deleting FnhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FnhHist findById(com.gopawpaw.erp.hibernate.f.FnhHistId id) {
		log.debug("getting FnhHist instance with id: " + id);
		try {
			FnhHist instance = (FnhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FnhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FnhHist instance) {
		log.debug("finding FnhHist instance by example");
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
		log.debug("finding FnhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FnhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FnhHist instances");
		try {
			String queryString = "from FnhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FnhHist merge(FnhHist detachedInstance) {
		log.debug("merging FnhHist instance");
		try {
			FnhHist result = (FnhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FnhHist instance) {
		log.debug("attaching dirty FnhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FnhHist instance) {
		log.debug("attaching clean FnhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FnhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FnhHistDAO) ctx.getBean("FnhHistDAO");
	}
}