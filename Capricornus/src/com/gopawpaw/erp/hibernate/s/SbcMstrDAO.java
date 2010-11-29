package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SbcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SbcMstr
 * @author MyEclipse Persistence Tools
 */

public class SbcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SbcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SbcMstr transientInstance) {
		log.debug("saving SbcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SbcMstr persistentInstance) {
		log.debug("deleting SbcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SbcMstr findById(com.gopawpaw.erp.hibernate.s.SbcMstrId id) {
		log.debug("getting SbcMstr instance with id: " + id);
		try {
			SbcMstr instance = (SbcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SbcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SbcMstr instance) {
		log.debug("finding SbcMstr instance by example");
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
		log.debug("finding SbcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SbcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SbcMstr instances");
		try {
			String queryString = "from SbcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SbcMstr merge(SbcMstr detachedInstance) {
		log.debug("merging SbcMstr instance");
		try {
			SbcMstr result = (SbcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SbcMstr instance) {
		log.debug("attaching dirty SbcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SbcMstr instance) {
		log.debug("attaching clean SbcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SbcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SbcMstrDAO) ctx.getBean("SbcMstrDAO");
	}
}