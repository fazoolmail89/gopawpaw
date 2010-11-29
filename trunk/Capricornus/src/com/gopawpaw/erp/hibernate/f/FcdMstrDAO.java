package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FcdMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FcdMstr
 * @author MyEclipse Persistence Tools
 */

public class FcdMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FcdMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FcdMstr transientInstance) {
		log.debug("saving FcdMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FcdMstr persistentInstance) {
		log.debug("deleting FcdMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FcdMstr findById(com.gopawpaw.erp.hibernate.f.FcdMstrId id) {
		log.debug("getting FcdMstr instance with id: " + id);
		try {
			FcdMstr instance = (FcdMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FcdMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FcdMstr instance) {
		log.debug("finding FcdMstr instance by example");
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
		log.debug("finding FcdMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FcdMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FcdMstr instances");
		try {
			String queryString = "from FcdMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FcdMstr merge(FcdMstr detachedInstance) {
		log.debug("merging FcdMstr instance");
		try {
			FcdMstr result = (FcdMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FcdMstr instance) {
		log.debug("attaching dirty FcdMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FcdMstr instance) {
		log.debug("attaching clean FcdMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FcdMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FcdMstrDAO) ctx.getBean("FcdMstrDAO");
	}
}