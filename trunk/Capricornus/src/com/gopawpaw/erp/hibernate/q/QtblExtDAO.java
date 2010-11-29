package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QtblExt entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QtblExt
 * @author MyEclipse Persistence Tools
 */

public class QtblExtDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QtblExtDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QtblExt transientInstance) {
		log.debug("saving QtblExt instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QtblExt persistentInstance) {
		log.debug("deleting QtblExt instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QtblExt findById(com.gopawpaw.erp.hibernate.q.QtblExtId id) {
		log.debug("getting QtblExt instance with id: " + id);
		try {
			QtblExt instance = (QtblExt) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QtblExt", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QtblExt instance) {
		log.debug("finding QtblExt instance by example");
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
		log.debug("finding QtblExt instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QtblExt as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QtblExt instances");
		try {
			String queryString = "from QtblExt";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QtblExt merge(QtblExt detachedInstance) {
		log.debug("merging QtblExt instance");
		try {
			QtblExt result = (QtblExt) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QtblExt instance) {
		log.debug("attaching dirty QtblExt instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QtblExt instance) {
		log.debug("attaching clean QtblExt instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QtblExtDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QtblExtDAO) ctx.getBean("QtblExtDAO");
	}
}