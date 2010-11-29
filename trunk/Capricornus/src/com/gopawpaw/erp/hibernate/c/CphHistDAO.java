package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CphHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CphHist
 * @author MyEclipse Persistence Tools
 */

public class CphHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CphHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CphHist transientInstance) {
		log.debug("saving CphHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CphHist persistentInstance) {
		log.debug("deleting CphHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CphHist findById(com.gopawpaw.erp.hibernate.c.CphHistId id) {
		log.debug("getting CphHist instance with id: " + id);
		try {
			CphHist instance = (CphHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CphHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CphHist instance) {
		log.debug("finding CphHist instance by example");
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
		log.debug("finding CphHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CphHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CphHist instances");
		try {
			String queryString = "from CphHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CphHist merge(CphHist detachedInstance) {
		log.debug("merging CphHist instance");
		try {
			CphHist result = (CphHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CphHist instance) {
		log.debug("attaching dirty CphHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CphHist instance) {
		log.debug("attaching clean CphHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CphHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CphHistDAO) ctx.getBean("CphHistDAO");
	}
}