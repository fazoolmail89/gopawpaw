package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FaclsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FaclsMstr
 * @author MyEclipse Persistence Tools
 */

public class FaclsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FaclsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FaclsMstr transientInstance) {
		log.debug("saving FaclsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FaclsMstr persistentInstance) {
		log.debug("deleting FaclsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FaclsMstr findById(com.gopawpaw.erp.hibernate.f.FaclsMstrId id) {
		log.debug("getting FaclsMstr instance with id: " + id);
		try {
			FaclsMstr instance = (FaclsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FaclsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FaclsMstr instance) {
		log.debug("finding FaclsMstr instance by example");
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
		log.debug("finding FaclsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FaclsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FaclsMstr instances");
		try {
			String queryString = "from FaclsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FaclsMstr merge(FaclsMstr detachedInstance) {
		log.debug("merging FaclsMstr instance");
		try {
			FaclsMstr result = (FaclsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FaclsMstr instance) {
		log.debug("attaching dirty FaclsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FaclsMstr instance) {
		log.debug("attaching clean FaclsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FaclsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FaclsMstrDAO) ctx.getBean("FaclsMstrDAO");
	}
}