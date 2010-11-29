package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FscMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FscMstr
 * @author MyEclipse Persistence Tools
 */

public class FscMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FscMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FscMstr transientInstance) {
		log.debug("saving FscMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FscMstr persistentInstance) {
		log.debug("deleting FscMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FscMstr findById(com.gopawpaw.erp.hibernate.f.FscMstrId id) {
		log.debug("getting FscMstr instance with id: " + id);
		try {
			FscMstr instance = (FscMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FscMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FscMstr instance) {
		log.debug("finding FscMstr instance by example");
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
		log.debug("finding FscMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FscMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FscMstr instances");
		try {
			String queryString = "from FscMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FscMstr merge(FscMstr detachedInstance) {
		log.debug("merging FscMstr instance");
		try {
			FscMstr result = (FscMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FscMstr instance) {
		log.debug("attaching dirty FscMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FscMstr instance) {
		log.debug("attaching clean FscMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FscMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FscMstrDAO) ctx.getBean("FscMstrDAO");
	}
}