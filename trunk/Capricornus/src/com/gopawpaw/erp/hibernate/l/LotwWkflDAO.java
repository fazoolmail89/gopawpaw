package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LotwWkfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LotwWkfl
 * @author MyEclipse Persistence Tools
 */

public class LotwWkflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LotwWkflDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LotwWkfl transientInstance) {
		log.debug("saving LotwWkfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LotwWkfl persistentInstance) {
		log.debug("deleting LotwWkfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LotwWkfl findById(com.gopawpaw.erp.hibernate.l.LotwWkflId id) {
		log.debug("getting LotwWkfl instance with id: " + id);
		try {
			LotwWkfl instance = (LotwWkfl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LotwWkfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LotwWkfl instance) {
		log.debug("finding LotwWkfl instance by example");
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
		log.debug("finding LotwWkfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LotwWkfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LotwWkfl instances");
		try {
			String queryString = "from LotwWkfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LotwWkfl merge(LotwWkfl detachedInstance) {
		log.debug("merging LotwWkfl instance");
		try {
			LotwWkfl result = (LotwWkfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LotwWkfl instance) {
		log.debug("attaching dirty LotwWkfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LotwWkfl instance) {
		log.debug("attaching clean LotwWkfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LotwWkflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LotwWkflDAO) ctx.getBean("LotwWkflDAO");
	}
}