package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsrgMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UsrgMstr
 * @author MyEclipse Persistence Tools
 */

public class UsrgMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsrgMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UsrgMstr transientInstance) {
		log.debug("saving UsrgMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsrgMstr persistentInstance) {
		log.debug("deleting UsrgMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsrgMstr findById(java.lang.String id) {
		log.debug("getting UsrgMstr instance with id: " + id);
		try {
			UsrgMstr instance = (UsrgMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UsrgMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsrgMstr instance) {
		log.debug("finding UsrgMstr instance by example");
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
		log.debug("finding UsrgMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsrgMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UsrgMstr instances");
		try {
			String queryString = "from UsrgMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsrgMstr merge(UsrgMstr detachedInstance) {
		log.debug("merging UsrgMstr instance");
		try {
			UsrgMstr result = (UsrgMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsrgMstr instance) {
		log.debug("attaching dirty UsrgMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsrgMstr instance) {
		log.debug("attaching clean UsrgMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsrgMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsrgMstrDAO) ctx.getBean("UsrgMstrDAO");
	}
}