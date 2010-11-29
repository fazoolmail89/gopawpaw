package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlcrhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlcrhHist
 * @author MyEclipse Persistence Tools
 */

public class FlcrhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlcrhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlcrhHist transientInstance) {
		log.debug("saving FlcrhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlcrhHist persistentInstance) {
		log.debug("deleting FlcrhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlcrhHist findById(com.gopawpaw.erp.hibernate.f.FlcrhHistId id) {
		log.debug("getting FlcrhHist instance with id: " + id);
		try {
			FlcrhHist instance = (FlcrhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlcrhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlcrhHist instance) {
		log.debug("finding FlcrhHist instance by example");
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
		log.debug("finding FlcrhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlcrhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlcrhHist instances");
		try {
			String queryString = "from FlcrhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlcrhHist merge(FlcrhHist detachedInstance) {
		log.debug("merging FlcrhHist instance");
		try {
			FlcrhHist result = (FlcrhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlcrhHist instance) {
		log.debug("attaching dirty FlcrhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlcrhHist instance) {
		log.debug("attaching clean FlcrhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlcrhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlcrhHistDAO) ctx.getBean("FlcrhHistDAO");
	}
}