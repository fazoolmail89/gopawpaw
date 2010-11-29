package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UsrMstr
 * @author MyEclipse Persistence Tools
 */

public class UsrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UsrMstr transientInstance) {
		log.debug("saving UsrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsrMstr persistentInstance) {
		log.debug("deleting UsrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsrMstr findById(java.lang.String id) {
		log.debug("getting UsrMstr instance with id: " + id);
		try {
			UsrMstr instance = (UsrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UsrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsrMstr instance) {
		log.debug("finding UsrMstr instance by example");
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
		log.debug("finding UsrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UsrMstr instances");
		try {
			String queryString = "from UsrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsrMstr merge(UsrMstr detachedInstance) {
		log.debug("merging UsrMstr instance");
		try {
			UsrMstr result = (UsrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsrMstr instance) {
		log.debug("attaching dirty UsrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsrMstr instance) {
		log.debug("attaching clean UsrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsrMstrDAO) ctx.getBean("UsrMstrDAO");
	}
}