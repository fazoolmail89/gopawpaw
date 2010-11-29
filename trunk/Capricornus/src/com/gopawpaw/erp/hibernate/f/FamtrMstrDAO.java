package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FamtrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FamtrMstr
 * @author MyEclipse Persistence Tools
 */

public class FamtrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FamtrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FamtrMstr transientInstance) {
		log.debug("saving FamtrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FamtrMstr persistentInstance) {
		log.debug("deleting FamtrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FamtrMstr findById(com.gopawpaw.erp.hibernate.f.FamtrMstrId id) {
		log.debug("getting FamtrMstr instance with id: " + id);
		try {
			FamtrMstr instance = (FamtrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FamtrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FamtrMstr instance) {
		log.debug("finding FamtrMstr instance by example");
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
		log.debug("finding FamtrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FamtrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FamtrMstr instances");
		try {
			String queryString = "from FamtrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FamtrMstr merge(FamtrMstr detachedInstance) {
		log.debug("merging FamtrMstr instance");
		try {
			FamtrMstr result = (FamtrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FamtrMstr instance) {
		log.debug("attaching dirty FamtrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FamtrMstr instance) {
		log.debug("attaching clean FamtrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FamtrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FamtrMstrDAO) ctx.getBean("FamtrMstrDAO");
	}
}