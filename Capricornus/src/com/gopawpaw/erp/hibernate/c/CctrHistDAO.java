package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CctrHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CctrHist
 * @author MyEclipse Persistence Tools
 */

public class CctrHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CctrHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CctrHist transientInstance) {
		log.debug("saving CctrHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CctrHist persistentInstance) {
		log.debug("deleting CctrHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CctrHist findById(com.gopawpaw.erp.hibernate.c.CctrHistId id) {
		log.debug("getting CctrHist instance with id: " + id);
		try {
			CctrHist instance = (CctrHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CctrHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CctrHist instance) {
		log.debug("finding CctrHist instance by example");
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
		log.debug("finding CctrHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CctrHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CctrHist instances");
		try {
			String queryString = "from CctrHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CctrHist merge(CctrHist detachedInstance) {
		log.debug("merging CctrHist instance");
		try {
			CctrHist result = (CctrHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CctrHist instance) {
		log.debug("attaching dirty CctrHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CctrHist instance) {
		log.debug("attaching clean CctrHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CctrHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CctrHistDAO) ctx.getBean("CctrHistDAO");
	}
}