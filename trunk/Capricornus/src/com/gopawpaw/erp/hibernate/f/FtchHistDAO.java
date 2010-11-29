package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FtchHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FtchHist
 * @author MyEclipse Persistence Tools
 */

public class FtchHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FtchHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FtchHist transientInstance) {
		log.debug("saving FtchHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FtchHist persistentInstance) {
		log.debug("deleting FtchHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FtchHist findById(com.gopawpaw.erp.hibernate.f.FtchHistId id) {
		log.debug("getting FtchHist instance with id: " + id);
		try {
			FtchHist instance = (FtchHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FtchHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FtchHist instance) {
		log.debug("finding FtchHist instance by example");
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
		log.debug("finding FtchHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FtchHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FtchHist instances");
		try {
			String queryString = "from FtchHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FtchHist merge(FtchHist detachedInstance) {
		log.debug("merging FtchHist instance");
		try {
			FtchHist result = (FtchHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FtchHist instance) {
		log.debug("attaching dirty FtchHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FtchHist instance) {
		log.debug("attaching clean FtchHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FtchHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FtchHistDAO) ctx.getBean("FtchHistDAO");
	}
}