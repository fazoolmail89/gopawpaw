package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SorMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SorMstr
 * @author MyEclipse Persistence Tools
 */

public class SorMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SorMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SorMstr transientInstance) {
		log.debug("saving SorMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SorMstr persistentInstance) {
		log.debug("deleting SorMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SorMstr findById(com.gopawpaw.erp.hibernate.s.SorMstrId id) {
		log.debug("getting SorMstr instance with id: " + id);
		try {
			SorMstr instance = (SorMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SorMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SorMstr instance) {
		log.debug("finding SorMstr instance by example");
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
		log.debug("finding SorMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SorMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SorMstr instances");
		try {
			String queryString = "from SorMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SorMstr merge(SorMstr detachedInstance) {
		log.debug("merging SorMstr instance");
		try {
			SorMstr result = (SorMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SorMstr instance) {
		log.debug("attaching dirty SorMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SorMstr instance) {
		log.debug("attaching clean SorMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SorMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SorMstrDAO) ctx.getBean("SorMstrDAO");
	}
}