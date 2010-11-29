package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ArMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.ArMstr
 * @author MyEclipse Persistence Tools
 */

public class ArMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ArMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ArMstr transientInstance) {
		log.debug("saving ArMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ArMstr persistentInstance) {
		log.debug("deleting ArMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArMstr findById(com.gopawpaw.erp.hibernate.a.ArMstrId id) {
		log.debug("getting ArMstr instance with id: " + id);
		try {
			ArMstr instance = (ArMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.ArMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ArMstr instance) {
		log.debug("finding ArMstr instance by example");
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
		log.debug("finding ArMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ArMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ArMstr instances");
		try {
			String queryString = "from ArMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ArMstr merge(ArMstr detachedInstance) {
		log.debug("merging ArMstr instance");
		try {
			ArMstr result = (ArMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ArMstr instance) {
		log.debug("attaching dirty ArMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArMstr instance) {
		log.debug("attaching clean ArMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ArMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ArMstrDAO) ctx.getBean("ArMstrDAO");
	}
}