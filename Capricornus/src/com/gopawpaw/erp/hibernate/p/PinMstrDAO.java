package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PinMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PinMstr
 * @author MyEclipse Persistence Tools
 */

public class PinMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PinMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PinMstr transientInstance) {
		log.debug("saving PinMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PinMstr persistentInstance) {
		log.debug("deleting PinMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PinMstr findById(java.lang.String id) {
		log.debug("getting PinMstr instance with id: " + id);
		try {
			PinMstr instance = (PinMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PinMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PinMstr instance) {
		log.debug("finding PinMstr instance by example");
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
		log.debug("finding PinMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PinMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PinMstr instances");
		try {
			String queryString = "from PinMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PinMstr merge(PinMstr detachedInstance) {
		log.debug("merging PinMstr instance");
		try {
			PinMstr result = (PinMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PinMstr instance) {
		log.debug("attaching dirty PinMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PinMstr instance) {
		log.debug("attaching clean PinMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PinMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PinMstrDAO) ctx.getBean("PinMstrDAO");
	}
}