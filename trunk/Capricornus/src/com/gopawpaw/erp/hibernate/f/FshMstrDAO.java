package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FshMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FshMstr
 * @author MyEclipse Persistence Tools
 */

public class FshMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FshMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FshMstr transientInstance) {
		log.debug("saving FshMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FshMstr persistentInstance) {
		log.debug("deleting FshMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FshMstr findById(com.gopawpaw.erp.hibernate.f.FshMstrId id) {
		log.debug("getting FshMstr instance with id: " + id);
		try {
			FshMstr instance = (FshMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FshMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FshMstr instance) {
		log.debug("finding FshMstr instance by example");
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
		log.debug("finding FshMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FshMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FshMstr instances");
		try {
			String queryString = "from FshMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FshMstr merge(FshMstr detachedInstance) {
		log.debug("merging FshMstr instance");
		try {
			FshMstr result = (FshMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FshMstr instance) {
		log.debug("attaching dirty FshMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FshMstr instance) {
		log.debug("attaching clean FshMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FshMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FshMstrDAO) ctx.getBean("FshMstrDAO");
	}
}