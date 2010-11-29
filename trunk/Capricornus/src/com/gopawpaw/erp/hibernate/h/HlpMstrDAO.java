package com.gopawpaw.erp.hibernate.h;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * HlpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.h.HlpMstr
 * @author MyEclipse Persistence Tools
 */

public class HlpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(HlpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(HlpMstr transientInstance) {
		log.debug("saving HlpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HlpMstr persistentInstance) {
		log.debug("deleting HlpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HlpMstr findById(com.gopawpaw.erp.hibernate.h.HlpMstrId id) {
		log.debug("getting HlpMstr instance with id: " + id);
		try {
			HlpMstr instance = (HlpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.h.HlpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HlpMstr instance) {
		log.debug("finding HlpMstr instance by example");
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
		log.debug("finding HlpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HlpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all HlpMstr instances");
		try {
			String queryString = "from HlpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HlpMstr merge(HlpMstr detachedInstance) {
		log.debug("merging HlpMstr instance");
		try {
			HlpMstr result = (HlpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HlpMstr instance) {
		log.debug("attaching dirty HlpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HlpMstr instance) {
		log.debug("attaching clean HlpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HlpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HlpMstrDAO) ctx.getBean("HlpMstrDAO");
	}
}