package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FfMstr
 * @author MyEclipse Persistence Tools
 */

public class FfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FfMstr transientInstance) {
		log.debug("saving FfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FfMstr persistentInstance) {
		log.debug("deleting FfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FfMstr findById(com.gopawpaw.erp.hibernate.f.FfMstrId id) {
		log.debug("getting FfMstr instance with id: " + id);
		try {
			FfMstr instance = (FfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FfMstr instance) {
		log.debug("finding FfMstr instance by example");
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
		log.debug("finding FfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FfMstr instances");
		try {
			String queryString = "from FfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FfMstr merge(FfMstr detachedInstance) {
		log.debug("merging FfMstr instance");
		try {
			FfMstr result = (FfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FfMstr instance) {
		log.debug("attaching dirty FfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FfMstr instance) {
		log.debug("attaching clean FfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FfMstrDAO) ctx.getBean("FfMstrDAO");
	}
}