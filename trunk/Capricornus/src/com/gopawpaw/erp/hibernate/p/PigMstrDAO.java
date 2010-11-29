package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PigMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PigMstr
 * @author MyEclipse Persistence Tools
 */

public class PigMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PigMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PigMstr transientInstance) {
		log.debug("saving PigMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PigMstr persistentInstance) {
		log.debug("deleting PigMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PigMstr findById(com.gopawpaw.erp.hibernate.p.PigMstrId id) {
		log.debug("getting PigMstr instance with id: " + id);
		try {
			PigMstr instance = (PigMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PigMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PigMstr instance) {
		log.debug("finding PigMstr instance by example");
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
		log.debug("finding PigMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PigMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PigMstr instances");
		try {
			String queryString = "from PigMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PigMstr merge(PigMstr detachedInstance) {
		log.debug("merging PigMstr instance");
		try {
			PigMstr result = (PigMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PigMstr instance) {
		log.debug("attaching dirty PigMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PigMstr instance) {
		log.debug("attaching clean PigMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PigMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PigMstrDAO) ctx.getBean("PigMstrDAO");
	}
}