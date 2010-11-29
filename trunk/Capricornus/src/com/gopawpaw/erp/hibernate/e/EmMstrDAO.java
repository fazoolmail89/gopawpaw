package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EmMstr
 * @author MyEclipse Persistence Tools
 */

public class EmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EmMstr transientInstance) {
		log.debug("saving EmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmMstr persistentInstance) {
		log.debug("deleting EmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmMstr findById(com.gopawpaw.erp.hibernate.e.EmMstrId id) {
		log.debug("getting EmMstr instance with id: " + id);
		try {
			EmMstr instance = (EmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmMstr instance) {
		log.debug("finding EmMstr instance by example");
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
		log.debug("finding EmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmMstr instances");
		try {
			String queryString = "from EmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmMstr merge(EmMstr detachedInstance) {
		log.debug("merging EmMstr instance");
		try {
			EmMstr result = (EmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmMstr instance) {
		log.debug("attaching dirty EmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmMstr instance) {
		log.debug("attaching clean EmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmMstrDAO) ctx.getBean("EmMstrDAO");
	}
}