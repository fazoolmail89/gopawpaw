package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PiMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PiMstr
 * @author MyEclipse Persistence Tools
 */

public class PiMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PiMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PiMstr transientInstance) {
		log.debug("saving PiMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PiMstr persistentInstance) {
		log.debug("deleting PiMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PiMstr findById(com.gopawpaw.erp.hibernate.p.PiMstrId id) {
		log.debug("getting PiMstr instance with id: " + id);
		try {
			PiMstr instance = (PiMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PiMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PiMstr instance) {
		log.debug("finding PiMstr instance by example");
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
		log.debug("finding PiMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PiMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PiMstr instances");
		try {
			String queryString = "from PiMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PiMstr merge(PiMstr detachedInstance) {
		log.debug("merging PiMstr instance");
		try {
			PiMstr result = (PiMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PiMstr instance) {
		log.debug("attaching dirty PiMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PiMstr instance) {
		log.debug("attaching clean PiMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PiMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PiMstrDAO) ctx.getBean("PiMstrDAO");
	}
}