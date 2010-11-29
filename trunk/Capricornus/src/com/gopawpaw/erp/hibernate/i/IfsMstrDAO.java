package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IfsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IfsMstr
 * @author MyEclipse Persistence Tools
 */

public class IfsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IfsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IfsMstr transientInstance) {
		log.debug("saving IfsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IfsMstr persistentInstance) {
		log.debug("deleting IfsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IfsMstr findById(com.gopawpaw.erp.hibernate.i.IfsMstrId id) {
		log.debug("getting IfsMstr instance with id: " + id);
		try {
			IfsMstr instance = (IfsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IfsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IfsMstr instance) {
		log.debug("finding IfsMstr instance by example");
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
		log.debug("finding IfsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IfsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IfsMstr instances");
		try {
			String queryString = "from IfsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IfsMstr merge(IfsMstr detachedInstance) {
		log.debug("merging IfsMstr instance");
		try {
			IfsMstr result = (IfsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IfsMstr instance) {
		log.debug("attaching dirty IfsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IfsMstr instance) {
		log.debug("attaching clean IfsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IfsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IfsMstrDAO) ctx.getBean("IfsMstrDAO");
	}
}