package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SrrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SrrMstr
 * @author MyEclipse Persistence Tools
 */

public class SrrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SrrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SrrMstr transientInstance) {
		log.debug("saving SrrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SrrMstr persistentInstance) {
		log.debug("deleting SrrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SrrMstr findById(com.gopawpaw.erp.hibernate.s.SrrMstrId id) {
		log.debug("getting SrrMstr instance with id: " + id);
		try {
			SrrMstr instance = (SrrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SrrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SrrMstr instance) {
		log.debug("finding SrrMstr instance by example");
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
		log.debug("finding SrrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SrrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SrrMstr instances");
		try {
			String queryString = "from SrrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SrrMstr merge(SrrMstr detachedInstance) {
		log.debug("merging SrrMstr instance");
		try {
			SrrMstr result = (SrrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SrrMstr instance) {
		log.debug("attaching dirty SrrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SrrMstr instance) {
		log.debug("attaching clean SrrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SrrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SrrMstrDAO) ctx.getBean("SrrMstrDAO");
	}
}