package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PgcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PgcCtrl
 * @author MyEclipse Persistence Tools
 */

public class PgcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PgcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PgcCtrl transientInstance) {
		log.debug("saving PgcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PgcCtrl persistentInstance) {
		log.debug("deleting PgcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PgcCtrl findById(com.gopawpaw.erp.hibernate.p.PgcCtrlId id) {
		log.debug("getting PgcCtrl instance with id: " + id);
		try {
			PgcCtrl instance = (PgcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PgcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PgcCtrl instance) {
		log.debug("finding PgcCtrl instance by example");
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
		log.debug("finding PgcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PgcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PgcCtrl instances");
		try {
			String queryString = "from PgcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PgcCtrl merge(PgcCtrl detachedInstance) {
		log.debug("merging PgcCtrl instance");
		try {
			PgcCtrl result = (PgcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PgcCtrl instance) {
		log.debug("attaching dirty PgcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PgcCtrl instance) {
		log.debug("attaching clean PgcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PgcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PgcCtrlDAO) ctx.getBean("PgcCtrlDAO");
	}
}