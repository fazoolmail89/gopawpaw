package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DmwWkfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DmwWkfl
 * @author MyEclipse Persistence Tools
 */

public class DmwWkflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DmwWkflDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DmwWkfl transientInstance) {
		log.debug("saving DmwWkfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DmwWkfl persistentInstance) {
		log.debug("deleting DmwWkfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DmwWkfl findById(com.gopawpaw.erp.hibernate.d.DmwWkflId id) {
		log.debug("getting DmwWkfl instance with id: " + id);
		try {
			DmwWkfl instance = (DmwWkfl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DmwWkfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DmwWkfl instance) {
		log.debug("finding DmwWkfl instance by example");
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
		log.debug("finding DmwWkfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DmwWkfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DmwWkfl instances");
		try {
			String queryString = "from DmwWkfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DmwWkfl merge(DmwWkfl detachedInstance) {
		log.debug("merging DmwWkfl instance");
		try {
			DmwWkfl result = (DmwWkfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DmwWkfl instance) {
		log.debug("attaching dirty DmwWkfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DmwWkfl instance) {
		log.debug("attaching clean DmwWkfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DmwWkflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DmwWkflDAO) ctx.getBean("DmwWkflDAO");
	}
}