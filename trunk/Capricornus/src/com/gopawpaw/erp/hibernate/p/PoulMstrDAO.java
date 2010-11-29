package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PoulMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PoulMstr
 * @author MyEclipse Persistence Tools
 */

public class PoulMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PoulMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PoulMstr transientInstance) {
		log.debug("saving PoulMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PoulMstr persistentInstance) {
		log.debug("deleting PoulMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PoulMstr findById(com.gopawpaw.erp.hibernate.p.PoulMstrId id) {
		log.debug("getting PoulMstr instance with id: " + id);
		try {
			PoulMstr instance = (PoulMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PoulMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PoulMstr instance) {
		log.debug("finding PoulMstr instance by example");
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
		log.debug("finding PoulMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PoulMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PoulMstr instances");
		try {
			String queryString = "from PoulMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PoulMstr merge(PoulMstr detachedInstance) {
		log.debug("merging PoulMstr instance");
		try {
			PoulMstr result = (PoulMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PoulMstr instance) {
		log.debug("attaching dirty PoulMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PoulMstr instance) {
		log.debug("attaching clean PoulMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PoulMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PoulMstrDAO) ctx.getBean("PoulMstrDAO");
	}
}