package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FldfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FldfMstr
 * @author MyEclipse Persistence Tools
 */

public class FldfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FldfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FldfMstr transientInstance) {
		log.debug("saving FldfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FldfMstr persistentInstance) {
		log.debug("deleting FldfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FldfMstr findById(com.gopawpaw.erp.hibernate.f.FldfMstrId id) {
		log.debug("getting FldfMstr instance with id: " + id);
		try {
			FldfMstr instance = (FldfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FldfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FldfMstr instance) {
		log.debug("finding FldfMstr instance by example");
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
		log.debug("finding FldfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FldfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FldfMstr instances");
		try {
			String queryString = "from FldfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FldfMstr merge(FldfMstr detachedInstance) {
		log.debug("merging FldfMstr instance");
		try {
			FldfMstr result = (FldfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FldfMstr instance) {
		log.debug("attaching dirty FldfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FldfMstr instance) {
		log.debug("attaching clean FldfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FldfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FldfMstrDAO) ctx.getBean("FldfMstrDAO");
	}
}