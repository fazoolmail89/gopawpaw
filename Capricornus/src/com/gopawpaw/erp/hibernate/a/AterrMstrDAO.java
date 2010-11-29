package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AterrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AterrMstr
 * @author MyEclipse Persistence Tools
 */

public class AterrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AterrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AterrMstr transientInstance) {
		log.debug("saving AterrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AterrMstr persistentInstance) {
		log.debug("deleting AterrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AterrMstr findById(com.gopawpaw.erp.hibernate.a.AterrMstrId id) {
		log.debug("getting AterrMstr instance with id: " + id);
		try {
			AterrMstr instance = (AterrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AterrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AterrMstr instance) {
		log.debug("finding AterrMstr instance by example");
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
		log.debug("finding AterrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AterrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AterrMstr instances");
		try {
			String queryString = "from AterrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AterrMstr merge(AterrMstr detachedInstance) {
		log.debug("merging AterrMstr instance");
		try {
			AterrMstr result = (AterrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AterrMstr instance) {
		log.debug("attaching dirty AterrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AterrMstr instance) {
		log.debug("attaching clean AterrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AterrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AterrMstrDAO) ctx.getBean("AterrMstrDAO");
	}
}