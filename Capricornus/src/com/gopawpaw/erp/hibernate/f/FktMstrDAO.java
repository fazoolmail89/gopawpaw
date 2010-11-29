package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FktMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FktMstr
 * @author MyEclipse Persistence Tools
 */

public class FktMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FktMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FktMstr transientInstance) {
		log.debug("saving FktMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FktMstr persistentInstance) {
		log.debug("deleting FktMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FktMstr findById(com.gopawpaw.erp.hibernate.f.FktMstrId id) {
		log.debug("getting FktMstr instance with id: " + id);
		try {
			FktMstr instance = (FktMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FktMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FktMstr instance) {
		log.debug("finding FktMstr instance by example");
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
		log.debug("finding FktMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FktMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FktMstr instances");
		try {
			String queryString = "from FktMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FktMstr merge(FktMstr detachedInstance) {
		log.debug("merging FktMstr instance");
		try {
			FktMstr result = (FktMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FktMstr instance) {
		log.debug("attaching dirty FktMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FktMstr instance) {
		log.debug("attaching clean FktMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FktMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FktMstrDAO) ctx.getBean("FktMstrDAO");
	}
}