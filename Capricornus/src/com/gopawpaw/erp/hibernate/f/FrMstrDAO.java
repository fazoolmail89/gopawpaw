package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FrMstr
 * @author MyEclipse Persistence Tools
 */

public class FrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FrMstr transientInstance) {
		log.debug("saving FrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FrMstr persistentInstance) {
		log.debug("deleting FrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FrMstr findById(com.gopawpaw.erp.hibernate.f.FrMstrId id) {
		log.debug("getting FrMstr instance with id: " + id);
		try {
			FrMstr instance = (FrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FrMstr instance) {
		log.debug("finding FrMstr instance by example");
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
		log.debug("finding FrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FrMstr instances");
		try {
			String queryString = "from FrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FrMstr merge(FrMstr detachedInstance) {
		log.debug("merging FrMstr instance");
		try {
			FrMstr result = (FrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FrMstr instance) {
		log.debug("attaching dirty FrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FrMstr instance) {
		log.debug("attaching clean FrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FrMstrDAO) ctx.getBean("FrMstrDAO");
	}
}