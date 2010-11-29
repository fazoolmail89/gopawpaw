package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FctMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FctMstr
 * @author MyEclipse Persistence Tools
 */

public class FctMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FctMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FctMstr transientInstance) {
		log.debug("saving FctMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FctMstr persistentInstance) {
		log.debug("deleting FctMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FctMstr findById(com.gopawpaw.erp.hibernate.f.FctMstrId id) {
		log.debug("getting FctMstr instance with id: " + id);
		try {
			FctMstr instance = (FctMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FctMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FctMstr instance) {
		log.debug("finding FctMstr instance by example");
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
		log.debug("finding FctMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FctMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FctMstr instances");
		try {
			String queryString = "from FctMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FctMstr merge(FctMstr detachedInstance) {
		log.debug("merging FctMstr instance");
		try {
			FctMstr result = (FctMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FctMstr instance) {
		log.debug("attaching dirty FctMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FctMstr instance) {
		log.debug("attaching clean FctMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FctMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FctMstrDAO) ctx.getBean("FctMstrDAO");
	}
}