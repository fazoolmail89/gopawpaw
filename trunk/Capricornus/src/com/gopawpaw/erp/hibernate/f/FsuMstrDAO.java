package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FsuMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FsuMstr
 * @author MyEclipse Persistence Tools
 */

public class FsuMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FsuMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FsuMstr transientInstance) {
		log.debug("saving FsuMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FsuMstr persistentInstance) {
		log.debug("deleting FsuMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FsuMstr findById(com.gopawpaw.erp.hibernate.f.FsuMstrId id) {
		log.debug("getting FsuMstr instance with id: " + id);
		try {
			FsuMstr instance = (FsuMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FsuMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FsuMstr instance) {
		log.debug("finding FsuMstr instance by example");
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
		log.debug("finding FsuMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FsuMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FsuMstr instances");
		try {
			String queryString = "from FsuMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FsuMstr merge(FsuMstr detachedInstance) {
		log.debug("merging FsuMstr instance");
		try {
			FsuMstr result = (FsuMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FsuMstr instance) {
		log.debug("attaching dirty FsuMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FsuMstr instance) {
		log.debug("attaching clean FsuMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FsuMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FsuMstrDAO) ctx.getBean("FsuMstrDAO");
	}
}