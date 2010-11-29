package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsrwWkfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UsrwWkfl
 * @author MyEclipse Persistence Tools
 */

public class UsrwWkflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsrwWkflDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UsrwWkfl transientInstance) {
		log.debug("saving UsrwWkfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsrwWkfl persistentInstance) {
		log.debug("deleting UsrwWkfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsrwWkfl findById(com.gopawpaw.erp.hibernate.u.UsrwWkflId id) {
		log.debug("getting UsrwWkfl instance with id: " + id);
		try {
			UsrwWkfl instance = (UsrwWkfl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UsrwWkfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsrwWkfl instance) {
		log.debug("finding UsrwWkfl instance by example");
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
		log.debug("finding UsrwWkfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsrwWkfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UsrwWkfl instances");
		try {
			String queryString = "from UsrwWkfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsrwWkfl merge(UsrwWkfl detachedInstance) {
		log.debug("merging UsrwWkfl instance");
		try {
			UsrwWkfl result = (UsrwWkfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsrwWkfl instance) {
		log.debug("attaching dirty UsrwWkfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsrwWkfl instance) {
		log.debug("attaching clean UsrwWkfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsrwWkflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsrwWkflDAO) ctx.getBean("UsrwWkflDAO");
	}
}