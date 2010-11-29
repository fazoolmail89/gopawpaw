package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlpwMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlpwMstr
 * @author MyEclipse Persistence Tools
 */

public class FlpwMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlpwMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlpwMstr transientInstance) {
		log.debug("saving FlpwMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlpwMstr persistentInstance) {
		log.debug("deleting FlpwMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlpwMstr findById(com.gopawpaw.erp.hibernate.f.FlpwMstrId id) {
		log.debug("getting FlpwMstr instance with id: " + id);
		try {
			FlpwMstr instance = (FlpwMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlpwMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlpwMstr instance) {
		log.debug("finding FlpwMstr instance by example");
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
		log.debug("finding FlpwMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlpwMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlpwMstr instances");
		try {
			String queryString = "from FlpwMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlpwMstr merge(FlpwMstr detachedInstance) {
		log.debug("merging FlpwMstr instance");
		try {
			FlpwMstr result = (FlpwMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlpwMstr instance) {
		log.debug("attaching dirty FlpwMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlpwMstr instance) {
		log.debug("attaching clean FlpwMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlpwMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlpwMstrDAO) ctx.getBean("FlpwMstrDAO");
	}
}