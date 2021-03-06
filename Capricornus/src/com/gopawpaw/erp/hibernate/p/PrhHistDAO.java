package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PrhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PrhHist
 * @author MyEclipse Persistence Tools
 */

public class PrhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PrhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PrhHist transientInstance) {
		log.debug("saving PrhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PrhHist persistentInstance) {
		log.debug("deleting PrhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PrhHist findById(com.gopawpaw.erp.hibernate.p.PrhHistId id) {
		log.debug("getting PrhHist instance with id: " + id);
		try {
			PrhHist instance = (PrhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PrhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PrhHist instance) {
		log.debug("finding PrhHist instance by example");
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
		log.debug("finding PrhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PrhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PrhHist instances");
		try {
			String queryString = "from PrhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PrhHist merge(PrhHist detachedInstance) {
		log.debug("merging PrhHist instance");
		try {
			PrhHist result = (PrhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PrhHist instance) {
		log.debug("attaching dirty PrhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PrhHist instance) {
		log.debug("attaching clean PrhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PrhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PrhHistDAO) ctx.getBean("PrhHistDAO");
	}
}