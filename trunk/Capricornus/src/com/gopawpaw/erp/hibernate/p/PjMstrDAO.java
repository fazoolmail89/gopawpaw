package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PjMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PjMstr
 * @author MyEclipse Persistence Tools
 */

public class PjMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PjMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PjMstr transientInstance) {
		log.debug("saving PjMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PjMstr persistentInstance) {
		log.debug("deleting PjMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PjMstr findById(com.gopawpaw.erp.hibernate.p.PjMstrId id) {
		log.debug("getting PjMstr instance with id: " + id);
		try {
			PjMstr instance = (PjMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PjMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PjMstr instance) {
		log.debug("finding PjMstr instance by example");
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
		log.debug("finding PjMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PjMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PjMstr instances");
		try {
			String queryString = "from PjMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PjMstr merge(PjMstr detachedInstance) {
		log.debug("merging PjMstr instance");
		try {
			PjMstr result = (PjMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PjMstr instance) {
		log.debug("attaching dirty PjMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PjMstr instance) {
		log.debug("attaching clean PjMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PjMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PjMstrDAO) ctx.getBean("PjMstrDAO");
	}
}