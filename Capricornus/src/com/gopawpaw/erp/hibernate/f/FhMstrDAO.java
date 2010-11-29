package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FhMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FhMstr
 * @author MyEclipse Persistence Tools
 */

public class FhMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FhMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FhMstr transientInstance) {
		log.debug("saving FhMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FhMstr persistentInstance) {
		log.debug("deleting FhMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FhMstr findById(com.gopawpaw.erp.hibernate.f.FhMstrId id) {
		log.debug("getting FhMstr instance with id: " + id);
		try {
			FhMstr instance = (FhMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FhMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FhMstr instance) {
		log.debug("finding FhMstr instance by example");
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
		log.debug("finding FhMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FhMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FhMstr instances");
		try {
			String queryString = "from FhMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FhMstr merge(FhMstr detachedInstance) {
		log.debug("merging FhMstr instance");
		try {
			FhMstr result = (FhMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FhMstr instance) {
		log.debug("attaching dirty FhMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FhMstr instance) {
		log.debug("attaching clean FhMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FhMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FhMstrDAO) ctx.getBean("FhMstrDAO");
	}
}