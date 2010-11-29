package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CmhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CmhHist
 * @author MyEclipse Persistence Tools
 */

public class CmhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CmhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CmhHist transientInstance) {
		log.debug("saving CmhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CmhHist persistentInstance) {
		log.debug("deleting CmhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CmhHist findById(com.gopawpaw.erp.hibernate.c.CmhHistId id) {
		log.debug("getting CmhHist instance with id: " + id);
		try {
			CmhHist instance = (CmhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CmhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CmhHist instance) {
		log.debug("finding CmhHist instance by example");
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
		log.debug("finding CmhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CmhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CmhHist instances");
		try {
			String queryString = "from CmhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CmhHist merge(CmhHist detachedInstance) {
		log.debug("merging CmhHist instance");
		try {
			CmhHist result = (CmhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CmhHist instance) {
		log.debug("attaching dirty CmhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CmhHist instance) {
		log.debug("attaching clean CmhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CmhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CmhHistDAO) ctx.getBean("CmhHistDAO");
	}
}