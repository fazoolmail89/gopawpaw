package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SalhHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SalhHist
 * @author MyEclipse Persistence Tools
 */

public class SalhHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SalhHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SalhHist transientInstance) {
		log.debug("saving SalhHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SalhHist persistentInstance) {
		log.debug("deleting SalhHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SalhHist findById(com.gopawpaw.erp.hibernate.s.SalhHistId id) {
		log.debug("getting SalhHist instance with id: " + id);
		try {
			SalhHist instance = (SalhHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SalhHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SalhHist instance) {
		log.debug("finding SalhHist instance by example");
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
		log.debug("finding SalhHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SalhHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SalhHist instances");
		try {
			String queryString = "from SalhHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SalhHist merge(SalhHist detachedInstance) {
		log.debug("merging SalhHist instance");
		try {
			SalhHist result = (SalhHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SalhHist instance) {
		log.debug("attaching dirty SalhHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SalhHist instance) {
		log.debug("attaching clean SalhHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SalhHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SalhHistDAO) ctx.getBean("SalhHistDAO");
	}
}