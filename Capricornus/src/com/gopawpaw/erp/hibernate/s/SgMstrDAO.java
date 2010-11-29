package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SgMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SgMstr
 * @author MyEclipse Persistence Tools
 */

public class SgMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SgMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SgMstr transientInstance) {
		log.debug("saving SgMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SgMstr persistentInstance) {
		log.debug("deleting SgMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SgMstr findById(com.gopawpaw.erp.hibernate.s.SgMstrId id) {
		log.debug("getting SgMstr instance with id: " + id);
		try {
			SgMstr instance = (SgMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SgMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SgMstr instance) {
		log.debug("finding SgMstr instance by example");
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
		log.debug("finding SgMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SgMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SgMstr instances");
		try {
			String queryString = "from SgMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SgMstr merge(SgMstr detachedInstance) {
		log.debug("merging SgMstr instance");
		try {
			SgMstr result = (SgMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SgMstr instance) {
		log.debug("attaching dirty SgMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SgMstr instance) {
		log.debug("attaching clean SgMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SgMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SgMstrDAO) ctx.getBean("SgMstrDAO");
	}
}