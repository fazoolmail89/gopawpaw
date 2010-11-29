package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.ComMstr
 * @author MyEclipse Persistence Tools
 */

public class ComMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ComMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ComMstr transientInstance) {
		log.debug("saving ComMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComMstr persistentInstance) {
		log.debug("deleting ComMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComMstr findById(com.gopawpaw.erp.hibernate.c.ComMstrId id) {
		log.debug("getting ComMstr instance with id: " + id);
		try {
			ComMstr instance = (ComMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.ComMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ComMstr instance) {
		log.debug("finding ComMstr instance by example");
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
		log.debug("finding ComMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ComMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ComMstr instances");
		try {
			String queryString = "from ComMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComMstr merge(ComMstr detachedInstance) {
		log.debug("merging ComMstr instance");
		try {
			ComMstr result = (ComMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComMstr instance) {
		log.debug("attaching dirty ComMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComMstr instance) {
		log.debug("attaching clean ComMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ComMstrDAO) ctx.getBean("ComMstrDAO");
	}
}