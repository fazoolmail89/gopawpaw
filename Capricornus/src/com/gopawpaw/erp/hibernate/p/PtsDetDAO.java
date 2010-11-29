package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtsDet
 * @author MyEclipse Persistence Tools
 */

public class PtsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtsDet transientInstance) {
		log.debug("saving PtsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtsDet persistentInstance) {
		log.debug("deleting PtsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtsDet findById(com.gopawpaw.erp.hibernate.p.PtsDetId id) {
		log.debug("getting PtsDet instance with id: " + id);
		try {
			PtsDet instance = (PtsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtsDet instance) {
		log.debug("finding PtsDet instance by example");
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
		log.debug("finding PtsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtsDet instances");
		try {
			String queryString = "from PtsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtsDet merge(PtsDet detachedInstance) {
		log.debug("merging PtsDet instance");
		try {
			PtsDet result = (PtsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtsDet instance) {
		log.debug("attaching dirty PtsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtsDet instance) {
		log.debug("attaching clean PtsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtsDetDAO) ctx.getBean("PtsDetDAO");
	}
}