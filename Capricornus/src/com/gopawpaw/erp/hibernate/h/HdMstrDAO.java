package com.gopawpaw.erp.hibernate.h;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * HdMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.h.HdMstr
 * @author MyEclipse Persistence Tools
 */

public class HdMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(HdMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(HdMstr transientInstance) {
		log.debug("saving HdMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HdMstr persistentInstance) {
		log.debug("deleting HdMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HdMstr findById(com.gopawpaw.erp.hibernate.h.HdMstrId id) {
		log.debug("getting HdMstr instance with id: " + id);
		try {
			HdMstr instance = (HdMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.h.HdMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HdMstr instance) {
		log.debug("finding HdMstr instance by example");
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
		log.debug("finding HdMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HdMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all HdMstr instances");
		try {
			String queryString = "from HdMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HdMstr merge(HdMstr detachedInstance) {
		log.debug("merging HdMstr instance");
		try {
			HdMstr result = (HdMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HdMstr instance) {
		log.debug("attaching dirty HdMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HdMstr instance) {
		log.debug("attaching clean HdMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HdMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HdMstrDAO) ctx.getBean("HdMstrDAO");
	}
}