package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlcrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlcrMstr
 * @author MyEclipse Persistence Tools
 */

public class FlcrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlcrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlcrMstr transientInstance) {
		log.debug("saving FlcrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlcrMstr persistentInstance) {
		log.debug("deleting FlcrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlcrMstr findById(com.gopawpaw.erp.hibernate.f.FlcrMstrId id) {
		log.debug("getting FlcrMstr instance with id: " + id);
		try {
			FlcrMstr instance = (FlcrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlcrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlcrMstr instance) {
		log.debug("finding FlcrMstr instance by example");
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
		log.debug("finding FlcrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlcrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlcrMstr instances");
		try {
			String queryString = "from FlcrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlcrMstr merge(FlcrMstr detachedInstance) {
		log.debug("merging FlcrMstr instance");
		try {
			FlcrMstr result = (FlcrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlcrMstr instance) {
		log.debug("attaching dirty FlcrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlcrMstr instance) {
		log.debug("attaching clean FlcrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlcrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlcrMstrDAO) ctx.getBean("FlcrMstrDAO");
	}
}