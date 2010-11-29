package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SixRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SixRef
 * @author MyEclipse Persistence Tools
 */

public class SixRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SixRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SixRef transientInstance) {
		log.debug("saving SixRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SixRef persistentInstance) {
		log.debug("deleting SixRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SixRef findById(com.gopawpaw.erp.hibernate.s.SixRefId id) {
		log.debug("getting SixRef instance with id: " + id);
		try {
			SixRef instance = (SixRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SixRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SixRef instance) {
		log.debug("finding SixRef instance by example");
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
		log.debug("finding SixRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SixRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SixRef instances");
		try {
			String queryString = "from SixRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SixRef merge(SixRef detachedInstance) {
		log.debug("merging SixRef instance");
		try {
			SixRef result = (SixRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SixRef instance) {
		log.debug("attaching dirty SixRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SixRef instance) {
		log.debug("attaching clean SixRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SixRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SixRefDAO) ctx.getBean("SixRefDAO");
	}
}