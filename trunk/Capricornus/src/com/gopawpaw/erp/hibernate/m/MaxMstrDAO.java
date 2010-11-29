package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MaxMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MaxMstr
 * @author MyEclipse Persistence Tools
 */

public class MaxMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MaxMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MaxMstr transientInstance) {
		log.debug("saving MaxMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MaxMstr persistentInstance) {
		log.debug("deleting MaxMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MaxMstr findById(com.gopawpaw.erp.hibernate.m.MaxMstrId id) {
		log.debug("getting MaxMstr instance with id: " + id);
		try {
			MaxMstr instance = (MaxMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MaxMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MaxMstr instance) {
		log.debug("finding MaxMstr instance by example");
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
		log.debug("finding MaxMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MaxMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MaxMstr instances");
		try {
			String queryString = "from MaxMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MaxMstr merge(MaxMstr detachedInstance) {
		log.debug("merging MaxMstr instance");
		try {
			MaxMstr result = (MaxMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MaxMstr instance) {
		log.debug("attaching dirty MaxMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MaxMstr instance) {
		log.debug("attaching clean MaxMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MaxMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MaxMstrDAO) ctx.getBean("MaxMstrDAO");
	}
}