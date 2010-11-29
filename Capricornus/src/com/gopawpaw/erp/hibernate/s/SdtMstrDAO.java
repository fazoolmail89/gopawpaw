package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SdtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SdtMstr
 * @author MyEclipse Persistence Tools
 */

public class SdtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SdtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SdtMstr transientInstance) {
		log.debug("saving SdtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SdtMstr persistentInstance) {
		log.debug("deleting SdtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SdtMstr findById(com.gopawpaw.erp.hibernate.s.SdtMstrId id) {
		log.debug("getting SdtMstr instance with id: " + id);
		try {
			SdtMstr instance = (SdtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SdtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SdtMstr instance) {
		log.debug("finding SdtMstr instance by example");
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
		log.debug("finding SdtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SdtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SdtMstr instances");
		try {
			String queryString = "from SdtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SdtMstr merge(SdtMstr detachedInstance) {
		log.debug("merging SdtMstr instance");
		try {
			SdtMstr result = (SdtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SdtMstr instance) {
		log.debug("attaching dirty SdtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SdtMstr instance) {
		log.debug("attaching clean SdtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SdtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SdtMstrDAO) ctx.getBean("SdtMstrDAO");
	}
}