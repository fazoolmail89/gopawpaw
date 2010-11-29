package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FisMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FisMstr
 * @author MyEclipse Persistence Tools
 */

public class FisMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FisMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FisMstr transientInstance) {
		log.debug("saving FisMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FisMstr persistentInstance) {
		log.debug("deleting FisMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FisMstr findById(com.gopawpaw.erp.hibernate.f.FisMstrId id) {
		log.debug("getting FisMstr instance with id: " + id);
		try {
			FisMstr instance = (FisMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FisMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FisMstr instance) {
		log.debug("finding FisMstr instance by example");
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
		log.debug("finding FisMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FisMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FisMstr instances");
		try {
			String queryString = "from FisMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FisMstr merge(FisMstr detachedInstance) {
		log.debug("merging FisMstr instance");
		try {
			FisMstr result = (FisMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FisMstr instance) {
		log.debug("attaching dirty FisMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FisMstr instance) {
		log.debug("attaching clean FisMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FisMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FisMstrDAO) ctx.getBean("FisMstrDAO");
	}
}