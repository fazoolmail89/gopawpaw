package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FalocMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FalocMstr
 * @author MyEclipse Persistence Tools
 */

public class FalocMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FalocMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FalocMstr transientInstance) {
		log.debug("saving FalocMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FalocMstr persistentInstance) {
		log.debug("deleting FalocMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FalocMstr findById(com.gopawpaw.erp.hibernate.f.FalocMstrId id) {
		log.debug("getting FalocMstr instance with id: " + id);
		try {
			FalocMstr instance = (FalocMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FalocMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FalocMstr instance) {
		log.debug("finding FalocMstr instance by example");
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
		log.debug("finding FalocMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FalocMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FalocMstr instances");
		try {
			String queryString = "from FalocMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FalocMstr merge(FalocMstr detachedInstance) {
		log.debug("merging FalocMstr instance");
		try {
			FalocMstr result = (FalocMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FalocMstr instance) {
		log.debug("attaching dirty FalocMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FalocMstr instance) {
		log.debug("attaching clean FalocMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FalocMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FalocMstrDAO) ctx.getBean("FalocMstrDAO");
	}
}