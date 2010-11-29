package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ShmMstr
 * @author MyEclipse Persistence Tools
 */

public class ShmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ShmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShmMstr transientInstance) {
		log.debug("saving ShmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShmMstr persistentInstance) {
		log.debug("deleting ShmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShmMstr findById(com.gopawpaw.erp.hibernate.s.ShmMstrId id) {
		log.debug("getting ShmMstr instance with id: " + id);
		try {
			ShmMstr instance = (ShmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ShmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShmMstr instance) {
		log.debug("finding ShmMstr instance by example");
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
		log.debug("finding ShmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShmMstr instances");
		try {
			String queryString = "from ShmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShmMstr merge(ShmMstr detachedInstance) {
		log.debug("merging ShmMstr instance");
		try {
			ShmMstr result = (ShmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShmMstr instance) {
		log.debug("attaching dirty ShmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShmMstr instance) {
		log.debug("attaching clean ShmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShmMstrDAO) ctx.getBean("ShmMstrDAO");
	}
}