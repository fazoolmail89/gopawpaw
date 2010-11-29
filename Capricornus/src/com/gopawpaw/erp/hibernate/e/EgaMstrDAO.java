package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EgaMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EgaMstr
 * @author MyEclipse Persistence Tools
 */

public class EgaMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EgaMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EgaMstr transientInstance) {
		log.debug("saving EgaMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EgaMstr persistentInstance) {
		log.debug("deleting EgaMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EgaMstr findById(com.gopawpaw.erp.hibernate.e.EgaMstrId id) {
		log.debug("getting EgaMstr instance with id: " + id);
		try {
			EgaMstr instance = (EgaMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EgaMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EgaMstr instance) {
		log.debug("finding EgaMstr instance by example");
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
		log.debug("finding EgaMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EgaMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EgaMstr instances");
		try {
			String queryString = "from EgaMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EgaMstr merge(EgaMstr detachedInstance) {
		log.debug("merging EgaMstr instance");
		try {
			EgaMstr result = (EgaMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EgaMstr instance) {
		log.debug("attaching dirty EgaMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EgaMstr instance) {
		log.debug("attaching clean EgaMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EgaMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EgaMstrDAO) ctx.getBean("EgaMstrDAO");
	}
}