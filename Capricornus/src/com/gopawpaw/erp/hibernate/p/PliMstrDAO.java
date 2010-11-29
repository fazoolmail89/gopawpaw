package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PliMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PliMstr
 * @author MyEclipse Persistence Tools
 */

public class PliMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PliMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PliMstr transientInstance) {
		log.debug("saving PliMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PliMstr persistentInstance) {
		log.debug("deleting PliMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PliMstr findById(com.gopawpaw.erp.hibernate.p.PliMstrId id) {
		log.debug("getting PliMstr instance with id: " + id);
		try {
			PliMstr instance = (PliMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PliMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PliMstr instance) {
		log.debug("finding PliMstr instance by example");
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
		log.debug("finding PliMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PliMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PliMstr instances");
		try {
			String queryString = "from PliMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PliMstr merge(PliMstr detachedInstance) {
		log.debug("merging PliMstr instance");
		try {
			PliMstr result = (PliMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PliMstr instance) {
		log.debug("attaching dirty PliMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PliMstr instance) {
		log.debug("attaching clean PliMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PliMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PliMstrDAO) ctx.getBean("PliMstrDAO");
	}
}