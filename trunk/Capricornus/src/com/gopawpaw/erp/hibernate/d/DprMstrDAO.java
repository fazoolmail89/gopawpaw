package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DprMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DprMstr
 * @author MyEclipse Persistence Tools
 */

public class DprMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DprMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DprMstr transientInstance) {
		log.debug("saving DprMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DprMstr persistentInstance) {
		log.debug("deleting DprMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DprMstr findById(java.lang.String id) {
		log.debug("getting DprMstr instance with id: " + id);
		try {
			DprMstr instance = (DprMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DprMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DprMstr instance) {
		log.debug("finding DprMstr instance by example");
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
		log.debug("finding DprMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DprMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DprMstr instances");
		try {
			String queryString = "from DprMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DprMstr merge(DprMstr detachedInstance) {
		log.debug("merging DprMstr instance");
		try {
			DprMstr result = (DprMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DprMstr instance) {
		log.debug("attaching dirty DprMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DprMstr instance) {
		log.debug("attaching clean DprMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DprMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DprMstrDAO) ctx.getBean("DprMstrDAO");
	}
}