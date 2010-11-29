package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FaadjMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FaadjMstr
 * @author MyEclipse Persistence Tools
 */

public class FaadjMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FaadjMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FaadjMstr transientInstance) {
		log.debug("saving FaadjMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FaadjMstr persistentInstance) {
		log.debug("deleting FaadjMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FaadjMstr findById(com.gopawpaw.erp.hibernate.f.FaadjMstrId id) {
		log.debug("getting FaadjMstr instance with id: " + id);
		try {
			FaadjMstr instance = (FaadjMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FaadjMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FaadjMstr instance) {
		log.debug("finding FaadjMstr instance by example");
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
		log.debug("finding FaadjMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FaadjMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FaadjMstr instances");
		try {
			String queryString = "from FaadjMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FaadjMstr merge(FaadjMstr detachedInstance) {
		log.debug("merging FaadjMstr instance");
		try {
			FaadjMstr result = (FaadjMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FaadjMstr instance) {
		log.debug("attaching dirty FaadjMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FaadjMstr instance) {
		log.debug("attaching clean FaadjMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FaadjMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FaadjMstrDAO) ctx.getBean("FaadjMstrDAO");
	}
}