package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PqMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PqMstr
 * @author MyEclipse Persistence Tools
 */

public class PqMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PqMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PqMstr transientInstance) {
		log.debug("saving PqMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PqMstr persistentInstance) {
		log.debug("deleting PqMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PqMstr findById(com.gopawpaw.erp.hibernate.p.PqMstrId id) {
		log.debug("getting PqMstr instance with id: " + id);
		try {
			PqMstr instance = (PqMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PqMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PqMstr instance) {
		log.debug("finding PqMstr instance by example");
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
		log.debug("finding PqMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PqMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PqMstr instances");
		try {
			String queryString = "from PqMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PqMstr merge(PqMstr detachedInstance) {
		log.debug("merging PqMstr instance");
		try {
			PqMstr result = (PqMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PqMstr instance) {
		log.debug("attaching dirty PqMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PqMstr instance) {
		log.debug("attaching clean PqMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PqMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PqMstrDAO) ctx.getBean("PqMstrDAO");
	}
}