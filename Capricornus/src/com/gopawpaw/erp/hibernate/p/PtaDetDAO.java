package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtaDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtaDet
 * @author MyEclipse Persistence Tools
 */

public class PtaDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtaDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtaDet transientInstance) {
		log.debug("saving PtaDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtaDet persistentInstance) {
		log.debug("deleting PtaDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtaDet findById(com.gopawpaw.erp.hibernate.p.PtaDetId id) {
		log.debug("getting PtaDet instance with id: " + id);
		try {
			PtaDet instance = (PtaDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtaDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtaDet instance) {
		log.debug("finding PtaDet instance by example");
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
		log.debug("finding PtaDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtaDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtaDet instances");
		try {
			String queryString = "from PtaDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtaDet merge(PtaDet detachedInstance) {
		log.debug("merging PtaDet instance");
		try {
			PtaDet result = (PtaDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtaDet instance) {
		log.debug("attaching dirty PtaDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtaDet instance) {
		log.debug("attaching clean PtaDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtaDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtaDetDAO) ctx.getBean("PtaDetDAO");
	}
}