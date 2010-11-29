package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SroMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SroMstr
 * @author MyEclipse Persistence Tools
 */

public class SroMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SroMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SroMstr transientInstance) {
		log.debug("saving SroMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SroMstr persistentInstance) {
		log.debug("deleting SroMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SroMstr findById(com.gopawpaw.erp.hibernate.s.SroMstrId id) {
		log.debug("getting SroMstr instance with id: " + id);
		try {
			SroMstr instance = (SroMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SroMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SroMstr instance) {
		log.debug("finding SroMstr instance by example");
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
		log.debug("finding SroMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SroMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SroMstr instances");
		try {
			String queryString = "from SroMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SroMstr merge(SroMstr detachedInstance) {
		log.debug("merging SroMstr instance");
		try {
			SroMstr result = (SroMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SroMstr instance) {
		log.debug("attaching dirty SroMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SroMstr instance) {
		log.debug("attaching clean SroMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SroMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SroMstrDAO) ctx.getBean("SroMstrDAO");
	}
}