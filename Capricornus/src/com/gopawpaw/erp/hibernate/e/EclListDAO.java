package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EclList entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EclList
 * @author MyEclipse Persistence Tools
 */

public class EclListDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EclListDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EclList transientInstance) {
		log.debug("saving EclList instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EclList persistentInstance) {
		log.debug("deleting EclList instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EclList findById(com.gopawpaw.erp.hibernate.e.EclListId id) {
		log.debug("getting EclList instance with id: " + id);
		try {
			EclList instance = (EclList) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EclList", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EclList instance) {
		log.debug("finding EclList instance by example");
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
		log.debug("finding EclList instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EclList as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EclList instances");
		try {
			String queryString = "from EclList";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EclList merge(EclList detachedInstance) {
		log.debug("merging EclList instance");
		try {
			EclList result = (EclList) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EclList instance) {
		log.debug("attaching dirty EclList instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EclList instance) {
		log.debug("attaching clean EclList instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EclListDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EclListDAO) ctx.getBean("EclListDAO");
	}
}