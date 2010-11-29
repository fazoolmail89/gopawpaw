package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FwkMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FwkMstr
 * @author MyEclipse Persistence Tools
 */

public class FwkMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FwkMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FwkMstr transientInstance) {
		log.debug("saving FwkMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FwkMstr persistentInstance) {
		log.debug("deleting FwkMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FwkMstr findById(com.gopawpaw.erp.hibernate.f.FwkMstrId id) {
		log.debug("getting FwkMstr instance with id: " + id);
		try {
			FwkMstr instance = (FwkMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FwkMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FwkMstr instance) {
		log.debug("finding FwkMstr instance by example");
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
		log.debug("finding FwkMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FwkMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FwkMstr instances");
		try {
			String queryString = "from FwkMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FwkMstr merge(FwkMstr detachedInstance) {
		log.debug("merging FwkMstr instance");
		try {
			FwkMstr result = (FwkMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FwkMstr instance) {
		log.debug("attaching dirty FwkMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FwkMstr instance) {
		log.debug("attaching clean FwkMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FwkMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FwkMstrDAO) ctx.getBean("FwkMstrDAO");
	}
}