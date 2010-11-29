package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlffMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlffMstr
 * @author MyEclipse Persistence Tools
 */

public class FlffMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlffMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlffMstr transientInstance) {
		log.debug("saving FlffMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlffMstr persistentInstance) {
		log.debug("deleting FlffMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlffMstr findById(com.gopawpaw.erp.hibernate.f.FlffMstrId id) {
		log.debug("getting FlffMstr instance with id: " + id);
		try {
			FlffMstr instance = (FlffMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlffMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlffMstr instance) {
		log.debug("finding FlffMstr instance by example");
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
		log.debug("finding FlffMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlffMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlffMstr instances");
		try {
			String queryString = "from FlffMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlffMstr merge(FlffMstr detachedInstance) {
		log.debug("merging FlffMstr instance");
		try {
			FlffMstr result = (FlffMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlffMstr instance) {
		log.debug("attaching dirty FlffMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlffMstr instance) {
		log.debug("attaching clean FlffMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlffMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlffMstrDAO) ctx.getBean("FlffMstrDAO");
	}
}