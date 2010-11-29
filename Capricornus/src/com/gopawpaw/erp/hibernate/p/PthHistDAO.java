package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PthHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PthHist
 * @author MyEclipse Persistence Tools
 */

public class PthHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PthHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PthHist transientInstance) {
		log.debug("saving PthHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PthHist persistentInstance) {
		log.debug("deleting PthHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PthHist findById(com.gopawpaw.erp.hibernate.p.PthHistId id) {
		log.debug("getting PthHist instance with id: " + id);
		try {
			PthHist instance = (PthHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PthHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PthHist instance) {
		log.debug("finding PthHist instance by example");
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
		log.debug("finding PthHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PthHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PthHist instances");
		try {
			String queryString = "from PthHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PthHist merge(PthHist detachedInstance) {
		log.debug("merging PthHist instance");
		try {
			PthHist result = (PthHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PthHist instance) {
		log.debug("attaching dirty PthHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PthHist instance) {
		log.debug("attaching clean PthHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PthHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PthHistDAO) ctx.getBean("PthHistDAO");
	}
}