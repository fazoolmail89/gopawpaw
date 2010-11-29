package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SrWkfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SrWkfl
 * @author MyEclipse Persistence Tools
 */

public class SrWkflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SrWkflDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SrWkfl transientInstance) {
		log.debug("saving SrWkfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SrWkfl persistentInstance) {
		log.debug("deleting SrWkfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SrWkfl findById(com.gopawpaw.erp.hibernate.s.SrWkflId id) {
		log.debug("getting SrWkfl instance with id: " + id);
		try {
			SrWkfl instance = (SrWkfl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SrWkfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SrWkfl instance) {
		log.debug("finding SrWkfl instance by example");
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
		log.debug("finding SrWkfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SrWkfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SrWkfl instances");
		try {
			String queryString = "from SrWkfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SrWkfl merge(SrWkfl detachedInstance) {
		log.debug("merging SrWkfl instance");
		try {
			SrWkfl result = (SrWkfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SrWkfl instance) {
		log.debug("attaching dirty SrWkfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SrWkfl instance) {
		log.debug("attaching clean SrWkfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SrWkflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SrWkflDAO) ctx.getBean("SrWkflDAO");
	}
}