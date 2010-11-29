package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PclMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PclMstr
 * @author MyEclipse Persistence Tools
 */

public class PclMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PclMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PclMstr transientInstance) {
		log.debug("saving PclMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PclMstr persistentInstance) {
		log.debug("deleting PclMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PclMstr findById(com.gopawpaw.erp.hibernate.p.PclMstrId id) {
		log.debug("getting PclMstr instance with id: " + id);
		try {
			PclMstr instance = (PclMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PclMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PclMstr instance) {
		log.debug("finding PclMstr instance by example");
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
		log.debug("finding PclMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PclMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PclMstr instances");
		try {
			String queryString = "from PclMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PclMstr merge(PclMstr detachedInstance) {
		log.debug("merging PclMstr instance");
		try {
			PclMstr result = (PclMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PclMstr instance) {
		log.debug("attaching dirty PclMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PclMstr instance) {
		log.debug("attaching clean PclMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PclMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PclMstrDAO) ctx.getBean("PclMstrDAO");
	}
}