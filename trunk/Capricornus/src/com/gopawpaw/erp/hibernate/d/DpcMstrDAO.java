package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DpcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DpcMstr
 * @author MyEclipse Persistence Tools
 */

public class DpcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DpcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DpcMstr transientInstance) {
		log.debug("saving DpcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DpcMstr persistentInstance) {
		log.debug("deleting DpcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DpcMstr findById(java.lang.String id) {
		log.debug("getting DpcMstr instance with id: " + id);
		try {
			DpcMstr instance = (DpcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DpcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DpcMstr instance) {
		log.debug("finding DpcMstr instance by example");
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
		log.debug("finding DpcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DpcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DpcMstr instances");
		try {
			String queryString = "from DpcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DpcMstr merge(DpcMstr detachedInstance) {
		log.debug("merging DpcMstr instance");
		try {
			DpcMstr result = (DpcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DpcMstr instance) {
		log.debug("attaching dirty DpcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DpcMstr instance) {
		log.debug("attaching clean DpcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DpcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DpcMstrDAO) ctx.getBean("DpcMstrDAO");
	}
}