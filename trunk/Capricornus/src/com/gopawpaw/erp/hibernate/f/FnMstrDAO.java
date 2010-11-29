package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FnMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FnMstr
 * @author MyEclipse Persistence Tools
 */

public class FnMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FnMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FnMstr transientInstance) {
		log.debug("saving FnMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FnMstr persistentInstance) {
		log.debug("deleting FnMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FnMstr findById(com.gopawpaw.erp.hibernate.f.FnMstrId id) {
		log.debug("getting FnMstr instance with id: " + id);
		try {
			FnMstr instance = (FnMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FnMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FnMstr instance) {
		log.debug("finding FnMstr instance by example");
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
		log.debug("finding FnMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FnMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FnMstr instances");
		try {
			String queryString = "from FnMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FnMstr merge(FnMstr detachedInstance) {
		log.debug("merging FnMstr instance");
		try {
			FnMstr result = (FnMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FnMstr instance) {
		log.debug("attaching dirty FnMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FnMstr instance) {
		log.debug("attaching clean FnMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FnMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FnMstrDAO) ctx.getBean("FnMstrDAO");
	}
}