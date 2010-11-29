package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FpciMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FpciMstr
 * @author MyEclipse Persistence Tools
 */

public class FpciMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FpciMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FpciMstr transientInstance) {
		log.debug("saving FpciMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FpciMstr persistentInstance) {
		log.debug("deleting FpciMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FpciMstr findById(com.gopawpaw.erp.hibernate.f.FpciMstrId id) {
		log.debug("getting FpciMstr instance with id: " + id);
		try {
			FpciMstr instance = (FpciMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FpciMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FpciMstr instance) {
		log.debug("finding FpciMstr instance by example");
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
		log.debug("finding FpciMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FpciMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FpciMstr instances");
		try {
			String queryString = "from FpciMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FpciMstr merge(FpciMstr detachedInstance) {
		log.debug("merging FpciMstr instance");
		try {
			FpciMstr result = (FpciMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FpciMstr instance) {
		log.debug("attaching dirty FpciMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FpciMstr instance) {
		log.debug("attaching clean FpciMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FpciMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FpciMstrDAO) ctx.getBean("FpciMstrDAO");
	}
}