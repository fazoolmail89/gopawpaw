package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EcxRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EcxRef
 * @author MyEclipse Persistence Tools
 */

public class EcxRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EcxRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EcxRef transientInstance) {
		log.debug("saving EcxRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EcxRef persistentInstance) {
		log.debug("deleting EcxRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EcxRef findById(com.gopawpaw.erp.hibernate.e.EcxRefId id) {
		log.debug("getting EcxRef instance with id: " + id);
		try {
			EcxRef instance = (EcxRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EcxRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EcxRef instance) {
		log.debug("finding EcxRef instance by example");
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
		log.debug("finding EcxRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EcxRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EcxRef instances");
		try {
			String queryString = "from EcxRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EcxRef merge(EcxRef detachedInstance) {
		log.debug("merging EcxRef instance");
		try {
			EcxRef result = (EcxRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EcxRef instance) {
		log.debug("attaching dirty EcxRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EcxRef instance) {
		log.debug("attaching clean EcxRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EcxRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EcxRefDAO) ctx.getBean("EcxRefDAO");
	}
}