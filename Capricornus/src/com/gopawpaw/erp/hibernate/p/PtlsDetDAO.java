package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtlsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtlsDet
 * @author MyEclipse Persistence Tools
 */

public class PtlsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtlsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtlsDet transientInstance) {
		log.debug("saving PtlsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtlsDet persistentInstance) {
		log.debug("deleting PtlsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtlsDet findById(com.gopawpaw.erp.hibernate.p.PtlsDetId id) {
		log.debug("getting PtlsDet instance with id: " + id);
		try {
			PtlsDet instance = (PtlsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtlsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtlsDet instance) {
		log.debug("finding PtlsDet instance by example");
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
		log.debug("finding PtlsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtlsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtlsDet instances");
		try {
			String queryString = "from PtlsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtlsDet merge(PtlsDet detachedInstance) {
		log.debug("merging PtlsDet instance");
		try {
			PtlsDet result = (PtlsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtlsDet instance) {
		log.debug("attaching dirty PtlsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtlsDet instance) {
		log.debug("attaching clean PtlsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtlsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtlsDetDAO) ctx.getBean("PtlsDetDAO");
	}
}