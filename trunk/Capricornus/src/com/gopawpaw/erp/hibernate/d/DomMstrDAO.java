package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DomMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DomMstr
 * @author MyEclipse Persistence Tools
 */

public class DomMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DomMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DomMstr transientInstance) {
		log.debug("saving DomMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DomMstr persistentInstance) {
		log.debug("deleting DomMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DomMstr findById(java.lang.String id) {
		log.debug("getting DomMstr instance with id: " + id);
		try {
			DomMstr instance = (DomMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DomMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DomMstr instance) {
		log.debug("finding DomMstr instance by example");
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
		log.debug("finding DomMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DomMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DomMstr instances");
		try {
			String queryString = "from DomMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DomMstr merge(DomMstr detachedInstance) {
		log.debug("merging DomMstr instance");
		try {
			DomMstr result = (DomMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DomMstr instance) {
		log.debug("attaching dirty DomMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DomMstr instance) {
		log.debug("attaching clean DomMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DomMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DomMstrDAO) ctx.getBean("DomMstrDAO");
	}
}