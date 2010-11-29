package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FabkMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FabkMstr
 * @author MyEclipse Persistence Tools
 */

public class FabkMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FabkMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FabkMstr transientInstance) {
		log.debug("saving FabkMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FabkMstr persistentInstance) {
		log.debug("deleting FabkMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FabkMstr findById(com.gopawpaw.erp.hibernate.f.FabkMstrId id) {
		log.debug("getting FabkMstr instance with id: " + id);
		try {
			FabkMstr instance = (FabkMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FabkMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FabkMstr instance) {
		log.debug("finding FabkMstr instance by example");
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
		log.debug("finding FabkMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FabkMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FabkMstr instances");
		try {
			String queryString = "from FabkMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FabkMstr merge(FabkMstr detachedInstance) {
		log.debug("merging FabkMstr instance");
		try {
			FabkMstr result = (FabkMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FabkMstr instance) {
		log.debug("attaching dirty FabkMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FabkMstr instance) {
		log.debug("attaching clean FabkMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FabkMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FabkMstrDAO) ctx.getBean("FabkMstrDAO");
	}
}