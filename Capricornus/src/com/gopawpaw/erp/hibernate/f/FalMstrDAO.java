package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FalMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FalMstr
 * @author MyEclipse Persistence Tools
 */

public class FalMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FalMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FalMstr transientInstance) {
		log.debug("saving FalMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FalMstr persistentInstance) {
		log.debug("deleting FalMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FalMstr findById(java.lang.String id) {
		log.debug("getting FalMstr instance with id: " + id);
		try {
			FalMstr instance = (FalMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FalMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FalMstr instance) {
		log.debug("finding FalMstr instance by example");
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
		log.debug("finding FalMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FalMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FalMstr instances");
		try {
			String queryString = "from FalMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FalMstr merge(FalMstr detachedInstance) {
		log.debug("merging FalMstr instance");
		try {
			FalMstr result = (FalMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FalMstr instance) {
		log.debug("attaching dirty FalMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FalMstr instance) {
		log.debug("attaching clean FalMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FalMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FalMstrDAO) ctx.getBean("FalMstrDAO");
	}
}