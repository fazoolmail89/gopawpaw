package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PcaDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PcaDet
 * @author MyEclipse Persistence Tools
 */

public class PcaDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PcaDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PcaDet transientInstance) {
		log.debug("saving PcaDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PcaDet persistentInstance) {
		log.debug("deleting PcaDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PcaDet findById(com.gopawpaw.erp.hibernate.p.PcaDetId id) {
		log.debug("getting PcaDet instance with id: " + id);
		try {
			PcaDet instance = (PcaDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PcaDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PcaDet instance) {
		log.debug("finding PcaDet instance by example");
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
		log.debug("finding PcaDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PcaDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PcaDet instances");
		try {
			String queryString = "from PcaDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PcaDet merge(PcaDet detachedInstance) {
		log.debug("merging PcaDet instance");
		try {
			PcaDet result = (PcaDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PcaDet instance) {
		log.debug("attaching dirty PcaDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PcaDet instance) {
		log.debug("attaching clean PcaDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PcaDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PcaDetDAO) ctx.getBean("PcaDetDAO");
	}
}