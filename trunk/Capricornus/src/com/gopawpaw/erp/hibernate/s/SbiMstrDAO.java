package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SbiMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SbiMstr
 * @author MyEclipse Persistence Tools
 */

public class SbiMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SbiMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SbiMstr transientInstance) {
		log.debug("saving SbiMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SbiMstr persistentInstance) {
		log.debug("deleting SbiMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SbiMstr findById(com.gopawpaw.erp.hibernate.s.SbiMstrId id) {
		log.debug("getting SbiMstr instance with id: " + id);
		try {
			SbiMstr instance = (SbiMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SbiMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SbiMstr instance) {
		log.debug("finding SbiMstr instance by example");
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
		log.debug("finding SbiMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SbiMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SbiMstr instances");
		try {
			String queryString = "from SbiMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SbiMstr merge(SbiMstr detachedInstance) {
		log.debug("merging SbiMstr instance");
		try {
			SbiMstr result = (SbiMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SbiMstr instance) {
		log.debug("attaching dirty SbiMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SbiMstr instance) {
		log.debug("attaching clean SbiMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SbiMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SbiMstrDAO) ctx.getBean("SbiMstrDAO");
	}
}