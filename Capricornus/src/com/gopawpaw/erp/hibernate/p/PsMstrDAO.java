package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PsMstr
 * @author MyEclipse Persistence Tools
 */

public class PsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PsMstr transientInstance) {
		log.debug("saving PsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PsMstr persistentInstance) {
		log.debug("deleting PsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PsMstr findById(com.gopawpaw.erp.hibernate.p.PsMstrId id) {
		log.debug("getting PsMstr instance with id: " + id);
		try {
			PsMstr instance = (PsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PsMstr instance) {
		log.debug("finding PsMstr instance by example");
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
		log.debug("finding PsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PsMstr instances");
		try {
			String queryString = "from PsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PsMstr merge(PsMstr detachedInstance) {
		log.debug("merging PsMstr instance");
		try {
			PsMstr result = (PsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PsMstr instance) {
		log.debug("attaching dirty PsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PsMstr instance) {
		log.debug("attaching clean PsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PsMstrDAO) ctx.getBean("PsMstrDAO");
	}
}