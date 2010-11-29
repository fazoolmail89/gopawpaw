package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FtMstr
 * @author MyEclipse Persistence Tools
 */

public class FtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FtMstr transientInstance) {
		log.debug("saving FtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FtMstr persistentInstance) {
		log.debug("deleting FtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FtMstr findById(com.gopawpaw.erp.hibernate.f.FtMstrId id) {
		log.debug("getting FtMstr instance with id: " + id);
		try {
			FtMstr instance = (FtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FtMstr instance) {
		log.debug("finding FtMstr instance by example");
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
		log.debug("finding FtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FtMstr instances");
		try {
			String queryString = "from FtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FtMstr merge(FtMstr detachedInstance) {
		log.debug("merging FtMstr instance");
		try {
			FtMstr result = (FtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FtMstr instance) {
		log.debug("attaching dirty FtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FtMstr instance) {
		log.debug("attaching clean FtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FtMstrDAO) ctx.getBean("FtMstrDAO");
	}
}