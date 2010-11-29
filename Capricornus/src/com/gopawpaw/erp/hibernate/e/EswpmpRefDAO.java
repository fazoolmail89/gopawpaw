package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EswpmpRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EswpmpRef
 * @author MyEclipse Persistence Tools
 */

public class EswpmpRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EswpmpRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EswpmpRef transientInstance) {
		log.debug("saving EswpmpRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EswpmpRef persistentInstance) {
		log.debug("deleting EswpmpRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EswpmpRef findById(com.gopawpaw.erp.hibernate.e.EswpmpRefId id) {
		log.debug("getting EswpmpRef instance with id: " + id);
		try {
			EswpmpRef instance = (EswpmpRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EswpmpRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EswpmpRef instance) {
		log.debug("finding EswpmpRef instance by example");
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
		log.debug("finding EswpmpRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EswpmpRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EswpmpRef instances");
		try {
			String queryString = "from EswpmpRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EswpmpRef merge(EswpmpRef detachedInstance) {
		log.debug("merging EswpmpRef instance");
		try {
			EswpmpRef result = (EswpmpRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EswpmpRef instance) {
		log.debug("attaching dirty EswpmpRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EswpmpRef instance) {
		log.debug("attaching clean EswpmpRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EswpmpRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EswpmpRefDAO) ctx.getBean("EswpmpRefDAO");
	}
}