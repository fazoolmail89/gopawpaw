package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EscfRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EscfRef
 * @author MyEclipse Persistence Tools
 */

public class EscfRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EscfRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EscfRef transientInstance) {
		log.debug("saving EscfRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EscfRef persistentInstance) {
		log.debug("deleting EscfRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EscfRef findById(com.gopawpaw.erp.hibernate.e.EscfRefId id) {
		log.debug("getting EscfRef instance with id: " + id);
		try {
			EscfRef instance = (EscfRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EscfRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EscfRef instance) {
		log.debug("finding EscfRef instance by example");
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
		log.debug("finding EscfRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EscfRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EscfRef instances");
		try {
			String queryString = "from EscfRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EscfRef merge(EscfRef detachedInstance) {
		log.debug("merging EscfRef instance");
		try {
			EscfRef result = (EscfRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EscfRef instance) {
		log.debug("attaching dirty EscfRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EscfRef instance) {
		log.debug("attaching clean EscfRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EscfRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EscfRefDAO) ctx.getBean("EscfRefDAO");
	}
}